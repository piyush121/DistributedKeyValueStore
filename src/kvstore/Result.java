/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package kvstore;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({ "cast", "rawtypes", "serial", "unchecked" })
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-10")
public class Result implements org.apache.thrift.TBase<Result, Result._Fields>, java.io.Serializable, Cloneable,
		Comparable<Result> {
	private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct(
			"Result");

	private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"value", org.apache.thrift.protocol.TType.STRING, (short) 1);
	private static final org.apache.thrift.protocol.TField ERROR_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"error", org.apache.thrift.protocol.TType.I32, (short) 2);
	private static final org.apache.thrift.protocol.TField ERRORTEXT_FIELD_DESC = new org.apache.thrift.protocol.TField(
			"errortext", org.apache.thrift.protocol.TType.STRING, (short) 3);

	private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
	static {
		schemes.put(StandardScheme.class, new ResultStandardSchemeFactory());
		schemes.put(TupleScheme.class, new ResultTupleSchemeFactory());
	}

	public String value; // required
	/**
	 * 
	 * @see ErrorCode
	 */
	public ErrorCode error; // required
	public String errortext; // required

	/**
	 * The set of fields this struct contains, along with convenience methods
	 * for finding and manipulating them.
	 */
	public enum _Fields implements org.apache.thrift.TFieldIdEnum {
		VALUE((short) 1, "value"),
		/**
		 * 
		 * @see ErrorCode
		 */
		ERROR((short) 2, "error"), ERRORTEXT((short) 3, "errortext");

		private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

		static {
			for (_Fields field : EnumSet.allOf(_Fields.class)) {
				byName.put(field.getFieldName(), field);
			}
		}

		/**
		 * Find the _Fields constant that matches fieldId, or null if its not
		 * found.
		 */
		public static _Fields findByThriftId(int fieldId) {
			switch (fieldId) {
			case 1: // VALUE
				return VALUE;
			case 2: // ERROR
				return ERROR;
			case 3: // ERRORTEXT
				return ERRORTEXT;
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
			if (fields == null)
				throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
			return fields;
		}

		/**
		 * Find the _Fields constant that matches name, or null if its not
		 * found.
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
	public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
	static {
		Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(
				_Fields.class);
		tmpMap.put(_Fields.VALUE,
				new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		tmpMap.put(_Fields.ERROR, new org.apache.thrift.meta_data.FieldMetaData("error",
				org.apache.thrift.TFieldRequirementType.DEFAULT,
				new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ErrorCode.class)));
		tmpMap.put(_Fields.ERRORTEXT,
				new org.apache.thrift.meta_data.FieldMetaData("errortext",
						org.apache.thrift.TFieldRequirementType.DEFAULT,
						new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
		metaDataMap = Collections.unmodifiableMap(tmpMap);
		org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Result.class, metaDataMap);
	}

	public Result() {
	}

	public Result(String value, ErrorCode error, String errortext) {
		this();
		this.value = value;
		this.error = error;
		this.errortext = errortext;
	}

	/**
	 * Performs a deep copy on <i>other</i>.
	 */
	public Result(Result other) {
		if (other.isSetValue()) {
			this.value = other.value;
		}
		if (other.isSetError()) {
			this.error = other.error;
		}
		if (other.isSetErrortext()) {
			this.errortext = other.errortext;
		}
	}

	public Result deepCopy() {
		return new Result(this);
	}

//	@Override
	public void clear() {
		this.value = null;
		this.error = null;
		this.errortext = null;
	}

	public String getValue() {
		return this.value;
	}

	public Result setValue(String value) {
		this.value = value;
		return this;
	}

	public void unsetValue() {
		this.value = null;
	}

	/**
	 * Returns true if field value is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetValue() {
		return this.value != null;
	}

	public void setValueIsSet(boolean value) {
		if (!value) {
			this.value = null;
		}
	}

	/**
	 * 
	 * @see ErrorCode
	 */
	public ErrorCode getError() {
		return this.error;
	}

	/**
	 * 
	 * @see ErrorCode
	 */
	public Result setError(ErrorCode error) {
		this.error = error;
		return this;
	}

	public void unsetError() {
		this.error = null;
	}

	/**
	 * Returns true if field error is set (has been assigned a value) and false
	 * otherwise
	 */
	public boolean isSetError() {
		return this.error != null;
	}

	public void setErrorIsSet(boolean value) {
		if (!value) {
			this.error = null;
		}
	}

	public String getErrortext() {
		return this.errortext;
	}

	public Result setErrortext(String errortext) {
		this.errortext = errortext;
		return this;
	}

	public void unsetErrortext() {
		this.errortext = null;
	}

	/**
	 * Returns true if field errortext is set (has been assigned a value) and
	 * false otherwise
	 */
	public boolean isSetErrortext() {
		return this.errortext != null;
	}

	public void setErrortextIsSet(boolean value) {
		if (!value) {
			this.errortext = null;
		}
	}

	public void setFieldValue(_Fields field, Object value) {
		switch (field) {
		case VALUE:
			if (value == null) {
				unsetValue();
			} else {
				setValue((String) value);
			}
			break;

		case ERROR:
			if (value == null) {
				unsetError();
			} else {
				setError((ErrorCode) value);
			}
			break;

		case ERRORTEXT:
			if (value == null) {
				unsetErrortext();
			} else {
				setErrortext((String) value);
			}
			break;

		}
	}

	public Object getFieldValue(_Fields field) {
		switch (field) {
		case VALUE:
			return getValue();

		case ERROR:
			return getError();

		case ERRORTEXT:
			return getErrortext();

		}
		throw new IllegalStateException();
	}

	/**
	 * Returns true if field corresponding to fieldID is set (has been assigned
	 * a value) and false otherwise
	 */
	public boolean isSet(_Fields field) {
		if (field == null) {
			throw new IllegalArgumentException();
		}

		switch (field) {
		case VALUE:
			return isSetValue();
		case ERROR:
			return isSetError();
		case ERRORTEXT:
			return isSetErrortext();
		}
		throw new IllegalStateException();
	}

//	@Override
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that instanceof Result)
			return this.equals((Result) that);
		return false;
	}

	public boolean equals(Result that) {
		if (that == null)
			return false;

		boolean this_present_value = true && this.isSetValue();
		boolean that_present_value = true && that.isSetValue();
		if (this_present_value || that_present_value) {
			if (!(this_present_value && that_present_value))
				return false;
			if (!this.value.equals(that.value))
				return false;
		}

		boolean this_present_error = true && this.isSetError();
		boolean that_present_error = true && that.isSetError();
		if (this_present_error || that_present_error) {
			if (!(this_present_error && that_present_error))
				return false;
			if (!this.error.equals(that.error))
				return false;
		}

		boolean this_present_errortext = true && this.isSetErrortext();
		boolean that_present_errortext = true && that.isSetErrortext();
		if (this_present_errortext || that_present_errortext) {
			if (!(this_present_errortext && that_present_errortext))
				return false;
			if (!this.errortext.equals(that.errortext))
				return false;
		}

		return true;
	}

	@Override
	public int hashCode() {
		List<Object> list = new ArrayList<Object>();

		boolean present_value = true && (isSetValue());
		list.add(present_value);
		if (present_value)
			list.add(value);

		boolean present_error = true && (isSetError());
		list.add(present_error);
		if (present_error)
			list.add(error.getValue());

		boolean present_errortext = true && (isSetErrortext());
		list.add(present_errortext);
		if (present_errortext)
			list.add(errortext);

		return list.hashCode();
	}

