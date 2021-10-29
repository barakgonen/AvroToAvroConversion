/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mashov.bla.schema.data.entity;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Ag is the same as Bg but with some more fields, not nullable and different names */
@org.apache.avro.specific.AvroGenerated
public class AgRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2549364883246523593L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AgRecord\",\"namespace\":\"org.mashov.bla.schema.data.entity\",\"doc\":\"Ag is the same as Bg but with some more fields, not nullable and different names\",\"fields\":[{\"name\":\"firstT\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"EMPTY\"},{\"name\":\"secondD\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"\"},{\"name\":\"thirdT\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"t\"},{\"name\":\"forthH\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"defaultEmpty\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AgRecord> ENCODER =
      new BinaryMessageEncoder<AgRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AgRecord> DECODER =
      new BinaryMessageDecoder<AgRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AgRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AgRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AgRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AgRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AgRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AgRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AgRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AgRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** bbbbbbb */
  @Deprecated public java.lang.String firstT;
  /** bbbbbbb */
  @Deprecated public java.lang.String secondD;
  /** bbbbbbb */
  @Deprecated public java.lang.String thirdT;
  /** bbbbbbb */
  @Deprecated public java.lang.String forthH;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AgRecord() {}

  /**
   * All-args constructor.
   * @param firstT bbbbbbb
   * @param secondD bbbbbbb
   * @param thirdT bbbbbbb
   * @param forthH bbbbbbb
   */
  public AgRecord(java.lang.String firstT, java.lang.String secondD, java.lang.String thirdT, java.lang.String forthH) {
    this.firstT = firstT;
    this.secondD = secondD;
    this.thirdT = thirdT;
    this.forthH = forthH;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstT;
    case 1: return secondD;
    case 2: return thirdT;
    case 3: return forthH;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstT = value$ != null ? value$.toString() : null; break;
    case 1: secondD = value$ != null ? value$.toString() : null; break;
    case 2: thirdT = value$ != null ? value$.toString() : null; break;
    case 3: forthH = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'firstT' field.
   * @return bbbbbbb
   */
  public java.lang.String getFirstT() {
    return firstT;
  }


  /**
   * Sets the value of the 'firstT' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setFirstT(java.lang.String value) {
    this.firstT = value;
  }

  /**
   * Gets the value of the 'secondD' field.
   * @return bbbbbbb
   */
  public java.lang.String getSecondD() {
    return secondD;
  }


  /**
   * Sets the value of the 'secondD' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setSecondD(java.lang.String value) {
    this.secondD = value;
  }

  /**
   * Gets the value of the 'thirdT' field.
   * @return bbbbbbb
   */
  public java.lang.String getThirdT() {
    return thirdT;
  }


  /**
   * Sets the value of the 'thirdT' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setThirdT(java.lang.String value) {
    this.thirdT = value;
  }

  /**
   * Gets the value of the 'forthH' field.
   * @return bbbbbbb
   */
  public java.lang.String getForthH() {
    return forthH;
  }


  /**
   * Sets the value of the 'forthH' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setForthH(java.lang.String value) {
    this.forthH = value;
  }

  /**
   * Creates a new AgRecord RecordBuilder.
   * @return A new AgRecord RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.AgRecord.Builder newBuilder() {
    return new org.mashov.bla.schema.data.entity.AgRecord.Builder();
  }

  /**
   * Creates a new AgRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AgRecord RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.AgRecord.Builder newBuilder(org.mashov.bla.schema.data.entity.AgRecord.Builder other) {
    if (other == null) {
      return new org.mashov.bla.schema.data.entity.AgRecord.Builder();
    } else {
      return new org.mashov.bla.schema.data.entity.AgRecord.Builder(other);
    }
  }

  /**
   * Creates a new AgRecord RecordBuilder by copying an existing AgRecord instance.
   * @param other The existing instance to copy.
   * @return A new AgRecord RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.AgRecord.Builder newBuilder(org.mashov.bla.schema.data.entity.AgRecord other) {
    if (other == null) {
      return new org.mashov.bla.schema.data.entity.AgRecord.Builder();
    } else {
      return new org.mashov.bla.schema.data.entity.AgRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for AgRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AgRecord>
    implements org.apache.avro.data.RecordBuilder<AgRecord> {

    /** bbbbbbb */
    private java.lang.String firstT;
    /** bbbbbbb */
    private java.lang.String secondD;
    /** bbbbbbb */
    private java.lang.String thirdT;
    /** bbbbbbb */
    private java.lang.String forthH;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mashov.bla.schema.data.entity.AgRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstT)) {
        this.firstT = data().deepCopy(fields()[0].schema(), other.firstT);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.secondD)) {
        this.secondD = data().deepCopy(fields()[1].schema(), other.secondD);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.thirdT)) {
        this.thirdT = data().deepCopy(fields()[2].schema(), other.thirdT);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.forthH)) {
        this.forthH = data().deepCopy(fields()[3].schema(), other.forthH);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing AgRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.bla.schema.data.entity.AgRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstT)) {
        this.firstT = data().deepCopy(fields()[0].schema(), other.firstT);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.secondD)) {
        this.secondD = data().deepCopy(fields()[1].schema(), other.secondD);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.thirdT)) {
        this.thirdT = data().deepCopy(fields()[2].schema(), other.thirdT);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.forthH)) {
        this.forthH = data().deepCopy(fields()[3].schema(), other.forthH);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'firstT' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getFirstT() {
      return firstT;
    }


    /**
      * Sets the value of the 'firstT' field.
      * bbbbbbb
      * @param value The value of 'firstT'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder setFirstT(java.lang.String value) {
      validate(fields()[0], value);
      this.firstT = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstT' field has been set.
      * bbbbbbb
      * @return True if the 'firstT' field has been set, false otherwise.
      */
    public boolean hasFirstT() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstT' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder clearFirstT() {
      firstT = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'secondD' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getSecondD() {
      return secondD;
    }


    /**
      * Sets the value of the 'secondD' field.
      * bbbbbbb
      * @param value The value of 'secondD'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder setSecondD(java.lang.String value) {
      validate(fields()[1], value);
      this.secondD = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'secondD' field has been set.
      * bbbbbbb
      * @return True if the 'secondD' field has been set, false otherwise.
      */
    public boolean hasSecondD() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'secondD' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder clearSecondD() {
      secondD = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'thirdT' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getThirdT() {
      return thirdT;
    }


    /**
      * Sets the value of the 'thirdT' field.
      * bbbbbbb
      * @param value The value of 'thirdT'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder setThirdT(java.lang.String value) {
      validate(fields()[2], value);
      this.thirdT = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'thirdT' field has been set.
      * bbbbbbb
      * @return True if the 'thirdT' field has been set, false otherwise.
      */
    public boolean hasThirdT() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'thirdT' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder clearThirdT() {
      thirdT = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'forthH' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getForthH() {
      return forthH;
    }


    /**
      * Sets the value of the 'forthH' field.
      * bbbbbbb
      * @param value The value of 'forthH'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder setForthH(java.lang.String value) {
      validate(fields()[3], value);
      this.forthH = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'forthH' field has been set.
      * bbbbbbb
      * @return True if the 'forthH' field has been set, false otherwise.
      */
    public boolean hasForthH() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'forthH' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.AgRecord.Builder clearForthH() {
      forthH = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AgRecord build() {
      try {
        AgRecord record = new AgRecord();
        record.firstT = fieldSetFlags()[0] ? this.firstT : (java.lang.String) defaultValue(fields()[0]);
        record.secondD = fieldSetFlags()[1] ? this.secondD : (java.lang.String) defaultValue(fields()[1]);
        record.thirdT = fieldSetFlags()[2] ? this.thirdT : (java.lang.String) defaultValue(fields()[2]);
        record.forthH = fieldSetFlags()[3] ? this.forthH : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AgRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<AgRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AgRecord>
    READER$ = (org.apache.avro.io.DatumReader<AgRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.firstT);

    out.writeString(this.secondD);

    out.writeString(this.thirdT);

    out.writeString(this.forthH);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.firstT = in.readString();

      this.secondD = in.readString();

      this.thirdT = in.readString();

      this.forthH = in.readString();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.firstT = in.readString();
          break;

        case 1:
          this.secondD = in.readString();
          break;

        case 2:
          this.thirdT = in.readString();
          break;

        case 3:
          this.forthH = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









