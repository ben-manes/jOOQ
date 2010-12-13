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
import org.jooq.test.oracle.generatedclasses.enums.TLanguage;
import org.jooq.test.oracle.generatedclasses.tables.records.TBookRecord;


/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
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
	 * The book ID
	 * 
	 * PRIMARY KEY
	 */
	public static final TableField<TBookRecord, Integer> ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.ORACLE, "ID", Integer.class, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.AUTHOR_ID] REFERENCES T_AUTHOR [TEST.T_AUTHOR.ID]
	 */
	public static final TableField<TBookRecord, Integer> AUTHOR_ID = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.ORACLE, "AUTHOR_ID", Integer.class, T_BOOK);

	/**
	 * The book's title
	 */
	public static final TableField<TBookRecord, String> TITLE = new TableFieldImpl<TBookRecord, String>(SQLDialect.ORACLE, "TITLE", String.class, T_BOOK);

	/**
	 * The year the book was published in
	 */
	public static final TableField<TBookRecord, Integer> PUBLISHED_IN = new TableFieldImpl<TBookRecord, Integer>(SQLDialect.ORACLE, "PUBLISHED_IN", Integer.class, T_BOOK);

	/**
	 * The language of the book
	 * 
	 * FOREIGN KEY [TEST.T_BOOK.LANGUAGE_ID] REFERENCES T_LANGUAGE [TEST.T_LANGUAGE.ID]
	 */
	public static final TableField<TBookRecord, TLanguage> LANGUAGE_ID = new TableFieldImpl<TBookRecord, TLanguage>(SQLDialect.ORACLE, "LANGUAGE_ID", TLanguage.class, T_BOOK);

	/**
	 * Some textual content of the book
	 */
	public static final TableField<TBookRecord, String> CONTENT_TEXT = new TableFieldImpl<TBookRecord, String>(SQLDialect.ORACLE, "CONTENT_TEXT", String.class, T_BOOK);

	/**
	 * Some binary content of the book
	 */
	public static final TableField<TBookRecord, byte[]> CONTENT_PDF = new TableFieldImpl<TBookRecord, byte[]>(SQLDialect.ORACLE, "CONTENT_PDF", byte[].class, T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super(SQLDialect.ORACLE, "T_BOOK", Test.TEST);
	}

	/*
	 * static initialiser
	 */
	static {
		T_BOOK.addToPrimaryKey(ID);
	}

}
