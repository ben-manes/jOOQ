/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.oracle.generatedclasses.Test;
import org.jooq.test.oracle.generatedclasses.tables.records.XTestCase_71Record;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71 extends UpdatableTableImpl<XTestCase_71Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of X_TEST_CASE_71
	 */
	public static final XTestCase_71 X_TEST_CASE_71 = new XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_71Record> __RECORD_TYPE = XTestCase_71Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_71Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_71Record, Integer> ID = new TableFieldImpl<XTestCase_71Record, Integer>(SQLDialect.ORACLE, "ID", Integer.class, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID] REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 */
	public static final TableField<XTestCase_71Record, Short> TEST_CASE_64_69_ID = new TableFieldImpl<XTestCase_71Record, Short>(SQLDialect.ORACLE, "TEST_CASE_64_69_ID", Short.class, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super(SQLDialect.ORACLE, "X_TEST_CASE_71", Test.TEST);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_71.addToPrimaryKey(ID);
	}

}
