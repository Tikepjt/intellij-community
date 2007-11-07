/*
 * Copyright 2000-2007 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.openapi.fileTypes;

public class StdFileTypes {
  public static final LanguageFileType JAVA = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("JAVA");
  public static final FileType CLASS = FileTypeManager.getInstance().getStdFileType("CLASS");
  public static final LanguageFileType JSP = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("JSP");
  public static final LanguageFileType JSPX = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("JSPX");
  public static final LanguageFileType XML = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("XML");
  public static final LanguageFileType DTD = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("DTD");
  public static final LanguageFileType HTML = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("HTML");
  public static final LanguageFileType XHTML = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("XHTML");
  public static final LanguageFileType PROPERTIES = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("Properties");
  public static final LanguageFileType PLAIN_TEXT = (LanguageFileType)FileTypeManager.getInstance().getLanguageStdFileType("PLAIN_TEXT");
  public static final FileType GUI_DESIGNER_FORM = FileTypeManager.getInstance().getStdFileType("GUI_DESIGNER_FORM");
  public static final FileType IDEA_WORKSPACE = FileTypeManager.getInstance().getStdFileType("IDEA_WORKSPACE");
  public static final FileType IDEA_PROJECT = FileTypeManager.getInstance().getStdFileType("IDEA_PROJECT");
  public static final FileType IDEA_MODULE = FileTypeManager.getInstance().getStdFileType("IDEA_MODULE");
  public static final FileType PATCH = FileTypeManager.getInstance().getStdFileType("PATCH");
}