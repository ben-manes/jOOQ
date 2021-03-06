/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69")
public class X_TEST_CASE_64_69_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE {

	private static final long serialVersionUID = -105027233;

	private java.lang.Integer ID;
	private java.lang.Integer UNUSED_ID;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "UNUSED_ID", precision = 7)
	@Override
	public java.lang.Integer getUNUSED_ID() {
		return this.UNUSED_ID;
	}

	@Override
	public void setUNUSED_ID(java.lang.Integer UNUSED_ID) {
		this.UNUSED_ID = UNUSED_ID;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE from) {
		setID(from.getID());
		setUNUSED_ID(from.getUNUSED_ID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
