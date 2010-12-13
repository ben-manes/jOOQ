/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71 extends UpdatableTableImpl<XTestCase_71Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of x_test_case_71
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
	public static final TableField<XTestCase_71Record, Integer> ID = new TableFieldImpl<XTestCase_71Record, Integer>(SQLDialect.POSTGRES, "id", Integer.class, X_TEST_CASE_71);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [public.x_test_case_71.test_case_64_69_id] REFERENCES x_test_case_64_69 [public.x_test_case_64_69.id]
	 */
	public static final TableField<XTestCase_71Record, Short> TEST_CASE_64_69_ID = new TableFieldImpl<XTestCase_71Record, Short>(SQLDialect.POSTGRES, "test_case_64_69_id", Short.class, X_TEST_CASE_71);

	/**
	 * No further instances allowed
	 */
	private XTestCase_71() {
		super(SQLDialect.POSTGRES, "x_test_case_71", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_71.addToPrimaryKey(ID);
	}

}
