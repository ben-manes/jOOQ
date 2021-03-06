/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71", schema = "TEST")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Short> {

	private static final long serialVersionUID = 1880855494;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", precision = 4)
	public java.lang.Short getTestCase_64_69Id() {
		return (java.lang.Short) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getTestCase_64_69Id();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71);
	}
}
