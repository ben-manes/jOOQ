/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 1521791471;

	/**
	 * The singleton instance of x_test_case_85
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.mysql.generatedclasses.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> __RECORD_TYPE = org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.Integer>("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_test_case_85.x_unused_id, test.x_test_case_85.x_unused_name]
	 * REFERENCES x_unused [test.x_unused.ID, test.x_unused.NAME]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, java.lang.String>("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR, X_TEST_CASE_85);

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		super("x_test_case_85", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_x_test_case_85_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_x_test_case_85_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.mysql.generatedclasses.Keys.fk_x_test_case_85);
	}
}
