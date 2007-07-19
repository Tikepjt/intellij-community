package com.intellij.openapi.components;

import com.intellij.openapi.util.Pair;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileEvent;
import com.intellij.util.io.fs.IFile;
import com.intellij.util.messages.Topic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface StateStorage {
  Topic<Listener> STORAGE_TOPIC = new Topic<Listener>("STORAGE_LISTENER", Listener.class, Topic.BroadcastDirection.TO_PARENT);

  @Nullable
  <T> T getState(final Object component, final String componentName, Class<T> stateClass, @Nullable T mergeInto) throws StateStorageException;
  boolean hasState(final Object component, final String componentName, final Class<?> aClass) throws StateStorageException;


  @NotNull
  ExternalizationSession startExternalization();
  @NotNull
  SaveSession startSave(ExternalizationSession externalizationSession);
  void finishSave(SaveSession saveSession);

  void reload(final Set<String> changedComponents) throws StateStorageException;

  interface ExternalizationSession {
    void setState(Object component, final String componentName, Object state, @Nullable final Storage storageSpec) throws StateStorageException;
  }

  interface SaveSession {
    void save() throws StateStorageException;

    Set<String> getUsedMacros();

    @Nullable
    Set<String> analyzeExternalChanges(final Set<Pair<VirtualFile,StateStorage>> changedFiles);

    Collection<IFile> getStorageFilesToSave() throws StateStorageException;
    List<IFile> getAllStorageFiles();
  }

  class StateStorageException extends Exception {
    public StateStorageException() {
    }

    public StateStorageException(final String message) {
      super(message);
    }

    public StateStorageException(final String message, final Throwable cause) {
      super(message, cause);
    }

    public StateStorageException(final Throwable cause) {
      super(cause);
    }
  }

  interface Listener {
    void storageFileChanged(final VirtualFileEvent event, final StateStorage storage);
  }
}
