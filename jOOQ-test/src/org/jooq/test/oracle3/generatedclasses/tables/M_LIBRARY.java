/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * snapshot table for snapshot TEST.M_LIBRARY
 */
@java.lang.SuppressWarnings("all")
public class M_LIBRARY extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.M_LIBRARY> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -2108181158;

	/**
	 * The singleton instance of TEST.M_LIBRARY
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY M_LIBRARY = new org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.M_LIBRARY> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.M_LIBRARY.class;
	}

	/**
	 * The table column <code>TEST.M_LIBRARY.AUTHOR</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.M_LIBRARY, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>TEST.M_LIBRARY.TITLE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.M_LIBRARY, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	public M_LIBRARY() {
		super("M_LIBRARY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public M_LIBRARY(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY.M_LIBRARY);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.M_LIBRARY(alias);
	}
}