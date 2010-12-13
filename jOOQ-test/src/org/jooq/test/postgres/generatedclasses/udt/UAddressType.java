/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt;


import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.SQLDialect;
import org.jooq.UDTField;
import org.jooq.impl.UDTFieldImpl;
import org.jooq.impl.UDTImpl;
import org.jooq.test.postgres.generatedclasses.Public;
import org.jooq.test.postgres.generatedclasses.enums.UCountry;
import org.jooq.test.postgres.generatedclasses.udt.records.UAddressTypeRecord;
import org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class UAddressType extends UDTImpl<UAddressTypeRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of u_address_type
	 */
	public static final UAddressType U_ADDRESS_TYPE = new UAddressType();

	/**
	 * The class holding records for this type
	 */
	private static final Class<UAddressTypeRecord> __RECORD_TYPE = UAddressTypeRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<UAddressTypeRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final UDTField<UAddressTypeRecord, UStreetTypeRecord> STREET = new UDTFieldImpl<UAddressTypeRecord, UStreetTypeRecord>(SQLDialect.POSTGRES, "street", UStreetTypeRecord.class, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final UDTField<UAddressTypeRecord, String> ZIP = new UDTFieldImpl<UAddressTypeRecord, String>(SQLDialect.POSTGRES, "zip", String.class, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final UDTField<UAddressTypeRecord, String> CITY = new UDTFieldImpl<UAddressTypeRecord, String>(SQLDialect.POSTGRES, "city", String.class, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final UDTField<UAddressTypeRecord, UCountry> COUNTRY = new UDTFieldImpl<UAddressTypeRecord, UCountry>(SQLDialect.POSTGRES, "country", UCountry.class, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final UDTField<UAddressTypeRecord, Date> SINCE = new UDTFieldImpl<UAddressTypeRecord, Date>(SQLDialect.POSTGRES, "since", Date.class, U_ADDRESS_TYPE);

	/**
	 * An uncommented item
	 */
	public static final UDTField<UAddressTypeRecord, Integer> CODE = new UDTFieldImpl<UAddressTypeRecord, Integer>(SQLDialect.POSTGRES, "code", Integer.class, U_ADDRESS_TYPE);

	/**
	 * No further instances allowed
	 */
	private UAddressType() {
		super(SQLDialect.POSTGRES, "u_address_type", Public.PUBLIC);
	}
}
