
package net.pt;

public final class Protocol {
  private Protocol() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum RegistrationType
      implements com.google.protobuf.ProtocolMessageEnum {
    annonymous(0, 1),
    xo(1, 2),
    google(2, 3),
    facebook(3, 4),
    vk(4, 5),
    ;
    
    public static final int annonymous_VALUE = 1;
    public static final int xo_VALUE = 2;
    public static final int google_VALUE = 3;
    public static final int facebook_VALUE = 4;
    public static final int vk_VALUE = 5;
    
    
    public final int getNumber() { return value; }
    
    public static RegistrationType valueOf(int value) {
      switch (value) {
        case 1: return annonymous;
        case 2: return xo;
        case 3: return google;
        case 4: return facebook;
        case 5: return vk;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<RegistrationType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<RegistrationType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RegistrationType>() {
            public RegistrationType findValueByNumber(int number) {
              return RegistrationType.valueOf(number);
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
      return net.pt.Protocol.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final RegistrationType[] VALUES = {
      annonymous, xo, google, facebook, vk, 
    };
    
    public static RegistrationType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private RegistrationType(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
  
  public enum LoginProblem
      implements com.google.protobuf.ProtocolMessageEnum {
    nickOrPasswordUnCorrect(0, 1),
    accountUnlocked(1, 2),
    ;
    
    public static final int nickOrPasswordUnCorrect_VALUE = 1;
    public static final int accountUnlocked_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static LoginProblem valueOf(int value) {
      switch (value) {
        case 1: return nickOrPasswordUnCorrect;
        case 2: return accountUnlocked;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<LoginProblem>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<LoginProblem>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LoginProblem>() {
            public LoginProblem findValueByNumber(int number) {
              return LoginProblem.valueOf(number);
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
      return net.pt.Protocol.getDescriptor().getEnumTypes().get(1);
    }
    
    private static final LoginProblem[] VALUES = {
      nickOrPasswordUnCorrect, accountUnlocked, 
    };
    
    public static LoginProblem valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private LoginProblem(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
  
  public enum RegistrationProblem
      implements com.google.protobuf.ProtocolMessageEnum {
    emailUnCorrect(0, 1),
    nickUnCorrect(1, 2),
    ;
    
    public static final int emailUnCorrect_VALUE = 1;
    public static final int nickUnCorrect_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static RegistrationProblem valueOf(int value) {
      switch (value) {
        case 1: return emailUnCorrect;
        case 2: return nickUnCorrect;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<RegistrationProblem>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<RegistrationProblem>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RegistrationProblem>() {
            public RegistrationProblem findValueByNumber(int number) {
              return RegistrationProblem.valueOf(number);
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
      return net.pt.Protocol.getDescriptor().getEnumTypes().get(2);
    }
    
    private static final RegistrationProblem[] VALUES = {
      emailUnCorrect, nickUnCorrect, 
    };
    
    public static RegistrationProblem valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private RegistrationProblem(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
  
  public enum Sex
      implements com.google.protobuf.ProtocolMessageEnum {
    male(0, 1),
    female(1, 2),
    ;
    
    public static final int male_VALUE = 1;
    public static final int female_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static Sex valueOf(int value) {
      switch (value) {
        case 1: return male;
        case 2: return female;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<Sex>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<Sex>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Sex>() {
            public Sex findValueByNumber(int number) {
              return Sex.valueOf(number);
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
      return net.pt.Protocol.getDescriptor().getEnumTypes().get(3);
    }
    
    private static final Sex[] VALUES = {
      male, female, 
    };
    
    public static Sex valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private Sex(int index, int value) {
      this.index = index;
      this.value = value;
    }
  }
  
  public enum ResponseForRestorePassword
      implements com.google.protobuf.ProtocolMessageEnum {
    sendToEmail(0, 1),
    emailUnCorrected(1, 2),
    ;
    
    public static final int sendToEmail_VALUE = 1;
    public static final int emailUnCorrected_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static ResponseForRestorePassword valueOf(int value) {
      switch (value) {
        case 1: return sendToEmail;
        case 2: return emailUnCorrected;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ResponseForRestorePassword>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ResponseForRestorePassword>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResponseForRestorePassword>() {
            public ResponseForRestorePassword findValueByNumber(int number) {
              return ResponseForRestorePassword.valueOf(number);
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
      return net.pt.Protocol.getDescriptor().getEnumTypes().get(4);
    }
    
    private static final ResponseForRestorePassword[] VALUES = {
      sendToEmail, emailUnCorrected, 
    };
    
    public static ResponseForRestorePassword valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private ResponseForRestorePassword(int index, int value) {
      this.index = index;
      this.value = value;
    }
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
      return net.pt.Protocol.getDescriptor().getEnumTypes().get(5);
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
    
    // @@protoc_insertion_point(enum_scope:net.protocol.TypeMove)
  }
  
  public interface SLoginToGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string name = 1;
    boolean hasName();
    String getName();
    
    // required .net.protocol.RegistrationType registarionType = 2;
    boolean hasRegistarionType();
    net.pt.Protocol.RegistrationType getRegistarionType();
    
    // optional string uuid = 3;
    boolean hasUuid();
    String getUuid();
    
    // optional bool isBot = 4;
    boolean hasIsBot();
    boolean getIsBot();
    
    // optional float appVersion = 5;
    boolean hasAppVersion();
    float getAppVersion();
  }
  public static final class SLoginToGame extends
      com.google.protobuf.GeneratedMessage
      implements SLoginToGameOrBuilder {
    // Use SLoginToGame.newBuilder() to construct.
    private SLoginToGame(Builder builder) {
      super(builder);
    }
    private SLoginToGame(boolean noInit) {}
    
    private static final SLoginToGame defaultInstance;
    public static SLoginToGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public SLoginToGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SLoginToGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SLoginToGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required .net.protocol.RegistrationType registarionType = 2;
    public static final int REGISTARIONTYPE_FIELD_NUMBER = 2;
    private net.pt.Protocol.RegistrationType registarionType_;
    public boolean hasRegistarionType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public net.pt.Protocol.RegistrationType getRegistarionType() {
      return registarionType_;
    }
    
    // optional string uuid = 3;
    public static final int UUID_FIELD_NUMBER = 3;
    private java.lang.Object uuid_;
    public boolean hasUuid() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getUuid() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          uuid_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional bool isBot = 4;
    public static final int ISBOT_FIELD_NUMBER = 4;
    private boolean isBot_;
    public boolean hasIsBot() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public boolean getIsBot() {
      return isBot_;
    }
    
    // optional float appVersion = 5;
    public static final int APPVERSION_FIELD_NUMBER = 5;
    private float appVersion_;
    public boolean hasAppVersion() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public float getAppVersion() {
      return appVersion_;
    }
    
    private void initFields() {
      name_ = "";
      registarionType_ = net.pt.Protocol.RegistrationType.annonymous;
      uuid_ = "";
      isBot_ = false;
      appVersion_ = 0F;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRegistarionType()) {
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
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, registarionType_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getUuidBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBool(4, isBot_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFloat(5, appVersion_);
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, registarionType_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getUuidBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isBot_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, appVersion_);
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
    
    public static net.pt.Protocol.SLoginToGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SLoginToGame parseDelimitedFrom(
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
    public static net.pt.Protocol.SLoginToGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SLoginToGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SLoginToGame prototype) {
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
       implements net.pt.Protocol.SLoginToGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SLoginToGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SLoginToGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SLoginToGame.newBuilder()
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
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        registarionType_ = net.pt.Protocol.RegistrationType.annonymous;
        bitField0_ = (bitField0_ & ~0x00000002);
        uuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        isBot_ = false;
        bitField0_ = (bitField0_ & ~0x00000008);
        appVersion_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SLoginToGame.getDescriptor();
      }
      
      public net.pt.Protocol.SLoginToGame getDefaultInstanceForType() {
        return net.pt.Protocol.SLoginToGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.SLoginToGame build() {
        net.pt.Protocol.SLoginToGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SLoginToGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SLoginToGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SLoginToGame buildPartial() {
        net.pt.Protocol.SLoginToGame result = new net.pt.Protocol.SLoginToGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.registarionType_ = registarionType_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.uuid_ = uuid_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.isBot_ = isBot_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.appVersion_ = appVersion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SLoginToGame) {
          return mergeFrom((net.pt.Protocol.SLoginToGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SLoginToGame other) {
        if (other == net.pt.Protocol.SLoginToGame.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasRegistarionType()) {
          setRegistarionType(other.getRegistarionType());
        }
        if (other.hasUuid()) {
          setUuid(other.getUuid());
        }
        if (other.hasIsBot()) {
          setIsBot(other.getIsBot());
        }
        if (other.hasAppVersion()) {
          setAppVersion(other.getAppVersion());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasRegistarionType()) {
          
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
              name_ = input.readBytes();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              net.pt.Protocol.RegistrationType value = net.pt.Protocol.RegistrationType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                registarionType_ = value;
              }
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              uuid_ = input.readBytes();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              isBot_ = input.readBool();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              appVersion_ = input.readFloat();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // required .net.protocol.RegistrationType registarionType = 2;
      private net.pt.Protocol.RegistrationType registarionType_ = net.pt.Protocol.RegistrationType.annonymous;
      public boolean hasRegistarionType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public net.pt.Protocol.RegistrationType getRegistarionType() {
        return registarionType_;
      }
      public Builder setRegistarionType(net.pt.Protocol.RegistrationType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        registarionType_ = value;
        onChanged();
        return this;
      }
      public Builder clearRegistarionType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        registarionType_ = net.pt.Protocol.RegistrationType.annonymous;
        onChanged();
        return this;
      }
      
      // optional string uuid = 3;
      private java.lang.Object uuid_ = "";
      public boolean hasUuid() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getUuid() {
        java.lang.Object ref = uuid_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          uuid_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUuid(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        uuid_ = value;
        onChanged();
        return this;
      }
      public Builder clearUuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        uuid_ = getDefaultInstance().getUuid();
        onChanged();
        return this;
      }
      void setUuid(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        uuid_ = value;
        onChanged();
      }
      
      // optional bool isBot = 4;
      private boolean isBot_ ;
      public boolean hasIsBot() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public boolean getIsBot() {
        return isBot_;
      }
      public Builder setIsBot(boolean value) {
        bitField0_ |= 0x00000008;
        isBot_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsBot() {
        bitField0_ = (bitField0_ & ~0x00000008);
        isBot_ = false;
        onChanged();
        return this;
      }
      
      // optional float appVersion = 5;
      private float appVersion_ ;
      public boolean hasAppVersion() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public float getAppVersion() {
        return appVersion_;
      }
      public Builder setAppVersion(float value) {
        bitField0_ |= 0x00000010;
        appVersion_ = value;
        onChanged();
        return this;
      }
      public Builder clearAppVersion() {
        bitField0_ = (bitField0_ & ~0x00000010);
        appVersion_ = 0F;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SLoginToGame)
    }
    
    static {
      defaultInstance = new SLoginToGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SLoginToGame)
  }
  
  public interface CLoginToGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool isLogin = 2;
    boolean hasIsLogin();
    boolean getIsLogin();
    
    // optional int32 id = 1;
    boolean hasId();
    int getId();
    
    // optional .net.protocol.LoginProblem loginProblem = 3;
    boolean hasLoginProblem();
    net.pt.Protocol.LoginProblem getLoginProblem();
  }
  public static final class CLoginToGame extends
      com.google.protobuf.GeneratedMessage
      implements CLoginToGameOrBuilder {
    // Use CLoginToGame.newBuilder() to construct.
    private CLoginToGame(Builder builder) {
      super(builder);
    }
    private CLoginToGame(boolean noInit) {}
    
    private static final CLoginToGame defaultInstance;
    public static CLoginToGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public CLoginToGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CLoginToGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CLoginToGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool isLogin = 2;
    public static final int ISLOGIN_FIELD_NUMBER = 2;
    private boolean isLogin_;
    public boolean hasIsLogin() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getIsLogin() {
      return isLogin_;
    }
    
    // optional int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getId() {
      return id_;
    }
    
    // optional .net.protocol.LoginProblem loginProblem = 3;
    public static final int LOGINPROBLEM_FIELD_NUMBER = 3;
    private net.pt.Protocol.LoginProblem loginProblem_;
    public boolean hasLoginProblem() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public net.pt.Protocol.LoginProblem getLoginProblem() {
      return loginProblem_;
    }
    
    private void initFields() {
      isLogin_ = false;
      id_ = 0;
      loginProblem_ = net.pt.Protocol.LoginProblem.nickOrPasswordUnCorrect;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIsLogin()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBool(2, isLogin_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, loginProblem_.getNumber());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isLogin_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, loginProblem_.getNumber());
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
    
    public static net.pt.Protocol.CLoginToGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CLoginToGame parseDelimitedFrom(
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
    public static net.pt.Protocol.CLoginToGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CLoginToGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CLoginToGame prototype) {
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
       implements net.pt.Protocol.CLoginToGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CLoginToGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CLoginToGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CLoginToGame.newBuilder()
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
        isLogin_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        loginProblem_ = net.pt.Protocol.LoginProblem.nickOrPasswordUnCorrect;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CLoginToGame.getDescriptor();
      }
      
      public net.pt.Protocol.CLoginToGame getDefaultInstanceForType() {
        return net.pt.Protocol.CLoginToGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.CLoginToGame build() {
        net.pt.Protocol.CLoginToGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CLoginToGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CLoginToGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CLoginToGame buildPartial() {
        net.pt.Protocol.CLoginToGame result = new net.pt.Protocol.CLoginToGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isLogin_ = isLogin_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.loginProblem_ = loginProblem_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CLoginToGame) {
          return mergeFrom((net.pt.Protocol.CLoginToGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CLoginToGame other) {
        if (other == net.pt.Protocol.CLoginToGame.getDefaultInstance()) return this;
        if (other.hasIsLogin()) {
          setIsLogin(other.getIsLogin());
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasLoginProblem()) {
          setLoginProblem(other.getLoginProblem());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIsLogin()) {
          
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
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000001;
              isLogin_ = input.readBool();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              net.pt.Protocol.LoginProblem value = net.pt.Protocol.LoginProblem.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                loginProblem_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool isLogin = 2;
      private boolean isLogin_ ;
      public boolean hasIsLogin() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getIsLogin() {
        return isLogin_;
      }
      public Builder setIsLogin(boolean value) {
        bitField0_ |= 0x00000001;
        isLogin_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsLogin() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isLogin_ = false;
        onChanged();
        return this;
      }
      
      // optional int32 id = 1;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }
      
      // optional .net.protocol.LoginProblem loginProblem = 3;
      private net.pt.Protocol.LoginProblem loginProblem_ = net.pt.Protocol.LoginProblem.nickOrPasswordUnCorrect;
      public boolean hasLoginProblem() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public net.pt.Protocol.LoginProblem getLoginProblem() {
        return loginProblem_;
      }
      public Builder setLoginProblem(net.pt.Protocol.LoginProblem value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        loginProblem_ = value;
        onChanged();
        return this;
      }
      public Builder clearLoginProblem() {
        bitField0_ = (bitField0_ & ~0x00000004);
        loginProblem_ = net.pt.Protocol.LoginProblem.nickOrPasswordUnCorrect;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CLoginToGame)
    }
    
    static {
      defaultInstance = new CLoginToGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CLoginToGame)
  }
  
  public interface SRegistrationNewXOAccountOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string name = 1;
    boolean hasName();
    String getName();
    
    // required string password = 2;
    boolean hasPassword();
    String getPassword();
    
    // required string email = 3;
    boolean hasEmail();
    String getEmail();
    
    // required .net.protocol.Sex sex = 4;
    boolean hasSex();
    net.pt.Protocol.Sex getSex();
    
    // optional string country = 5;
    boolean hasCountry();
    String getCountry();
  }
  public static final class SRegistrationNewXOAccount extends
      com.google.protobuf.GeneratedMessage
      implements SRegistrationNewXOAccountOrBuilder {
    // Use SRegistrationNewXOAccount.newBuilder() to construct.
    private SRegistrationNewXOAccount(Builder builder) {
      super(builder);
    }
    private SRegistrationNewXOAccount(boolean noInit) {}
    
    private static final SRegistrationNewXOAccount defaultInstance;
    public static SRegistrationNewXOAccount getDefaultInstance() {
      return defaultInstance;
    }
    
    public SRegistrationNewXOAccount getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SRegistrationNewXOAccount_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SRegistrationNewXOAccount_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string password = 2;
    public static final int PASSWORD_FIELD_NUMBER = 2;
    private java.lang.Object password_;
    public boolean hasPassword() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getPassword() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          password_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getPasswordBytes() {
      java.lang.Object ref = password_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        password_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required string email = 3;
    public static final int EMAIL_FIELD_NUMBER = 3;
    private java.lang.Object email_;
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          email_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required .net.protocol.Sex sex = 4;
    public static final int SEX_FIELD_NUMBER = 4;
    private net.pt.Protocol.Sex sex_;
    public boolean hasSex() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public net.pt.Protocol.Sex getSex() {
      return sex_;
    }
    
    // optional string country = 5;
    public static final int COUNTRY_FIELD_NUMBER = 5;
    private java.lang.Object country_;
    public boolean hasCountry() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public String getCountry() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          country_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCountryBytes() {
      java.lang.Object ref = country_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        country_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      name_ = "";
      password_ = "";
      email_ = "";
      sex_ = net.pt.Protocol.Sex.male;
      country_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasPassword()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasEmail()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSex()) {
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
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getPasswordBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getEmailBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeEnum(4, sex_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getCountryBytes());
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getPasswordBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getEmailBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, sex_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getCountryBytes());
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
    
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseDelimitedFrom(
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
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SRegistrationNewXOAccount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SRegistrationNewXOAccount prototype) {
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
       implements net.pt.Protocol.SRegistrationNewXOAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SRegistrationNewXOAccount_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SRegistrationNewXOAccount_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SRegistrationNewXOAccount.newBuilder()
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
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        password_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        sex_ = net.pt.Protocol.Sex.male;
        bitField0_ = (bitField0_ & ~0x00000008);
        country_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SRegistrationNewXOAccount.getDescriptor();
      }
      
      public net.pt.Protocol.SRegistrationNewXOAccount getDefaultInstanceForType() {
        return net.pt.Protocol.SRegistrationNewXOAccount.getDefaultInstance();
      }
      
      public net.pt.Protocol.SRegistrationNewXOAccount build() {
        net.pt.Protocol.SRegistrationNewXOAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SRegistrationNewXOAccount buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SRegistrationNewXOAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SRegistrationNewXOAccount buildPartial() {
        net.pt.Protocol.SRegistrationNewXOAccount result = new net.pt.Protocol.SRegistrationNewXOAccount(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.password_ = password_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.email_ = email_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.sex_ = sex_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.country_ = country_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SRegistrationNewXOAccount) {
          return mergeFrom((net.pt.Protocol.SRegistrationNewXOAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SRegistrationNewXOAccount other) {
        if (other == net.pt.Protocol.SRegistrationNewXOAccount.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasPassword()) {
          setPassword(other.getPassword());
        }
        if (other.hasEmail()) {
          setEmail(other.getEmail());
        }
        if (other.hasSex()) {
          setSex(other.getSex());
        }
        if (other.hasCountry()) {
          setCountry(other.getCountry());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasPassword()) {
          
          return false;
        }
        if (!hasEmail()) {
          
          return false;
        }
        if (!hasSex()) {
          
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
              name_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              password_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              email_ = input.readBytes();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              net.pt.Protocol.Sex value = net.pt.Protocol.Sex.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                sex_ = value;
              }
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              country_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // required string password = 2;
      private java.lang.Object password_ = "";
      public boolean hasPassword() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getPassword() {
        java.lang.Object ref = password_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          password_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setPassword(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassword() {
        bitField0_ = (bitField0_ & ~0x00000002);
        password_ = getDefaultInstance().getPassword();
        onChanged();
        return this;
      }
      void setPassword(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        password_ = value;
        onChanged();
      }
      
      // required string email = 3;
      private java.lang.Object email_ = "";
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEmail(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
        return this;
      }
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000004);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      void setEmail(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        email_ = value;
        onChanged();
      }
      
      // required .net.protocol.Sex sex = 4;
      private net.pt.Protocol.Sex sex_ = net.pt.Protocol.Sex.male;
      public boolean hasSex() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public net.pt.Protocol.Sex getSex() {
        return sex_;
      }
      public Builder setSex(net.pt.Protocol.Sex value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        sex_ = value;
        onChanged();
        return this;
      }
      public Builder clearSex() {
        bitField0_ = (bitField0_ & ~0x00000008);
        sex_ = net.pt.Protocol.Sex.male;
        onChanged();
        return this;
      }
      
      // optional string country = 5;
      private java.lang.Object country_ = "";
      public boolean hasCountry() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public String getCountry() {
        java.lang.Object ref = country_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          country_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setCountry(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        country_ = value;
        onChanged();
        return this;
      }
      public Builder clearCountry() {
        bitField0_ = (bitField0_ & ~0x00000010);
        country_ = getDefaultInstance().getCountry();
        onChanged();
        return this;
      }
      void setCountry(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000010;
        country_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SRegistrationNewXOAccount)
    }
    
    static {
      defaultInstance = new SRegistrationNewXOAccount(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SRegistrationNewXOAccount)
  }
  
  public interface CRegistrationNewXOAccountOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool isRegistred = 1;
    boolean hasIsRegistred();
    boolean getIsRegistred();
    
    // optional .net.protocol.RegistrationProblem problem = 2;
    boolean hasProblem();
    net.pt.Protocol.RegistrationProblem getProblem();
  }
  public static final class CRegistrationNewXOAccount extends
      com.google.protobuf.GeneratedMessage
      implements CRegistrationNewXOAccountOrBuilder {
    // Use CRegistrationNewXOAccount.newBuilder() to construct.
    private CRegistrationNewXOAccount(Builder builder) {
      super(builder);
    }
    private CRegistrationNewXOAccount(boolean noInit) {}
    
    private static final CRegistrationNewXOAccount defaultInstance;
    public static CRegistrationNewXOAccount getDefaultInstance() {
      return defaultInstance;
    }
    
    public CRegistrationNewXOAccount getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CRegistrationNewXOAccount_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CRegistrationNewXOAccount_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool isRegistred = 1;
    public static final int ISREGISTRED_FIELD_NUMBER = 1;
    private boolean isRegistred_;
    public boolean hasIsRegistred() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getIsRegistred() {
      return isRegistred_;
    }
    
    // optional .net.protocol.RegistrationProblem problem = 2;
    public static final int PROBLEM_FIELD_NUMBER = 2;
    private net.pt.Protocol.RegistrationProblem problem_;
    public boolean hasProblem() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public net.pt.Protocol.RegistrationProblem getProblem() {
      return problem_;
    }
    
    private void initFields() {
      isRegistred_ = false;
      problem_ = net.pt.Protocol.RegistrationProblem.emailUnCorrect;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIsRegistred()) {
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
        output.writeBool(1, isRegistred_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, problem_.getNumber());
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
          .computeBoolSize(1, isRegistred_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, problem_.getNumber());
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
    
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseDelimitedFrom(
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
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CRegistrationNewXOAccount parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CRegistrationNewXOAccount prototype) {
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
       implements net.pt.Protocol.CRegistrationNewXOAccountOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CRegistrationNewXOAccount_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CRegistrationNewXOAccount_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CRegistrationNewXOAccount.newBuilder()
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
        isRegistred_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        problem_ = net.pt.Protocol.RegistrationProblem.emailUnCorrect;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CRegistrationNewXOAccount.getDescriptor();
      }
      
      public net.pt.Protocol.CRegistrationNewXOAccount getDefaultInstanceForType() {
        return net.pt.Protocol.CRegistrationNewXOAccount.getDefaultInstance();
      }
      
      public net.pt.Protocol.CRegistrationNewXOAccount build() {
        net.pt.Protocol.CRegistrationNewXOAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CRegistrationNewXOAccount buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CRegistrationNewXOAccount result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CRegistrationNewXOAccount buildPartial() {
        net.pt.Protocol.CRegistrationNewXOAccount result = new net.pt.Protocol.CRegistrationNewXOAccount(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isRegistred_ = isRegistred_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.problem_ = problem_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CRegistrationNewXOAccount) {
          return mergeFrom((net.pt.Protocol.CRegistrationNewXOAccount)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CRegistrationNewXOAccount other) {
        if (other == net.pt.Protocol.CRegistrationNewXOAccount.getDefaultInstance()) return this;
        if (other.hasIsRegistred()) {
          setIsRegistred(other.getIsRegistred());
        }
        if (other.hasProblem()) {
          setProblem(other.getProblem());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIsRegistred()) {
          
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
              isRegistred_ = input.readBool();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              net.pt.Protocol.RegistrationProblem value = net.pt.Protocol.RegistrationProblem.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                problem_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool isRegistred = 1;
      private boolean isRegistred_ ;
      public boolean hasIsRegistred() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getIsRegistred() {
        return isRegistred_;
      }
      public Builder setIsRegistred(boolean value) {
        bitField0_ |= 0x00000001;
        isRegistred_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsRegistred() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isRegistred_ = false;
        onChanged();
        return this;
      }
      
      // optional .net.protocol.RegistrationProblem problem = 2;
      private net.pt.Protocol.RegistrationProblem problem_ = net.pt.Protocol.RegistrationProblem.emailUnCorrect;
      public boolean hasProblem() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public net.pt.Protocol.RegistrationProblem getProblem() {
        return problem_;
      }
      public Builder setProblem(net.pt.Protocol.RegistrationProblem value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        problem_ = value;
        onChanged();
        return this;
      }
      public Builder clearProblem() {
        bitField0_ = (bitField0_ & ~0x00000002);
        problem_ = net.pt.Protocol.RegistrationProblem.emailUnCorrect;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CRegistrationNewXOAccount)
    }
    
    static {
      defaultInstance = new CRegistrationNewXOAccount(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CRegistrationNewXOAccount)
  }
  
  public interface SForgotXOAccountPasswordOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string email = 1;
    boolean hasEmail();
    String getEmail();
  }
  public static final class SForgotXOAccountPassword extends
      com.google.protobuf.GeneratedMessage
      implements SForgotXOAccountPasswordOrBuilder {
    // Use SForgotXOAccountPassword.newBuilder() to construct.
    private SForgotXOAccountPassword(Builder builder) {
      super(builder);
    }
    private SForgotXOAccountPassword(boolean noInit) {}
    
    private static final SForgotXOAccountPassword defaultInstance;
    public static SForgotXOAccountPassword getDefaultInstance() {
      return defaultInstance;
    }
    
    public SForgotXOAccountPassword getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SForgotXOAccountPassword_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SForgotXOAccountPassword_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string email = 1;
    public static final int EMAIL_FIELD_NUMBER = 1;
    private java.lang.Object email_;
    public boolean hasEmail() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getEmail() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          email_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEmailBytes() {
      java.lang.Object ref = email_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        email_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      email_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasEmail()) {
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
        output.writeBytes(1, getEmailBytes());
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
          .computeBytesSize(1, getEmailBytes());
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
    
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseDelimitedFrom(
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
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SForgotXOAccountPassword parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SForgotXOAccountPassword prototype) {
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
       implements net.pt.Protocol.SForgotXOAccountPasswordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SForgotXOAccountPassword_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SForgotXOAccountPassword_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SForgotXOAccountPassword.newBuilder()
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
        email_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SForgotXOAccountPassword.getDescriptor();
      }
      
      public net.pt.Protocol.SForgotXOAccountPassword getDefaultInstanceForType() {
        return net.pt.Protocol.SForgotXOAccountPassword.getDefaultInstance();
      }
      
      public net.pt.Protocol.SForgotXOAccountPassword build() {
        net.pt.Protocol.SForgotXOAccountPassword result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SForgotXOAccountPassword buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SForgotXOAccountPassword result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SForgotXOAccountPassword buildPartial() {
        net.pt.Protocol.SForgotXOAccountPassword result = new net.pt.Protocol.SForgotXOAccountPassword(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.email_ = email_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SForgotXOAccountPassword) {
          return mergeFrom((net.pt.Protocol.SForgotXOAccountPassword)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SForgotXOAccountPassword other) {
        if (other == net.pt.Protocol.SForgotXOAccountPassword.getDefaultInstance()) return this;
        if (other.hasEmail()) {
          setEmail(other.getEmail());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasEmail()) {
          
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
              email_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string email = 1;
      private java.lang.Object email_ = "";
      public boolean hasEmail() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getEmail() {
        java.lang.Object ref = email_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          email_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEmail(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        email_ = value;
        onChanged();
        return this;
      }
      public Builder clearEmail() {
        bitField0_ = (bitField0_ & ~0x00000001);
        email_ = getDefaultInstance().getEmail();
        onChanged();
        return this;
      }
      void setEmail(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        email_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SForgotXOAccountPassword)
    }
    
    static {
      defaultInstance = new SForgotXOAccountPassword(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SForgotXOAccountPassword)
  }
  
  public interface CForgotXOAccountPasswordOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required .net.protocol.ResponseForRestorePassword pesponse = 1;
    boolean hasPesponse();
    net.pt.Protocol.ResponseForRestorePassword getPesponse();
  }
  public static final class CForgotXOAccountPassword extends
      com.google.protobuf.GeneratedMessage
      implements CForgotXOAccountPasswordOrBuilder {
    // Use CForgotXOAccountPassword.newBuilder() to construct.
    private CForgotXOAccountPassword(Builder builder) {
      super(builder);
    }
    private CForgotXOAccountPassword(boolean noInit) {}
    
    private static final CForgotXOAccountPassword defaultInstance;
    public static CForgotXOAccountPassword getDefaultInstance() {
      return defaultInstance;
    }
    
    public CForgotXOAccountPassword getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CForgotXOAccountPassword_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CForgotXOAccountPassword_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required .net.protocol.ResponseForRestorePassword pesponse = 1;
    public static final int PESPONSE_FIELD_NUMBER = 1;
    private net.pt.Protocol.ResponseForRestorePassword pesponse_;
    public boolean hasPesponse() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public net.pt.Protocol.ResponseForRestorePassword getPesponse() {
      return pesponse_;
    }
    
    private void initFields() {
      pesponse_ = net.pt.Protocol.ResponseForRestorePassword.sendToEmail;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPesponse()) {
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
        output.writeEnum(1, pesponse_.getNumber());
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
          .computeEnumSize(1, pesponse_.getNumber());
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
    
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseDelimitedFrom(
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
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CForgotXOAccountPassword parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CForgotXOAccountPassword prototype) {
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
       implements net.pt.Protocol.CForgotXOAccountPasswordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CForgotXOAccountPassword_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CForgotXOAccountPassword_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CForgotXOAccountPassword.newBuilder()
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
        pesponse_ = net.pt.Protocol.ResponseForRestorePassword.sendToEmail;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CForgotXOAccountPassword.getDescriptor();
      }
      
      public net.pt.Protocol.CForgotXOAccountPassword getDefaultInstanceForType() {
        return net.pt.Protocol.CForgotXOAccountPassword.getDefaultInstance();
      }
      
      public net.pt.Protocol.CForgotXOAccountPassword build() {
        net.pt.Protocol.CForgotXOAccountPassword result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CForgotXOAccountPassword buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CForgotXOAccountPassword result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CForgotXOAccountPassword buildPartial() {
        net.pt.Protocol.CForgotXOAccountPassword result = new net.pt.Protocol.CForgotXOAccountPassword(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.pesponse_ = pesponse_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CForgotXOAccountPassword) {
          return mergeFrom((net.pt.Protocol.CForgotXOAccountPassword)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CForgotXOAccountPassword other) {
        if (other == net.pt.Protocol.CForgotXOAccountPassword.getDefaultInstance()) return this;
        if (other.hasPesponse()) {
          setPesponse(other.getPesponse());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPesponse()) {
          
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
              int rawValue = input.readEnum();
              net.pt.Protocol.ResponseForRestorePassword value = net.pt.Protocol.ResponseForRestorePassword.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                pesponse_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required .net.protocol.ResponseForRestorePassword pesponse = 1;
      private net.pt.Protocol.ResponseForRestorePassword pesponse_ = net.pt.Protocol.ResponseForRestorePassword.sendToEmail;
      public boolean hasPesponse() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public net.pt.Protocol.ResponseForRestorePassword getPesponse() {
        return pesponse_;
      }
      public Builder setPesponse(net.pt.Protocol.ResponseForRestorePassword value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        pesponse_ = value;
        onChanged();
        return this;
      }
      public Builder clearPesponse() {
        bitField0_ = (bitField0_ & ~0x00000001);
        pesponse_ = net.pt.Protocol.ResponseForRestorePassword.sendToEmail;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CForgotXOAccountPassword)
    }
    
    static {
      defaultInstance = new CForgotXOAccountPassword(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CForgotXOAccountPassword)
  }
  
  public interface CUpdateAboutActivityPlayerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .net.protocol.Player newPlayer = 1;
    java.util.List<net.pt.Protocol.Player> 
        getNewPlayerList();
    net.pt.Protocol.Player getNewPlayer(int index);
    int getNewPlayerCount();
    java.util.List<? extends net.pt.Protocol.PlayerOrBuilder> 
        getNewPlayerOrBuilderList();
    net.pt.Protocol.PlayerOrBuilder getNewPlayerOrBuilder(
        int index);
    
    // repeated .net.protocol.CExitFromGroup exitPlayer = 2;
    java.util.List<net.pt.Protocol.CExitFromGroup> 
        getExitPlayerList();
    net.pt.Protocol.CExitFromGroup getExitPlayer(int index);
    int getExitPlayerCount();
    java.util.List<? extends net.pt.Protocol.CExitFromGroupOrBuilder> 
        getExitPlayerOrBuilderList();
    net.pt.Protocol.CExitFromGroupOrBuilder getExitPlayerOrBuilder(
        int index);
    
    // required int32 groupId = 3;
    boolean hasGroupId();
    int getGroupId();
  }
  public static final class CUpdateAboutActivityPlayer extends
      com.google.protobuf.GeneratedMessage
      implements CUpdateAboutActivityPlayerOrBuilder {
    // Use CUpdateAboutActivityPlayer.newBuilder() to construct.
    private CUpdateAboutActivityPlayer(Builder builder) {
      super(builder);
    }
    private CUpdateAboutActivityPlayer(boolean noInit) {}
    
    private static final CUpdateAboutActivityPlayer defaultInstance;
    public static CUpdateAboutActivityPlayer getDefaultInstance() {
      return defaultInstance;
    }
    
    public CUpdateAboutActivityPlayer getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CUpdateAboutActivityPlayer_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CUpdateAboutActivityPlayer_fieldAccessorTable;
    }
    
    private int bitField0_;
    // repeated .net.protocol.Player newPlayer = 1;
    public static final int NEWPLAYER_FIELD_NUMBER = 1;
    private java.util.List<net.pt.Protocol.Player> newPlayer_;
    public java.util.List<net.pt.Protocol.Player> getNewPlayerList() {
      return newPlayer_;
    }
    public java.util.List<? extends net.pt.Protocol.PlayerOrBuilder> 
        getNewPlayerOrBuilderList() {
      return newPlayer_;
    }
    public int getNewPlayerCount() {
      return newPlayer_.size();
    }
    public net.pt.Protocol.Player getNewPlayer(int index) {
      return newPlayer_.get(index);
    }
    public net.pt.Protocol.PlayerOrBuilder getNewPlayerOrBuilder(
        int index) {
      return newPlayer_.get(index);
    }
    
    // repeated .net.protocol.CExitFromGroup exitPlayer = 2;
    public static final int EXITPLAYER_FIELD_NUMBER = 2;
    private java.util.List<net.pt.Protocol.CExitFromGroup> exitPlayer_;
    public java.util.List<net.pt.Protocol.CExitFromGroup> getExitPlayerList() {
      return exitPlayer_;
    }
    public java.util.List<? extends net.pt.Protocol.CExitFromGroupOrBuilder> 
        getExitPlayerOrBuilderList() {
      return exitPlayer_;
    }
    public int getExitPlayerCount() {
      return exitPlayer_.size();
    }
    public net.pt.Protocol.CExitFromGroup getExitPlayer(int index) {
      return exitPlayer_.get(index);
    }
    public net.pt.Protocol.CExitFromGroupOrBuilder getExitPlayerOrBuilder(
        int index) {
      return exitPlayer_.get(index);
    }
    
    // required int32 groupId = 3;
    public static final int GROUPID_FIELD_NUMBER = 3;
    private int groupId_;
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getGroupId() {
      return groupId_;
    }
    
    private void initFields() {
      newPlayer_ = java.util.Collections.emptyList();
      exitPlayer_ = java.util.Collections.emptyList();
      groupId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getNewPlayerCount(); i++) {
        if (!getNewPlayer(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getExitPlayerCount(); i++) {
        if (!getExitPlayer(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < newPlayer_.size(); i++) {
        output.writeMessage(1, newPlayer_.get(i));
      }
      for (int i = 0; i < exitPlayer_.size(); i++) {
        output.writeMessage(2, exitPlayer_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(3, groupId_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < newPlayer_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, newPlayer_.get(i));
      }
      for (int i = 0; i < exitPlayer_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, exitPlayer_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, groupId_);
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
    
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseDelimitedFrom(
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
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CUpdateAboutActivityPlayer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CUpdateAboutActivityPlayer prototype) {
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
       implements net.pt.Protocol.CUpdateAboutActivityPlayerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CUpdateAboutActivityPlayer_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CUpdateAboutActivityPlayer_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CUpdateAboutActivityPlayer.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getNewPlayerFieldBuilder();
          getExitPlayerFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (newPlayerBuilder_ == null) {
          newPlayer_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          newPlayerBuilder_.clear();
        }
        if (exitPlayerBuilder_ == null) {
          exitPlayer_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          exitPlayerBuilder_.clear();
        }
        groupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CUpdateAboutActivityPlayer.getDescriptor();
      }
      
      public net.pt.Protocol.CUpdateAboutActivityPlayer getDefaultInstanceForType() {
        return net.pt.Protocol.CUpdateAboutActivityPlayer.getDefaultInstance();
      }
      
      public net.pt.Protocol.CUpdateAboutActivityPlayer build() {
        net.pt.Protocol.CUpdateAboutActivityPlayer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CUpdateAboutActivityPlayer buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CUpdateAboutActivityPlayer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CUpdateAboutActivityPlayer buildPartial() {
        net.pt.Protocol.CUpdateAboutActivityPlayer result = new net.pt.Protocol.CUpdateAboutActivityPlayer(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (newPlayerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            newPlayer_ = java.util.Collections.unmodifiableList(newPlayer_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.newPlayer_ = newPlayer_;
        } else {
          result.newPlayer_ = newPlayerBuilder_.build();
        }
        if (exitPlayerBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            exitPlayer_ = java.util.Collections.unmodifiableList(exitPlayer_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.exitPlayer_ = exitPlayer_;
        } else {
          result.exitPlayer_ = exitPlayerBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CUpdateAboutActivityPlayer) {
          return mergeFrom((net.pt.Protocol.CUpdateAboutActivityPlayer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CUpdateAboutActivityPlayer other) {
        if (other == net.pt.Protocol.CUpdateAboutActivityPlayer.getDefaultInstance()) return this;
        if (newPlayerBuilder_ == null) {
          if (!other.newPlayer_.isEmpty()) {
            if (newPlayer_.isEmpty()) {
              newPlayer_ = other.newPlayer_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNewPlayerIsMutable();
              newPlayer_.addAll(other.newPlayer_);
            }
            onChanged();
          }
        } else {
          if (!other.newPlayer_.isEmpty()) {
            if (newPlayerBuilder_.isEmpty()) {
              newPlayerBuilder_.dispose();
              newPlayerBuilder_ = null;
              newPlayer_ = other.newPlayer_;
              bitField0_ = (bitField0_ & ~0x00000001);
              newPlayerBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getNewPlayerFieldBuilder() : null;
            } else {
              newPlayerBuilder_.addAllMessages(other.newPlayer_);
            }
          }
        }
        if (exitPlayerBuilder_ == null) {
          if (!other.exitPlayer_.isEmpty()) {
            if (exitPlayer_.isEmpty()) {
              exitPlayer_ = other.exitPlayer_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureExitPlayerIsMutable();
              exitPlayer_.addAll(other.exitPlayer_);
            }
            onChanged();
          }
        } else {
          if (!other.exitPlayer_.isEmpty()) {
            if (exitPlayerBuilder_.isEmpty()) {
              exitPlayerBuilder_.dispose();
              exitPlayerBuilder_ = null;
              exitPlayer_ = other.exitPlayer_;
              bitField0_ = (bitField0_ & ~0x00000002);
              exitPlayerBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getExitPlayerFieldBuilder() : null;
            } else {
              exitPlayerBuilder_.addAllMessages(other.exitPlayer_);
            }
          }
        }
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasGroupId()) {
          
          return false;
        }
        for (int i = 0; i < getNewPlayerCount(); i++) {
          if (!getNewPlayer(i).isInitialized()) {
            
            return false;
          }
        }
        for (int i = 0; i < getExitPlayerCount(); i++) {
          if (!getExitPlayer(i).isInitialized()) {
            
            return false;
          }
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
              net.pt.Protocol.Player.Builder subBuilder = net.pt.Protocol.Player.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addNewPlayer(subBuilder.buildPartial());
              break;
            }
            case 18: {
              net.pt.Protocol.CExitFromGroup.Builder subBuilder = net.pt.Protocol.CExitFromGroup.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addExitPlayer(subBuilder.buildPartial());
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              groupId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .net.protocol.Player newPlayer = 1;
      private java.util.List<net.pt.Protocol.Player> newPlayer_ =
        java.util.Collections.emptyList();
      private void ensureNewPlayerIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          newPlayer_ = new java.util.ArrayList<net.pt.Protocol.Player>(newPlayer_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.Player, net.pt.Protocol.Player.Builder, net.pt.Protocol.PlayerOrBuilder> newPlayerBuilder_;
      
      public java.util.List<net.pt.Protocol.Player> getNewPlayerList() {
        if (newPlayerBuilder_ == null) {
          return java.util.Collections.unmodifiableList(newPlayer_);
        } else {
          return newPlayerBuilder_.getMessageList();
        }
      }
      public int getNewPlayerCount() {
        if (newPlayerBuilder_ == null) {
          return newPlayer_.size();
        } else {
          return newPlayerBuilder_.getCount();
        }
      }
      public net.pt.Protocol.Player getNewPlayer(int index) {
        if (newPlayerBuilder_ == null) {
          return newPlayer_.get(index);
        } else {
          return newPlayerBuilder_.getMessage(index);
        }
      }
      public Builder setNewPlayer(
          int index, net.pt.Protocol.Player value) {
        if (newPlayerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNewPlayerIsMutable();
          newPlayer_.set(index, value);
          onChanged();
        } else {
          newPlayerBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setNewPlayer(
          int index, net.pt.Protocol.Player.Builder builderForValue) {
        if (newPlayerBuilder_ == null) {
          ensureNewPlayerIsMutable();
          newPlayer_.set(index, builderForValue.build());
          onChanged();
        } else {
          newPlayerBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addNewPlayer(net.pt.Protocol.Player value) {
        if (newPlayerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNewPlayerIsMutable();
          newPlayer_.add(value);
          onChanged();
        } else {
          newPlayerBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addNewPlayer(
          int index, net.pt.Protocol.Player value) {
        if (newPlayerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNewPlayerIsMutable();
          newPlayer_.add(index, value);
          onChanged();
        } else {
          newPlayerBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addNewPlayer(
          net.pt.Protocol.Player.Builder builderForValue) {
        if (newPlayerBuilder_ == null) {
          ensureNewPlayerIsMutable();
          newPlayer_.add(builderForValue.build());
          onChanged();
        } else {
          newPlayerBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addNewPlayer(
          int index, net.pt.Protocol.Player.Builder builderForValue) {
        if (newPlayerBuilder_ == null) {
          ensureNewPlayerIsMutable();
          newPlayer_.add(index, builderForValue.build());
          onChanged();
        } else {
          newPlayerBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllNewPlayer(
          java.lang.Iterable<? extends net.pt.Protocol.Player> values) {
        if (newPlayerBuilder_ == null) {
          ensureNewPlayerIsMutable();
          super.addAll(values, newPlayer_);
          onChanged();
        } else {
          newPlayerBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearNewPlayer() {
        if (newPlayerBuilder_ == null) {
          newPlayer_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          newPlayerBuilder_.clear();
        }
        return this;
      }
      public Builder removeNewPlayer(int index) {
        if (newPlayerBuilder_ == null) {
          ensureNewPlayerIsMutable();
          newPlayer_.remove(index);
          onChanged();
        } else {
          newPlayerBuilder_.remove(index);
        }
        return this;
      }
      public net.pt.Protocol.Player.Builder getNewPlayerBuilder(
          int index) {
        return getNewPlayerFieldBuilder().getBuilder(index);
      }
      public net.pt.Protocol.PlayerOrBuilder getNewPlayerOrBuilder(
          int index) {
        if (newPlayerBuilder_ == null) {
          return newPlayer_.get(index);  } else {
          return newPlayerBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pt.Protocol.PlayerOrBuilder> 
           getNewPlayerOrBuilderList() {
        if (newPlayerBuilder_ != null) {
          return newPlayerBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(newPlayer_);
        }
      }
      public net.pt.Protocol.Player.Builder addNewPlayerBuilder() {
        return getNewPlayerFieldBuilder().addBuilder(
            net.pt.Protocol.Player.getDefaultInstance());
      }
      public net.pt.Protocol.Player.Builder addNewPlayerBuilder(
          int index) {
        return getNewPlayerFieldBuilder().addBuilder(
            index, net.pt.Protocol.Player.getDefaultInstance());
      }
      public java.util.List<net.pt.Protocol.Player.Builder> 
           getNewPlayerBuilderList() {
        return getNewPlayerFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.Player, net.pt.Protocol.Player.Builder, net.pt.Protocol.PlayerOrBuilder> 
          getNewPlayerFieldBuilder() {
        if (newPlayerBuilder_ == null) {
          newPlayerBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pt.Protocol.Player, net.pt.Protocol.Player.Builder, net.pt.Protocol.PlayerOrBuilder>(
                  newPlayer_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          newPlayer_ = null;
        }
        return newPlayerBuilder_;
      }
      
      // repeated .net.protocol.CExitFromGroup exitPlayer = 2;
      private java.util.List<net.pt.Protocol.CExitFromGroup> exitPlayer_ =
        java.util.Collections.emptyList();
      private void ensureExitPlayerIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          exitPlayer_ = new java.util.ArrayList<net.pt.Protocol.CExitFromGroup>(exitPlayer_);
          bitField0_ |= 0x00000002;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.CExitFromGroup, net.pt.Protocol.CExitFromGroup.Builder, net.pt.Protocol.CExitFromGroupOrBuilder> exitPlayerBuilder_;
      
      public java.util.List<net.pt.Protocol.CExitFromGroup> getExitPlayerList() {
        if (exitPlayerBuilder_ == null) {
          return java.util.Collections.unmodifiableList(exitPlayer_);
        } else {
          return exitPlayerBuilder_.getMessageList();
        }
      }
      public int getExitPlayerCount() {
        if (exitPlayerBuilder_ == null) {
          return exitPlayer_.size();
        } else {
          return exitPlayerBuilder_.getCount();
        }
      }
      public net.pt.Protocol.CExitFromGroup getExitPlayer(int index) {
        if (exitPlayerBuilder_ == null) {
          return exitPlayer_.get(index);
        } else {
          return exitPlayerBuilder_.getMessage(index);
        }
      }
      public Builder setExitPlayer(
          int index, net.pt.Protocol.CExitFromGroup value) {
        if (exitPlayerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExitPlayerIsMutable();
          exitPlayer_.set(index, value);
          onChanged();
        } else {
          exitPlayerBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setExitPlayer(
          int index, net.pt.Protocol.CExitFromGroup.Builder builderForValue) {
        if (exitPlayerBuilder_ == null) {
          ensureExitPlayerIsMutable();
          exitPlayer_.set(index, builderForValue.build());
          onChanged();
        } else {
          exitPlayerBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addExitPlayer(net.pt.Protocol.CExitFromGroup value) {
        if (exitPlayerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExitPlayerIsMutable();
          exitPlayer_.add(value);
          onChanged();
        } else {
          exitPlayerBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addExitPlayer(
          int index, net.pt.Protocol.CExitFromGroup value) {
        if (exitPlayerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureExitPlayerIsMutable();
          exitPlayer_.add(index, value);
          onChanged();
        } else {
          exitPlayerBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addExitPlayer(
          net.pt.Protocol.CExitFromGroup.Builder builderForValue) {
        if (exitPlayerBuilder_ == null) {
          ensureExitPlayerIsMutable();
          exitPlayer_.add(builderForValue.build());
          onChanged();
        } else {
          exitPlayerBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addExitPlayer(
          int index, net.pt.Protocol.CExitFromGroup.Builder builderForValue) {
        if (exitPlayerBuilder_ == null) {
          ensureExitPlayerIsMutable();
          exitPlayer_.add(index, builderForValue.build());
          onChanged();
        } else {
          exitPlayerBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllExitPlayer(
          java.lang.Iterable<? extends net.pt.Protocol.CExitFromGroup> values) {
        if (exitPlayerBuilder_ == null) {
          ensureExitPlayerIsMutable();
          super.addAll(values, exitPlayer_);
          onChanged();
        } else {
          exitPlayerBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearExitPlayer() {
        if (exitPlayerBuilder_ == null) {
          exitPlayer_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          exitPlayerBuilder_.clear();
        }
        return this;
      }
      public Builder removeExitPlayer(int index) {
        if (exitPlayerBuilder_ == null) {
          ensureExitPlayerIsMutable();
          exitPlayer_.remove(index);
          onChanged();
        } else {
          exitPlayerBuilder_.remove(index);
        }
        return this;
      }
      public net.pt.Protocol.CExitFromGroup.Builder getExitPlayerBuilder(
          int index) {
        return getExitPlayerFieldBuilder().getBuilder(index);
      }
      public net.pt.Protocol.CExitFromGroupOrBuilder getExitPlayerOrBuilder(
          int index) {
        if (exitPlayerBuilder_ == null) {
          return exitPlayer_.get(index);  } else {
          return exitPlayerBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pt.Protocol.CExitFromGroupOrBuilder> 
           getExitPlayerOrBuilderList() {
        if (exitPlayerBuilder_ != null) {
          return exitPlayerBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(exitPlayer_);
        }
      }
      public net.pt.Protocol.CExitFromGroup.Builder addExitPlayerBuilder() {
        return getExitPlayerFieldBuilder().addBuilder(
            net.pt.Protocol.CExitFromGroup.getDefaultInstance());
      }
      public net.pt.Protocol.CExitFromGroup.Builder addExitPlayerBuilder(
          int index) {
        return getExitPlayerFieldBuilder().addBuilder(
            index, net.pt.Protocol.CExitFromGroup.getDefaultInstance());
      }
      public java.util.List<net.pt.Protocol.CExitFromGroup.Builder> 
           getExitPlayerBuilderList() {
        return getExitPlayerFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.CExitFromGroup, net.pt.Protocol.CExitFromGroup.Builder, net.pt.Protocol.CExitFromGroupOrBuilder> 
          getExitPlayerFieldBuilder() {
        if (exitPlayerBuilder_ == null) {
          exitPlayerBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pt.Protocol.CExitFromGroup, net.pt.Protocol.CExitFromGroup.Builder, net.pt.Protocol.CExitFromGroupOrBuilder>(
                  exitPlayer_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          exitPlayer_ = null;
        }
        return exitPlayerBuilder_;
      }
      
      // required int32 groupId = 3;
      private int groupId_ ;
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getGroupId() {
        return groupId_;
      }
      public Builder setGroupId(int value) {
        bitField0_ |= 0x00000004;
        groupId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        groupId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CUpdateAboutActivityPlayer)
    }
    
    static {
      defaultInstance = new CUpdateAboutActivityPlayer(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CUpdateAboutActivityPlayer)
  }
  
  public interface SGetUpdateOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 id = 1;
    boolean hasId();
    int getId();
    
    // required int32 groupId = 2;
    boolean hasGroupId();
    int getGroupId();
  }
  public static final class SGetUpdate extends
      com.google.protobuf.GeneratedMessage
      implements SGetUpdateOrBuilder {
    // Use SGetUpdate.newBuilder() to construct.
    private SGetUpdate(Builder builder) {
      super(builder);
    }
    private SGetUpdate(boolean noInit) {}
    
    private static final SGetUpdate defaultInstance;
    public static SGetUpdate getDefaultInstance() {
      return defaultInstance;
    }
    
    public SGetUpdate getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SGetUpdate_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SGetUpdate_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getId() {
      return id_;
    }
    
    // required int32 groupId = 2;
    public static final int GROUPID_FIELD_NUMBER = 2;
    private int groupId_;
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getGroupId() {
      return groupId_;
    }
    
    private void initFields() {
      id_ = 0;
      groupId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroupId()) {
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
        output.writeInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, groupId_);
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
          .computeInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, groupId_);
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
    
    public static net.pt.Protocol.SGetUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SGetUpdate parseDelimitedFrom(
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
    public static net.pt.Protocol.SGetUpdate parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SGetUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SGetUpdate prototype) {
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
       implements net.pt.Protocol.SGetUpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SGetUpdate_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SGetUpdate_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SGetUpdate.newBuilder()
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
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SGetUpdate.getDescriptor();
      }
      
      public net.pt.Protocol.SGetUpdate getDefaultInstanceForType() {
        return net.pt.Protocol.SGetUpdate.getDefaultInstance();
      }
      
      public net.pt.Protocol.SGetUpdate build() {
        net.pt.Protocol.SGetUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SGetUpdate buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SGetUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SGetUpdate buildPartial() {
        net.pt.Protocol.SGetUpdate result = new net.pt.Protocol.SGetUpdate(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.groupId_ = groupId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SGetUpdate) {
          return mergeFrom((net.pt.Protocol.SGetUpdate)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SGetUpdate other) {
        if (other == net.pt.Protocol.SGetUpdate.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasGroupId()) {
          
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
              id_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              groupId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 id = 1;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 groupId = 2;
      private int groupId_ ;
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getGroupId() {
        return groupId_;
      }
      public Builder setGroupId(int value) {
        bitField0_ |= 0x00000002;
        groupId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        groupId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SGetUpdate)
    }
    
    static {
      defaultInstance = new SGetUpdate(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SGetUpdate)
  }
  
  public interface PlayerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string name = 1;
    boolean hasName();
    String getName();
    
    // required int32 id = 2;
    boolean hasId();
    int getId();
    
    // optional int32 rating = 3;
    boolean hasRating();
    int getRating();
  }
  public static final class Player extends
      com.google.protobuf.GeneratedMessage
      implements PlayerOrBuilder {
    // Use Player.newBuilder() to construct.
    private Player(Builder builder) {
      super(builder);
    }
    private Player(boolean noInit) {}
    
    private static final Player defaultInstance;
    public static Player getDefaultInstance() {
      return defaultInstance;
    }
    
    public Player getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_Player_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_Player_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string name = 1;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required int32 id = 2;
    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getId() {
      return id_;
    }
    
    // optional int32 rating = 3;
    public static final int RATING_FIELD_NUMBER = 3;
    private int rating_;
    public boolean hasRating() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getRating() {
      return rating_;
    }
    
    private void initFields() {
      name_ = "";
      id_ = 0;
      rating_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasId()) {
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
        output.writeBytes(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, rating_);
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
          .computeBytesSize(1, getNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, rating_);
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
    
    public static net.pt.Protocol.Player parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.Player parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.Player parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.Player parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.Player parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.Player parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.Player parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.Player parseDelimitedFrom(
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
    public static net.pt.Protocol.Player parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.Player parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.Player prototype) {
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
       implements net.pt.Protocol.PlayerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_Player_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_Player_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.Player.newBuilder()
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
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        rating_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.Player.getDescriptor();
      }
      
      public net.pt.Protocol.Player getDefaultInstanceForType() {
        return net.pt.Protocol.Player.getDefaultInstance();
      }
      
      public net.pt.Protocol.Player build() {
        net.pt.Protocol.Player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.Player buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.Player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.Player buildPartial() {
        net.pt.Protocol.Player result = new net.pt.Protocol.Player(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.rating_ = rating_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.Player) {
          return mergeFrom((net.pt.Protocol.Player)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.Player other) {
        if (other == net.pt.Protocol.Player.getDefaultInstance()) return this;
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasRating()) {
          setRating(other.getRating());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasName()) {
          
          return false;
        }
        if (!hasId()) {
          
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
              name_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              rating_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string name = 1;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
      }
      
      // required int32 id = 2;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 rating = 3;
      private int rating_ ;
      public boolean hasRating() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getRating() {
        return rating_;
      }
      public Builder setRating(int value) {
        bitField0_ |= 0x00000004;
        rating_ = value;
        onChanged();
        return this;
      }
      public Builder clearRating() {
        bitField0_ = (bitField0_ & ~0x00000004);
        rating_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.Player)
    }
    
    static {
      defaultInstance = new Player(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.Player)
  }
  
  public interface SGetGroupListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 id = 1;
    boolean hasId();
    int getId();
  }
  public static final class SGetGroupList extends
      com.google.protobuf.GeneratedMessage
      implements SGetGroupListOrBuilder {
    // Use SGetGroupList.newBuilder() to construct.
    private SGetGroupList(Builder builder) {
      super(builder);
    }
    private SGetGroupList(boolean noInit) {}
    
    private static final SGetGroupList defaultInstance;
    public static SGetGroupList getDefaultInstance() {
      return defaultInstance;
    }
    
    public SGetGroupList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SGetGroupList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SGetGroupList_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getId() {
      return id_;
    }
    
    private void initFields() {
      id_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasId()) {
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
        output.writeInt32(1, id_);
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
          .computeInt32Size(1, id_);
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
    
    public static net.pt.Protocol.SGetGroupList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SGetGroupList parseDelimitedFrom(
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
    public static net.pt.Protocol.SGetGroupList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SGetGroupList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SGetGroupList prototype) {
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
       implements net.pt.Protocol.SGetGroupListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SGetGroupList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SGetGroupList_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SGetGroupList.newBuilder()
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
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SGetGroupList.getDescriptor();
      }
      
      public net.pt.Protocol.SGetGroupList getDefaultInstanceForType() {
        return net.pt.Protocol.SGetGroupList.getDefaultInstance();
      }
      
      public net.pt.Protocol.SGetGroupList build() {
        net.pt.Protocol.SGetGroupList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SGetGroupList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SGetGroupList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SGetGroupList buildPartial() {
        net.pt.Protocol.SGetGroupList result = new net.pt.Protocol.SGetGroupList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SGetGroupList) {
          return mergeFrom((net.pt.Protocol.SGetGroupList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SGetGroupList other) {
        if (other == net.pt.Protocol.SGetGroupList.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasId()) {
          
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
              id_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 id = 1;
      private int id_ ;
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getId() {
        return id_;
      }
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SGetGroupList)
    }
    
    static {
      defaultInstance = new SGetGroupList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SGetGroupList)
  }
  
  public interface CGetGroupListOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .net.protocol.Group group = 1;
    java.util.List<net.pt.Protocol.Group> 
        getGroupList();
    net.pt.Protocol.Group getGroup(int index);
    int getGroupCount();
    java.util.List<? extends net.pt.Protocol.GroupOrBuilder> 
        getGroupOrBuilderList();
    net.pt.Protocol.GroupOrBuilder getGroupOrBuilder(
        int index);
    
    // optional int32 numAllOnlinePlayers = 2;
    boolean hasNumAllOnlinePlayers();
    int getNumAllOnlinePlayers();
  }
  public static final class CGetGroupList extends
      com.google.protobuf.GeneratedMessage
      implements CGetGroupListOrBuilder {
    // Use CGetGroupList.newBuilder() to construct.
    private CGetGroupList(Builder builder) {
      super(builder);
    }
    private CGetGroupList(boolean noInit) {}
    
    private static final CGetGroupList defaultInstance;
    public static CGetGroupList getDefaultInstance() {
      return defaultInstance;
    }
    
    public CGetGroupList getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CGetGroupList_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CGetGroupList_fieldAccessorTable;
    }
    
    private int bitField0_;
    // repeated .net.protocol.Group group = 1;
    public static final int GROUP_FIELD_NUMBER = 1;
    private java.util.List<net.pt.Protocol.Group> group_;
    public java.util.List<net.pt.Protocol.Group> getGroupList() {
      return group_;
    }
    public java.util.List<? extends net.pt.Protocol.GroupOrBuilder> 
        getGroupOrBuilderList() {
      return group_;
    }
    public int getGroupCount() {
      return group_.size();
    }
    public net.pt.Protocol.Group getGroup(int index) {
      return group_.get(index);
    }
    public net.pt.Protocol.GroupOrBuilder getGroupOrBuilder(
        int index) {
      return group_.get(index);
    }
    
    // optional int32 numAllOnlinePlayers = 2;
    public static final int NUMALLONLINEPLAYERS_FIELD_NUMBER = 2;
    private int numAllOnlinePlayers_;
    public boolean hasNumAllOnlinePlayers() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getNumAllOnlinePlayers() {
      return numAllOnlinePlayers_;
    }
    
    private void initFields() {
      group_ = java.util.Collections.emptyList();
      numAllOnlinePlayers_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getGroupCount(); i++) {
        if (!getGroup(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < group_.size(); i++) {
        output.writeMessage(1, group_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(2, numAllOnlinePlayers_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < group_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, group_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, numAllOnlinePlayers_);
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
    
    public static net.pt.Protocol.CGetGroupList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CGetGroupList parseDelimitedFrom(
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
    public static net.pt.Protocol.CGetGroupList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CGetGroupList parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CGetGroupList prototype) {
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
       implements net.pt.Protocol.CGetGroupListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CGetGroupList_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CGetGroupList_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CGetGroupList.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getGroupFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (groupBuilder_ == null) {
          group_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          groupBuilder_.clear();
        }
        numAllOnlinePlayers_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CGetGroupList.getDescriptor();
      }
      
      public net.pt.Protocol.CGetGroupList getDefaultInstanceForType() {
        return net.pt.Protocol.CGetGroupList.getDefaultInstance();
      }
      
      public net.pt.Protocol.CGetGroupList build() {
        net.pt.Protocol.CGetGroupList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CGetGroupList buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CGetGroupList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CGetGroupList buildPartial() {
        net.pt.Protocol.CGetGroupList result = new net.pt.Protocol.CGetGroupList(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (groupBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            group_ = java.util.Collections.unmodifiableList(group_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.group_ = group_;
        } else {
          result.group_ = groupBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000001;
        }
        result.numAllOnlinePlayers_ = numAllOnlinePlayers_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CGetGroupList) {
          return mergeFrom((net.pt.Protocol.CGetGroupList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CGetGroupList other) {
        if (other == net.pt.Protocol.CGetGroupList.getDefaultInstance()) return this;
        if (groupBuilder_ == null) {
          if (!other.group_.isEmpty()) {
            if (group_.isEmpty()) {
              group_ = other.group_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureGroupIsMutable();
              group_.addAll(other.group_);
            }
            onChanged();
          }
        } else {
          if (!other.group_.isEmpty()) {
            if (groupBuilder_.isEmpty()) {
              groupBuilder_.dispose();
              groupBuilder_ = null;
              group_ = other.group_;
              bitField0_ = (bitField0_ & ~0x00000001);
              groupBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getGroupFieldBuilder() : null;
            } else {
              groupBuilder_.addAllMessages(other.group_);
            }
          }
        }
        if (other.hasNumAllOnlinePlayers()) {
          setNumAllOnlinePlayers(other.getNumAllOnlinePlayers());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getGroupCount(); i++) {
          if (!getGroup(i).isInitialized()) {
            
            return false;
          }
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
              net.pt.Protocol.Group.Builder subBuilder = net.pt.Protocol.Group.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addGroup(subBuilder.buildPartial());
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              numAllOnlinePlayers_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .net.protocol.Group group = 1;
      private java.util.List<net.pt.Protocol.Group> group_ =
        java.util.Collections.emptyList();
      private void ensureGroupIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          group_ = new java.util.ArrayList<net.pt.Protocol.Group>(group_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.Group, net.pt.Protocol.Group.Builder, net.pt.Protocol.GroupOrBuilder> groupBuilder_;
      
      public java.util.List<net.pt.Protocol.Group> getGroupList() {
        if (groupBuilder_ == null) {
          return java.util.Collections.unmodifiableList(group_);
        } else {
          return groupBuilder_.getMessageList();
        }
      }
      public int getGroupCount() {
        if (groupBuilder_ == null) {
          return group_.size();
        } else {
          return groupBuilder_.getCount();
        }
      }
      public net.pt.Protocol.Group getGroup(int index) {
        if (groupBuilder_ == null) {
          return group_.get(index);
        } else {
          return groupBuilder_.getMessage(index);
        }
      }
      public Builder setGroup(
          int index, net.pt.Protocol.Group value) {
        if (groupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGroupIsMutable();
          group_.set(index, value);
          onChanged();
        } else {
          groupBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setGroup(
          int index, net.pt.Protocol.Group.Builder builderForValue) {
        if (groupBuilder_ == null) {
          ensureGroupIsMutable();
          group_.set(index, builderForValue.build());
          onChanged();
        } else {
          groupBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addGroup(net.pt.Protocol.Group value) {
        if (groupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGroupIsMutable();
          group_.add(value);
          onChanged();
        } else {
          groupBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addGroup(
          int index, net.pt.Protocol.Group value) {
        if (groupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureGroupIsMutable();
          group_.add(index, value);
          onChanged();
        } else {
          groupBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addGroup(
          net.pt.Protocol.Group.Builder builderForValue) {
        if (groupBuilder_ == null) {
          ensureGroupIsMutable();
          group_.add(builderForValue.build());
          onChanged();
        } else {
          groupBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addGroup(
          int index, net.pt.Protocol.Group.Builder builderForValue) {
        if (groupBuilder_ == null) {
          ensureGroupIsMutable();
          group_.add(index, builderForValue.build());
          onChanged();
        } else {
          groupBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllGroup(
          java.lang.Iterable<? extends net.pt.Protocol.Group> values) {
        if (groupBuilder_ == null) {
          ensureGroupIsMutable();
          super.addAll(values, group_);
          onChanged();
        } else {
          groupBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearGroup() {
        if (groupBuilder_ == null) {
          group_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          groupBuilder_.clear();
        }
        return this;
      }
      public Builder removeGroup(int index) {
        if (groupBuilder_ == null) {
          ensureGroupIsMutable();
          group_.remove(index);
          onChanged();
        } else {
          groupBuilder_.remove(index);
        }
        return this;
      }
      public net.pt.Protocol.Group.Builder getGroupBuilder(
          int index) {
        return getGroupFieldBuilder().getBuilder(index);
      }
      public net.pt.Protocol.GroupOrBuilder getGroupOrBuilder(
          int index) {
        if (groupBuilder_ == null) {
          return group_.get(index);  } else {
          return groupBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pt.Protocol.GroupOrBuilder> 
           getGroupOrBuilderList() {
        if (groupBuilder_ != null) {
          return groupBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(group_);
        }
      }
      public net.pt.Protocol.Group.Builder addGroupBuilder() {
        return getGroupFieldBuilder().addBuilder(
            net.pt.Protocol.Group.getDefaultInstance());
      }
      public net.pt.Protocol.Group.Builder addGroupBuilder(
          int index) {
        return getGroupFieldBuilder().addBuilder(
            index, net.pt.Protocol.Group.getDefaultInstance());
      }
      public java.util.List<net.pt.Protocol.Group.Builder> 
           getGroupBuilderList() {
        return getGroupFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.Group, net.pt.Protocol.Group.Builder, net.pt.Protocol.GroupOrBuilder> 
          getGroupFieldBuilder() {
        if (groupBuilder_ == null) {
          groupBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pt.Protocol.Group, net.pt.Protocol.Group.Builder, net.pt.Protocol.GroupOrBuilder>(
                  group_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          group_ = null;
        }
        return groupBuilder_;
      }
      
      // optional int32 numAllOnlinePlayers = 2;
      private int numAllOnlinePlayers_ ;
      public boolean hasNumAllOnlinePlayers() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getNumAllOnlinePlayers() {
        return numAllOnlinePlayers_;
      }
      public Builder setNumAllOnlinePlayers(int value) {
        bitField0_ |= 0x00000002;
        numAllOnlinePlayers_ = value;
        onChanged();
        return this;
      }
      public Builder clearNumAllOnlinePlayers() {
        bitField0_ = (bitField0_ & ~0x00000002);
        numAllOnlinePlayers_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CGetGroupList)
    }
    
    static {
      defaultInstance = new CGetGroupList(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CGetGroupList)
  }
  
  public interface GroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 groupId = 3;
    boolean hasGroupId();
    int getGroupId();
    
    // required int32 numOnlinePlayers = 1;
    boolean hasNumOnlinePlayers();
    int getNumOnlinePlayers();
    
    // optional int32 numOnlineBots = 2;
    boolean hasNumOnlineBots();
    int getNumOnlineBots();
  }
  public static final class Group extends
      com.google.protobuf.GeneratedMessage
      implements GroupOrBuilder {
    // Use Group.newBuilder() to construct.
    private Group(Builder builder) {
      super(builder);
    }
    private Group(boolean noInit) {}
    
    private static final Group defaultInstance;
    public static Group getDefaultInstance() {
      return defaultInstance;
    }
    
    public Group getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_Group_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_Group_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 groupId = 3;
    public static final int GROUPID_FIELD_NUMBER = 3;
    private int groupId_;
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getGroupId() {
      return groupId_;
    }
    
    // required int32 numOnlinePlayers = 1;
    public static final int NUMONLINEPLAYERS_FIELD_NUMBER = 1;
    private int numOnlinePlayers_;
    public boolean hasNumOnlinePlayers() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getNumOnlinePlayers() {
      return numOnlinePlayers_;
    }
    
    // optional int32 numOnlineBots = 2;
    public static final int NUMONLINEBOTS_FIELD_NUMBER = 2;
    private int numOnlineBots_;
    public boolean hasNumOnlineBots() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getNumOnlineBots() {
      return numOnlineBots_;
    }
    
    private void initFields() {
      groupId_ = 0;
      numOnlinePlayers_ = 0;
      numOnlineBots_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasGroupId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasNumOnlinePlayers()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(1, numOnlinePlayers_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(2, numOnlineBots_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(3, groupId_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, numOnlinePlayers_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, numOnlineBots_);
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, groupId_);
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
    
    public static net.pt.Protocol.Group parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.Group parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.Group parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.Group parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.Group parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.Group parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.Group parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.Group parseDelimitedFrom(
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
    public static net.pt.Protocol.Group parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.Group parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.Group prototype) {
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
       implements net.pt.Protocol.GroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_Group_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_Group_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.Group.newBuilder()
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
        groupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        numOnlinePlayers_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        numOnlineBots_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.Group.getDescriptor();
      }
      
      public net.pt.Protocol.Group getDefaultInstanceForType() {
        return net.pt.Protocol.Group.getDefaultInstance();
      }
      
      public net.pt.Protocol.Group build() {
        net.pt.Protocol.Group result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.Group buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.Group result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.Group buildPartial() {
        net.pt.Protocol.Group result = new net.pt.Protocol.Group(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.numOnlinePlayers_ = numOnlinePlayers_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.numOnlineBots_ = numOnlineBots_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.Group) {
          return mergeFrom((net.pt.Protocol.Group)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.Group other) {
        if (other == net.pt.Protocol.Group.getDefaultInstance()) return this;
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        if (other.hasNumOnlinePlayers()) {
          setNumOnlinePlayers(other.getNumOnlinePlayers());
        }
        if (other.hasNumOnlineBots()) {
          setNumOnlineBots(other.getNumOnlineBots());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasGroupId()) {
          
          return false;
        }
        if (!hasNumOnlinePlayers()) {
          
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
              bitField0_ |= 0x00000002;
              numOnlinePlayers_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000004;
              numOnlineBots_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000001;
              groupId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 groupId = 3;
      private int groupId_ ;
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getGroupId() {
        return groupId_;
      }
      public Builder setGroupId(int value) {
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 numOnlinePlayers = 1;
      private int numOnlinePlayers_ ;
      public boolean hasNumOnlinePlayers() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getNumOnlinePlayers() {
        return numOnlinePlayers_;
      }
      public Builder setNumOnlinePlayers(int value) {
        bitField0_ |= 0x00000002;
        numOnlinePlayers_ = value;
        onChanged();
        return this;
      }
      public Builder clearNumOnlinePlayers() {
        bitField0_ = (bitField0_ & ~0x00000002);
        numOnlinePlayers_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 numOnlineBots = 2;
      private int numOnlineBots_ ;
      public boolean hasNumOnlineBots() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getNumOnlineBots() {
        return numOnlineBots_;
      }
      public Builder setNumOnlineBots(int value) {
        bitField0_ |= 0x00000004;
        numOnlineBots_ = value;
        onChanged();
        return this;
      }
      public Builder clearNumOnlineBots() {
        bitField0_ = (bitField0_ & ~0x00000004);
        numOnlineBots_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.Group)
    }
    
    static {
      defaultInstance = new Group(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.Group)
  }
  
  public interface SEnterToGroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 groupId = 1;
    boolean hasGroupId();
    int getGroupId();
  }
  public static final class SEnterToGroup extends
      com.google.protobuf.GeneratedMessage
      implements SEnterToGroupOrBuilder {
    // Use SEnterToGroup.newBuilder() to construct.
    private SEnterToGroup(Builder builder) {
      super(builder);
    }
    private SEnterToGroup(boolean noInit) {}
    
    private static final SEnterToGroup defaultInstance;
    public static SEnterToGroup getDefaultInstance() {
      return defaultInstance;
    }
    
    public SEnterToGroup getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SEnterToGroup_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SEnterToGroup_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 groupId = 1;
    public static final int GROUPID_FIELD_NUMBER = 1;
    private int groupId_;
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getGroupId() {
      return groupId_;
    }
    
    private void initFields() {
      groupId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasGroupId()) {
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
        output.writeInt32(1, groupId_);
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
          .computeInt32Size(1, groupId_);
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
    
    public static net.pt.Protocol.SEnterToGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SEnterToGroup parseDelimitedFrom(
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
    public static net.pt.Protocol.SEnterToGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SEnterToGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SEnterToGroup prototype) {
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
       implements net.pt.Protocol.SEnterToGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SEnterToGroup_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SEnterToGroup_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SEnterToGroup.newBuilder()
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
        groupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SEnterToGroup.getDescriptor();
      }
      
      public net.pt.Protocol.SEnterToGroup getDefaultInstanceForType() {
        return net.pt.Protocol.SEnterToGroup.getDefaultInstance();
      }
      
      public net.pt.Protocol.SEnterToGroup build() {
        net.pt.Protocol.SEnterToGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SEnterToGroup buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SEnterToGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SEnterToGroup buildPartial() {
        net.pt.Protocol.SEnterToGroup result = new net.pt.Protocol.SEnterToGroup(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.groupId_ = groupId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SEnterToGroup) {
          return mergeFrom((net.pt.Protocol.SEnterToGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SEnterToGroup other) {
        if (other == net.pt.Protocol.SEnterToGroup.getDefaultInstance()) return this;
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasGroupId()) {
          
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
              groupId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 groupId = 1;
      private int groupId_ ;
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getGroupId() {
        return groupId_;
      }
      public Builder setGroupId(int value) {
        bitField0_ |= 0x00000001;
        groupId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SEnterToGroup)
    }
    
    static {
      defaultInstance = new SEnterToGroup(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SEnterToGroup)
  }
  
  public interface CEnterToGroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool isEnteredGroup = 1;
    boolean hasIsEnteredGroup();
    boolean getIsEnteredGroup();
  }
  public static final class CEnterToGroup extends
      com.google.protobuf.GeneratedMessage
      implements CEnterToGroupOrBuilder {
    // Use CEnterToGroup.newBuilder() to construct.
    private CEnterToGroup(Builder builder) {
      super(builder);
    }
    private CEnterToGroup(boolean noInit) {}
    
    private static final CEnterToGroup defaultInstance;
    public static CEnterToGroup getDefaultInstance() {
      return defaultInstance;
    }
    
    public CEnterToGroup getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CEnterToGroup_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CEnterToGroup_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool isEnteredGroup = 1;
    public static final int ISENTEREDGROUP_FIELD_NUMBER = 1;
    private boolean isEnteredGroup_;
    public boolean hasIsEnteredGroup() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getIsEnteredGroup() {
      return isEnteredGroup_;
    }
    
    private void initFields() {
      isEnteredGroup_ = false;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIsEnteredGroup()) {
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
        output.writeBool(1, isEnteredGroup_);
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
          .computeBoolSize(1, isEnteredGroup_);
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
    
    public static net.pt.Protocol.CEnterToGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CEnterToGroup parseDelimitedFrom(
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
    public static net.pt.Protocol.CEnterToGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CEnterToGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CEnterToGroup prototype) {
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
       implements net.pt.Protocol.CEnterToGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CEnterToGroup_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CEnterToGroup_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CEnterToGroup.newBuilder()
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
        isEnteredGroup_ = false;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CEnterToGroup.getDescriptor();
      }
      
      public net.pt.Protocol.CEnterToGroup getDefaultInstanceForType() {
        return net.pt.Protocol.CEnterToGroup.getDefaultInstance();
      }
      
      public net.pt.Protocol.CEnterToGroup build() {
        net.pt.Protocol.CEnterToGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CEnterToGroup buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CEnterToGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CEnterToGroup buildPartial() {
        net.pt.Protocol.CEnterToGroup result = new net.pt.Protocol.CEnterToGroup(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.isEnteredGroup_ = isEnteredGroup_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CEnterToGroup) {
          return mergeFrom((net.pt.Protocol.CEnterToGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CEnterToGroup other) {
        if (other == net.pt.Protocol.CEnterToGroup.getDefaultInstance()) return this;
        if (other.hasIsEnteredGroup()) {
          setIsEnteredGroup(other.getIsEnteredGroup());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIsEnteredGroup()) {
          
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
              isEnteredGroup_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool isEnteredGroup = 1;
      private boolean isEnteredGroup_ ;
      public boolean hasIsEnteredGroup() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public boolean getIsEnteredGroup() {
        return isEnteredGroup_;
      }
      public Builder setIsEnteredGroup(boolean value) {
        bitField0_ |= 0x00000001;
        isEnteredGroup_ = value;
        onChanged();
        return this;
      }
      public Builder clearIsEnteredGroup() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isEnteredGroup_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CEnterToGroup)
    }
    
    static {
      defaultInstance = new CEnterToGroup(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CEnterToGroup)
  }
  
  public interface SWantToPlayOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class SWantToPlay extends
      com.google.protobuf.GeneratedMessage
      implements SWantToPlayOrBuilder {
    // Use SWantToPlay.newBuilder() to construct.
    private SWantToPlay(Builder builder) {
      super(builder);
    }
    private SWantToPlay(boolean noInit) {}
    
    private static final SWantToPlay defaultInstance;
    public static SWantToPlay getDefaultInstance() {
      return defaultInstance;
    }
    
    public SWantToPlay getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SWantToPlay_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SWantToPlay_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      opponentId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
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
    
    public static net.pt.Protocol.SWantToPlay parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SWantToPlay parseDelimitedFrom(
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
    public static net.pt.Protocol.SWantToPlay parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SWantToPlay parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SWantToPlay prototype) {
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
       implements net.pt.Protocol.SWantToPlayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SWantToPlay_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SWantToPlay_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SWantToPlay.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SWantToPlay.getDescriptor();
      }
      
      public net.pt.Protocol.SWantToPlay getDefaultInstanceForType() {
        return net.pt.Protocol.SWantToPlay.getDefaultInstance();
      }
      
      public net.pt.Protocol.SWantToPlay build() {
        net.pt.Protocol.SWantToPlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SWantToPlay buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SWantToPlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SWantToPlay buildPartial() {
        net.pt.Protocol.SWantToPlay result = new net.pt.Protocol.SWantToPlay(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SWantToPlay) {
          return mergeFrom((net.pt.Protocol.SWantToPlay)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SWantToPlay other) {
        if (other == net.pt.Protocol.SWantToPlay.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SWantToPlay)
    }
    
    static {
      defaultInstance = new SWantToPlay(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SWantToPlay)
  }
  
  public interface CWantToPlayOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 opponentId = 1;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class CWantToPlay extends
      com.google.protobuf.GeneratedMessage
      implements CWantToPlayOrBuilder {
    // Use CWantToPlay.newBuilder() to construct.
    private CWantToPlay(Builder builder) {
      super(builder);
    }
    private CWantToPlay(boolean noInit) {}
    
    private static final CWantToPlay defaultInstance;
    public static CWantToPlay getDefaultInstance() {
      return defaultInstance;
    }
    
    public CWantToPlay getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CWantToPlay_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CWantToPlay_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 opponentId = 1;
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
    
    public static net.pt.Protocol.CWantToPlay parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CWantToPlay parseDelimitedFrom(
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
    public static net.pt.Protocol.CWantToPlay parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CWantToPlay parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CWantToPlay prototype) {
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
       implements net.pt.Protocol.CWantToPlayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CWantToPlay_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CWantToPlay_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CWantToPlay.newBuilder()
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
        return net.pt.Protocol.CWantToPlay.getDescriptor();
      }
      
      public net.pt.Protocol.CWantToPlay getDefaultInstanceForType() {
        return net.pt.Protocol.CWantToPlay.getDefaultInstance();
      }
      
      public net.pt.Protocol.CWantToPlay build() {
        net.pt.Protocol.CWantToPlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CWantToPlay buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CWantToPlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CWantToPlay buildPartial() {
        net.pt.Protocol.CWantToPlay result = new net.pt.Protocol.CWantToPlay(this);
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
        if (other instanceof net.pt.Protocol.CWantToPlay) {
          return mergeFrom((net.pt.Protocol.CWantToPlay)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CWantToPlay other) {
        if (other == net.pt.Protocol.CWantToPlay.getDefaultInstance()) return this;
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
      
      // required int32 opponentId = 1;
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
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CWantToPlay)
    }
    
    static {
      defaultInstance = new CWantToPlay(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CWantToPlay)
  }
  
  public interface SCancelDesirePlayOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class SCancelDesirePlay extends
      com.google.protobuf.GeneratedMessage
      implements SCancelDesirePlayOrBuilder {
    // Use SCancelDesirePlay.newBuilder() to construct.
    private SCancelDesirePlay(Builder builder) {
      super(builder);
    }
    private SCancelDesirePlay(boolean noInit) {}
    
    private static final SCancelDesirePlay defaultInstance;
    public static SCancelDesirePlay getDefaultInstance() {
      return defaultInstance;
    }
    
    public SCancelDesirePlay getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SCancelDesirePlay_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SCancelDesirePlay_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      opponentId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
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
    
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SCancelDesirePlay parseDelimitedFrom(
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
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SCancelDesirePlay parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SCancelDesirePlay prototype) {
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
       implements net.pt.Protocol.SCancelDesirePlayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SCancelDesirePlay_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SCancelDesirePlay_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SCancelDesirePlay.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SCancelDesirePlay.getDescriptor();
      }
      
      public net.pt.Protocol.SCancelDesirePlay getDefaultInstanceForType() {
        return net.pt.Protocol.SCancelDesirePlay.getDefaultInstance();
      }
      
      public net.pt.Protocol.SCancelDesirePlay build() {
        net.pt.Protocol.SCancelDesirePlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SCancelDesirePlay buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SCancelDesirePlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SCancelDesirePlay buildPartial() {
        net.pt.Protocol.SCancelDesirePlay result = new net.pt.Protocol.SCancelDesirePlay(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SCancelDesirePlay) {
          return mergeFrom((net.pt.Protocol.SCancelDesirePlay)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SCancelDesirePlay other) {
        if (other == net.pt.Protocol.SCancelDesirePlay.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SCancelDesirePlay)
    }
    
    static {
      defaultInstance = new SCancelDesirePlay(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SCancelDesirePlay)
  }
  
  public interface CCancelDesirePlayOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 opponentId = 1;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class CCancelDesirePlay extends
      com.google.protobuf.GeneratedMessage
      implements CCancelDesirePlayOrBuilder {
    // Use CCancelDesirePlay.newBuilder() to construct.
    private CCancelDesirePlay(Builder builder) {
      super(builder);
    }
    private CCancelDesirePlay(boolean noInit) {}
    
    private static final CCancelDesirePlay defaultInstance;
    public static CCancelDesirePlay getDefaultInstance() {
      return defaultInstance;
    }
    
    public CCancelDesirePlay getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CCancelDesirePlay_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CCancelDesirePlay_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 opponentId = 1;
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
    
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CCancelDesirePlay parseDelimitedFrom(
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
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CCancelDesirePlay parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CCancelDesirePlay prototype) {
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
       implements net.pt.Protocol.CCancelDesirePlayOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CCancelDesirePlay_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CCancelDesirePlay_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CCancelDesirePlay.newBuilder()
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
        return net.pt.Protocol.CCancelDesirePlay.getDescriptor();
      }
      
      public net.pt.Protocol.CCancelDesirePlay getDefaultInstanceForType() {
        return net.pt.Protocol.CCancelDesirePlay.getDefaultInstance();
      }
      
      public net.pt.Protocol.CCancelDesirePlay build() {
        net.pt.Protocol.CCancelDesirePlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CCancelDesirePlay buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CCancelDesirePlay result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CCancelDesirePlay buildPartial() {
        net.pt.Protocol.CCancelDesirePlay result = new net.pt.Protocol.CCancelDesirePlay(this);
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
        if (other instanceof net.pt.Protocol.CCancelDesirePlay) {
          return mergeFrom((net.pt.Protocol.CCancelDesirePlay)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CCancelDesirePlay other) {
        if (other == net.pt.Protocol.CCancelDesirePlay.getDefaultInstance()) return this;
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
      
      // required int32 opponentId = 1;
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
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CCancelDesirePlay)
    }
    
    static {
      defaultInstance = new CCancelDesirePlay(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CCancelDesirePlay)
  }
  
  public interface SStartGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class SStartGame extends
      com.google.protobuf.GeneratedMessage
      implements SStartGameOrBuilder {
    // Use SStartGame.newBuilder() to construct.
    private SStartGame(Builder builder) {
      super(builder);
    }
    private SStartGame(boolean noInit) {}
    
    private static final SStartGame defaultInstance;
    public static SStartGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public SStartGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SStartGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SStartGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      opponentId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
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
    
    public static net.pt.Protocol.SStartGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SStartGame parseDelimitedFrom(
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
    public static net.pt.Protocol.SStartGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SStartGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SStartGame prototype) {
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
       implements net.pt.Protocol.SStartGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SStartGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SStartGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SStartGame.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SStartGame.getDescriptor();
      }
      
      public net.pt.Protocol.SStartGame getDefaultInstanceForType() {
        return net.pt.Protocol.SStartGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.SStartGame build() {
        net.pt.Protocol.SStartGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SStartGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SStartGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SStartGame buildPartial() {
        net.pt.Protocol.SStartGame result = new net.pt.Protocol.SStartGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SStartGame) {
          return mergeFrom((net.pt.Protocol.SStartGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SStartGame other) {
        if (other == net.pt.Protocol.SStartGame.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SStartGame)
    }
    
    static {
      defaultInstance = new SStartGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SStartGame)
  }
  
  public interface CStartGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 opponentId = 1;
    boolean hasOpponentId();
    int getOpponentId();
    
    // required .net.protocol.TypeMove typeMove = 2;
    boolean hasTypeMove();
    net.pt.Protocol.TypeMove getTypeMove();
    
    // optional int32 numberOfWonGame = 3;
    boolean hasNumberOfWonGame();
    int getNumberOfWonGame();
    
    // optional int32 numberOfLostGame = 4;
    boolean hasNumberOfLostGame();
    int getNumberOfLostGame();
  }
  public static final class CStartGame extends
      com.google.protobuf.GeneratedMessage
      implements CStartGameOrBuilder {
    // Use CStartGame.newBuilder() to construct.
    private CStartGame(Builder builder) {
      super(builder);
    }
    private CStartGame(boolean noInit) {}
    
    private static final CStartGame defaultInstance;
    public static CStartGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public CStartGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CStartGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CStartGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 opponentId = 1;
    public static final int OPPONENTID_FIELD_NUMBER = 1;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    // required .net.protocol.TypeMove typeMove = 2;
    public static final int TYPEMOVE_FIELD_NUMBER = 2;
    private net.pt.Protocol.TypeMove typeMove_;
    public boolean hasTypeMove() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public net.pt.Protocol.TypeMove getTypeMove() {
      return typeMove_;
    }
    
    // optional int32 numberOfWonGame = 3;
    public static final int NUMBEROFWONGAME_FIELD_NUMBER = 3;
    private int numberOfWonGame_;
    public boolean hasNumberOfWonGame() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getNumberOfWonGame() {
      return numberOfWonGame_;
    }
    
    // optional int32 numberOfLostGame = 4;
    public static final int NUMBEROFLOSTGAME_FIELD_NUMBER = 4;
    private int numberOfLostGame_;
    public boolean hasNumberOfLostGame() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getNumberOfLostGame() {
      return numberOfLostGame_;
    }
    
    private void initFields() {
      opponentId_ = 0;
      typeMove_ = net.pt.Protocol.TypeMove.X;
      numberOfWonGame_ = 0;
      numberOfLostGame_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasOpponentId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTypeMove()) {
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, typeMove_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, numberOfWonGame_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, numberOfLostGame_);
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
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, typeMove_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, numberOfWonGame_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, numberOfLostGame_);
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
    
    public static net.pt.Protocol.CStartGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CStartGame parseDelimitedFrom(
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
    public static net.pt.Protocol.CStartGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CStartGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CStartGame prototype) {
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
       implements net.pt.Protocol.CStartGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CStartGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CStartGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CStartGame.newBuilder()
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
        typeMove_ = net.pt.Protocol.TypeMove.X;
        bitField0_ = (bitField0_ & ~0x00000002);
        numberOfWonGame_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        numberOfLostGame_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CStartGame.getDescriptor();
      }
      
      public net.pt.Protocol.CStartGame getDefaultInstanceForType() {
        return net.pt.Protocol.CStartGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.CStartGame build() {
        net.pt.Protocol.CStartGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CStartGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CStartGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CStartGame buildPartial() {
        net.pt.Protocol.CStartGame result = new net.pt.Protocol.CStartGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.opponentId_ = opponentId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.typeMove_ = typeMove_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.numberOfWonGame_ = numberOfWonGame_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.numberOfLostGame_ = numberOfLostGame_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CStartGame) {
          return mergeFrom((net.pt.Protocol.CStartGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CStartGame other) {
        if (other == net.pt.Protocol.CStartGame.getDefaultInstance()) return this;
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        if (other.hasTypeMove()) {
          setTypeMove(other.getTypeMove());
        }
        if (other.hasNumberOfWonGame()) {
          setNumberOfWonGame(other.getNumberOfWonGame());
        }
        if (other.hasNumberOfLostGame()) {
          setNumberOfLostGame(other.getNumberOfLostGame());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasOpponentId()) {
          
          return false;
        }
        if (!hasTypeMove()) {
          
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
            case 16: {
              int rawValue = input.readEnum();
              net.pt.Protocol.TypeMove value = net.pt.Protocol.TypeMove.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                typeMove_ = value;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              numberOfWonGame_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              numberOfLostGame_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 opponentId = 1;
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
      
      // required .net.protocol.TypeMove typeMove = 2;
      private net.pt.Protocol.TypeMove typeMove_ = net.pt.Protocol.TypeMove.X;
      public boolean hasTypeMove() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public net.pt.Protocol.TypeMove getTypeMove() {
        return typeMove_;
      }
      public Builder setTypeMove(net.pt.Protocol.TypeMove value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        typeMove_ = value;
        onChanged();
        return this;
      }
      public Builder clearTypeMove() {
        bitField0_ = (bitField0_ & ~0x00000002);
        typeMove_ = net.pt.Protocol.TypeMove.X;
        onChanged();
        return this;
      }
      
      // optional int32 numberOfWonGame = 3;
      private int numberOfWonGame_ ;
      public boolean hasNumberOfWonGame() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getNumberOfWonGame() {
        return numberOfWonGame_;
      }
      public Builder setNumberOfWonGame(int value) {
        bitField0_ |= 0x00000004;
        numberOfWonGame_ = value;
        onChanged();
        return this;
      }
      public Builder clearNumberOfWonGame() {
        bitField0_ = (bitField0_ & ~0x00000004);
        numberOfWonGame_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 numberOfLostGame = 4;
      private int numberOfLostGame_ ;
      public boolean hasNumberOfLostGame() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getNumberOfLostGame() {
        return numberOfLostGame_;
      }
      public Builder setNumberOfLostGame(int value) {
        bitField0_ |= 0x00000008;
        numberOfLostGame_ = value;
        onChanged();
        return this;
      }
      public Builder clearNumberOfLostGame() {
        bitField0_ = (bitField0_ & ~0x00000008);
        numberOfLostGame_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CStartGame)
    }
    
    static {
      defaultInstance = new CStartGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CStartGame)
  }
  
  public interface SDidMoveOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
    
    // required int32 i = 3;
    boolean hasI();
    int getI();
    
    // required int32 j = 4;
    boolean hasJ();
    int getJ();
    
    // required .net.protocol.TypeMove type = 5;
    boolean hasType();
    net.pt.Protocol.TypeMove getType();
  }
  public static final class SDidMove extends
      com.google.protobuf.GeneratedMessage
      implements SDidMoveOrBuilder {
    // Use SDidMove.newBuilder() to construct.
    private SDidMove(Builder builder) {
      super(builder);
    }
    private SDidMove(boolean noInit) {}
    
    private static final SDidMove defaultInstance;
    public static SDidMove getDefaultInstance() {
      return defaultInstance;
    }
    
    public SDidMove getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SDidMove_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SDidMove_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    // required int32 i = 3;
    public static final int I_FIELD_NUMBER = 3;
    private int i_;
    public boolean hasI() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getI() {
      return i_;
    }
    
    // required int32 j = 4;
    public static final int J_FIELD_NUMBER = 4;
    private int j_;
    public boolean hasJ() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getJ() {
      return j_;
    }
    
    // required .net.protocol.TypeMove type = 5;
    public static final int TYPE_FIELD_NUMBER = 5;
    private net.pt.Protocol.TypeMove type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public net.pt.Protocol.TypeMove getType() {
      return type_;
    }
    
    private void initFields() {
      playerId_ = 0;
      opponentId_ = 0;
      i_ = 0;
      j_ = 0;
      type_ = net.pt.Protocol.TypeMove.X;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpponentId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, i_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, j_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeEnum(5, type_.getNumber());
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, i_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, j_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, type_.getNumber());
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
    
    public static net.pt.Protocol.SDidMove parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SDidMove parseDelimitedFrom(
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
    public static net.pt.Protocol.SDidMove parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SDidMove parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SDidMove prototype) {
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
       implements net.pt.Protocol.SDidMoveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SDidMove_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SDidMove_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SDidMove.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        i_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        j_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        type_ = net.pt.Protocol.TypeMove.X;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SDidMove.getDescriptor();
      }
      
      public net.pt.Protocol.SDidMove getDefaultInstanceForType() {
        return net.pt.Protocol.SDidMove.getDefaultInstance();
      }
      
      public net.pt.Protocol.SDidMove build() {
        net.pt.Protocol.SDidMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SDidMove buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SDidMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SDidMove buildPartial() {
        net.pt.Protocol.SDidMove result = new net.pt.Protocol.SDidMove(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.i_ = i_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.j_ = j_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SDidMove) {
          return mergeFrom((net.pt.Protocol.SDidMove)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SDidMove other) {
        if (other == net.pt.Protocol.SDidMove.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
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
        if (!hasPlayerId()) {
          
          return false;
        }
        if (!hasOpponentId()) {
          
          return false;
        }
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              i_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              j_ = input.readInt32();
              break;
            }
            case 40: {
              int rawValue = input.readEnum();
              net.pt.Protocol.TypeMove value = net.pt.Protocol.TypeMove.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(5, rawValue);
              } else {
                bitField0_ |= 0x00000010;
                type_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 i = 3;
      private int i_ ;
      public boolean hasI() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getI() {
        return i_;
      }
      public Builder setI(int value) {
        bitField0_ |= 0x00000004;
        i_ = value;
        onChanged();
        return this;
      }
      public Builder clearI() {
        bitField0_ = (bitField0_ & ~0x00000004);
        i_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 j = 4;
      private int j_ ;
      public boolean hasJ() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getJ() {
        return j_;
      }
      public Builder setJ(int value) {
        bitField0_ |= 0x00000008;
        j_ = value;
        onChanged();
        return this;
      }
      public Builder clearJ() {
        bitField0_ = (bitField0_ & ~0x00000008);
        j_ = 0;
        onChanged();
        return this;
      }
      
      // required .net.protocol.TypeMove type = 5;
      private net.pt.Protocol.TypeMove type_ = net.pt.Protocol.TypeMove.X;
      public boolean hasType() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public net.pt.Protocol.TypeMove getType() {
        return type_;
      }
      public Builder setType(net.pt.Protocol.TypeMove value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        type_ = net.pt.Protocol.TypeMove.X;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SDidMove)
    }
    
    static {
      defaultInstance = new SDidMove(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SDidMove)
  }
  
  public interface CDidMoveOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 i = 1;
    boolean hasI();
    int getI();
    
    // required int32 j = 2;
    boolean hasJ();
    int getJ();
    
    // required .net.protocol.TypeMove type = 3;
    boolean hasType();
    net.pt.Protocol.TypeMove getType();
  }
  public static final class CDidMove extends
      com.google.protobuf.GeneratedMessage
      implements CDidMoveOrBuilder {
    // Use CDidMove.newBuilder() to construct.
    private CDidMove(Builder builder) {
      super(builder);
    }
    private CDidMove(boolean noInit) {}
    
    private static final CDidMove defaultInstance;
    public static CDidMove getDefaultInstance() {
      return defaultInstance;
    }
    
    public CDidMove getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CDidMove_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CDidMove_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 i = 1;
    public static final int I_FIELD_NUMBER = 1;
    private int i_;
    public boolean hasI() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getI() {
      return i_;
    }
    
    // required int32 j = 2;
    public static final int J_FIELD_NUMBER = 2;
    private int j_;
    public boolean hasJ() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getJ() {
      return j_;
    }
    
    // required .net.protocol.TypeMove type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private net.pt.Protocol.TypeMove type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public net.pt.Protocol.TypeMove getType() {
      return type_;
    }
    
    private void initFields() {
      i_ = 0;
      j_ = 0;
      type_ = net.pt.Protocol.TypeMove.X;
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
    
    public static net.pt.Protocol.CDidMove parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CDidMove parseDelimitedFrom(
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
    public static net.pt.Protocol.CDidMove parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CDidMove parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CDidMove prototype) {
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
       implements net.pt.Protocol.CDidMoveOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CDidMove_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CDidMove_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CDidMove.newBuilder()
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
        type_ = net.pt.Protocol.TypeMove.X;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CDidMove.getDescriptor();
      }
      
      public net.pt.Protocol.CDidMove getDefaultInstanceForType() {
        return net.pt.Protocol.CDidMove.getDefaultInstance();
      }
      
      public net.pt.Protocol.CDidMove build() {
        net.pt.Protocol.CDidMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CDidMove buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CDidMove result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CDidMove buildPartial() {
        net.pt.Protocol.CDidMove result = new net.pt.Protocol.CDidMove(this);
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
        if (other instanceof net.pt.Protocol.CDidMove) {
          return mergeFrom((net.pt.Protocol.CDidMove)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CDidMove other) {
        if (other == net.pt.Protocol.CDidMove.getDefaultInstance()) return this;
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
              net.pt.Protocol.TypeMove value = net.pt.Protocol.TypeMove.valueOf(rawValue);
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
      
      // required int32 i = 1;
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
      
      // required int32 j = 2;
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
      
      // required .net.protocol.TypeMove type = 3;
      private net.pt.Protocol.TypeMove type_ = net.pt.Protocol.TypeMove.X;
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public net.pt.Protocol.TypeMove getType() {
        return type_;
      }
      public Builder setType(net.pt.Protocol.TypeMove value) {
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
        type_ = net.pt.Protocol.TypeMove.X;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CDidMove)
    }
    
    static {
      defaultInstance = new CDidMove(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CDidMove)
  }
  
  public interface SWonGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 idWonPlayer = 1;
    boolean hasIdWonPlayer();
    int getIdWonPlayer();
    
    // required int32 idLostPlayer = 2;
    boolean hasIdLostPlayer();
    int getIdLostPlayer();
  }
  public static final class SWonGame extends
      com.google.protobuf.GeneratedMessage
      implements SWonGameOrBuilder {
    // Use SWonGame.newBuilder() to construct.
    private SWonGame(Builder builder) {
      super(builder);
    }
    private SWonGame(boolean noInit) {}
    
    private static final SWonGame defaultInstance;
    public static SWonGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public SWonGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SWonGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SWonGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 idWonPlayer = 1;
    public static final int IDWONPLAYER_FIELD_NUMBER = 1;
    private int idWonPlayer_;
    public boolean hasIdWonPlayer() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getIdWonPlayer() {
      return idWonPlayer_;
    }
    
    // required int32 idLostPlayer = 2;
    public static final int IDLOSTPLAYER_FIELD_NUMBER = 2;
    private int idLostPlayer_;
    public boolean hasIdLostPlayer() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getIdLostPlayer() {
      return idLostPlayer_;
    }
    
    private void initFields() {
      idWonPlayer_ = 0;
      idLostPlayer_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasIdWonPlayer()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasIdLostPlayer()) {
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
        output.writeInt32(1, idWonPlayer_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, idLostPlayer_);
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
          .computeInt32Size(1, idWonPlayer_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, idLostPlayer_);
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
    
    public static net.pt.Protocol.SWonGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SWonGame parseDelimitedFrom(
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
    public static net.pt.Protocol.SWonGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SWonGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SWonGame prototype) {
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
       implements net.pt.Protocol.SWonGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SWonGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SWonGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SWonGame.newBuilder()
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
        idWonPlayer_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        idLostPlayer_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SWonGame.getDescriptor();
      }
      
      public net.pt.Protocol.SWonGame getDefaultInstanceForType() {
        return net.pt.Protocol.SWonGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.SWonGame build() {
        net.pt.Protocol.SWonGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SWonGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SWonGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SWonGame buildPartial() {
        net.pt.Protocol.SWonGame result = new net.pt.Protocol.SWonGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.idWonPlayer_ = idWonPlayer_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.idLostPlayer_ = idLostPlayer_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SWonGame) {
          return mergeFrom((net.pt.Protocol.SWonGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SWonGame other) {
        if (other == net.pt.Protocol.SWonGame.getDefaultInstance()) return this;
        if (other.hasIdWonPlayer()) {
          setIdWonPlayer(other.getIdWonPlayer());
        }
        if (other.hasIdLostPlayer()) {
          setIdLostPlayer(other.getIdLostPlayer());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasIdWonPlayer()) {
          
          return false;
        }
        if (!hasIdLostPlayer()) {
          
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
              idWonPlayer_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              idLostPlayer_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 idWonPlayer = 1;
      private int idWonPlayer_ ;
      public boolean hasIdWonPlayer() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getIdWonPlayer() {
        return idWonPlayer_;
      }
      public Builder setIdWonPlayer(int value) {
        bitField0_ |= 0x00000001;
        idWonPlayer_ = value;
        onChanged();
        return this;
      }
      public Builder clearIdWonPlayer() {
        bitField0_ = (bitField0_ & ~0x00000001);
        idWonPlayer_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 idLostPlayer = 2;
      private int idLostPlayer_ ;
      public boolean hasIdLostPlayer() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getIdLostPlayer() {
        return idLostPlayer_;
      }
      public Builder setIdLostPlayer(int value) {
        bitField0_ |= 0x00000002;
        idLostPlayer_ = value;
        onChanged();
        return this;
      }
      public Builder clearIdLostPlayer() {
        bitField0_ = (bitField0_ & ~0x00000002);
        idLostPlayer_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SWonGame)
    }
    
    static {
      defaultInstance = new SWonGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SWonGame)
  }
  
  public interface SContinueGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class SContinueGame extends
      com.google.protobuf.GeneratedMessage
      implements SContinueGameOrBuilder {
    // Use SContinueGame.newBuilder() to construct.
    private SContinueGame(Builder builder) {
      super(builder);
    }
    private SContinueGame(boolean noInit) {}
    
    private static final SContinueGame defaultInstance;
    public static SContinueGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public SContinueGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SContinueGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SContinueGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      opponentId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
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
    
    public static net.pt.Protocol.SContinueGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SContinueGame parseDelimitedFrom(
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
    public static net.pt.Protocol.SContinueGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SContinueGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SContinueGame prototype) {
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
       implements net.pt.Protocol.SContinueGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SContinueGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SContinueGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SContinueGame.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SContinueGame.getDescriptor();
      }
      
      public net.pt.Protocol.SContinueGame getDefaultInstanceForType() {
        return net.pt.Protocol.SContinueGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.SContinueGame build() {
        net.pt.Protocol.SContinueGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SContinueGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SContinueGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SContinueGame buildPartial() {
        net.pt.Protocol.SContinueGame result = new net.pt.Protocol.SContinueGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SContinueGame) {
          return mergeFrom((net.pt.Protocol.SContinueGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SContinueGame other) {
        if (other == net.pt.Protocol.SContinueGame.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SContinueGame)
    }
    
    static {
      defaultInstance = new SContinueGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SContinueGame)
  }
  
  public interface CContinueGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool continueGame = 1;
    boolean hasContinueGame();
    boolean getContinueGame();
    
    // required .net.protocol.TypeMove type = 3;
    boolean hasType();
    net.pt.Protocol.TypeMove getType();
  }
  public static final class CContinueGame extends
      com.google.protobuf.GeneratedMessage
      implements CContinueGameOrBuilder {
    // Use CContinueGame.newBuilder() to construct.
    private CContinueGame(Builder builder) {
      super(builder);
    }
    private CContinueGame(boolean noInit) {}
    
    private static final CContinueGame defaultInstance;
    public static CContinueGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public CContinueGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CContinueGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CContinueGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool continueGame = 1;
    public static final int CONTINUEGAME_FIELD_NUMBER = 1;
    private boolean continueGame_;
    public boolean hasContinueGame() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public boolean getContinueGame() {
      return continueGame_;
    }
    
    // required .net.protocol.TypeMove type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private net.pt.Protocol.TypeMove type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public net.pt.Protocol.TypeMove getType() {
      return type_;
    }
    
    private void initFields() {
      continueGame_ = false;
      type_ = net.pt.Protocol.TypeMove.X;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasContinueGame()) {
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
        output.writeBool(1, continueGame_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
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
          .computeBoolSize(1, continueGame_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
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
    
    public static net.pt.Protocol.CContinueGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CContinueGame parseDelimitedFrom(
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
    public static net.pt.Protocol.CContinueGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CContinueGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CContinueGame prototype) {
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
       implements net.pt.Protocol.CContinueGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CContinueGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CContinueGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CContinueGame.newBuilder()
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
        type_ = net.pt.Protocol.TypeMove.X;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CContinueGame.getDescriptor();
      }
      
      public net.pt.Protocol.CContinueGame getDefaultInstanceForType() {
        return net.pt.Protocol.CContinueGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.CContinueGame build() {
        net.pt.Protocol.CContinueGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CContinueGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CContinueGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CContinueGame buildPartial() {
        net.pt.Protocol.CContinueGame result = new net.pt.Protocol.CContinueGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.continueGame_ = continueGame_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CContinueGame) {
          return mergeFrom((net.pt.Protocol.CContinueGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CContinueGame other) {
        if (other == net.pt.Protocol.CContinueGame.getDefaultInstance()) return this;
        if (other.hasContinueGame()) {
          setContinueGame(other.getContinueGame());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasContinueGame()) {
          
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
              continueGame_ = input.readBool();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              net.pt.Protocol.TypeMove value = net.pt.Protocol.TypeMove.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required bool continueGame = 1;
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
      
      // required .net.protocol.TypeMove type = 3;
      private net.pt.Protocol.TypeMove type_ = net.pt.Protocol.TypeMove.X;
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public net.pt.Protocol.TypeMove getType() {
        return type_;
      }
      public Builder setType(net.pt.Protocol.TypeMove value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = net.pt.Protocol.TypeMove.X;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CContinueGame)
    }
    
    static {
      defaultInstance = new CContinueGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CContinueGame)
  }
  
  public interface SChatMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
    
    // required string message = 3;
    boolean hasMessage();
    String getMessage();
  }
  public static final class SChatMessage extends
      com.google.protobuf.GeneratedMessage
      implements SChatMessageOrBuilder {
    // Use SChatMessage.newBuilder() to construct.
    private SChatMessage(Builder builder) {
      super(builder);
    }
    private SChatMessage(boolean noInit) {}
    
    private static final SChatMessage defaultInstance;
    public static SChatMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public SChatMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SChatMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SChatMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    // required string message = 3;
    public static final int MESSAGE_FIELD_NUMBER = 3;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
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
      playerId_ = 0;
      opponentId_ = 0;
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOpponentId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMessageBytes());
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMessageBytes());
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
    
    public static net.pt.Protocol.SChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SChatMessage parseDelimitedFrom(
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
    public static net.pt.Protocol.SChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SChatMessage prototype) {
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
       implements net.pt.Protocol.SChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SChatMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SChatMessage_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SChatMessage.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SChatMessage.getDescriptor();
      }
      
      public net.pt.Protocol.SChatMessage getDefaultInstanceForType() {
        return net.pt.Protocol.SChatMessage.getDefaultInstance();
      }
      
      public net.pt.Protocol.SChatMessage build() {
        net.pt.Protocol.SChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SChatMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SChatMessage buildPartial() {
        net.pt.Protocol.SChatMessage result = new net.pt.Protocol.SChatMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SChatMessage) {
          return mergeFrom((net.pt.Protocol.SChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SChatMessage other) {
        if (other == net.pt.Protocol.SChatMessage.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        if (!hasOpponentId()) {
          
          return false;
        }
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
            case 8: {
              bitField0_ |= 0x00000001;
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              message_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // required string message = 3;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
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
  bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000004);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        message_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SChatMessage)
    }
    
    static {
      defaultInstance = new SChatMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SChatMessage)
  }
  
  public interface CChatMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string message = 1;
    boolean hasMessage();
    String getMessage();
  }
  public static final class CChatMessage extends
      com.google.protobuf.GeneratedMessage
      implements CChatMessageOrBuilder {
    // Use CChatMessage.newBuilder() to construct.
    private CChatMessage(Builder builder) {
      super(builder);
    }
    private CChatMessage(boolean noInit) {}
    
    private static final CChatMessage defaultInstance;
    public static CChatMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public CChatMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CChatMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CChatMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string message = 1;
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
    
    public static net.pt.Protocol.CChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CChatMessage parseDelimitedFrom(
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
    public static net.pt.Protocol.CChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CChatMessage prototype) {
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
       implements net.pt.Protocol.CChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CChatMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CChatMessage_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CChatMessage.newBuilder()
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
        return net.pt.Protocol.CChatMessage.getDescriptor();
      }
      
      public net.pt.Protocol.CChatMessage getDefaultInstanceForType() {
        return net.pt.Protocol.CChatMessage.getDefaultInstance();
      }
      
      public net.pt.Protocol.CChatMessage build() {
        net.pt.Protocol.CChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CChatMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CChatMessage buildPartial() {
        net.pt.Protocol.CChatMessage result = new net.pt.Protocol.CChatMessage(this);
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
        if (other instanceof net.pt.Protocol.CChatMessage) {
          return mergeFrom((net.pt.Protocol.CChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CChatMessage other) {
        if (other == net.pt.Protocol.CChatMessage.getDefaultInstance()) return this;
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
      
      // required string message = 1;
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
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CChatMessage)
    }
    
    static {
      defaultInstance = new CChatMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CChatMessage)
  }
  
  public interface SGroupChatMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required string message = 2;
    boolean hasMessage();
    String getMessage();
    
    // required int32 groupId = 3;
    boolean hasGroupId();
    int getGroupId();
  }
  public static final class SGroupChatMessage extends
      com.google.protobuf.GeneratedMessage
      implements SGroupChatMessageOrBuilder {
    // Use SGroupChatMessage.newBuilder() to construct.
    private SGroupChatMessage(Builder builder) {
      super(builder);
    }
    private SGroupChatMessage(boolean noInit) {}
    
    private static final SGroupChatMessage defaultInstance;
    public static SGroupChatMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public SGroupChatMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SGroupChatMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SGroupChatMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required string message = 2;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
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
    
    // required int32 groupId = 3;
    public static final int GROUPID_FIELD_NUMBER = 3;
    private int groupId_;
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getGroupId() {
      return groupId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      message_ = "";
      groupId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasMessage()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroupId()) {
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMessageBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, groupId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMessageBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, groupId_);
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
    
    public static net.pt.Protocol.SGroupChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SGroupChatMessage parseDelimitedFrom(
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
    public static net.pt.Protocol.SGroupChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SGroupChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SGroupChatMessage prototype) {
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
       implements net.pt.Protocol.SGroupChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SGroupChatMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SGroupChatMessage_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SGroupChatMessage.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        groupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SGroupChatMessage.getDescriptor();
      }
      
      public net.pt.Protocol.SGroupChatMessage getDefaultInstanceForType() {
        return net.pt.Protocol.SGroupChatMessage.getDefaultInstance();
      }
      
      public net.pt.Protocol.SGroupChatMessage build() {
        net.pt.Protocol.SGroupChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SGroupChatMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SGroupChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SGroupChatMessage buildPartial() {
        net.pt.Protocol.SGroupChatMessage result = new net.pt.Protocol.SGroupChatMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.groupId_ = groupId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SGroupChatMessage) {
          return mergeFrom((net.pt.Protocol.SGroupChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SGroupChatMessage other) {
        if (other == net.pt.Protocol.SGroupChatMessage.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        if (!hasMessage()) {
          
          return false;
        }
        if (!hasGroupId()) {
          
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
              playerId_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              message_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              groupId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required string message = 2;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
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
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
      }
      
      // required int32 groupId = 3;
      private int groupId_ ;
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getGroupId() {
        return groupId_;
      }
      public Builder setGroupId(int value) {
        bitField0_ |= 0x00000004;
        groupId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        groupId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SGroupChatMessage)
    }
    
    static {
      defaultInstance = new SGroupChatMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SGroupChatMessage)
  }
  
  public interface CGroupChatMessageOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required string message = 2;
    boolean hasMessage();
    String getMessage();
  }
  public static final class CGroupChatMessage extends
      com.google.protobuf.GeneratedMessage
      implements CGroupChatMessageOrBuilder {
    // Use CGroupChatMessage.newBuilder() to construct.
    private CGroupChatMessage(Builder builder) {
      super(builder);
    }
    private CGroupChatMessage(boolean noInit) {}
    
    private static final CGroupChatMessage defaultInstance;
    public static CGroupChatMessage getDefaultInstance() {
      return defaultInstance;
    }
    
    public CGroupChatMessage getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CGroupChatMessage_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CGroupChatMessage_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required string message = 2;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private java.lang.Object message_;
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
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
      playerId_ = 0;
      message_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getMessageBytes());
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getMessageBytes());
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
    
    public static net.pt.Protocol.CGroupChatMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CGroupChatMessage parseDelimitedFrom(
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
    public static net.pt.Protocol.CGroupChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CGroupChatMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CGroupChatMessage prototype) {
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
       implements net.pt.Protocol.CGroupChatMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CGroupChatMessage_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CGroupChatMessage_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CGroupChatMessage.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        message_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CGroupChatMessage.getDescriptor();
      }
      
      public net.pt.Protocol.CGroupChatMessage getDefaultInstanceForType() {
        return net.pt.Protocol.CGroupChatMessage.getDefaultInstance();
      }
      
      public net.pt.Protocol.CGroupChatMessage build() {
        net.pt.Protocol.CGroupChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CGroupChatMessage buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CGroupChatMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CGroupChatMessage buildPartial() {
        net.pt.Protocol.CGroupChatMessage result = new net.pt.Protocol.CGroupChatMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.message_ = message_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CGroupChatMessage) {
          return mergeFrom((net.pt.Protocol.CGroupChatMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CGroupChatMessage other) {
        if (other == net.pt.Protocol.CGroupChatMessage.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
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
            case 8: {
              bitField0_ |= 0x00000001;
              playerId_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              message_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required string message = 2;
      private java.lang.Object message_ = "";
      public boolean hasMessage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
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
  bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
        return this;
      }
      public Builder clearMessage() {
        bitField0_ = (bitField0_ & ~0x00000002);
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      void setMessage(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        message_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CGroupChatMessage)
    }
    
    static {
      defaultInstance = new CGroupChatMessage(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CGroupChatMessage)
  }
  
  public interface SExitFromGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 opponentId = 2;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class SExitFromGame extends
      com.google.protobuf.GeneratedMessage
      implements SExitFromGameOrBuilder {
    // Use SExitFromGame.newBuilder() to construct.
    private SExitFromGame(Builder builder) {
      super(builder);
    }
    private SExitFromGame(boolean noInit) {}
    
    private static final SExitFromGame defaultInstance;
    public static SExitFromGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public SExitFromGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SExitFromGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SExitFromGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 opponentId = 2;
    public static final int OPPONENTID_FIELD_NUMBER = 2;
    private int opponentId_;
    public boolean hasOpponentId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getOpponentId() {
      return opponentId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      opponentId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, opponentId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, opponentId_);
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
    
    public static net.pt.Protocol.SExitFromGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SExitFromGame parseDelimitedFrom(
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
    public static net.pt.Protocol.SExitFromGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SExitFromGame prototype) {
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
       implements net.pt.Protocol.SExitFromGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SExitFromGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SExitFromGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SExitFromGame.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        opponentId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SExitFromGame.getDescriptor();
      }
      
      public net.pt.Protocol.SExitFromGame getDefaultInstanceForType() {
        return net.pt.Protocol.SExitFromGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.SExitFromGame build() {
        net.pt.Protocol.SExitFromGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SExitFromGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SExitFromGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SExitFromGame buildPartial() {
        net.pt.Protocol.SExitFromGame result = new net.pt.Protocol.SExitFromGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.opponentId_ = opponentId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SExitFromGame) {
          return mergeFrom((net.pt.Protocol.SExitFromGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SExitFromGame other) {
        if (other == net.pt.Protocol.SExitFromGame.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasOpponentId()) {
          setOpponentId(other.getOpponentId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              opponentId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 opponentId = 2;
      private int opponentId_ ;
      public boolean hasOpponentId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getOpponentId() {
        return opponentId_;
      }
      public Builder setOpponentId(int value) {
        bitField0_ |= 0x00000002;
        opponentId_ = value;
        onChanged();
        return this;
      }
      public Builder clearOpponentId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        opponentId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SExitFromGame)
    }
    
    static {
      defaultInstance = new SExitFromGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SExitFromGame)
  }
  
  public interface CExitFromGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 opponentId = 1;
    boolean hasOpponentId();
    int getOpponentId();
  }
  public static final class CExitFromGame extends
      com.google.protobuf.GeneratedMessage
      implements CExitFromGameOrBuilder {
    // Use CExitFromGame.newBuilder() to construct.
    private CExitFromGame(Builder builder) {
      super(builder);
    }
    private CExitFromGame(boolean noInit) {}
    
    private static final CExitFromGame defaultInstance;
    public static CExitFromGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public CExitFromGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CExitFromGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CExitFromGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 opponentId = 1;
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
    
    public static net.pt.Protocol.CExitFromGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CExitFromGame parseDelimitedFrom(
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
    public static net.pt.Protocol.CExitFromGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CExitFromGame prototype) {
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
       implements net.pt.Protocol.CExitFromGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CExitFromGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CExitFromGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CExitFromGame.newBuilder()
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
        return net.pt.Protocol.CExitFromGame.getDescriptor();
      }
      
      public net.pt.Protocol.CExitFromGame getDefaultInstanceForType() {
        return net.pt.Protocol.CExitFromGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.CExitFromGame build() {
        net.pt.Protocol.CExitFromGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CExitFromGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CExitFromGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CExitFromGame buildPartial() {
        net.pt.Protocol.CExitFromGame result = new net.pt.Protocol.CExitFromGame(this);
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
        if (other instanceof net.pt.Protocol.CExitFromGame) {
          return mergeFrom((net.pt.Protocol.CExitFromGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CExitFromGame other) {
        if (other == net.pt.Protocol.CExitFromGame.getDefaultInstance()) return this;
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
      
      // required int32 opponentId = 1;
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
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CExitFromGame)
    }
    
    static {
      defaultInstance = new CExitFromGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CExitFromGame)
  }
  
  public interface SExitFromGroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
    
    // required int32 groupId = 2;
    boolean hasGroupId();
    int getGroupId();
  }
  public static final class SExitFromGroup extends
      com.google.protobuf.GeneratedMessage
      implements SExitFromGroupOrBuilder {
    // Use SExitFromGroup.newBuilder() to construct.
    private SExitFromGroup(Builder builder) {
      super(builder);
    }
    private SExitFromGroup(boolean noInit) {}
    
    private static final SExitFromGroup defaultInstance;
    public static SExitFromGroup getDefaultInstance() {
      return defaultInstance;
    }
    
    public SExitFromGroup getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SExitFromGroup_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SExitFromGroup_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    // required int32 groupId = 2;
    public static final int GROUPID_FIELD_NUMBER = 2;
    private int groupId_;
    public boolean hasGroupId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getGroupId() {
      return groupId_;
    }
    
    private void initFields() {
      playerId_ = 0;
      groupId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasGroupId()) {
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
        output.writeInt32(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, groupId_);
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
          .computeInt32Size(1, playerId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, groupId_);
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
    
    public static net.pt.Protocol.SExitFromGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SExitFromGroup parseDelimitedFrom(
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
    public static net.pt.Protocol.SExitFromGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SExitFromGroup prototype) {
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
       implements net.pt.Protocol.SExitFromGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SExitFromGroup_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SExitFromGroup_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SExitFromGroup.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        groupId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SExitFromGroup.getDescriptor();
      }
      
      public net.pt.Protocol.SExitFromGroup getDefaultInstanceForType() {
        return net.pt.Protocol.SExitFromGroup.getDefaultInstance();
      }
      
      public net.pt.Protocol.SExitFromGroup build() {
        net.pt.Protocol.SExitFromGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SExitFromGroup buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SExitFromGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SExitFromGroup buildPartial() {
        net.pt.Protocol.SExitFromGroup result = new net.pt.Protocol.SExitFromGroup(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.groupId_ = groupId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SExitFromGroup) {
          return mergeFrom((net.pt.Protocol.SExitFromGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SExitFromGroup other) {
        if (other == net.pt.Protocol.SExitFromGroup.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        if (other.hasGroupId()) {
          setGroupId(other.getGroupId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
          return false;
        }
        if (!hasGroupId()) {
          
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
              playerId_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              groupId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // required int32 groupId = 2;
      private int groupId_ ;
      public boolean hasGroupId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getGroupId() {
        return groupId_;
      }
      public Builder setGroupId(int value) {
        bitField0_ |= 0x00000002;
        groupId_ = value;
        onChanged();
        return this;
      }
      public Builder clearGroupId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        groupId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SExitFromGroup)
    }
    
    static {
      defaultInstance = new SExitFromGroup(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SExitFromGroup)
  }
  
  public interface CExitFromGroupOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
  }
  public static final class CExitFromGroup extends
      com.google.protobuf.GeneratedMessage
      implements CExitFromGroupOrBuilder {
    // Use CExitFromGroup.newBuilder() to construct.
    private CExitFromGroup(Builder builder) {
      super(builder);
    }
    private CExitFromGroup(boolean noInit) {}
    
    private static final CExitFromGroup defaultInstance;
    public static CExitFromGroup getDefaultInstance() {
      return defaultInstance;
    }
    
    public CExitFromGroup getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CExitFromGroup_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CExitFromGroup_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    private void initFields() {
      playerId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
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
        output.writeInt32(1, playerId_);
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
          .computeInt32Size(1, playerId_);
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
    
    public static net.pt.Protocol.CExitFromGroup parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CExitFromGroup parseDelimitedFrom(
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
    public static net.pt.Protocol.CExitFromGroup parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CExitFromGroup parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CExitFromGroup prototype) {
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
       implements net.pt.Protocol.CExitFromGroupOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CExitFromGroup_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CExitFromGroup_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CExitFromGroup.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CExitFromGroup.getDescriptor();
      }
      
      public net.pt.Protocol.CExitFromGroup getDefaultInstanceForType() {
        return net.pt.Protocol.CExitFromGroup.getDefaultInstance();
      }
      
      public net.pt.Protocol.CExitFromGroup build() {
        net.pt.Protocol.CExitFromGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CExitFromGroup buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CExitFromGroup result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CExitFromGroup buildPartial() {
        net.pt.Protocol.CExitFromGroup result = new net.pt.Protocol.CExitFromGroup(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CExitFromGroup) {
          return mergeFrom((net.pt.Protocol.CExitFromGroup)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CExitFromGroup other) {
        if (other == net.pt.Protocol.CExitFromGroup.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
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
              playerId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CExitFromGroup)
    }
    
    static {
      defaultInstance = new CExitFromGroup(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CExitFromGroup)
  }
  
  public interface SExitFromGlobalGameOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
  }
  public static final class SExitFromGlobalGame extends
      com.google.protobuf.GeneratedMessage
      implements SExitFromGlobalGameOrBuilder {
    // Use SExitFromGlobalGame.newBuilder() to construct.
    private SExitFromGlobalGame(Builder builder) {
      super(builder);
    }
    private SExitFromGlobalGame(boolean noInit) {}
    
    private static final SExitFromGlobalGame defaultInstance;
    public static SExitFromGlobalGame getDefaultInstance() {
      return defaultInstance;
    }
    
    public SExitFromGlobalGame getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_SExitFromGlobalGame_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_SExitFromGlobalGame_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    private void initFields() {
      playerId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
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
        output.writeInt32(1, playerId_);
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
          .computeInt32Size(1, playerId_);
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
    
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseDelimitedFrom(
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
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.SExitFromGlobalGame parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.SExitFromGlobalGame prototype) {
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
       implements net.pt.Protocol.SExitFromGlobalGameOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_SExitFromGlobalGame_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_SExitFromGlobalGame_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.SExitFromGlobalGame.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.SExitFromGlobalGame.getDescriptor();
      }
      
      public net.pt.Protocol.SExitFromGlobalGame getDefaultInstanceForType() {
        return net.pt.Protocol.SExitFromGlobalGame.getDefaultInstance();
      }
      
      public net.pt.Protocol.SExitFromGlobalGame build() {
        net.pt.Protocol.SExitFromGlobalGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.SExitFromGlobalGame buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.SExitFromGlobalGame result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.SExitFromGlobalGame buildPartial() {
        net.pt.Protocol.SExitFromGlobalGame result = new net.pt.Protocol.SExitFromGlobalGame(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.SExitFromGlobalGame) {
          return mergeFrom((net.pt.Protocol.SExitFromGlobalGame)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.SExitFromGlobalGame other) {
        if (other == net.pt.Protocol.SExitFromGlobalGame.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
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
              playerId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.SExitFromGlobalGame)
    }
    
    static {
      defaultInstance = new SExitFromGlobalGame(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.SExitFromGlobalGame)
  }
  
  public interface STop100PlayerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required int32 playerId = 1;
    boolean hasPlayerId();
    int getPlayerId();
  }
  public static final class STop100Player extends
      com.google.protobuf.GeneratedMessage
      implements STop100PlayerOrBuilder {
    // Use STop100Player.newBuilder() to construct.
    private STop100Player(Builder builder) {
      super(builder);
    }
    private STop100Player(boolean noInit) {}
    
    private static final STop100Player defaultInstance;
    public static STop100Player getDefaultInstance() {
      return defaultInstance;
    }
    
    public STop100Player getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_STop100Player_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_STop100Player_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required int32 playerId = 1;
    public static final int PLAYERID_FIELD_NUMBER = 1;
    private int playerId_;
    public boolean hasPlayerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getPlayerId() {
      return playerId_;
    }
    
    private void initFields() {
      playerId_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasPlayerId()) {
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
        output.writeInt32(1, playerId_);
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
          .computeInt32Size(1, playerId_);
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
    
    public static net.pt.Protocol.STop100Player parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.STop100Player parseDelimitedFrom(
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
    public static net.pt.Protocol.STop100Player parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.STop100Player parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.STop100Player prototype) {
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
       implements net.pt.Protocol.STop100PlayerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_STop100Player_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_STop100Player_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.STop100Player.newBuilder()
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
        playerId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.STop100Player.getDescriptor();
      }
      
      public net.pt.Protocol.STop100Player getDefaultInstanceForType() {
        return net.pt.Protocol.STop100Player.getDefaultInstance();
      }
      
      public net.pt.Protocol.STop100Player build() {
        net.pt.Protocol.STop100Player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.STop100Player buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.STop100Player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.STop100Player buildPartial() {
        net.pt.Protocol.STop100Player result = new net.pt.Protocol.STop100Player(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.playerId_ = playerId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.STop100Player) {
          return mergeFrom((net.pt.Protocol.STop100Player)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.STop100Player other) {
        if (other == net.pt.Protocol.STop100Player.getDefaultInstance()) return this;
        if (other.hasPlayerId()) {
          setPlayerId(other.getPlayerId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasPlayerId()) {
          
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
              playerId_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required int32 playerId = 1;
      private int playerId_ ;
      public boolean hasPlayerId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getPlayerId() {
        return playerId_;
      }
      public Builder setPlayerId(int value) {
        bitField0_ |= 0x00000001;
        playerId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPlayerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        playerId_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.STop100Player)
    }
    
    static {
      defaultInstance = new STop100Player(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.STop100Player)
  }
  
  public interface CTop100PlayerOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .net.protocol.Player player = 1;
    java.util.List<net.pt.Protocol.Player> 
        getPlayerList();
    net.pt.Protocol.Player getPlayer(int index);
    int getPlayerCount();
    java.util.List<? extends net.pt.Protocol.PlayerOrBuilder> 
        getPlayerOrBuilderList();
    net.pt.Protocol.PlayerOrBuilder getPlayerOrBuilder(
        int index);
  }
  public static final class CTop100Player extends
      com.google.protobuf.GeneratedMessage
      implements CTop100PlayerOrBuilder {
    // Use CTop100Player.newBuilder() to construct.
    private CTop100Player(Builder builder) {
      super(builder);
    }
    private CTop100Player(boolean noInit) {}
    
    private static final CTop100Player defaultInstance;
    public static CTop100Player getDefaultInstance() {
      return defaultInstance;
    }
    
    public CTop100Player getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_CTop100Player_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_CTop100Player_fieldAccessorTable;
    }
    
    // repeated .net.protocol.Player player = 1;
    public static final int PLAYER_FIELD_NUMBER = 1;
    private java.util.List<net.pt.Protocol.Player> player_;
    public java.util.List<net.pt.Protocol.Player> getPlayerList() {
      return player_;
    }
    public java.util.List<? extends net.pt.Protocol.PlayerOrBuilder> 
        getPlayerOrBuilderList() {
      return player_;
    }
    public int getPlayerCount() {
      return player_.size();
    }
    public net.pt.Protocol.Player getPlayer(int index) {
      return player_.get(index);
    }
    public net.pt.Protocol.PlayerOrBuilder getPlayerOrBuilder(
        int index) {
      return player_.get(index);
    }
    
    private void initFields() {
      player_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      for (int i = 0; i < getPlayerCount(); i++) {
        if (!getPlayer(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < player_.size(); i++) {
        output.writeMessage(1, player_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < player_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, player_.get(i));
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
    
    public static net.pt.Protocol.CTop100Player parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.CTop100Player parseDelimitedFrom(
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
    public static net.pt.Protocol.CTop100Player parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.CTop100Player parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.CTop100Player prototype) {
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
       implements net.pt.Protocol.CTop100PlayerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_CTop100Player_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_CTop100Player_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.CTop100Player.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getPlayerFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (playerBuilder_ == null) {
          player_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playerBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.CTop100Player.getDescriptor();
      }
      
      public net.pt.Protocol.CTop100Player getDefaultInstanceForType() {
        return net.pt.Protocol.CTop100Player.getDefaultInstance();
      }
      
      public net.pt.Protocol.CTop100Player build() {
        net.pt.Protocol.CTop100Player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.CTop100Player buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.CTop100Player result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.CTop100Player buildPartial() {
        net.pt.Protocol.CTop100Player result = new net.pt.Protocol.CTop100Player(this);
        int from_bitField0_ = bitField0_;
        if (playerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            player_ = java.util.Collections.unmodifiableList(player_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.player_ = player_;
        } else {
          result.player_ = playerBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.CTop100Player) {
          return mergeFrom((net.pt.Protocol.CTop100Player)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.CTop100Player other) {
        if (other == net.pt.Protocol.CTop100Player.getDefaultInstance()) return this;
        if (playerBuilder_ == null) {
          if (!other.player_.isEmpty()) {
            if (player_.isEmpty()) {
              player_ = other.player_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayerIsMutable();
              player_.addAll(other.player_);
            }
            onChanged();
          }
        } else {
          if (!other.player_.isEmpty()) {
            if (playerBuilder_.isEmpty()) {
              playerBuilder_.dispose();
              playerBuilder_ = null;
              player_ = other.player_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playerBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getPlayerFieldBuilder() : null;
            } else {
              playerBuilder_.addAllMessages(other.player_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        for (int i = 0; i < getPlayerCount(); i++) {
          if (!getPlayer(i).isInitialized()) {
            
            return false;
          }
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
              net.pt.Protocol.Player.Builder subBuilder = net.pt.Protocol.Player.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addPlayer(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .net.protocol.Player player = 1;
      private java.util.List<net.pt.Protocol.Player> player_ =
        java.util.Collections.emptyList();
      private void ensurePlayerIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          player_ = new java.util.ArrayList<net.pt.Protocol.Player>(player_);
          bitField0_ |= 0x00000001;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.Player, net.pt.Protocol.Player.Builder, net.pt.Protocol.PlayerOrBuilder> playerBuilder_;
      
      public java.util.List<net.pt.Protocol.Player> getPlayerList() {
        if (playerBuilder_ == null) {
          return java.util.Collections.unmodifiableList(player_);
        } else {
          return playerBuilder_.getMessageList();
        }
      }
      public int getPlayerCount() {
        if (playerBuilder_ == null) {
          return player_.size();
        } else {
          return playerBuilder_.getCount();
        }
      }
      public net.pt.Protocol.Player getPlayer(int index) {
        if (playerBuilder_ == null) {
          return player_.get(index);
        } else {
          return playerBuilder_.getMessage(index);
        }
      }
      public Builder setPlayer(
          int index, net.pt.Protocol.Player value) {
        if (playerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerIsMutable();
          player_.set(index, value);
          onChanged();
        } else {
          playerBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setPlayer(
          int index, net.pt.Protocol.Player.Builder builderForValue) {
        if (playerBuilder_ == null) {
          ensurePlayerIsMutable();
          player_.set(index, builderForValue.build());
          onChanged();
        } else {
          playerBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addPlayer(net.pt.Protocol.Player value) {
        if (playerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerIsMutable();
          player_.add(value);
          onChanged();
        } else {
          playerBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addPlayer(
          int index, net.pt.Protocol.Player value) {
        if (playerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayerIsMutable();
          player_.add(index, value);
          onChanged();
        } else {
          playerBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addPlayer(
          net.pt.Protocol.Player.Builder builderForValue) {
        if (playerBuilder_ == null) {
          ensurePlayerIsMutable();
          player_.add(builderForValue.build());
          onChanged();
        } else {
          playerBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addPlayer(
          int index, net.pt.Protocol.Player.Builder builderForValue) {
        if (playerBuilder_ == null) {
          ensurePlayerIsMutable();
          player_.add(index, builderForValue.build());
          onChanged();
        } else {
          playerBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllPlayer(
          java.lang.Iterable<? extends net.pt.Protocol.Player> values) {
        if (playerBuilder_ == null) {
          ensurePlayerIsMutable();
          super.addAll(values, player_);
          onChanged();
        } else {
          playerBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearPlayer() {
        if (playerBuilder_ == null) {
          player_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playerBuilder_.clear();
        }
        return this;
      }
      public Builder removePlayer(int index) {
        if (playerBuilder_ == null) {
          ensurePlayerIsMutable();
          player_.remove(index);
          onChanged();
        } else {
          playerBuilder_.remove(index);
        }
        return this;
      }
      public net.pt.Protocol.Player.Builder getPlayerBuilder(
          int index) {
        return getPlayerFieldBuilder().getBuilder(index);
      }
      public net.pt.Protocol.PlayerOrBuilder getPlayerOrBuilder(
          int index) {
        if (playerBuilder_ == null) {
          return player_.get(index);  } else {
          return playerBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends net.pt.Protocol.PlayerOrBuilder> 
           getPlayerOrBuilderList() {
        if (playerBuilder_ != null) {
          return playerBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(player_);
        }
      }
      public net.pt.Protocol.Player.Builder addPlayerBuilder() {
        return getPlayerFieldBuilder().addBuilder(
            net.pt.Protocol.Player.getDefaultInstance());
      }
      public net.pt.Protocol.Player.Builder addPlayerBuilder(
          int index) {
        return getPlayerFieldBuilder().addBuilder(
            index, net.pt.Protocol.Player.getDefaultInstance());
      }
      public java.util.List<net.pt.Protocol.Player.Builder> 
           getPlayerBuilderList() {
        return getPlayerFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          net.pt.Protocol.Player, net.pt.Protocol.Player.Builder, net.pt.Protocol.PlayerOrBuilder> 
          getPlayerFieldBuilder() {
        if (playerBuilder_ == null) {
          playerBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              net.pt.Protocol.Player, net.pt.Protocol.Player.Builder, net.pt.Protocol.PlayerOrBuilder>(
                  player_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          player_ = null;
        }
        return playerBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.CTop100Player)
    }
    
    static {
      defaultInstance = new CTop100Player(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.CTop100Player)
  }
  
  public interface TimeForMoveFullUpOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required bool timeFullUp = 1;
    boolean hasTimeFullUp();
    boolean getTimeFullUp();
  }
  public static final class TimeForMoveFullUp extends
      com.google.protobuf.GeneratedMessage
      implements TimeForMoveFullUpOrBuilder {
    // Use TimeForMoveFullUp.newBuilder() to construct.
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
      return net.pt.Protocol.internal_static_net_protocol_TimeForMoveFullUp_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_TimeForMoveFullUp_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required bool timeFullUp = 1;
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
    
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseDelimitedFrom(
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
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.TimeForMoveFullUp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.TimeForMoveFullUp prototype) {
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
       implements net.pt.Protocol.TimeForMoveFullUpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_TimeForMoveFullUp_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_TimeForMoveFullUp_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.TimeForMoveFullUp.newBuilder()
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
        return net.pt.Protocol.TimeForMoveFullUp.getDescriptor();
      }
      
      public net.pt.Protocol.TimeForMoveFullUp getDefaultInstanceForType() {
        return net.pt.Protocol.TimeForMoveFullUp.getDefaultInstance();
      }
      
      public net.pt.Protocol.TimeForMoveFullUp build() {
        net.pt.Protocol.TimeForMoveFullUp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.TimeForMoveFullUp buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.TimeForMoveFullUp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.TimeForMoveFullUp buildPartial() {
        net.pt.Protocol.TimeForMoveFullUp result = new net.pt.Protocol.TimeForMoveFullUp(this);
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
        if (other instanceof net.pt.Protocol.TimeForMoveFullUp) {
          return mergeFrom((net.pt.Protocol.TimeForMoveFullUp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.TimeForMoveFullUp other) {
        if (other == net.pt.Protocol.TimeForMoveFullUp.getDefaultInstance()) return this;
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
      
      // required bool timeFullUp = 1;
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
      
      // @@protoc_insertion_point(builder_scope:net.protocol.TimeForMoveFullUp)
    }
    
    static {
      defaultInstance = new TimeForMoveFullUp(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.TimeForMoveFullUp)
  }
  
  public interface AppNeedUpdateToLastVersionOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string urlForUpdate = 1;
    boolean hasUrlForUpdate();
    String getUrlForUpdate();
  }
  public static final class AppNeedUpdateToLastVersion extends
      com.google.protobuf.GeneratedMessage
      implements AppNeedUpdateToLastVersionOrBuilder {
    // Use AppNeedUpdateToLastVersion.newBuilder() to construct.
    private AppNeedUpdateToLastVersion(Builder builder) {
      super(builder);
    }
    private AppNeedUpdateToLastVersion(boolean noInit) {}
    
    private static final AppNeedUpdateToLastVersion defaultInstance;
    public static AppNeedUpdateToLastVersion getDefaultInstance() {
      return defaultInstance;
    }
    
    public AppNeedUpdateToLastVersion getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.pt.Protocol.internal_static_net_protocol_AppNeedUpdateToLastVersion_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.pt.Protocol.internal_static_net_protocol_AppNeedUpdateToLastVersion_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string urlForUpdate = 1;
    public static final int URLFORUPDATE_FIELD_NUMBER = 1;
    private java.lang.Object urlForUpdate_;
    public boolean hasUrlForUpdate() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getUrlForUpdate() {
      java.lang.Object ref = urlForUpdate_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          urlForUpdate_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getUrlForUpdateBytes() {
      java.lang.Object ref = urlForUpdate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        urlForUpdate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      urlForUpdate_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasUrlForUpdate()) {
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
        output.writeBytes(1, getUrlForUpdateBytes());
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
          .computeBytesSize(1, getUrlForUpdateBytes());
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
    
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseDelimitedFrom(
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
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static net.pt.Protocol.AppNeedUpdateToLastVersion parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(net.pt.Protocol.AppNeedUpdateToLastVersion prototype) {
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
       implements net.pt.Protocol.AppNeedUpdateToLastVersionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.pt.Protocol.internal_static_net_protocol_AppNeedUpdateToLastVersion_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.pt.Protocol.internal_static_net_protocol_AppNeedUpdateToLastVersion_fieldAccessorTable;
      }
      
      // Construct using net.protocol.Protocol.AppNeedUpdateToLastVersion.newBuilder()
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
        urlForUpdate_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.pt.Protocol.AppNeedUpdateToLastVersion.getDescriptor();
      }
      
      public net.pt.Protocol.AppNeedUpdateToLastVersion getDefaultInstanceForType() {
        return net.pt.Protocol.AppNeedUpdateToLastVersion.getDefaultInstance();
      }
      
      public net.pt.Protocol.AppNeedUpdateToLastVersion build() {
        net.pt.Protocol.AppNeedUpdateToLastVersion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private net.pt.Protocol.AppNeedUpdateToLastVersion buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        net.pt.Protocol.AppNeedUpdateToLastVersion result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public net.pt.Protocol.AppNeedUpdateToLastVersion buildPartial() {
        net.pt.Protocol.AppNeedUpdateToLastVersion result = new net.pt.Protocol.AppNeedUpdateToLastVersion(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.urlForUpdate_ = urlForUpdate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.pt.Protocol.AppNeedUpdateToLastVersion) {
          return mergeFrom((net.pt.Protocol.AppNeedUpdateToLastVersion)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(net.pt.Protocol.AppNeedUpdateToLastVersion other) {
        if (other == net.pt.Protocol.AppNeedUpdateToLastVersion.getDefaultInstance()) return this;
        if (other.hasUrlForUpdate()) {
          setUrlForUpdate(other.getUrlForUpdate());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasUrlForUpdate()) {
          
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
              urlForUpdate_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string urlForUpdate = 1;
      private java.lang.Object urlForUpdate_ = "";
      public boolean hasUrlForUpdate() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getUrlForUpdate() {
        java.lang.Object ref = urlForUpdate_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          urlForUpdate_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setUrlForUpdate(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        urlForUpdate_ = value;
        onChanged();
        return this;
      }
      public Builder clearUrlForUpdate() {
        bitField0_ = (bitField0_ & ~0x00000001);
        urlForUpdate_ = getDefaultInstance().getUrlForUpdate();
        onChanged();
        return this;
      }
      void setUrlForUpdate(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        urlForUpdate_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:net.protocol.AppNeedUpdateToLastVersion)
    }
    
    static {
      defaultInstance = new AppNeedUpdateToLastVersion(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:net.protocol.AppNeedUpdateToLastVersion)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SLoginToGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SLoginToGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CLoginToGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CLoginToGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SRegistrationNewXOAccount_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SRegistrationNewXOAccount_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CRegistrationNewXOAccount_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CRegistrationNewXOAccount_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SForgotXOAccountPassword_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SForgotXOAccountPassword_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CForgotXOAccountPassword_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CForgotXOAccountPassword_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CUpdateAboutActivityPlayer_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CUpdateAboutActivityPlayer_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SGetUpdate_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SGetUpdate_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_Player_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_Player_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SGetGroupList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SGetGroupList_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CGetGroupList_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CGetGroupList_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_Group_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_Group_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SEnterToGroup_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SEnterToGroup_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CEnterToGroup_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CEnterToGroup_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SWantToPlay_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SWantToPlay_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CWantToPlay_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CWantToPlay_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SCancelDesirePlay_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SCancelDesirePlay_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CCancelDesirePlay_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CCancelDesirePlay_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SStartGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SStartGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CStartGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CStartGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SDidMove_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SDidMove_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CDidMove_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CDidMove_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SWonGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SWonGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SContinueGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SContinueGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CContinueGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CContinueGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SChatMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SChatMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CChatMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CChatMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SGroupChatMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SGroupChatMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CGroupChatMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CGroupChatMessage_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SExitFromGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SExitFromGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CExitFromGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CExitFromGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SExitFromGroup_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SExitFromGroup_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CExitFromGroup_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CExitFromGroup_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_SExitFromGlobalGame_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_SExitFromGlobalGame_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_STop100Player_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_STop100Player_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_CTop100Player_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_CTop100Player_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_TimeForMoveFullUp_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_TimeForMoveFullUp_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_net_protocol_AppNeedUpdateToLastVersion_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_net_protocol_AppNeedUpdateToLastVersion_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Protocol.proto\022\014net.protocol\"\206\001\n\014SLogi" +
      "nToGame\022\014\n\004name\030\001 \002(\t\0227\n\017registarionType" +
      "\030\002 \002(\0162\036.net.protocol.RegistrationType\022\014" +
      "\n\004uuid\030\003 \001(\t\022\r\n\005isBot\030\004 \001(\010\022\022\n\nappVersio" +
      "n\030\005 \001(\002\"]\n\014CLoginToGame\022\017\n\007isLogin\030\002 \002(\010" +
      "\022\n\n\002id\030\001 \001(\005\0220\n\014loginProblem\030\003 \001(\0162\032.net" +
      ".protocol.LoginProblem\"{\n\031SRegistrationN" +
      "ewXOAccount\022\014\n\004name\030\001 \002(\t\022\020\n\010password\030\002 " +
      "\002(\t\022\r\n\005email\030\003 \002(\t\022\036\n\003sex\030\004 \002(\0162\021.net.pr" +
      "otocol.Sex\022\017\n\007country\030\005 \001(\t\"d\n\031CRegistra",
      "tionNewXOAccount\022\023\n\013isRegistred\030\001 \002(\010\0222\n" +
      "\007problem\030\002 \001(\0162!.net.protocol.Registrati" +
      "onProblem\")\n\030SForgotXOAccountPassword\022\r\n" +
      "\005email\030\001 \002(\t\"V\n\030CForgotXOAccountPassword" +
      "\022:\n\010pesponse\030\001 \002(\0162(.net.protocol.Respon" +
      "seForRestorePassword\"\210\001\n\032CUpdateAboutAct" +
      "ivityPlayer\022\'\n\tnewPlayer\030\001 \003(\0132\024.net.pro" +
      "tocol.Player\0220\n\nexitPlayer\030\002 \003(\0132\034.net.p" +
      "rotocol.CExitFromGroup\022\017\n\007groupId\030\003 \002(\005\"" +
      ")\n\nSGetUpdate\022\n\n\002id\030\001 \002(\005\022\017\n\007groupId\030\002 \002",
      "(\005\"2\n\006Player\022\014\n\004name\030\001 \002(\t\022\n\n\002id\030\002 \002(\005\022\016" +
      "\n\006rating\030\003 \001(\005\"\033\n\rSGetGroupList\022\n\n\002id\030\001 " +
      "\002(\005\"P\n\rCGetGroupList\022\"\n\005group\030\001 \003(\0132\023.ne" +
      "t.protocol.Group\022\033\n\023numAllOnlinePlayers\030" +
      "\002 \001(\005\"I\n\005Group\022\017\n\007groupId\030\003 \002(\005\022\030\n\020numOn" +
      "linePlayers\030\001 \002(\005\022\025\n\rnumOnlineBots\030\002 \001(\005" +
      "\" \n\rSEnterToGroup\022\017\n\007groupId\030\001 \002(\005\"\'\n\rCE" +
      "nterToGroup\022\026\n\016isEnteredGroup\030\001 \002(\010\"3\n\013S" +
      "WantToPlay\022\020\n\010playerId\030\001 \002(\005\022\022\n\nopponent" +
      "Id\030\002 \002(\005\"!\n\013CWantToPlay\022\022\n\nopponentId\030\001 ",
      "\002(\005\"9\n\021SCancelDesirePlay\022\020\n\010playerId\030\001 \002" +
      "(\005\022\022\n\nopponentId\030\002 \002(\005\"\'\n\021CCancelDesireP" +
      "lay\022\022\n\nopponentId\030\001 \002(\005\"2\n\nSStartGame\022\020\n" +
      "\010playerId\030\001 \002(\005\022\022\n\nopponentId\030\002 \002(\005\"}\n\nC" +
      "StartGame\022\022\n\nopponentId\030\001 \002(\005\022(\n\010typeMov" +
      "e\030\002 \002(\0162\026.net.protocol.TypeMove\022\027\n\017numbe" +
      "rOfWonGame\030\003 \001(\005\022\030\n\020numberOfLostGame\030\004 \001" +
      "(\005\"l\n\010SDidMove\022\020\n\010playerId\030\001 \002(\005\022\022\n\noppo" +
      "nentId\030\002 \002(\005\022\t\n\001i\030\003 \002(\005\022\t\n\001j\030\004 \002(\005\022$\n\004ty" +
      "pe\030\005 \002(\0162\026.net.protocol.TypeMove\"F\n\010CDid",
      "Move\022\t\n\001i\030\001 \002(\005\022\t\n\001j\030\002 \002(\005\022$\n\004type\030\003 \002(\016" +
      "2\026.net.protocol.TypeMove\"5\n\010SWonGame\022\023\n\013" +
      "idWonPlayer\030\001 \002(\005\022\024\n\014idLostPlayer\030\002 \002(\005\"" +
      "5\n\rSContinueGame\022\020\n\010playerId\030\001 \002(\005\022\022\n\nop" +
      "ponentId\030\002 \002(\005\"K\n\rCContinueGame\022\024\n\014conti" +
      "nueGame\030\001 \002(\010\022$\n\004type\030\003 \002(\0162\026.net.protoc" +
      "ol.TypeMove\"E\n\014SChatMessage\022\020\n\010playerId\030" +
      "\001 \002(\005\022\022\n\nopponentId\030\002 \002(\005\022\017\n\007message\030\003 \002" +
      "(\t\"\037\n\014CChatMessage\022\017\n\007message\030\001 \002(\t\"G\n\021S" +
      "GroupChatMessage\022\020\n\010playerId\030\001 \002(\005\022\017\n\007me",
      "ssage\030\002 \002(\t\022\017\n\007groupId\030\003 \002(\005\"6\n\021CGroupCh" +
      "atMessage\022\020\n\010playerId\030\001 \002(\005\022\017\n\007message\030\002" +
      " \002(\t\"5\n\rSExitFromGame\022\020\n\010playerId\030\001 \002(\005\022" +
      "\022\n\nopponentId\030\002 \002(\005\"#\n\rCExitFromGame\022\022\n\n" +
      "opponentId\030\001 \002(\005\"3\n\016SExitFromGroup\022\020\n\010pl" +
      "ayerId\030\001 \002(\005\022\017\n\007groupId\030\002 \002(\005\"\"\n\016CExitFr" +
      "omGroup\022\020\n\010playerId\030\001 \002(\005\"\'\n\023SExitFromGl" +
      "obalGame\022\020\n\010playerId\030\001 \002(\005\"!\n\rSTop100Pla" +
      "yer\022\020\n\010playerId\030\001 \002(\005\"5\n\rCTop100Player\022$" +
      "\n\006player\030\001 \003(\0132\024.net.protocol.Player\"\'\n\021",
      "TimeForMoveFullUp\022\022\n\ntimeFullUp\030\001 \002(\010\"2\n" +
      "\032AppNeedUpdateToLastVersion\022\024\n\014urlForUpd" +
      "ate\030\001 \002(\t*L\n\020RegistrationType\022\016\n\nannonym" +
      "ous\020\001\022\006\n\002xo\020\002\022\n\n\006google\020\003\022\014\n\010facebook\020\004\022" +
      "\006\n\002vk\020\005*@\n\014LoginProblem\022\033\n\027nickOrPasswor" +
      "dUnCorrect\020\001\022\023\n\017accountUnlocked\020\002*<\n\023Reg" +
      "istrationProblem\022\022\n\016emailUnCorrect\020\001\022\021\n\r" +
      "nickUnCorrect\020\002*\033\n\003Sex\022\010\n\004male\020\001\022\n\n\006fema" +
      "le\020\002*C\n\032ResponseForRestorePassword\022\017\n\013se" +
      "ndToEmail\020\001\022\024\n\020emailUnCorrected\020\002*\030\n\010Typ",
      "eMove\022\005\n\001X\020\001\022\005\n\001O\020\002B\030\n\014net.protocolB\010Pro" +
      "tocol"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_net_protocol_SLoginToGame_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_net_protocol_SLoginToGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SLoginToGame_descriptor,
              new java.lang.String[] { "Name", "RegistarionType", "Uuid", "IsBot", "AppVersion", },
              net.pt.Protocol.SLoginToGame.class,
              net.pt.Protocol.SLoginToGame.Builder.class);
          internal_static_net_protocol_CLoginToGame_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_net_protocol_CLoginToGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CLoginToGame_descriptor,
              new java.lang.String[] { "IsLogin", "Id", "LoginProblem", },
              net.pt.Protocol.CLoginToGame.class,
              net.pt.Protocol.CLoginToGame.Builder.class);
          internal_static_net_protocol_SRegistrationNewXOAccount_descriptor =
            getDescriptor().getMessageTypes().get(2);
          internal_static_net_protocol_SRegistrationNewXOAccount_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SRegistrationNewXOAccount_descriptor,
              new java.lang.String[] { "Name", "Password", "Email", "Sex", "Country", },
              net.pt.Protocol.SRegistrationNewXOAccount.class,
              net.pt.Protocol.SRegistrationNewXOAccount.Builder.class);
          internal_static_net_protocol_CRegistrationNewXOAccount_descriptor =
            getDescriptor().getMessageTypes().get(3);
          internal_static_net_protocol_CRegistrationNewXOAccount_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CRegistrationNewXOAccount_descriptor,
              new java.lang.String[] { "IsRegistred", "Problem", },
              net.pt.Protocol.CRegistrationNewXOAccount.class,
              net.pt.Protocol.CRegistrationNewXOAccount.Builder.class);
          internal_static_net_protocol_SForgotXOAccountPassword_descriptor =
            getDescriptor().getMessageTypes().get(4);
          internal_static_net_protocol_SForgotXOAccountPassword_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SForgotXOAccountPassword_descriptor,
              new java.lang.String[] { "Email", },
              net.pt.Protocol.SForgotXOAccountPassword.class,
              net.pt.Protocol.SForgotXOAccountPassword.Builder.class);
          internal_static_net_protocol_CForgotXOAccountPassword_descriptor =
            getDescriptor().getMessageTypes().get(5);
          internal_static_net_protocol_CForgotXOAccountPassword_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CForgotXOAccountPassword_descriptor,
              new java.lang.String[] { "Pesponse", },
              net.pt.Protocol.CForgotXOAccountPassword.class,
              net.pt.Protocol.CForgotXOAccountPassword.Builder.class);
          internal_static_net_protocol_CUpdateAboutActivityPlayer_descriptor =
            getDescriptor().getMessageTypes().get(6);
          internal_static_net_protocol_CUpdateAboutActivityPlayer_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CUpdateAboutActivityPlayer_descriptor,
              new java.lang.String[] { "NewPlayer", "ExitPlayer", "GroupId", },
              net.pt.Protocol.CUpdateAboutActivityPlayer.class,
              net.pt.Protocol.CUpdateAboutActivityPlayer.Builder.class);
          internal_static_net_protocol_SGetUpdate_descriptor =
            getDescriptor().getMessageTypes().get(7);
          internal_static_net_protocol_SGetUpdate_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SGetUpdate_descriptor,
              new java.lang.String[] { "Id", "GroupId", },
              net.pt.Protocol.SGetUpdate.class,
              net.pt.Protocol.SGetUpdate.Builder.class);
          internal_static_net_protocol_Player_descriptor =
            getDescriptor().getMessageTypes().get(8);
          internal_static_net_protocol_Player_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_Player_descriptor,
              new java.lang.String[] { "Name", "Id", "Rating", },
              net.pt.Protocol.Player.class,
              net.pt.Protocol.Player.Builder.class);
          internal_static_net_protocol_SGetGroupList_descriptor =
            getDescriptor().getMessageTypes().get(9);
          internal_static_net_protocol_SGetGroupList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SGetGroupList_descriptor,
              new java.lang.String[] { "Id", },
              net.pt.Protocol.SGetGroupList.class,
              net.pt.Protocol.SGetGroupList.Builder.class);
          internal_static_net_protocol_CGetGroupList_descriptor =
            getDescriptor().getMessageTypes().get(10);
          internal_static_net_protocol_CGetGroupList_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CGetGroupList_descriptor,
              new java.lang.String[] { "Group", "NumAllOnlinePlayers", },
              net.pt.Protocol.CGetGroupList.class,
              net.pt.Protocol.CGetGroupList.Builder.class);
          internal_static_net_protocol_Group_descriptor =
            getDescriptor().getMessageTypes().get(11);
          internal_static_net_protocol_Group_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_Group_descriptor,
              new java.lang.String[] { "GroupId", "NumOnlinePlayers", "NumOnlineBots", },
              net.pt.Protocol.Group.class,
              net.pt.Protocol.Group.Builder.class);
          internal_static_net_protocol_SEnterToGroup_descriptor =
            getDescriptor().getMessageTypes().get(12);
          internal_static_net_protocol_SEnterToGroup_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SEnterToGroup_descriptor,
              new java.lang.String[] { "GroupId", },
              net.pt.Protocol.SEnterToGroup.class,
              net.pt.Protocol.SEnterToGroup.Builder.class);
          internal_static_net_protocol_CEnterToGroup_descriptor =
            getDescriptor().getMessageTypes().get(13);
          internal_static_net_protocol_CEnterToGroup_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CEnterToGroup_descriptor,
              new java.lang.String[] { "IsEnteredGroup", },
              net.pt.Protocol.CEnterToGroup.class,
              net.pt.Protocol.CEnterToGroup.Builder.class);
          internal_static_net_protocol_SWantToPlay_descriptor =
            getDescriptor().getMessageTypes().get(14);
          internal_static_net_protocol_SWantToPlay_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SWantToPlay_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", },
              net.pt.Protocol.SWantToPlay.class,
              net.pt.Protocol.SWantToPlay.Builder.class);
          internal_static_net_protocol_CWantToPlay_descriptor =
            getDescriptor().getMessageTypes().get(15);
          internal_static_net_protocol_CWantToPlay_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CWantToPlay_descriptor,
              new java.lang.String[] { "OpponentId", },
              net.pt.Protocol.CWantToPlay.class,
              net.pt.Protocol.CWantToPlay.Builder.class);
          internal_static_net_protocol_SCancelDesirePlay_descriptor =
            getDescriptor().getMessageTypes().get(16);
          internal_static_net_protocol_SCancelDesirePlay_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SCancelDesirePlay_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", },
              net.pt.Protocol.SCancelDesirePlay.class,
              net.pt.Protocol.SCancelDesirePlay.Builder.class);
          internal_static_net_protocol_CCancelDesirePlay_descriptor =
            getDescriptor().getMessageTypes().get(17);
          internal_static_net_protocol_CCancelDesirePlay_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CCancelDesirePlay_descriptor,
              new java.lang.String[] { "OpponentId", },
              net.pt.Protocol.CCancelDesirePlay.class,
              net.pt.Protocol.CCancelDesirePlay.Builder.class);
          internal_static_net_protocol_SStartGame_descriptor =
            getDescriptor().getMessageTypes().get(18);
          internal_static_net_protocol_SStartGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SStartGame_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", },
              net.pt.Protocol.SStartGame.class,
              net.pt.Protocol.SStartGame.Builder.class);
          internal_static_net_protocol_CStartGame_descriptor =
            getDescriptor().getMessageTypes().get(19);
          internal_static_net_protocol_CStartGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CStartGame_descriptor,
              new java.lang.String[] { "OpponentId", "TypeMove", "NumberOfWonGame", "NumberOfLostGame", },
              net.pt.Protocol.CStartGame.class,
              net.pt.Protocol.CStartGame.Builder.class);
          internal_static_net_protocol_SDidMove_descriptor =
            getDescriptor().getMessageTypes().get(20);
          internal_static_net_protocol_SDidMove_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SDidMove_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", "I", "J", "Type", },
              net.pt.Protocol.SDidMove.class,
              net.pt.Protocol.SDidMove.Builder.class);
          internal_static_net_protocol_CDidMove_descriptor =
            getDescriptor().getMessageTypes().get(21);
          internal_static_net_protocol_CDidMove_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CDidMove_descriptor,
              new java.lang.String[] { "I", "J", "Type", },
              net.pt.Protocol.CDidMove.class,
              net.pt.Protocol.CDidMove.Builder.class);
          internal_static_net_protocol_SWonGame_descriptor =
            getDescriptor().getMessageTypes().get(22);
          internal_static_net_protocol_SWonGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SWonGame_descriptor,
              new java.lang.String[] { "IdWonPlayer", "IdLostPlayer", },
              net.pt.Protocol.SWonGame.class,
              net.pt.Protocol.SWonGame.Builder.class);
          internal_static_net_protocol_SContinueGame_descriptor =
            getDescriptor().getMessageTypes().get(23);
          internal_static_net_protocol_SContinueGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SContinueGame_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", },
              net.pt.Protocol.SContinueGame.class,
              net.pt.Protocol.SContinueGame.Builder.class);
          internal_static_net_protocol_CContinueGame_descriptor =
            getDescriptor().getMessageTypes().get(24);
          internal_static_net_protocol_CContinueGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CContinueGame_descriptor,
              new java.lang.String[] { "ContinueGame", "Type", },
              net.pt.Protocol.CContinueGame.class,
              net.pt.Protocol.CContinueGame.Builder.class);
          internal_static_net_protocol_SChatMessage_descriptor =
            getDescriptor().getMessageTypes().get(25);
          internal_static_net_protocol_SChatMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SChatMessage_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", "Message", },
              net.pt.Protocol.SChatMessage.class,
              net.pt.Protocol.SChatMessage.Builder.class);
          internal_static_net_protocol_CChatMessage_descriptor =
            getDescriptor().getMessageTypes().get(26);
          internal_static_net_protocol_CChatMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CChatMessage_descriptor,
              new java.lang.String[] { "Message", },
              net.pt.Protocol.CChatMessage.class,
              net.pt.Protocol.CChatMessage.Builder.class);
          internal_static_net_protocol_SGroupChatMessage_descriptor =
            getDescriptor().getMessageTypes().get(27);
          internal_static_net_protocol_SGroupChatMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SGroupChatMessage_descriptor,
              new java.lang.String[] { "PlayerId", "Message", "GroupId", },
              net.pt.Protocol.SGroupChatMessage.class,
              net.pt.Protocol.SGroupChatMessage.Builder.class);
          internal_static_net_protocol_CGroupChatMessage_descriptor =
            getDescriptor().getMessageTypes().get(28);
          internal_static_net_protocol_CGroupChatMessage_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CGroupChatMessage_descriptor,
              new java.lang.String[] { "PlayerId", "Message", },
              net.pt.Protocol.CGroupChatMessage.class,
              net.pt.Protocol.CGroupChatMessage.Builder.class);
          internal_static_net_protocol_SExitFromGame_descriptor =
            getDescriptor().getMessageTypes().get(29);
          internal_static_net_protocol_SExitFromGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SExitFromGame_descriptor,
              new java.lang.String[] { "PlayerId", "OpponentId", },
              net.pt.Protocol.SExitFromGame.class,
              net.pt.Protocol.SExitFromGame.Builder.class);
          internal_static_net_protocol_CExitFromGame_descriptor =
            getDescriptor().getMessageTypes().get(30);
          internal_static_net_protocol_CExitFromGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CExitFromGame_descriptor,
              new java.lang.String[] { "OpponentId", },
              net.pt.Protocol.CExitFromGame.class,
              net.pt.Protocol.CExitFromGame.Builder.class);
          internal_static_net_protocol_SExitFromGroup_descriptor =
            getDescriptor().getMessageTypes().get(31);
          internal_static_net_protocol_SExitFromGroup_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SExitFromGroup_descriptor,
              new java.lang.String[] { "PlayerId", "GroupId", },
              net.pt.Protocol.SExitFromGroup.class,
              net.pt.Protocol.SExitFromGroup.Builder.class);
          internal_static_net_protocol_CExitFromGroup_descriptor =
            getDescriptor().getMessageTypes().get(32);
          internal_static_net_protocol_CExitFromGroup_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CExitFromGroup_descriptor,
              new java.lang.String[] { "PlayerId", },
              net.pt.Protocol.CExitFromGroup.class,
              net.pt.Protocol.CExitFromGroup.Builder.class);
          internal_static_net_protocol_SExitFromGlobalGame_descriptor =
            getDescriptor().getMessageTypes().get(33);
          internal_static_net_protocol_SExitFromGlobalGame_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_SExitFromGlobalGame_descriptor,
              new java.lang.String[] { "PlayerId", },
              net.pt.Protocol.SExitFromGlobalGame.class,
              net.pt.Protocol.SExitFromGlobalGame.Builder.class);
          internal_static_net_protocol_STop100Player_descriptor =
            getDescriptor().getMessageTypes().get(34);
          internal_static_net_protocol_STop100Player_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_STop100Player_descriptor,
              new java.lang.String[] { "PlayerId", },
              net.pt.Protocol.STop100Player.class,
              net.pt.Protocol.STop100Player.Builder.class);
          internal_static_net_protocol_CTop100Player_descriptor =
            getDescriptor().getMessageTypes().get(35);
          internal_static_net_protocol_CTop100Player_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_CTop100Player_descriptor,
              new java.lang.String[] { "Player", },
              net.pt.Protocol.CTop100Player.class,
              net.pt.Protocol.CTop100Player.Builder.class);
          internal_static_net_protocol_TimeForMoveFullUp_descriptor =
            getDescriptor().getMessageTypes().get(36);
          internal_static_net_protocol_TimeForMoveFullUp_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_TimeForMoveFullUp_descriptor,
              new java.lang.String[] { "TimeFullUp", },
              net.pt.Protocol.TimeForMoveFullUp.class,
              net.pt.Protocol.TimeForMoveFullUp.Builder.class);
          internal_static_net_protocol_AppNeedUpdateToLastVersion_descriptor =
            getDescriptor().getMessageTypes().get(37);
          internal_static_net_protocol_AppNeedUpdateToLastVersion_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_net_protocol_AppNeedUpdateToLastVersion_descriptor,
              new java.lang.String[] { "UrlForUpdate", },
              net.pt.Protocol.AppNeedUpdateToLastVersion.class,
              net.pt.Protocol.AppNeedUpdateToLastVersion.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
}
