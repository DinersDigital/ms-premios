// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: consumo.proto

package ec.com.dinersclub.dddmodules.application.grpc;

/**
 * Protobuf type {@code grpc.ConsumosRegistradosResponse}
 */
public final class ConsumosRegistradosResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.ConsumosRegistradosResponse)
    ConsumosRegistradosResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsumosRegistradosResponse.newBuilder() to construct.
  private ConsumosRegistradosResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsumosRegistradosResponse() {
    consumosRegistradosCampania_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConsumosRegistradosResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsumosRegistradosResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              consumosRegistradosCampania_ = new java.util.ArrayList<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania>();
              mutable_bitField0_ |= 0x00000001;
            }
            consumosRegistradosCampania_.add(
                input.readMessage(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        consumosRegistradosCampania_ = java.util.Collections.unmodifiableList(consumosRegistradosCampania_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ec.com.dinersclub.dddmodules.application.grpc.ConsumoProto.internal_static_grpc_ConsumosRegistradosResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ec.com.dinersclub.dddmodules.application.grpc.ConsumoProto.internal_static_grpc_ConsumosRegistradosResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.class, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.Builder.class);
  }

  public static final int CONSUMOSREGISTRADOSCAMPANIA_FIELD_NUMBER = 1;
  private java.util.List<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania> consumosRegistradosCampania_;
  /**
   * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
   */
  @java.lang.Override
  public java.util.List<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania> getConsumosRegistradosCampaniaList() {
    return consumosRegistradosCampania_;
  }
  /**
   * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder> 
      getConsumosRegistradosCampaniaOrBuilderList() {
    return consumosRegistradosCampania_;
  }
  /**
   * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
   */
  @java.lang.Override
  public int getConsumosRegistradosCampaniaCount() {
    return consumosRegistradosCampania_.size();
  }
  /**
   * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
   */
  @java.lang.Override
  public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania getConsumosRegistradosCampania(int index) {
    return consumosRegistradosCampania_.get(index);
  }
  /**
   * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
   */
  @java.lang.Override
  public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder getConsumosRegistradosCampaniaOrBuilder(
      int index) {
    return consumosRegistradosCampania_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < consumosRegistradosCampania_.size(); i++) {
      output.writeMessage(1, consumosRegistradosCampania_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < consumosRegistradosCampania_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, consumosRegistradosCampania_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse)) {
      return super.equals(obj);
    }
    ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse other = (ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse) obj;

    if (!getConsumosRegistradosCampaniaList()
        .equals(other.getConsumosRegistradosCampaniaList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getConsumosRegistradosCampaniaCount() > 0) {
      hash = (37 * hash) + CONSUMOSREGISTRADOSCAMPANIA_FIELD_NUMBER;
      hash = (53 * hash) + getConsumosRegistradosCampaniaList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code grpc.ConsumosRegistradosResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.ConsumosRegistradosResponse)
      ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ec.com.dinersclub.dddmodules.application.grpc.ConsumoProto.internal_static_grpc_ConsumosRegistradosResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ec.com.dinersclub.dddmodules.application.grpc.ConsumoProto.internal_static_grpc_ConsumosRegistradosResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.class, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.Builder.class);
    }

    // Construct using ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getConsumosRegistradosCampaniaFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (consumosRegistradosCampaniaBuilder_ == null) {
        consumosRegistradosCampania_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        consumosRegistradosCampaniaBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ec.com.dinersclub.dddmodules.application.grpc.ConsumoProto.internal_static_grpc_ConsumosRegistradosResponse_descriptor;
    }

    @java.lang.Override
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse getDefaultInstanceForType() {
      return ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse build() {
      ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse buildPartial() {
      ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse result = new ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse(this);
      int from_bitField0_ = bitField0_;
      if (consumosRegistradosCampaniaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          consumosRegistradosCampania_ = java.util.Collections.unmodifiableList(consumosRegistradosCampania_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.consumosRegistradosCampania_ = consumosRegistradosCampania_;
      } else {
        result.consumosRegistradosCampania_ = consumosRegistradosCampaniaBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse) {
        return mergeFrom((ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse other) {
      if (other == ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse.getDefaultInstance()) return this;
      if (consumosRegistradosCampaniaBuilder_ == null) {
        if (!other.consumosRegistradosCampania_.isEmpty()) {
          if (consumosRegistradosCampania_.isEmpty()) {
            consumosRegistradosCampania_ = other.consumosRegistradosCampania_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConsumosRegistradosCampaniaIsMutable();
            consumosRegistradosCampania_.addAll(other.consumosRegistradosCampania_);
          }
          onChanged();
        }
      } else {
        if (!other.consumosRegistradosCampania_.isEmpty()) {
          if (consumosRegistradosCampaniaBuilder_.isEmpty()) {
            consumosRegistradosCampaniaBuilder_.dispose();
            consumosRegistradosCampaniaBuilder_ = null;
            consumosRegistradosCampania_ = other.consumosRegistradosCampania_;
            bitField0_ = (bitField0_ & ~0x00000001);
            consumosRegistradosCampaniaBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConsumosRegistradosCampaniaFieldBuilder() : null;
          } else {
            consumosRegistradosCampaniaBuilder_.addAllMessages(other.consumosRegistradosCampania_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania> consumosRegistradosCampania_ =
      java.util.Collections.emptyList();
    private void ensureConsumosRegistradosCampaniaIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        consumosRegistradosCampania_ = new java.util.ArrayList<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania>(consumosRegistradosCampania_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder> consumosRegistradosCampaniaBuilder_;

    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public java.util.List<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania> getConsumosRegistradosCampaniaList() {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        return java.util.Collections.unmodifiableList(consumosRegistradosCampania_);
      } else {
        return consumosRegistradosCampaniaBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public int getConsumosRegistradosCampaniaCount() {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        return consumosRegistradosCampania_.size();
      } else {
        return consumosRegistradosCampaniaBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania getConsumosRegistradosCampania(int index) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        return consumosRegistradosCampania_.get(index);
      } else {
        return consumosRegistradosCampaniaBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder setConsumosRegistradosCampania(
        int index, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania value) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.set(index, value);
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder setConsumosRegistradosCampania(
        int index, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder builderForValue) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.set(index, builderForValue.build());
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder addConsumosRegistradosCampania(ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania value) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.add(value);
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder addConsumosRegistradosCampania(
        int index, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania value) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.add(index, value);
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder addConsumosRegistradosCampania(
        ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder builderForValue) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.add(builderForValue.build());
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder addConsumosRegistradosCampania(
        int index, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder builderForValue) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.add(index, builderForValue.build());
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder addAllConsumosRegistradosCampania(
        java.lang.Iterable<? extends ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania> values) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        ensureConsumosRegistradosCampaniaIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, consumosRegistradosCampania_);
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder clearConsumosRegistradosCampania() {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        consumosRegistradosCampania_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public Builder removeConsumosRegistradosCampania(int index) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        ensureConsumosRegistradosCampaniaIsMutable();
        consumosRegistradosCampania_.remove(index);
        onChanged();
      } else {
        consumosRegistradosCampaniaBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder getConsumosRegistradosCampaniaBuilder(
        int index) {
      return getConsumosRegistradosCampaniaFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder getConsumosRegistradosCampaniaOrBuilder(
        int index) {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        return consumosRegistradosCampania_.get(index);  } else {
        return consumosRegistradosCampaniaBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public java.util.List<? extends ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder> 
         getConsumosRegistradosCampaniaOrBuilderList() {
      if (consumosRegistradosCampaniaBuilder_ != null) {
        return consumosRegistradosCampaniaBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(consumosRegistradosCampania_);
      }
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder addConsumosRegistradosCampaniaBuilder() {
      return getConsumosRegistradosCampaniaFieldBuilder().addBuilder(
          ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder addConsumosRegistradosCampaniaBuilder(
        int index) {
      return getConsumosRegistradosCampaniaFieldBuilder().addBuilder(
          index, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.getDefaultInstance());
    }
    /**
     * <code>repeated .grpc.ConsumosRegistradosCampania consumosRegistradosCampania = 1;</code>
     */
    public java.util.List<ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder> 
         getConsumosRegistradosCampaniaBuilderList() {
      return getConsumosRegistradosCampaniaFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder> 
        getConsumosRegistradosCampaniaFieldBuilder() {
      if (consumosRegistradosCampaniaBuilder_ == null) {
        consumosRegistradosCampaniaBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampania.Builder, ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosCampaniaOrBuilder>(
                consumosRegistradosCampania_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        consumosRegistradosCampania_ = null;
      }
      return consumosRegistradosCampaniaBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:grpc.ConsumosRegistradosResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.ConsumosRegistradosResponse)
  private static final ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse();
  }

  public static ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumosRegistradosResponse>
      PARSER = new com.google.protobuf.AbstractParser<ConsumosRegistradosResponse>() {
    @java.lang.Override
    public ConsumosRegistradosResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsumosRegistradosResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsumosRegistradosResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsumosRegistradosResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ec.com.dinersclub.dddmodules.application.grpc.ConsumosRegistradosResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

