/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.17.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.accumulo.proxy.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class DiskUsage implements org.apache.thrift.TBase<DiskUsage, DiskUsage._Fields>, java.io.Serializable, Cloneable, Comparable<DiskUsage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DiskUsage");

  private static final org.apache.thrift.protocol.TField TABLES_FIELD_DESC = new org.apache.thrift.protocol.TField("tables", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField USAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("usage", org.apache.thrift.protocol.TType.I64, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new DiskUsageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new DiskUsageTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> tables; // required
  public long usage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLES((short)1, "tables"),
    USAGE((short)2, "usage");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLES
          return TABLES;
        case 2: // USAGE
          return USAGE;
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
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __USAGE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLES, new org.apache.thrift.meta_data.FieldMetaData("tables", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.USAGE, new org.apache.thrift.meta_data.FieldMetaData("usage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DiskUsage.class, metaDataMap);
  }

  public DiskUsage() {
  }

  public DiskUsage(
    java.util.List<java.lang.String> tables,
    long usage)
  {
    this();
    this.tables = tables;
    this.usage = usage;
    setUsageIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DiskUsage(DiskUsage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTables()) {
      java.util.List<java.lang.String> __this__tables = new java.util.ArrayList<java.lang.String>(other.tables);
      this.tables = __this__tables;
    }
    this.usage = other.usage;
  }

  @Override
  public DiskUsage deepCopy() {
    return new DiskUsage(this);
  }

  @Override
  public void clear() {
    this.tables = null;
    setUsageIsSet(false);
    this.usage = 0;
  }

  public int getTablesSize() {
    return (this.tables == null) ? 0 : this.tables.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<java.lang.String> getTablesIterator() {
    return (this.tables == null) ? null : this.tables.iterator();
  }

  public void addToTables(java.lang.String elem) {
    if (this.tables == null) {
      this.tables = new java.util.ArrayList<java.lang.String>();
    }
    this.tables.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.List<java.lang.String> getTables() {
    return this.tables;
  }

  public DiskUsage setTables(@org.apache.thrift.annotation.Nullable java.util.List<java.lang.String> tables) {
    this.tables = tables;
    return this;
  }

  public void unsetTables() {
    this.tables = null;
  }

  /** Returns true if field tables is set (has been assigned a value) and false otherwise */
  public boolean isSetTables() {
    return this.tables != null;
  }

  public void setTablesIsSet(boolean value) {
    if (!value) {
      this.tables = null;
    }
  }

  public long getUsage() {
    return this.usage;
  }

  public DiskUsage setUsage(long usage) {
    this.usage = usage;
    setUsageIsSet(true);
    return this;
  }

  public void unsetUsage() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __USAGE_ISSET_ID);
  }

  /** Returns true if field usage is set (has been assigned a value) and false otherwise */
  public boolean isSetUsage() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __USAGE_ISSET_ID);
  }

  public void setUsageIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __USAGE_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TABLES:
      if (value == null) {
        unsetTables();
      } else {
        setTables((java.util.List<java.lang.String>)value);
      }
      break;

    case USAGE:
      if (value == null) {
        unsetUsage();
      } else {
        setUsage((java.lang.Long)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TABLES:
      return getTables();

    case USAGE:
      return getUsage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TABLES:
      return isSetTables();
    case USAGE:
      return isSetUsage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof DiskUsage)
      return this.equals((DiskUsage)that);
    return false;
  }

  public boolean equals(DiskUsage that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_tables = true && this.isSetTables();
    boolean that_present_tables = true && that.isSetTables();
    if (this_present_tables || that_present_tables) {
      if (!(this_present_tables && that_present_tables))
        return false;
      if (!this.tables.equals(that.tables))
        return false;
    }

    boolean this_present_usage = true;
    boolean that_present_usage = true;
    if (this_present_usage || that_present_usage) {
      if (!(this_present_usage && that_present_usage))
        return false;
      if (this.usage != that.usage)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTables()) ? 131071 : 524287);
    if (isSetTables())
      hashCode = hashCode * 8191 + tables.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(usage);

    return hashCode;
  }

  @Override
  public int compareTo(DiskUsage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(isSetTables(), other.isSetTables());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTables()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tables, other.tables);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(isSetUsage(), other.isSetUsage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.usage, other.usage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("DiskUsage(");
    boolean first = true;

    sb.append("tables:");
    if (this.tables == null) {
      sb.append("null");
    } else {
      sb.append(this.tables);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("usage:");
    sb.append(this.usage);
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

  private static class DiskUsageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DiskUsageStandardScheme getScheme() {
      return new DiskUsageStandardScheme();
    }
  }

  private static class DiskUsageStandardScheme extends org.apache.thrift.scheme.StandardScheme<DiskUsage> {

    @Override
    public void read(org.apache.thrift.protocol.TProtocol iprot, DiskUsage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TABLES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.tables = new java.util.ArrayList<java.lang.String>(_list0.size);
                @org.apache.thrift.annotation.Nullable java.lang.String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.tables.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setTablesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // USAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.usage = iprot.readI64();
              struct.setUsageIsSet(true);
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

    @Override
    public void write(org.apache.thrift.protocol.TProtocol oprot, DiskUsage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tables != null) {
        oprot.writeFieldBegin(TABLES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.tables.size()));
          for (java.lang.String _iter3 : struct.tables)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(USAGE_FIELD_DESC);
      oprot.writeI64(struct.usage);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DiskUsageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    @Override
    public DiskUsageTupleScheme getScheme() {
      return new DiskUsageTupleScheme();
    }
  }

  private static class DiskUsageTupleScheme extends org.apache.thrift.scheme.TupleScheme<DiskUsage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DiskUsage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTables()) {
        optionals.set(0);
      }
      if (struct.isSetUsage()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTables()) {
        {
          oprot.writeI32(struct.tables.size());
          for (java.lang.String _iter4 : struct.tables)
          {
            oprot.writeString(_iter4);
          }
        }
      }
      if (struct.isSetUsage()) {
        oprot.writeI64(struct.usage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DiskUsage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = iprot.readListBegin(org.apache.thrift.protocol.TType.STRING);
          struct.tables = new java.util.ArrayList<java.lang.String>(_list5.size);
          @org.apache.thrift.annotation.Nullable java.lang.String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.tables.add(_elem6);
          }
        }
        struct.setTablesIsSet(true);
      }
      if (incoming.get(1)) {
        struct.usage = iprot.readI64();
        struct.setUsageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
  private static void unusedMethod() {}
}

