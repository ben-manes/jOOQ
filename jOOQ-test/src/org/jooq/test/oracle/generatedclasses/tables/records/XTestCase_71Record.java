/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.tables.records;


import java.sql.SQLException;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.SimpleSelectQuery;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.oracle.generatedclasses.tables.XTestCase_71;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class XTestCase_71Record extends UpdatableRecordImpl<XTestCase_71Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XTestCase_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XTestCase_71.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID] REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 */
	public void setTestCase_64_69Id(Short value) {
		setValue(XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID] REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 */
	public Short getTestCase_64_69Id() {
		return getValue(XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID] REFERENCES X_TEST_CASE_64_69 [TEST.X_TEST_CASE_64_69.ID]
	 */
	public XTestCase_64_69Record getXTestCase_64_69() throws SQLException {
		SimpleSelectQuery<XTestCase_64_69Record> q = create().selectQuery(XTestCase_64_69.X_TEST_CASE_64_69);
		q.addCompareCondition(XTestCase_64_69.ID, getIntegerValue(XTestCase_71.TEST_CASE_64_69_ID));
		q.execute();

		List<XTestCase_64_69Record> result = q.getResult().getRecords();
		return result.size() == 1 ? result.get(0) : null;
	}

	public XTestCase_71Record(Configuration configuration) {
		super(configuration, XTestCase_71.X_TEST_CASE_71);
	}
}
