/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UStreetType extends org.jooq.impl.UDTImpl<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord> {

	private static final long serialVersionUID = 1813957313;

	/**
	 * The singleton instance of <code>public.u_street_type</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.udt.UStreetType U_STREET_TYPE = new org.jooq.test.postgres.generatedclasses.udt.UStreetType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord.class;
	}

	/**
	 * The attribute <code>public.u_street_type.street</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord, java.lang.String> STREET = createField("street", org.jooq.impl.SQLDataType.VARCHAR.length(100), U_STREET_TYPE);

	/**
	 * The attribute <code>public.u_street_type.no</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord, java.lang.String> NO = createField("no", org.jooq.impl.SQLDataType.VARCHAR.length(30), U_STREET_TYPE);

	/**
	 * The attribute <code>public.u_street_type.floors</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord, java.lang.Integer[]> FLOORS = createField("floors", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), U_STREET_TYPE);

	/**
	 * The attribute <code>public.u_street_type.f_1323</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord, byte[]> F_1323 = createField("f_1323", org.jooq.impl.SQLDataType.BLOB, U_STREET_TYPE);

	/**
	 * No further instances allowed
	 */
	private UStreetType() {
		super("u_street_type", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		// Initialise data type
		getDataType();
	}
}
