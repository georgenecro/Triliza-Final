
package com.bt.pt;

public final class BluetoothProtocol {
  private BluetoothProtocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum TypeMove
      implements com.google.protobuf.ProtocolMessageEnum {
    X(0, 1),
    O(1, 2),
    ;
    
    public static final int X_VALUE = 1;
    public static final int O_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static TypeMove valueOf(int value) {
      switch (value) {
        case 1: return X;
        case 2: return O;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<TypeMove>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<TypeMove>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TypeMove>() {
            public TypeMove findValueByNumber(int number) {
              return TypeMove.valueOf(number);
            }
          };
    
    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final TypeMove[] VALUES = {
      X, O, 
    };
    
    public static TypeMove valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private TypeMove(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
  
  public interface StartGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    boolean hasOponentName();
    String getOponentName();
  }
  public static final class StartGame extends
      com.google.protobuf.GeneratedMessage
      implements StartGameOrBuilder {
    private StartGame(Builder builder) {
      super(builder);
    }
    private StartGame(boolean noInit) {}
    
    private static final StartGame defaultInstance;
    public static StartGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public StartGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_StartGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_StartGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    public static final int OPONENTNAME_FIELD_NUMBER = 1;
    private java.lang.Object oponentName_;
    public boolean hasOponentName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getOponentName() {
      java.lang.Object ref = oponentName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          oponentName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getOponentNameBytes() {
      java.lang.Object ref = oponentName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        oponentName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      oponentName_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasOponentName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getOponentNameBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getOponentNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.StartGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bt.pt.BluetoothProtocol.StartGame prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bt.pt.BluetoothProtocol.StartGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_StartGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_StartGame_fieldAccessorTable;
      }
      
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        oponentName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bt.pt.BluetoothProtocol.StartGame.getDescriptor();
      }
      
      public com.bt.pt.BluetoothProtocol.StartGame getDefaultInstanceForType() {
        return com.bt.pt.BluetoothProtocol.StartGame.getDefaultInstance();
      }
      
      public com.bt.pt.BluetoothProtocol.StartGame build() {
        com.bt.pt.BluetoothProtocol.StartGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.bt.pt.BluetoothProtocol.StartGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.bt.pt.BluetoothProtocol.StartGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.bt.pt.BluetoothProtocol.StartGame buildPartial() {
        com.bt.pt.BluetoothProtocol.StartGame result = new com.bt.pt.BluetoothProtocol.StartGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.oponentName_ = oponentName_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bt.pt.BluetoothProtocol.StartGame) {
          return mergeFrom((com.bt.pt.BluetoothProtocol.StartGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.bt.pt.BluetoothProtocol.StartGame other) {
        if (other == com.bt.pt.BluetoothProtocol.StartGame.getDefaultInstance()) return this;
        if (other.hasOponentName()) {
          setOponentName(other.getOponentName());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasOponentName()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              oponentName_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      private java.lang.Object oponentName_ = "";
      public boolean hasOponentName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getOponentName() {
        java.lang.Object ref = oponentName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          oponentName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setOponentName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        oponentName_ = value;
        onChanged();
        return this;
      }
      public Builder clearOponentName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        oponentName_ = getDefaultInstance().getOponentName();
        onChanged();
        return this;
      }
      void setOponentName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        oponentName_ = value;
        onChanged();
      }
    }
    
    static {
      defaultInstance = new StartGame(true);
      defaultInstance.initFields();
    }
  }
  
  public interface DidMoveOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    boolean hasI();
    int getI();
    boolean hasJ();
    int getJ();
    boolean hasType();
    com.bt.pt.BluetoothProtocol.TypeMove getType();
  }
  public static final class DidMove extends
      com.google.protobuf.GeneratedMessage
      implements DidMoveOrBuilder {
    private DidMove(Builder builder) {
      super(builder);
    }
    private DidMove(boolean noInit) {}
    
    private static final DidMove defaultInstance;
    public static DidMove getDefaultInstance() {
      return defaultInstance;
    }
    
    public DidMove getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_DidMove_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_DidMove_fieldAccessorTable;
    }
    
    private int bitField0_;
    public static final int I_FIELD_NUMBER = 1;
    private int i_;
    public boolean hasI() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getI() {
      return i_;
    }
    public static final int J_FIELD_NUMBER = 2;
    private int j_;
    public boolean hasJ() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getJ() {
      return j_;
    }
    public static final int TYPE_FIELD_NUMBER = 3;
    private com.bt.pt.BluetoothProtocol.TypeMove type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.bt.pt.BluetoothProtocol.TypeMove getType() {
      return type_;
    }
    
    private void initFields() {
      i_ = 0;
      j_ = 0;
      type_ = com.bt.pt.BluetoothProtocol.TypeMove.X;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasI()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasJ()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, i_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, j_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, i_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, j_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.DidMove parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bt.pt.BluetoothProtocol.DidMove prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bt.pt.BluetoothProtocol.DidMoveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_DidMove_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_DidMove_fieldAccessorTable;
      }
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        i_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        j_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.bt.pt.BluetoothProtocol.TypeMove.X;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bt.pt.BluetoothProtocol.DidMove.getDescriptor();
      }
      
      public com.bt.pt.BluetoothProtocol.DidMove getDefaultInstanceForType() {
        return com.bt.pt.BluetoothProtocol.DidMove.getDefaultInstance();
      }
      
      public com.bt.pt.BluetoothProtocol.DidMove build() {
        com.bt.pt.BluetoothProtocol.DidMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.bt.pt.BluetoothProtocol.DidMove buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.bt.pt.BluetoothProtocol.DidMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.bt.pt.BluetoothProtocol.DidMove buildPartial() {
        com.bt.pt.BluetoothProtocol.DidMove result = new com.bt.pt.BluetoothProtocol.DidMove(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.i_ = i_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.j_ = j_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bt.pt.BluetoothProtocol.DidMove) {
          return mergeFrom((com.bt.pt.BluetoothProtocol.DidMove)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.bt.pt.BluetoothProtocol.DidMove other) {
        if (other == com.bt.pt.BluetoothProtocol.DidMove.getDefaultInstance()) return this;
        if (other.hasI()) {
          setI(other.getI());
        }
        if (other.hasJ()) {
          setJ(other.getJ());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasI()) {
          
          return false;
        }
        if (!hasJ()) {
          
          return false;
        }
        if (!hasType()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              i_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              j_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.bt.pt.BluetoothProtocol.TypeMove value = com.bt.pt.BluetoothProtocol.TypeMove.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      private int i_ ;
      public boolean hasI() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getI() {
        return i_;
      }
      public Builder setI(int value) {
        bitField0_ |= 0x00000001;
        i_ = value;
        onChanged();
        return this;
      }
      public Builder clearI() {
        bitField0_ = (bitField0_ & ~0x00000001);
        i_ = 0;
        onChanged();
        return this;
      }
      private int j_ ;
      public boolean hasJ() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getJ() {
        return j_;
      }
      public Builder setJ(int value) {
        bitField0_ |= 0x00000002;
        j_ = value;
        onChanged();
        return this;
      }
      public Builder clearJ() {
        bitField0_ = (bitField0_ & ~0x00000002);
        j_ = 0;
        onChanged();
        return this;
      }
      private com.bt.pt.BluetoothProtocol.TypeMove type_ = com.bt.pt.BluetoothProtocol.TypeMove.X;
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.bt.pt.BluetoothProtocol.TypeMove getType() {
        return type_;
      }
      public Builder setType(com.bt.pt.BluetoothProtocol.TypeMove value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = com.bt.pt.BluetoothProtocol.TypeMove.X;
        onChanged();
        return this;
      }
    }
    
    static {
      defaultInstance = new DidMove(true);
      defaultInstance.initFields();
    }
  }
  
  public interface ContinueGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    boolean hasContinueGame();
    boolean getContinueGame();
  }
  public static final class ContinueGame extends
      com.google.protobuf.GeneratedMessage
      implements ContinueGameOrBuilder {
    private ContinueGame(Builder builder) {
      super(builder);
    }
    private ContinueGame(boolean noInit) {}
    
    private static final ContinueGame defaultInstance;
    public static ContinueGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public ContinueGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ContinueGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ContinueGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    public static final int CONTINUEGAME_FIELD_NUMBER = 1;
    private boolean continueGame_;
    public boolean hasContinueGame() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getContinueGame() {
      return continueGame_;
    }
    
    private void initFields() {
      continueGame_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasContinueGame()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, continueGame_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, continueGame_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ContinueGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bt.pt.BluetoothProtocol.ContinueGame prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bt.pt.BluetoothProtocol.ContinueGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ContinueGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ContinueGame_fieldAccessorTable;
      }
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        continueGame_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bt.pt.BluetoothProtocol.ContinueGame.getDescriptor();
      }
      
      public com.bt.pt.BluetoothProtocol.ContinueGame getDefaultInstanceForType() {
        return com.bt.pt.BluetoothProtocol.ContinueGame.getDefaultInstance();
      }
      
      public com.bt.pt.BluetoothProtocol.ContinueGame build() {
        com.bt.pt.BluetoothProtocol.ContinueGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.bt.pt.BluetoothProtocol.ContinueGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.bt.pt.BluetoothProtocol.ContinueGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.bt.pt.BluetoothProtocol.ContinueGame buildPartial() {
        com.bt.pt.BluetoothProtocol.ContinueGame result = new com.bt.pt.BluetoothProtocol.ContinueGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.continueGame_ = continueGame_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bt.pt.BluetoothProtocol.ContinueGame) {
          return mergeFrom((com.bt.pt.BluetoothProtocol.ContinueGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.bt.pt.BluetoothProtocol.ContinueGame other) {
        if (other == com.bt.pt.BluetoothProtocol.ContinueGame.getDefaultInstance()) return this;
        if (other.hasContinueGame()) {
          setContinueGame(other.getContinueGame());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasContinueGame()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              continueGame_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      private boolean continueGame_ ;
      public boolean hasContinueGame() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getContinueGame() {
        return continueGame_;
      }
      public Builder setContinueGame(boolean value) {
        bitField0_ |= 0x00000001;
        continueGame_ = value;
        onChanged();
        return this;
      }
      public Builder clearContinueGame() {
        bitField0_ = (bitField0_ & ~0x00000001);
        continueGame_ = false;
        onChanged();
        return this;
      }
    }
    
    static {
      defaultInstance = new ContinueGame(true);
      defaultInstance.initFields();
    }
  }
  
  public interface TimeForMoveFullUpOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    boolean hasTimeFullUp();
    boolean getTimeFullUp();
  }
  public static final class TimeForMoveFullUp extends
      com.google.protobuf.GeneratedMessage
      implements TimeForMoveFullUpOrBuilder {
    private TimeForMoveFullUp(Builder builder) {
      super(builder);
    }
    private TimeForMoveFullUp(boolean noInit) {}
    
    private static final TimeForMoveFullUp defaultInstance;
    public static TimeForMoveFullUp getDefaultInstance() {
      return defaultInstance;
    }
    
    public TimeForMoveFullUp getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_TimeForMoveFullUp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_TimeForMoveFullUp_fieldAccessorTable;
    }
    
    private int bitField0_;
    public static final int TIMEFULLUP_FIELD_NUMBER = 1;
    private boolean timeFullUp_;
    public boolean hasTimeFullUp() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getTimeFullUp() {
      return timeFullUp_;
    }
    
    private void initFields() {
      timeFullUp_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasTimeFullUp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(1, timeFullUp_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, timeFullUp_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bt.pt.BluetoothProtocol.TimeForMoveFullUp prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bt.pt.BluetoothProtocol.TimeForMoveFullUpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_TimeForMoveFullUp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_TimeForMoveFullUp_fieldAccessorTable;
      }
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        timeFullUp_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bt.pt.BluetoothProtocol.TimeForMoveFullUp.getDescriptor();
      }
      
      public com.bt.pt.BluetoothProtocol.TimeForMoveFullUp getDefaultInstanceForType() {
        return com.bt.pt.BluetoothProtocol.TimeForMoveFullUp.getDefaultInstance();
      }
      
      public com.bt.pt.BluetoothProtocol.TimeForMoveFullUp build() {
        com.bt.pt.BluetoothProtocol.TimeForMoveFullUp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.bt.pt.BluetoothProtocol.TimeForMoveFullUp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.bt.pt.BluetoothProtocol.TimeForMoveFullUp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.bt.pt.BluetoothProtocol.TimeForMoveFullUp buildPartial() {
        com.bt.pt.BluetoothProtocol.TimeForMoveFullUp result = new com.bt.pt.BluetoothProtocol.TimeForMoveFullUp(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.timeFullUp_ = timeFullUp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bt.pt.BluetoothProtocol.TimeForMoveFullUp) {
          return mergeFrom((com.bt.pt.BluetoothProtocol.TimeForMoveFullUp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.bt.pt.BluetoothProtocol.TimeForMoveFullUp other) {
        if (other == com.bt.pt.BluetoothProtocol.TimeForMoveFullUp.getDefaultInstance()) return this;
        if (other.hasTimeFullUp()) {
          setTimeFullUp(other.getTimeFullUp());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasTimeFullUp()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              timeFullUp_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      private boolean timeFullUp_ ;
      public boolean hasTimeFullUp() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getTimeFullUp() {
        return timeFullUp_;
      }
      public Builder setTimeFullUp(boolean value) {
        bitField0_ |= 0x00000001;
        timeFullUp_ = value;
        onChanged();
        return this;
      }
      public Builder clearTimeFullUp() {
        bitField0_ = (bitField0_ & ~0x00000001);
        timeFullUp_ = false;
        onChanged();
        return this;
      }
    }
    
    static {
      defaultInstance = new TimeForMoveFullUp(true);
      defaultInstance.initFields();
    }
  }
  
  public interface ChatMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    boolean hasMessage();
    String getMessage();
  }
  public static final class ChatMessage extends
      com.google.protobuf.GeneratedMessage
      implements ChatMessageOrBuilder {
    private ChatMessage(Builder builder) {
      super(builder);
    }
    private ChatMessage(boolean noInit) {}
    
    private static final ChatMessage defaultInstance;
    public static ChatMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public ChatMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ChatMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ChatMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    public static final int MESSAGE_FIELD_NUMBER = 1;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getMessage() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          message_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getMessageBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getMessageBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bt.pt.BluetoothProtocol.ChatMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bt.pt.BluetoothProtocol.ChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ChatMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ChatMessage_fieldAccessorTable;
      }
      
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bt.pt.BluetoothProtocol.ChatMessage.getDescriptor();
      }
      
      public com.bt.pt.BluetoothProtocol.ChatMessage getDefaultInstanceForType() {
        return com.bt.pt.BluetoothProtocol.ChatMessage.getDefaultInstance();
      }
      
      public com.bt.pt.BluetoothProtocol.ChatMessage build() {
        com.bt.pt.BluetoothProtocol.ChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.bt.pt.BluetoothProtocol.ChatMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.bt.pt.BluetoothProtocol.ChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.bt.pt.BluetoothProtocol.ChatMessage buildPartial() {
        com.bt.pt.BluetoothProtocol.ChatMessage result = new com.bt.pt.BluetoothProtocol.ChatMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bt.pt.BluetoothProtocol.ChatMessage) {
          return mergeFrom((com.bt.pt.BluetoothProtocol.ChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.bt.pt.BluetoothProtocol.ChatMessage other) {
        if (other == com.bt.pt.BluetoothProtocol.ChatMessage.getDefaultInstance()) return this;
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasMessage()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              message_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getMessage() {
        java.lang.Object ref = message_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          message_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMessage(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        message_ = value;
        onChanged();
      }
    }
    
    static {
      defaultInstance = new ChatMessage(true);
      defaultInstance.initFields();
    }
  }
  
  public interface ExitFromGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class ExitFromGame extends
      com.google.protobuf.GeneratedMessage
      implements ExitFromGameOrBuilder {
    private ExitFromGame(Builder builder) {
      super(builder);
    }
    private ExitFromGame(boolean noInit) {}
    
    private static final ExitFromGame defaultInstance;
    public static ExitFromGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public ExitFromGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ExitFromGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ExitFromGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    public static final int OPPONENTID_FIELD_NUMBER = 1;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    private void initFields() {
      opponentId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasOpponentId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, opponentId_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, opponentId_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.bt.pt.BluetoothProtocol.ExitFromGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.bt.pt.BluetoothProtocol.ExitFromGame prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.bt.pt.BluetoothProtocol.ExitFromGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ExitFromGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.bt.pt.BluetoothProtocol.internal_static_net_bluetooth_protocol_ExitFromGame_fieldAccessorTable;
      }
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.bt.pt.BluetoothProtocol.ExitFromGame.getDescriptor();
      }
      
      public com.bt.pt.BluetoothProtocol.ExitFromGame getDefaultInstanceForType() {
        return com.bt.pt.BluetoothProtocol.ExitFromGame.getDefaultInstance();
      }
      
      public com.bt.pt.BluetoothProtocol.ExitFromGame build() {
        com.bt.pt.BluetoothProtocol.ExitFromGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.bt.pt.BluetoothProtocol.ExitFromGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.bt.pt.BluetoothProtocol.ExitFromGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.bt.pt.BluetoothProtocol.ExitFromGame buildPartial() {
        com.bt.pt.BluetoothProtocol.ExitFromGame result = new com.bt.pt.BluetoothProtocol.ExitFromGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.opponentId_ = opponentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.bt.pt.BluetoothProtocol.ExitFromGame) {
          return mergeFrom((com.bt.pt.BluetoothProtocol.ExitFromGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.bt.pt.BluetoothProtocol.ExitFromGame other) {
        if (other == com.bt.pt.BluetoothProtocol.ExitFromGame.getDefaultInstance()) return this;
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasOpponentId()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              opponentId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000001;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        onChanged();
        return this;
      }
    }
    
    static {
      defaultInstance = new ExitFromGame(true);
      defaultInstance.initFields();
    }
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_bluetooth_protocol_StartGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_bluetooth_protocol_StartGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_bluetooth_protocol_DidMove_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_bluetooth_protocol_DidMove_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_bluetooth_protocol_ContinueGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_bluetooth_protocol_ContinueGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_bluetooth_protocol_TimeForMoveFullUp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_bluetooth_protocol_TimeForMoveFullUp_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_bluetooth_protocol_ChatMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_bluetooth_protocol_ChatMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_bluetooth_protocol_ExitFromGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_bluetooth_protocol_ExitFromGame_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027BluetoothProtocol.proto\022\026net.bluetooth" +
      ".protocol\" \n\tStartGame\022\023\n\013oponentName\030\001 " +
      "\002(\t\"O\n\007DidMove\022\t\n\001i\030\001 \002(\005\022\t\n\001j\030\002 \002(\005\022.\n\004" +
      "type\030\003 \002(\0162 .net.bluetooth.protocol.Type" +
      "Move\"$\n\014ContinueGame\022\024\n\014continueGame\030\001 \002" +
      "(\010\"\'\n\021TimeForMoveFullUp\022\022\n\ntimeFullUp\030\001 " +
      "\002(\010\"\036\n\013ChatMessage\022\017\n\007message\030\001 \002(\t\"\"\n\014E" +
      "xitFromGame\022\022\n\nopponentId\030\001 \002(\005*\030\n\010TypeM" +
      "ove\022\005\n\001X\020\001\022\005\n\001O\020\002B+\n\026com.bluetooth.proto" +
      "colB\021BluetoothProtocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_bluetooth_protocol_StartGame_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_bluetooth_protocol_StartGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_bluetooth_protocol_StartGame_descriptor,
              new java.lang.String[] { "OponentName", },
              com.bt.pt.BluetoothProtocol.StartGame.class,
              com.bt.pt.BluetoothProtocol.StartGame.Builder.class);
          internal_static_net_bluetooth_protocol_DidMove_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_net_bluetooth_protocol_DidMove_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_bluetooth_protocol_DidMove_descriptor,
              new java.lang.String[] { "I", "J", "Type", },
              com.bt.pt.BluetoothProtocol.DidMove.class,
              com.bt.pt.BluetoothProtocol.DidMove.Builder.class);
          internal_static_net_bluetooth_protocol_ContinueGame_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_net_bluetooth_protocol_ContinueGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_bluetooth_protocol_ContinueGame_descriptor,
              new java.lang.String[] { "ContinueGame", },
              com.bt.pt.BluetoothProtocol.ContinueGame.class,
              com.bt.pt.BluetoothProtocol.ContinueGame.Builder.class);
          internal_static_net_bluetooth_protocol_TimeForMoveFullUp_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_net_bluetooth_protocol_TimeForMoveFullUp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_bluetooth_protocol_TimeForMoveFullUp_descriptor,
              new java.lang.String[] { "TimeFullUp", },
              com.bt.pt.BluetoothProtocol.TimeForMoveFullUp.class,
              com.bt.pt.BluetoothProtocol.TimeForMoveFullUp.Builder.class);
          internal_static_net_bluetooth_protocol_ChatMessage_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_net_bluetooth_protocol_ChatMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_bluetooth_protocol_ChatMessage_descriptor,
              new java.lang.String[] { "Message", },
              com.bt.pt.BluetoothProtocol.ChatMessage.class,
              com.bt.pt.BluetoothProtocol.ChatMessage.Builder.class);
          internal_static_net_bluetooth_protocol_ExitFromGame_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_net_bluetooth_protocol_ExitFromGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_bluetooth_protocol_ExitFromGame_descriptor,
              new java.lang.String[] { "OpponentId", },
              com.bt.pt.BluetoothProtocol.ExitFromGame.class,
              com.bt.pt.BluetoothProtocol.ExitFromGame.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
}