//	@Override
	public int compareTo(Result other) {
		if (!getClass().equals(other.getClass())) {
			return getClass().getName().compareTo(other.getClass().getName());
		}

		int lastComparison = 0;

		lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetValue()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetError()).compareTo(other.isSetError());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetError()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.error, other.error);
			if (lastComparison != 0) {
				return lastComparison;
			}
		}
		lastComparison = Boolean.valueOf(isSetErrortext()).compareTo(other.isSetErrortext());
		if (lastComparison != 0) {
			return lastComparison;
		}
		if (isSetErrortext()) {
			lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.errortext, other.errortext);
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
		schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
	}

	public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
		schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Result(");
		boolean first = true;

		sb.append("value:");
		if (this.value == null) {
			sb.append("null");
		} else {
			sb.append(this.value);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("error:");
		if (this.error == null) {
			sb.append("null");
		} else {
			sb.append(this.error);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("errortext:");
		if (this.errortext == null) {
			sb.append("null");
		} else {
			sb.append(this.errortext);
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
			write(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(out)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
		try {
			read(new org.apache.thrift.protocol.TCompactProtocol(
					new org.apache.thrift.transport.TIOStreamTransport(in)));
		} catch (org.apache.thrift.TException te) {
			throw new java.io.IOException(te);
		}
	}

	private static class ResultStandardSchemeFactory implements SchemeFactory {
		public ResultStandardScheme getScheme() {
			return new ResultStandardScheme();
		}
	}

	private static class ResultStandardScheme extends StandardScheme<Result> {

		public void read(org.apache.thrift.protocol.TProtocol iprot, Result struct)
				throws org.apache.thrift.TException {
			org.apache.thrift.protocol.TField schemeField;
			iprot.readStructBegin();
			while (true) {
				schemeField = iprot.readFieldBegin();
				if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
					break;
				}
				switch (schemeField.id) {
				case 1: // VALUE
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.value = iprot.readString();
						struct.setValueIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 2: // ERROR
					if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
						struct.error = kvstore.ErrorCode.findByValue(iprot.readI32());
						struct.setErrorIsSet(true);
					} else {
						org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
					}
					break;
				case 3: // ERRORTEXT
					if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
						struct.errortext = iprot.readString();
						struct.setErrortextIsSet(true);
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

			// check for required fields of primitive type, which can't be
			// checked in the validate method
			struct.validate();
		}

		public void write(org.apache.thrift.protocol.TProtocol oprot, Result struct)
				throws org.apache.thrift.TException {
			struct.validate();

			oprot.writeStructBegin(STRUCT_DESC);
			if (struct.value != null) {
				oprot.writeFieldBegin(VALUE_FIELD_DESC);
				oprot.writeString(struct.value);
				oprot.writeFieldEnd();
			}
			if (struct.error != null) {
				oprot.writeFieldBegin(ERROR_FIELD_DESC);
				oprot.writeI32(struct.error.getValue());
				oprot.writeFieldEnd();
			}
			if (struct.errortext != null) {
				oprot.writeFieldBegin(ERRORTEXT_FIELD_DESC);
				oprot.writeString(struct.errortext);
				oprot.writeFieldEnd();
			}
			oprot.writeFieldStop();
			oprot.writeStructEnd();
		}

	}

	private static class ResultTupleSchemeFactory implements SchemeFactory {
		public ResultTupleScheme getScheme() {
			return new ResultTupleScheme();
		}
	}

	private static class ResultTupleScheme extends TupleScheme<Result> {

//		@Override
		public void write(org.apache.thrift.protocol.TProtocol prot, Result struct)
				throws org.apache.thrift.TException {
			TTupleProtocol oprot = (TTupleProtocol) prot;
			BitSet optionals = new BitSet();
			if (struct.isSetValue()) {
				optionals.set(0);
			}
			if (struct.isSetError()) {
				optionals.set(1);
			}
			if (struct.isSetErrortext()) {
				optionals.set(2);
			}
			oprot.writeBitSet(optionals, 3);
			if (struct.isSetValue()) {
				oprot.writeString(struct.value);
			}
			if (struct.isSetError()) {
				oprot.writeI32(struct.error.getValue());
			}
			if (struct.isSetErrortext()) {
				oprot.writeString(struct.errortext);
			}
		}

//		@Override
		public void read(org.apache.thrift.protocol.TProtocol prot, Result struct) throws org.apache.thrift.TException {
			TTupleProtocol iprot = (TTupleProtocol) prot;
			BitSet incoming = iprot.readBitSet(3);
			if (incoming.get(0)) {
				struct.value = iprot.readString();
				struct.setValueIsSet(true);
			}
			if (incoming.get(1)) {
				struct.error = kvstore.ErrorCode.findByValue(iprot.readI32());
				struct.setErrorIsSet(true);
			}
			if (incoming.get(2)) {
				struct.errortext = iprot.readString();
				struct.setErrortextIsSet(true);
			}
		}
	}

}
