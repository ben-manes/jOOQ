/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.Record;
import org.jooq.RecordMetaData;
import org.jooq.SelectQuery;
import org.jooq.impl.QueryFactory;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
public class XUnusedRecord extends UpdatableRecordImpl {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XUnused.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XUnused.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public List<XUnusedRecord> getXUnuseds(Connection connection) throws SQLException {
		SelectQuery q = QueryFactory.createSelectQuery(XUnused.X_UNUSED);
		q.addCompareCondition(XUnused.NAME_REF, getValue(XUnused.NAME));
		q.addCompareCondition(XUnused.ID_REF, getValue(XUnused.ID));
		q.execute(connection);

		return q.getResult().getRecords();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setName(String value) {
		setValue(XUnused.NAME, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public String getName() {
		return getValue(XUnused.NAME);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [NAME_REF, ID_REF] REFERENCES X_UNUSED [NAME, ID]
	 */
	public void setIdRef(Integer value) {
		setValue(XUnused.ID_REF, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [NAME_REF, ID_REF] REFERENCES X_UNUSED [NAME, ID]
	 */
	public Integer getIdRef() {
		return getValue(XUnused.ID_REF);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [NAME_REF, ID_REF] REFERENCES X_UNUSED [NAME, ID]
	 */
	public XUnusedRecord getXUnused(Connection connection) throws SQLException {
		SelectQuery q = QueryFactory.createSelectQuery(XUnused.X_UNUSED);
		q.addCompareCondition(XUnused.NAME, getValue(XUnused.NAME_REF));
		q.addCompareCondition(XUnused.ID, getValue(XUnused.ID_REF));
		q.execute(connection);

		List<Record> result = q.getResult().getRecords();
		return (XUnusedRecord) (result.size() == 1 ? result.get(0) : null);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [NAME_REF, ID_REF] REFERENCES X_UNUSED [NAME, ID]
	 */
	public void setNameRef(String value) {
		setValue(XUnused.NAME_REF, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [NAME_REF, ID_REF] REFERENCES X_UNUSED [NAME, ID]
	 */
	public String getNameRef() {
		return getValue(XUnused.NAME_REF);
	}

	public XUnusedRecord(RecordMetaData metaData) {
		super(metaData, XUnused.X_UNUSED);
	}
}
