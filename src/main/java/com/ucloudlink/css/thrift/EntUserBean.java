/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ucloudlink.css.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-01-16")
public class EntUserBean implements org.apache.thrift.TBase<EntUserBean, EntUserBean._Fields>, java.io.Serializable, Cloneable, Comparable<EntUserBean> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("EntUserBean");

  private static final org.apache.thrift.protocol.TField ENT_USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("EntUserID", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField LOGIN_FIELD_DESC = new org.apache.thrift.protocol.TField("login", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LOGIN_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("loginType", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXTEND_FIELD_DESC = new org.apache.thrift.protocol.TField("extend", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField USERID_FIELD_DESC = new org.apache.thrift.protocol.TField("userid", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new EntUserBeanStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new EntUserBeanTupleSchemeFactory();

  public long EntUserID; // required
  public java.lang.String login; // required
  public java.lang.String loginType; // required
  public java.lang.String extend; // required
  public java.lang.String userid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENT_USER_ID((short)1, "EntUserID"),
    LOGIN((short)2, "login"),
    LOGIN_TYPE((short)3, "loginType"),
    EXTEND((short)4, "extend"),
    USERID((short)5, "userid");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ENT_USER_ID
          return ENT_USER_ID;
        case 2: // LOGIN
          return LOGIN;
        case 3: // LOGIN_TYPE
          return LOGIN_TYPE;
        case 4: // EXTEND
          return EXTEND;
        case 5: // USERID
          return USERID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ENTUSERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENT_USER_ID, new org.apache.thrift.meta_data.FieldMetaData("EntUserID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LOGIN, new org.apache.thrift.meta_data.FieldMetaData("login", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOGIN_TYPE, new org.apache.thrift.meta_data.FieldMetaData("loginType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXTEND, new org.apache.thrift.meta_data.FieldMetaData("extend", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USERID, new org.apache.thrift.meta_data.FieldMetaData("userid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(EntUserBean.class, metaDataMap);
  }

  public EntUserBean() {
  }

  public EntUserBean(
    long EntUserID,
    java.lang.String login,
    java.lang.String loginType,
    java.lang.String extend,
    java.lang.String userid)
  {
    this();
    this.EntUserID = EntUserID;
    setEntUserIDIsSet(true);
    this.login = login;
    this.loginType = loginType;
    this.extend = extend;
    this.userid = userid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public EntUserBean(EntUserBean other) {
    __isset_bitfield = other.__isset_bitfield;
    this.EntUserID = other.EntUserID;
    if (other.isSetLogin()) {
      this.login = other.login;
    }
    if (other.isSetLoginType()) {
      this.loginType = other.loginType;
    }
    if (other.isSetExtend()) {
      this.extend = other.extend;
    }
    if (other.isSetUserid()) {
      this.userid = other.userid;
    }
  }

  public EntUserBean deepCopy() {
    return new EntUserBean(this);
  }

  @Override
  public void clear() {
    setEntUserIDIsSet(false);
    this.EntUserID = 0;
    this.login = null;
    this.loginType = null;
    this.extend = null;
    this.userid = null;
  }

  public long getEntUserID() {
    return this.EntUserID;
  }

  public EntUserBean setEntUserID(long EntUserID) {
    this.EntUserID = EntUserID;
    setEntUserIDIsSet(true);
    return this;
  }

  public void unsetEntUserID() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ENTUSERID_ISSET_ID);
  }

  /** Returns true if field EntUserID is set (has been assigned a value) and false otherwise */
  public boolean isSetEntUserID() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ENTUSERID_ISSET_ID);
  }

  public void setEntUserIDIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ENTUSERID_ISSET_ID, value);
  }

  public java.lang.String getLogin() {
    return this.login;
  }

  public EntUserBean setLogin(java.lang.String login) {
    this.login = login;
    return this;
  }

  public void unsetLogin() {
    this.login = null;
  }

  /** Returns true if field login is set (has been assigned a value) and false otherwise */
  public boolean isSetLogin() {
    return this.login != null;
  }

  public void setLoginIsSet(boolean value) {
    if (!value) {
      this.login = null;
    }
  }

  public java.lang.String getLoginType() {
    return this.loginType;
  }

  public EntUserBean setLoginType(java.lang.String loginType) {
    this.loginType = loginType;
    return this;
  }

  public void unsetLoginType() {
    this.loginType = null;
  }

  /** Returns true if field loginType is set (has been assigned a value) and false otherwise */
  public boolean isSetLoginType() {
    return this.loginType != null;
  }

  public void setLoginTypeIsSet(boolean value) {
    if (!value) {
      this.loginType = null;
    }
  }

  public java.lang.String getExtend() {
    return this.extend;
  }

  public EntUserBean setExtend(java.lang.String extend) {
    this.extend = extend;
    return this;
  }

  public void unsetExtend() {
    this.extend = null;
  }

  /** Returns true if field extend is set (has been assigned a value) and false otherwise */
  public boolean isSetExtend() {
    return this.extend != null;
  }

  public void setExtendIsSet(boolean value) {
    if (!value) {
      this.extend = null;
    }
  }

  public java.lang.String getUserid() {
    return this.userid;
  }

  public EntUserBean setUserid(java.lang.String userid) {
    this.userid = userid;
    return this;
  }

  public void unsetUserid() {
    this.userid = null;
  }

  /** Returns true if field userid is set (has been assigned a value) and false otherwise */
  public boolean isSetUserid() {
    return this.userid != null;
  }

  public void setUseridIsSet(boolean value) {
    if (!value) {
      this.userid = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ENT_USER_ID:
      if (value == null) {
        unsetEntUserID();
      } else {
        setEntUserID((java.lang.Long)value);
      }
      break;

    case LOGIN:
      if (value == null) {
        unsetLogin();
      } else {
        setLogin((java.lang.String)value);
      }
      break;

    case LOGIN_TYPE:
      if (value == null) {
        unsetLoginType();
      } else {
        setLoginType((java.lang.String)value);
      }
      break;

    case EXTEND:
      if (value == null) {
        unsetExtend();
      } else {
        setExtend((java.lang.String)value);
      }
      break;

    case USERID:
      if (value == null) {
        unsetUserid();
      } else {
        setUserid((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ENT_USER_ID:
      return getEntUserID();

    case LOGIN:
      return getLogin();

    case LOGIN_TYPE:
      return getLoginType();

    case EXTEND:
      return getExtend();

    case USERID:
      return getUserid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ENT_USER_ID:
      return isSetEntUserID();
    case LOGIN:
      return isSetLogin();
    case LOGIN_TYPE:
      return isSetLoginType();
    case EXTEND:
      return isSetExtend();
    case USERID:
      return isSetUserid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof EntUserBean)
      return this.equals((EntUserBean)that);
    return false;
  }

  public boolean equals(EntUserBean that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_EntUserID = true;
    boolean that_present_EntUserID = true;
    if (this_present_EntUserID || that_present_EntUserID) {
      if (!(this_present_EntUserID && that_present_EntUserID))
        return false;
      if (this.EntUserID != that.EntUserID)
        return false;
    }

    boolean this_present_login = true && this.isSetLogin();
    boolean that_present_login = true && that.isSetLogin();
    if (this_present_login || that_present_login) {
      if (!(this_present_login && that_present_login))
        return false;
      if (!this.login.equals(that.login))
        return false;
    }

    boolean this_present_loginType = true && this.isSetLoginType();
    boolean that_present_loginType = true && that.isSetLoginType();
    if (this_present_loginType || that_present_loginType) {
      if (!(this_present_loginType && that_present_loginType))
        return false;
      if (!this.loginType.equals(that.loginType))
        return false;
    }

    boolean this_present_extend = true && this.isSetExtend();
    boolean that_present_extend = true && that.isSetExtend();
    if (this_present_extend || that_present_extend) {
      if (!(this_present_extend && that_present_extend))
        return false;
      if (!this.extend.equals(that.extend))
        return false;
    }

    boolean this_present_userid = true && this.isSetUserid();
    boolean that_present_userid = true && that.isSetUserid();
    if (this_present_userid || that_present_userid) {
      if (!(this_present_userid && that_present_userid))
        return false;
      if (!this.userid.equals(that.userid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(EntUserID);

    hashCode = hashCode * 8191 + ((isSetLogin()) ? 131071 : 524287);
    if (isSetLogin())
      hashCode = hashCode * 8191 + login.hashCode();

    hashCode = hashCode * 8191 + ((isSetLoginType()) ? 131071 : 524287);
    if (isSetLoginType())
      hashCode = hashCode * 8191 + loginType.hashCode();

    hashCode = hashCode * 8191 + ((isSetExtend()) ? 131071 : 524287);
    if (isSetExtend())
      hashCode = hashCode * 8191 + extend.hashCode();

    hashCode = hashCode * 8191 + ((isSetUserid()) ? 131071 : 524287);
    if (isSetUserid())
      hashCode = hashCode * 8191 + userid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(EntUserBean other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetEntUserID()).compareTo(other.isSetEntUserID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntUserID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.EntUserID, other.EntUserID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLogin()).compareTo(other.isSetLogin());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLogin()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.login, other.login);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLoginType()).compareTo(other.isSetLoginType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoginType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loginType, other.loginType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetExtend()).compareTo(other.isSetExtend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtend()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extend, other.extend);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUserid()).compareTo(other.isSetUserid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userid, other.userid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("EntUserBean(");
    boolean first = true;

    sb.append("EntUserID:");
    sb.append(this.EntUserID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("login:");
    if (this.login == null) {
      sb.append("null");
    } else {
      sb.append(this.login);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("loginType:");
    if (this.loginType == null) {
      sb.append("null");
    } else {
      sb.append(this.loginType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("extend:");
    if (this.extend == null) {
      sb.append("null");
    } else {
      sb.append(this.extend);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userid:");
    if (this.userid == null) {
      sb.append("null");
    } else {
      sb.append(this.userid);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class EntUserBeanStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EntUserBeanStandardScheme getScheme() {
      return new EntUserBeanStandardScheme();
    }
  }

  private static class EntUserBeanStandardScheme extends org.apache.thrift.scheme.StandardScheme<EntUserBean> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, EntUserBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENT_USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.EntUserID = iprot.readI64();
              struct.setEntUserIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LOGIN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.login = iprot.readString();
              struct.setLoginIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LOGIN_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.loginType = iprot.readString();
              struct.setLoginTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTEND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.extend = iprot.readString();
              struct.setExtendIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USERID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userid = iprot.readString();
              struct.setUseridIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, EntUserBean struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ENT_USER_ID_FIELD_DESC);
      oprot.writeI64(struct.EntUserID);
      oprot.writeFieldEnd();
      if (struct.login != null) {
        oprot.writeFieldBegin(LOGIN_FIELD_DESC);
        oprot.writeString(struct.login);
        oprot.writeFieldEnd();
      }
      if (struct.loginType != null) {
        oprot.writeFieldBegin(LOGIN_TYPE_FIELD_DESC);
        oprot.writeString(struct.loginType);
        oprot.writeFieldEnd();
      }
      if (struct.extend != null) {
        oprot.writeFieldBegin(EXTEND_FIELD_DESC);
        oprot.writeString(struct.extend);
        oprot.writeFieldEnd();
      }
      if (struct.userid != null) {
        oprot.writeFieldBegin(USERID_FIELD_DESC);
        oprot.writeString(struct.userid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class EntUserBeanTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public EntUserBeanTupleScheme getScheme() {
      return new EntUserBeanTupleScheme();
    }
  }

  private static class EntUserBeanTupleScheme extends org.apache.thrift.scheme.TupleScheme<EntUserBean> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, EntUserBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetEntUserID()) {
        optionals.set(0);
      }
      if (struct.isSetLogin()) {
        optionals.set(1);
      }
      if (struct.isSetLoginType()) {
        optionals.set(2);
      }
      if (struct.isSetExtend()) {
        optionals.set(3);
      }
      if (struct.isSetUserid()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetEntUserID()) {
        oprot.writeI64(struct.EntUserID);
      }
      if (struct.isSetLogin()) {
        oprot.writeString(struct.login);
      }
      if (struct.isSetLoginType()) {
        oprot.writeString(struct.loginType);
      }
      if (struct.isSetExtend()) {
        oprot.writeString(struct.extend);
      }
      if (struct.isSetUserid()) {
        oprot.writeString(struct.userid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, EntUserBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.EntUserID = iprot.readI64();
        struct.setEntUserIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.login = iprot.readString();
        struct.setLoginIsSet(true);
      }
      if (incoming.get(2)) {
        struct.loginType = iprot.readString();
        struct.setLoginTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.extend = iprot.readString();
        struct.setExtendIsSet(true);
      }
      if (incoming.get(4)) {
        struct.userid = iprot.readString();
        struct.setUseridIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

