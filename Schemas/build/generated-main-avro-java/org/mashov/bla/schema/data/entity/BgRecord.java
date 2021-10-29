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

/** blablablabla */
@org.apache.avro.specific.AvroGenerated
public class BgRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -9158919411646053959L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BgRecord\",\"namespace\":\"org.mashov.bla.schema.data.entity\",\"doc\":\"blablablabla\",\"fields\":[{\"name\":\"first\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"bbbbbbb\",\"default\":null},{\"name\":\"second\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"\"},{\"name\":\"third\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"t\"},{\"name\":\"forth\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"bbbbbbb\",\"default\":\"defaultEmpty\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BgRecord> ENCODER =
      new BinaryMessageEncoder<BgRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BgRecord> DECODER =
      new BinaryMessageDecoder<BgRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<BgRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<BgRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<BgRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BgRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this BgRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a BgRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a BgRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static BgRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** bbbbbbb */
  @Deprecated public java.lang.String first;
  /** bbbbbbb */
  @Deprecated public java.lang.String second;
  /** bbbbbbb */
  @Deprecated public java.lang.String third;
  /** bbbbbbb */
  @Deprecated public java.lang.String forth;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BgRecord() {}

  /**
   * All-args constructor.
   * @param first bbbbbbb
   * @param second bbbbbbb
   * @param third bbbbbbb
   * @param forth bbbbbbb
   */
  public BgRecord(java.lang.String first, java.lang.String second, java.lang.String third, java.lang.String forth) {
    this.first = first;
    this.second = second;
    this.third = third;
    this.forth = forth;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return first;
    case 1: return second;
    case 2: return third;
    case 3: return forth;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: first = value$ != null ? value$.toString() : null; break;
    case 1: second = value$ != null ? value$.toString() : null; break;
    case 2: third = value$ != null ? value$.toString() : null; break;
    case 3: forth = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'first' field.
   * @return bbbbbbb
   */
  public java.lang.String getFirst() {
    return first;
  }


  /**
   * Sets the value of the 'first' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setFirst(java.lang.String value) {
    this.first = value;
  }

  /**
   * Gets the value of the 'second' field.
   * @return bbbbbbb
   */
  public java.lang.String getSecond() {
    return second;
  }


  /**
   * Sets the value of the 'second' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setSecond(java.lang.String value) {
    this.second = value;
  }

  /**
   * Gets the value of the 'third' field.
   * @return bbbbbbb
   */
  public java.lang.String getThird() {
    return third;
  }


  /**
   * Sets the value of the 'third' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setThird(java.lang.String value) {
    this.third = value;
  }

  /**
   * Gets the value of the 'forth' field.
   * @return bbbbbbb
   */
  public java.lang.String getForth() {
    return forth;
  }


  /**
   * Sets the value of the 'forth' field.
   * bbbbbbb
   * @param value the value to set.
   */
  public void setForth(java.lang.String value) {
    this.forth = value;
  }

  /**
   * Creates a new BgRecord RecordBuilder.
   * @return A new BgRecord RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.BgRecord.Builder newBuilder() {
    return new org.mashov.bla.schema.data.entity.BgRecord.Builder();
  }

  /**
   * Creates a new BgRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BgRecord RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.BgRecord.Builder newBuilder(org.mashov.bla.schema.data.entity.BgRecord.Builder other) {
    if (other == null) {
      return new org.mashov.bla.schema.data.entity.BgRecord.Builder();
    } else {
      return new org.mashov.bla.schema.data.entity.BgRecord.Builder(other);
    }
  }

  /**
   * Creates a new BgRecord RecordBuilder by copying an existing BgRecord instance.
   * @param other The existing instance to copy.
   * @return A new BgRecord RecordBuilder
   */
  public static org.mashov.bla.schema.data.entity.BgRecord.Builder newBuilder(org.mashov.bla.schema.data.entity.BgRecord other) {
    if (other == null) {
      return new org.mashov.bla.schema.data.entity.BgRecord.Builder();
    } else {
      return new org.mashov.bla.schema.data.entity.BgRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for BgRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BgRecord>
    implements org.apache.avro.data.RecordBuilder<BgRecord> {

    /** bbbbbbb */
    private java.lang.String first;
    /** bbbbbbb */
    private java.lang.String second;
    /** bbbbbbb */
    private java.lang.String third;
    /** bbbbbbb */
    private java.lang.String forth;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mashov.bla.schema.data.entity.BgRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.first)) {
        this.first = data().deepCopy(fields()[0].schema(), other.first);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.second)) {
        this.second = data().deepCopy(fields()[1].schema(), other.second);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.third)) {
        this.third = data().deepCopy(fields()[2].schema(), other.third);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.forth)) {
        this.forth = data().deepCopy(fields()[3].schema(), other.forth);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing BgRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mashov.bla.schema.data.entity.BgRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.first)) {
        this.first = data().deepCopy(fields()[0].schema(), other.first);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.second)) {
        this.second = data().deepCopy(fields()[1].schema(), other.second);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.third)) {
        this.third = data().deepCopy(fields()[2].schema(), other.third);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.forth)) {
        this.forth = data().deepCopy(fields()[3].schema(), other.forth);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'first' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getFirst() {
      return first;
    }


    /**
      * Sets the value of the 'first' field.
      * bbbbbbb
      * @param value The value of 'first'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder setFirst(java.lang.String value) {
      validate(fields()[0], value);
      this.first = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'first' field has been set.
      * bbbbbbb
      * @return True if the 'first' field has been set, false otherwise.
      */
    public boolean hasFirst() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'first' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder clearFirst() {
      first = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'second' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getSecond() {
      return second;
    }


    /**
      * Sets the value of the 'second' field.
      * bbbbbbb
      * @param value The value of 'second'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder setSecond(java.lang.String value) {
      validate(fields()[1], value);
      this.second = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'second' field has been set.
      * bbbbbbb
      * @return True if the 'second' field has been set, false otherwise.
      */
    public boolean hasSecond() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'second' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder clearSecond() {
      second = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'third' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getThird() {
      return third;
    }


    /**
      * Sets the value of the 'third' field.
      * bbbbbbb
      * @param value The value of 'third'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder setThird(java.lang.String value) {
      validate(fields()[2], value);
      this.third = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'third' field has been set.
      * bbbbbbb
      * @return True if the 'third' field has been set, false otherwise.
      */
    public boolean hasThird() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'third' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder clearThird() {
      third = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'forth' field.
      * bbbbbbb
      * @return The value.
      */
    public java.lang.String getForth() {
      return forth;
    }


    /**
      * Sets the value of the 'forth' field.
      * bbbbbbb
      * @param value The value of 'forth'.
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder setForth(java.lang.String value) {
      validate(fields()[3], value);
      this.forth = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'forth' field has been set.
      * bbbbbbb
      * @return True if the 'forth' field has been set, false otherwise.
      */
    public boolean hasForth() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'forth' field.
      * bbbbbbb
      * @return This builder.
      */
    public org.mashov.bla.schema.data.entity.BgRecord.Builder clearForth() {
      forth = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BgRecord build() {
      try {
        BgRecord record = new BgRecord();
        record.first = fieldSetFlags()[0] ? this.first : (java.lang.String) defaultValue(fields()[0]);
        record.second = fieldSetFlags()[1] ? this.second : (java.lang.String) defaultValue(fields()[1]);
        record.third = fieldSetFlags()[2] ? this.third : (java.lang.String) defaultValue(fields()[2]);
        record.forth = fieldSetFlags()[3] ? this.forth : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BgRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<BgRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BgRecord>
    READER$ = (org.apache.avro.io.DatumReader<BgRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.first == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.first);
    }

    out.writeString(this.second);

    out.writeString(this.third);

    out.writeString(this.forth);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.first = null;
      } else {
        this.first = in.readString();
      }

      this.second = in.readString();

      this.third = in.readString();

      this.forth = in.readString();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.first = null;
          } else {
            this.first = in.readString();
          }
          break;

        case 1:
          this.second = in.readString();
          break;

        case 2:
          this.third = in.readString();
          break;

        case 3:
          this.forth = in.readString();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










