/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
public class uspLogError extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1625709489;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> ErrorLogID = createParameter("ErrorLogID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public uspLogError() {
		super("uspLogError", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);

		addInOutParameter(ErrorLogID);
	}

	/**
	 * Set the <code>ErrorLogID</code> parameter to the routine
	 */
	public void setErrorLogID(java.lang.Integer value) {
		setValue(ErrorLogID, value);
	}

	public java.lang.Integer getErrorLogID() {
		return getValue(ErrorLogID);
	}
}