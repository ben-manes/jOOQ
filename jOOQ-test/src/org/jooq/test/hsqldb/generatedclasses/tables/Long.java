/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class Long extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> {

	private static final long serialVersionUID = 588680641;

	/**
	 * The singleton instance of LONG
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Long LONG = new org.jooq.test.hsqldb.generatedclasses.tables.Long();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, LONG);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord, java.lang.Long> OTHER = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.LongRecord, java.lang.Long>("OTHER", org.jooq.impl.SQLDataType.BIGINT, LONG);

	/**
	 * No further instances allowed
	 */
	private Long() {
		super("LONG", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}
}
