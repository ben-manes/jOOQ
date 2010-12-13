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
import org.jooq.test.hsqldb.generatedclasses.enums.TLanguage;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class TBook extends UpdatableTableImpl<TBookRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of T_BOOK
	 */
	public static final TBook T_BOOK = new TBook();

	/**
	 * The class holding records for this type
	 */
	private static final Class<TBookRecord> __RECORD_TYPE = TBookRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TBookRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.HSQLDB, "ID", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [PUBLIC.T_AUTHOR.ID]
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.HSQLDB, "AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>(SQLDialect.HSQLDB, "TITLE", String.class, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.HSQLDB, "PUBLISHED_IN", Integer.class, T_BOOK);

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [PUBLIC.T_BOOK.LANGUAGE_ID] REFERENCES T_LANGUAGE [PUBLIC.T_LANGUAGE.ID]
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>(SQLDialect.HSQLDB, "LANGUAGE_ID", TLanguage.class, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>(SQLDialect.HSQLDB, "CONTENT_TEXT", String.class, T_BOOK);

	/**
	 * An uncommented item
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>(SQLDialect.HSQLDB, "CONTENT_PDF", byte[].class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super(SQLDialect.HSQLDB, "T_BOOK", Public.PUBLIC);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK.addToPrimaryKey(ID);
	}

}
