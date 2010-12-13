/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.UpdatableTableImpl;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.XTestCase_64_69Record;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_64_69 extends UpdatableTableImpl<XTestCase_64_69Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of X_TEST_CASE_64_69
	 */
	public static final XTestCase_64_69 X_TEST_CASE_64_69 = new XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	private static final Class<XTestCase_64_69Record> __RECORD_TYPE = XTestCase_64_69Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_64_69Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<XTestCase_64_69Record, Integer> ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.HSQLDB, "ID", Integer.class, X_TEST_CASE_64_69);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.X_TEST_CASE_64_69.UNUSED_ID] REFERENCES X_UNUSED [PUBLIC.X_UNUSED.ID, PUBLIC.X_UNUSED.NAME]
	 */
	public static final TableField<XTestCase_64_69Record, Integer> UNUSED_ID = new TableFieldImpl<XTestCase_64_69Record, Integer>(SQLDialect.HSQLDB, "UNUSED_ID", Integer.class, X_TEST_CASE_64_69);

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		super(SQLDialect.HSQLDB, "X_TEST_CASE_64_69", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		X_TEST_CASE_64_69.addToPrimaryKey(ID);
	}

}
