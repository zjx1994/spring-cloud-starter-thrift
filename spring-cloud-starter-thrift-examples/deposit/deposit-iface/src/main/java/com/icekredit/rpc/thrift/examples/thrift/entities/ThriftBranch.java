/**
 * Autogenerated by Thrift Compiler (0.10.0)
 * <p>
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *
 * @generated
 */
package com.icekredit.rpc.thrift.examples.thrift.entities;


import com.icekredit.rpc.thrift.examples.thrift.enums.ThriftRegion;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.10.0)", date = "2017-11-21")
public class ThriftBranch implements org.apache.thrift.TBase<ThriftBranch, ThriftBranch._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftBranch> {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftBranch");

    private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short) 1);
    private static final org.apache.thrift.protocol.TField CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short) 2);
    private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short) 3);
    private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short) 4);
    private static final org.apache.thrift.protocol.TField STAFFS_FIELD_DESC = new org.apache.thrift.protocol.TField("staffs", org.apache.thrift.protocol.TType.I32, (short) 5);
    private static final org.apache.thrift.protocol.TField BANK_FIELD_DESC = new org.apache.thrift.protocol.TField("bank", org.apache.thrift.protocol.TType.STRUCT, (short) 6);
    private static final org.apache.thrift.protocol.TField REGION_FIELD_DESC = new org.apache.thrift.protocol.TField("region", org.apache.thrift.protocol.TType.I32, (short) 7);

    private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ThriftBranchStandardSchemeFactory();
    private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ThriftBranchTupleSchemeFactory();

    public long id; // required
    public String code; // required
    public String name; // required
    public String address; // required
    public int staffs; // optional
    public ThriftBank bank; // optional
    /**
     * @see ThriftRegion
     */
    public ThriftRegion region; // optional

    /**
     * The set of fields this struct contains, along with convenience methods for finding and manipulating them.
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
        ID((short) 1, "id"),
        CODE((short) 2, "code"),
        NAME((short) 3, "name"),
        ADDRESS((short) 4, "address"),
        STAFFS((short) 5, "staffs"),
        BANK((short) 6, "bank"),
        /**
         * @see ThriftRegion
         */
        REGION((short) 7, "region");

        private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

        static {
            for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
                byName.put(field.getFieldName(), field);
            }
        }

        /**
         * Find the _Fields constant that matches fieldId, or null if its not found.
         */
        public static _Fields findByThriftId(int fieldId) {
            switch (fieldId) {
                case 1: // ID
                    return ID;
                case 2: // CODE
                    return CODE;
                case 3: // NAME
                    return NAME;
                case 4: // ADDRESS
                    return ADDRESS;
                case 5: // STAFFS
                    return STAFFS;
                case 6: // BANK
                    return BANK;
                case 7: // REGION
                    return REGION;
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
            if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
            return fields;
        }

        /**
         * Find the _Fields constant that matches name, or null if its not found.
         */
        public static _Fields findByName(String name) {
            return byName.get(name);
        }

        private final short _thriftId;
        private final String _fieldName;

        _Fields(short thriftId, String fieldName) {
            _thriftId = thriftId;
            _fieldName = fieldName;
        }

        public short getThriftFieldId() {
            return _thriftId;
        }

        public String getFieldName() {
            return _fieldName;
        }
    }

    // isset id assignments
    private static final int __ID_ISSET_ID = 0;
    private static final int __STAFFS_ISSET_ID = 1;
    private byte __isset_bitfield = 0;
    private static final _Fields optionals[] = {_Fields.STAFFS, _Fields.BANK, _Fields.REGION};
    public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;

    static {
        java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
        tmpMap.put(_Fields.CODE, new org.apache.thrift.meta_data.FieldMetaData("code", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.REQUIRED,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
        tmpMap.put(_Fields.STAFFS, new org.apache.thrift.meta_data.FieldMetaData("staffs", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
        tmpMap.put(_Fields.BANK, new org.apache.thrift.meta_data.FieldMetaData("bank", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftBank.class)));
        tmpMap.put(_Fields.REGION, new org.apache.thrift.meta_data.FieldMetaData("region", org.apache.thrift.TFieldRequirementType.OPTIONAL,
                new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftRegion.class)));
        metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
        org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftBranch.class, metaDataMap);
    }

    public ThriftBranch() {
    }

    public ThriftBranch(
            long id,
            String code,
            String name,
            String address) {
        this();
        this.id = id;
        setIdIsSet(true);
        this.code = code;
        this.name = name;
        this.address = address;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public ThriftBranch(ThriftBranch other) {
        __isset_bitfield = other.__isset_bitfield;
        this.id = other.id;
        if (other.isSetCode()) {
            this.code = other.code;
        }
        if (other.isSetName()) {
            this.name = other.name;
        }
        if (other.isSetAddress()) {
            this.address = other.address;
        }
        this.staffs = other.staffs;
        if (other.isSetBank()) {
            this.bank = new ThriftBank(other.bank);
        }
        if (other.isSetRegion()) {
            this.region = other.region;
        }
    }

    public ThriftBranch deepCopy() {
        return new ThriftBranch(this);
    }

    @Override
    public void clear() {
        setIdIsSet(false);
        this.id = 0;
        this.code = null;
        this.name = null;
        this.address = null;
        setStaffsIsSet(false);
        this.staffs = 0;
        this.bank = null;
        this.region = null;
    }

    public long getId() {
        return this.id;
    }

    public ThriftBranch setId(long id) {
        this.id = id;
        setIdIsSet(true);
        return this;
    }

    public void unsetId() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
    }

    /**
     * Returns true if field id is set (has been assigned a value) and false otherwise
     */
    public boolean isSetId() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
    }

    public void setIdIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
    }

    public String getCode() {
        return this.code;
    }

    public ThriftBranch setCode(String code) {
        this.code = code;
        return this;
    }

    public void unsetCode() {
        this.code = null;
    }

    /**
     * Returns true if field code is set (has been assigned a value) and false otherwise
     */
    public boolean isSetCode() {
        return this.code != null;
    }

    public void setCodeIsSet(boolean value) {
        if (!value) {
            this.code = null;
        }
    }

    public String getName() {
        return this.name;
    }

    public ThriftBranch setName(String name) {
        this.name = name;
        return this;
    }

    public void unsetName() {
        this.name = null;
    }

    /**
     * Returns true if field name is set (has been assigned a value) and false otherwise
     */
    public boolean isSetName() {
        return this.name != null;
    }

    public void setNameIsSet(boolean value) {
        if (!value) {
            this.name = null;
        }
    }

    public String getAddress() {
        return this.address;
    }

    public ThriftBranch setAddress(String address) {
        this.address = address;
        return this;
    }

    public void unsetAddress() {
        this.address = null;
    }

    /**
     * Returns true if field address is set (has been assigned a value) and false otherwise
     */
    public boolean isSetAddress() {
        return this.address != null;
    }

    public void setAddressIsSet(boolean value) {
        if (!value) {
            this.address = null;
        }
    }

    public int getStaffs() {
        return this.staffs;
    }

    public ThriftBranch setStaffs(int staffs) {
        this.staffs = staffs;
        setStaffsIsSet(true);
        return this;
    }

    public void unsetStaffs() {
        __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STAFFS_ISSET_ID);
    }

    /**
     * Returns true if field staffs is set (has been assigned a value) and false otherwise
     */
    public boolean isSetStaffs() {
        return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STAFFS_ISSET_ID);
    }

    public void setStaffsIsSet(boolean value) {
        __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STAFFS_ISSET_ID, value);
    }

    public ThriftBank getBank() {
        return this.bank;
    }

    public ThriftBranch setBank(ThriftBank bank) {
        this.bank = bank;
        return this;
    }

    public void unsetBank() {
        this.bank = null;
    }

    /**
     * Returns true if field bank is set (has been assigned a value) and false otherwise
     */
    public boolean isSetBank() {
        return this.bank != null;
    }

    public void setBankIsSet(boolean value) {
        if (!value) {
            this.bank = null;
        }
    }

    /**
     * @see ThriftRegion
     */
    public ThriftRegion getRegion() {
        return this.region;
    }

    /**
     * @see ThriftRegion
     */
    public ThriftBranch setRegion(ThriftRegion region) {
        this.region = region;
        return this;
    }

    public void unsetRegion() {
        this.region = null;
    }

    /**
     * Returns true if field region is set (has been assigned a value) and false otherwise
     */
    public boolean isSetRegion() {
        return this.region != null;
    }

    public void setRegionIsSet(boolean value) {
        if (!value) {
            this.region = null;
        }
    }

    public void setFieldValue(_Fields field, Object value) {
        switch (field) {
            case ID:
                if (value == null) {
                    unsetId();
                } else {
                    setId((Long) value);
                }
                break;

            case CODE:
                if (value == null) {
                    unsetCode();
                } else {
                    setCode((String) value);
                }
                break;

            case NAME:
                if (value == null) {
                    unsetName();
                } else {
                    setName((String) value);
                }
                break;

            case ADDRESS:
                if (value == null) {
                    unsetAddress();
                } else {
                    setAddress((String) value);
                }
                break;

            case STAFFS:
                if (value == null) {
                    unsetStaffs();
                } else {
                    setStaffs((Integer) value);
                }
                break;

            case BANK:
                if (value == null) {
                    unsetBank();
                } else {
                    setBank((ThriftBank) value);
                }
                break;

            case REGION:
                if (value == null) {
                    unsetRegion();
                } else {
                    setRegion((ThriftRegion) value);
                }
                break;

        }
    }

    public Object getFieldValue(_Fields field) {
        switch (field) {
            case ID:
                return getId();

            case CODE:
                return getCode();

            case NAME:
                return getName();

            case ADDRESS:
                return getAddress();

            case STAFFS:
                return getStaffs();

            case BANK:
                return getBank();

            case REGION:
                return getRegion();

        }
        throw new IllegalStateException();
    }

    /**
     * Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
     */
    public boolean isSet(_Fields field) {
        if (field == null) {
            throw new IllegalArgumentException();
        }

        switch (field) {
            case ID:
                return isSetId();
            case CODE:
                return isSetCode();
            case NAME:
                return isSetName();
            case ADDRESS:
                return isSetAddress();
            case STAFFS:
                return isSetStaffs();
            case BANK:
                return isSetBank();
            case REGION:
                return isSetRegion();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
        if (that == null)
            return false;
        if (that instanceof ThriftBranch)
            return this.equals((ThriftBranch) that);
        return false;
    }

    public boolean equals(ThriftBranch that) {
        if (that == null)
            return false;
        if (this == that)
            return true;

        boolean this_present_id = true;
        boolean that_present_id = true;
        if (this_present_id || that_present_id) {
            if (!(this_present_id && that_present_id))
                return false;
            if (this.id != that.id)
                return false;
        }

        boolean this_present_code = true && this.isSetCode();
        boolean that_present_code = true && that.isSetCode();
        if (this_present_code || that_present_code) {
            if (!(this_present_code && that_present_code))
                return false;
            if (!this.code.equals(that.code))
                return false;
        }

        boolean this_present_name = true && this.isSetName();
        boolean that_present_name = true && that.isSetName();
        if (this_present_name || that_present_name) {
            if (!(this_present_name && that_present_name))
                return false;
            if (!this.name.equals(that.name))
                return false;
        }

        boolean this_present_address = true && this.isSetAddress();
        boolean that_present_address = true && that.isSetAddress();
        if (this_present_address || that_present_address) {
            if (!(this_present_address && that_present_address))
                return false;
            if (!this.address.equals(that.address))
                return false;
        }

        boolean this_present_staffs = true && this.isSetStaffs();
        boolean that_present_staffs = true && that.isSetStaffs();
        if (this_present_staffs || that_present_staffs) {
            if (!(this_present_staffs && that_present_staffs))
                return false;
            if (this.staffs != that.staffs)
                return false;
        }

        boolean this_present_bank = true && this.isSetBank();
        boolean that_present_bank = true && that.isSetBank();
        if (this_present_bank || that_present_bank) {
            if (!(this_present_bank && that_present_bank))
                return false;
            if (!this.bank.equals(that.bank))
                return false;
        }

        boolean this_present_region = true && this.isSetRegion();
        boolean that_present_region = true && that.isSetRegion();
        if (this_present_region || that_present_region) {
            if (!(this_present_region && that_present_region))
                return false;
            if (!this.region.equals(that.region))
                return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int hashCode = 1;

        hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(id);

        hashCode = hashCode * 8191 + ((isSetCode()) ? 131071 : 524287);
        if (isSetCode())
            hashCode = hashCode * 8191 + code.hashCode();

        hashCode = hashCode * 8191 + ((isSetName()) ? 131071 : 524287);
        if (isSetName())
            hashCode = hashCode * 8191 + name.hashCode();

        hashCode = hashCode * 8191 + ((isSetAddress()) ? 131071 : 524287);
        if (isSetAddress())
            hashCode = hashCode * 8191 + address.hashCode();

        hashCode = hashCode * 8191 + ((isSetStaffs()) ? 131071 : 524287);
        if (isSetStaffs())
            hashCode = hashCode * 8191 + staffs;

        hashCode = hashCode * 8191 + ((isSetBank()) ? 131071 : 524287);
        if (isSetBank())
            hashCode = hashCode * 8191 + bank.hashCode();

        hashCode = hashCode * 8191 + ((isSetRegion()) ? 131071 : 524287);
        if (isSetRegion())
            hashCode = hashCode * 8191 + region.getValue();

        return hashCode;
    }

    @Override
    public int compareTo(ThriftBranch other) {
        if (!getClass().equals(other.getClass())) {
            return getClass().getName().compareTo(other.getClass().getName());
        }

        int lastComparison = 0;

        lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetId()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetCode()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.code, other.code);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetName()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetAddress()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetStaffs()).compareTo(other.isSetStaffs());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetStaffs()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.staffs, other.staffs);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetBank()).compareTo(other.isSetBank());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetBank()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bank, other.bank);
            if (lastComparison != 0) {
                return lastComparison;
            }
        }
        lastComparison = Boolean.valueOf(isSetRegion()).compareTo(other.isSetRegion());
        if (lastComparison != 0) {
            return lastComparison;
        }
        if (isSetRegion()) {
            lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.region, other.region);
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
    public String toString() {
        StringBuilder sb = new StringBuilder("ThriftBranch(");
        boolean first = true;

        sb.append("id:");
        sb.append(this.id);
        first = false;
        if (!first) sb.append(", ");
        sb.append("code:");
        if (this.code == null) {
            sb.append("null");
        } else {
            sb.append(this.code);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("name:");
        if (this.name == null) {
            sb.append("null");
        } else {
            sb.append(this.name);
        }
        first = false;
        if (!first) sb.append(", ");
        sb.append("address:");
        if (this.address == null) {
            sb.append("null");
        } else {
            sb.append(this.address);
        }
        first = false;
        if (isSetStaffs()) {
            if (!first) sb.append(", ");
            sb.append("staffs:");
            sb.append(this.staffs);
            first = false;
        }
        if (isSetBank()) {
            if (!first) sb.append(", ");
            sb.append("bank:");
            if (this.bank == null) {
                sb.append("null");
            } else {
                sb.append(this.bank);
            }
            first = false;
        }
        if (isSetRegion()) {
            if (!first) sb.append(", ");
            sb.append("region:");
            if (this.region == null) {
                sb.append("null");
            } else {
                sb.append(this.region);
            }
            first = false;
        }
        sb.append(")");
        return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
        // check for required fields
        // alas, we cannot check 'id' because it's a primitive and you chose the non-beans generator.
        if (code == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'code' was not present! Struct: " + toString());
        }
        if (name == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'name' was not present! Struct: " + toString());
        }
        if (address == null) {
            throw new org.apache.thrift.protocol.TProtocolException("Required field 'address' was not present! Struct: " + toString());
        }
        // check for sub-struct validity
        if (bank != null) {
            bank.validate();
        }
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
        try {
            write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
        try {
            // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
            __isset_bitfield = 0;
            read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
        } catch (org.apache.thrift.TException te) {
            throw new java.io.IOException(te);
        }
    }

    private static class ThriftBranchStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ThriftBranchStandardScheme getScheme() {
            return new ThriftBranchStandardScheme();
        }
    }

    private static class ThriftBranchStandardScheme extends org.apache.thrift.scheme.StandardScheme<ThriftBranch> {

        public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftBranch struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();
            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // ID
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            struct.id = iprot.readI64();
                            struct.setIdIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // CODE
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.code = iprot.readString();
                            struct.setCodeIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 3: // NAME
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.name = iprot.readString();
                            struct.setNameIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 4: // ADDRESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            struct.address = iprot.readString();
                            struct.setAddressIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 5: // STAFFS
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.staffs = iprot.readI32();
                            struct.setStaffsIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 6: // BANK
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                            struct.bank = new ThriftBank();
                            struct.bank.read(iprot);
                            struct.setBankIsSet(true);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 7: // REGION
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            struct.region = ThriftRegion.findByValue(iprot.readI32());
                            struct.setRegionIsSet(true);
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
            if (!struct.isSetId()) {
                throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' was not found in serialized data! Struct: " + toString());
            }
            struct.validate();
        }

        public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftBranch struct) throws org.apache.thrift.TException {
            struct.validate();

            oprot.writeStructBegin(STRUCT_DESC);
            oprot.writeFieldBegin(ID_FIELD_DESC);
            oprot.writeI64(struct.id);
            oprot.writeFieldEnd();
            if (struct.code != null) {
                oprot.writeFieldBegin(CODE_FIELD_DESC);
                oprot.writeString(struct.code);
                oprot.writeFieldEnd();
            }
            if (struct.name != null) {
                oprot.writeFieldBegin(NAME_FIELD_DESC);
                oprot.writeString(struct.name);
                oprot.writeFieldEnd();
            }
            if (struct.address != null) {
                oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
                oprot.writeString(struct.address);
                oprot.writeFieldEnd();
            }
            if (struct.isSetStaffs()) {
                oprot.writeFieldBegin(STAFFS_FIELD_DESC);
                oprot.writeI32(struct.staffs);
                oprot.writeFieldEnd();
            }
            if (struct.bank != null) {
                if (struct.isSetBank()) {
                    oprot.writeFieldBegin(BANK_FIELD_DESC);
                    struct.bank.write(oprot);
                    oprot.writeFieldEnd();
                }
            }
            if (struct.region != null) {
                if (struct.isSetRegion()) {
                    oprot.writeFieldBegin(REGION_FIELD_DESC);
                    oprot.writeI32(struct.region.getValue());
                    oprot.writeFieldEnd();
                }
            }
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

    }

    private static class ThriftBranchTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
        public ThriftBranchTupleScheme getScheme() {
            return new ThriftBranchTupleScheme();
        }
    }

    private static class ThriftBranchTupleScheme extends org.apache.thrift.scheme.TupleScheme<ThriftBranch> {

        @Override
        public void write(org.apache.thrift.protocol.TProtocol prot, ThriftBranch struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            oprot.writeI64(struct.id);
            oprot.writeString(struct.code);
            oprot.writeString(struct.name);
            oprot.writeString(struct.address);
            java.util.BitSet optionals = new java.util.BitSet();
            if (struct.isSetStaffs()) {
                optionals.set(0);
            }
            if (struct.isSetBank()) {
                optionals.set(1);
            }
            if (struct.isSetRegion()) {
                optionals.set(2);
            }
            oprot.writeBitSet(optionals, 3);
            if (struct.isSetStaffs()) {
                oprot.writeI32(struct.staffs);
            }
            if (struct.isSetBank()) {
                struct.bank.write(oprot);
            }
            if (struct.isSetRegion()) {
                oprot.writeI32(struct.region.getValue());
            }
        }

        @Override
        public void read(org.apache.thrift.protocol.TProtocol prot, ThriftBranch struct) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
            struct.id = iprot.readI64();
            struct.setIdIsSet(true);
            struct.code = iprot.readString();
            struct.setCodeIsSet(true);
            struct.name = iprot.readString();
            struct.setNameIsSet(true);
            struct.address = iprot.readString();
            struct.setAddressIsSet(true);
            java.util.BitSet incoming = iprot.readBitSet(3);
            if (incoming.get(0)) {
                struct.staffs = iprot.readI32();
                struct.setStaffsIsSet(true);
            }
            if (incoming.get(1)) {
                struct.bank = new ThriftBank();
                struct.bank.read(iprot);
                struct.setBankIsSet(true);
            }
            if (incoming.get(2)) {
                struct.region = ThriftRegion.findByValue(iprot.readI32());
                struct.setRegionIsSet(true);
            }
        }
    }

    private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
        return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
    }
}
