/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Definitions of file type groups to scan.
 * </pre>
 *
 * Protobuf enum {@code google.privacy.dlp.v2.FileType}
 */
public enum FileType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Includes all files.
   * </pre>
   *
   * <code>FILE_TYPE_UNSPECIFIED = 0;</code>
   */
  FILE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Includes all file extensions not covered by text file types.
   * </pre>
   *
   * <code>BINARY_FILE = 1;</code>
   */
  BINARY_FILE(1),
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   asc, brf, c, cc, cpp, csv, cxx, c++, cs, css, dart, eml, go, h, hh, hpp,
   *   hxx, h++, hs, html, htm, shtml, shtm, xhtml, lhs, ini, java, js, json,
   *   ocaml, md, mkd, markdown, m, ml, mli, pl, pm, php, phtml, pht, py, pyw,
   *   rb, rbw, rs, rc, scala, sh, sql, tex, txt, text, tsv, vcard, vcs, wml,
   *   xml, xsl, xsd, yml, yaml.
   * </pre>
   *
   * <code>TEXT_FILE = 2;</code>
   */
  TEXT_FILE(2),
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   bmp, gif, jpg, jpeg, jpe, png.
   * bytes_limit_per_file has no effect on image files.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>IMAGE = 3;</code>
   */
  IMAGE(3),
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   docx, dotx, docm, dotm
   * </pre>
   *
   * <code>WORD = 5;</code>
   */
  WORD(5),
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   pdf
   * </pre>
   *
   * <code>PDF = 6;</code>
   */
  PDF(6),
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   avro
   * </pre>
   *
   * <code>AVRO = 7;</code>
   */
  AVRO(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Includes all files.
   * </pre>
   *
   * <code>FILE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int FILE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Includes all file extensions not covered by text file types.
   * </pre>
   *
   * <code>BINARY_FILE = 1;</code>
   */
  public static final int BINARY_FILE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   asc, brf, c, cc, cpp, csv, cxx, c++, cs, css, dart, eml, go, h, hh, hpp,
   *   hxx, h++, hs, html, htm, shtml, shtm, xhtml, lhs, ini, java, js, json,
   *   ocaml, md, mkd, markdown, m, ml, mli, pl, pm, php, phtml, pht, py, pyw,
   *   rb, rbw, rs, rc, scala, sh, sql, tex, txt, text, tsv, vcard, vcs, wml,
   *   xml, xsl, xsd, yml, yaml.
   * </pre>
   *
   * <code>TEXT_FILE = 2;</code>
   */
  public static final int TEXT_FILE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   bmp, gif, jpg, jpeg, jpe, png.
   * bytes_limit_per_file has no effect on image files.
   * Image inspection is restricted to 'global', 'us', 'asia', and 'europe'.
   * </pre>
   *
   * <code>IMAGE = 3;</code>
   */
  public static final int IMAGE_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   docx, dotx, docm, dotm
   * </pre>
   *
   * <code>WORD = 5;</code>
   */
  public static final int WORD_VALUE = 5;
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   pdf
   * </pre>
   *
   * <code>PDF = 6;</code>
   */
  public static final int PDF_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Included file extensions:
   *   avro
   * </pre>
   *
   * <code>AVRO = 7;</code>
   */
  public static final int AVRO_VALUE = 7;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static FileType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FileType forNumber(int value) {
    switch (value) {
      case 0:
        return FILE_TYPE_UNSPECIFIED;
      case 1:
        return BINARY_FILE;
      case 2:
        return TEXT_FILE;
      case 3:
        return IMAGE;
      case 5:
        return WORD;
      case 6:
        return PDF;
      case 7:
        return AVRO;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FileType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<FileType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<FileType>() {
        public FileType findValueByNumber(int number) {
          return FileType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage.getDescriptor().getEnumTypes().get(1);
  }

  private static final FileType[] VALUES = values();

  public static FileType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FileType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.FileType)
}
