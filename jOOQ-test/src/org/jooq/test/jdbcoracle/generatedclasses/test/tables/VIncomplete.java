/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VIncomplete extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord> {

	private static final long serialVersionUID = -106523190;

	/**
	 * The singleton instance of <code>TEST.V_INCOMPLETE</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.VIncomplete V_INCOMPLETE = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.VIncomplete();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord.class;
	}

	/**
	 * The column <code>TEST.V_INCOMPLETE.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> ID = createField("ID", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.DETAILS_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.TITLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * The column <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.VIncompleteRecord, java.lang.Object> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.OTHER, V_INCOMPLETE);

	/**
	 * No further instances allowed
	 */
	private VIncomplete() {
		super("V_INCOMPLETE", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
