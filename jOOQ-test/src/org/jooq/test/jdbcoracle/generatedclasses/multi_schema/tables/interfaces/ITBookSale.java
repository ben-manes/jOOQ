/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITBookSale extends java.io.Serializable {

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	public void setBookId(java.lang.Integer value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	public java.lang.Integer getBookId();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	public void setBookStoreName(java.lang.String value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	public java.lang.String getBookStoreName();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	public void setSoldAt(java.sql.Date value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	public java.sql.Date getSoldAt();

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	public void setSoldFor(java.math.BigDecimal value);

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	public java.math.BigDecimal getSoldFor();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITBookSale
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBookSale from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITBookSale
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.multi_schema.tables.interfaces.ITBookSale> E into(E into);
}
