/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaLanguage extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> {

	private static final long serialVersionUID = 78439665;

	/**
	 * The singleton instance of <code>sakila.language</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SakilaLanguage LANGUAGE = new org.jooq.examples.mysql.sakila.tables.SakilaLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord.class;
	}

	/**
	 * The column <code>sakila.language.language_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord, java.lang.Byte> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.language.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.CHAR.length(20), this);

	/**
	 * The column <code>sakila.language.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.language</code> table reference
	 */
	public SakilaLanguage() {
		super("language", org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.language</code> table reference
	 */
	public SakilaLanguage(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.SakilaSakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SakilaLanguage.LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord, java.lang.Byte> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_LANGUAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.SakilaLanguageRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_LANGUAGE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SakilaLanguage as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SakilaLanguage(alias);
	}
}
