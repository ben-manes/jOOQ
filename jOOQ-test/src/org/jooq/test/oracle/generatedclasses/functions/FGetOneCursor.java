/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class FGetOneCursor extends org.jooq.impl.StoredFunctionImpl<org.jooq.Result<org.jooq.Record>> {

	private static final long serialVersionUID = 304134245;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> BOOK_IDS = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord>("BOOK_IDS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new function call instance
	 */
	public FGetOneCursor() {
		super(org.jooq.SQLDialect.ORACLE, "F_GET_ONE_CURSOR", org.jooq.test.oracle.generatedclasses.Test.TEST, org.jooq.impl.SQLDataType.RESULT);

		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter to the function
	 */
	public void setBookIds(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord value) {
		setValue(BOOK_IDS, value);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setBookIds(org.jooq.Field<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> field) {
		setField(BOOK_IDS, field);
	}
}
