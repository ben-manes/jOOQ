/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dr$iBookTitleContext$rRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.Dr$iBookTitleContext$rRecord> implements org.jooq.Record2<java.math.BigDecimal, byte[]>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$r {

	private static final long serialVersionUID = 1398864226;

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.ROW_NO</code>. 
	 */
	@Override
	public void setRowNo(java.math.BigDecimal value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.ROW_NO</code>. 
	 */
	@Override
	public java.math.BigDecimal getRowNo() {
		return (java.math.BigDecimal) getValue(0);
	}

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.DATA</code>. 
	 */
	@Override
	public void setData(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$R.DATA</code>. 
	 */
	@Override
	public byte[] getData() {
		return (byte[]) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.math.BigDecimal, byte[]> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.math.BigDecimal, byte[]> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$r.ROW_NO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$r.DATA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value1() {
		return getRowNo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getData();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$r from) {
		setRowNo(from.getRowNo());
		setData(from.getData());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$r> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Dr$iBookTitleContext$rRecord
	 */
	public Dr$iBookTitleContext$rRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.Dr$iBookTitleContext$r.DR$I_BOOK_TITLE_CONTEXT$R);
	}
}