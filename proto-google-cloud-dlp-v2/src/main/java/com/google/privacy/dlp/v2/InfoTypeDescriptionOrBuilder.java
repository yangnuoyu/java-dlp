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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface InfoTypeDescriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InfoTypeDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Internal name of the infoType.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Internal name of the infoType.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Human readable form of the infoType name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human readable form of the infoType name.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Which parts of the API supports this InfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSupportedBy supported_by = 3;</code>
   *
   * @return A list containing the supportedBy.
   */
  java.util.List<com.google.privacy.dlp.v2.InfoTypeSupportedBy> getSupportedByList();
  /**
   *
   *
   * <pre>
   * Which parts of the API supports this InfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSupportedBy supported_by = 3;</code>
   *
   * @return The count of supportedBy.
   */
  int getSupportedByCount();
  /**
   *
   *
   * <pre>
   * Which parts of the API supports this InfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSupportedBy supported_by = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedBy at the given index.
   */
  com.google.privacy.dlp.v2.InfoTypeSupportedBy getSupportedBy(int index);
  /**
   *
   *
   * <pre>
   * Which parts of the API supports this InfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSupportedBy supported_by = 3;</code>
   *
   * @return A list containing the enum numeric values on the wire for supportedBy.
   */
  java.util.List<java.lang.Integer> getSupportedByValueList();
  /**
   *
   *
   * <pre>
   * Which parts of the API supports this InfoType.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoTypeSupportedBy supported_by = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of supportedBy at the given index.
   */
  int getSupportedByValue(int index);

  /**
   *
   *
   * <pre>
   * Description of the infotype. Translated when language is provided in the
   * request.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the infotype. Translated when language is provided in the
   * request.
   * </pre>
   *
   * <code>string description = 4;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
