/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "AWBuildVersion", schema = "dbo")
public class AWBuildVersion implements java.io.Serializable {

	private static final long serialVersionUID = -1171551211;

	private java.lang.Byte     SystemInformationID;
	private java.lang.String   Database_Version;
	private java.sql.Timestamp VersionDate;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "SystemInformationID", unique = true, nullable = false, precision = 3)
	public java.lang.Byte getSystemInformationID() {
		return this.SystemInformationID;
	}

	public void setSystemInformationID(java.lang.Byte SystemInformationID) {
		this.SystemInformationID = SystemInformationID;
	}

	@javax.persistence.Column(name = "Database Version", nullable = false, length = 25)
	public java.lang.String getDatabase_Version() {
		return this.Database_Version;
	}

	public void setDatabase_Version(java.lang.String Database_Version) {
		this.Database_Version = Database_Version;
	}

	@javax.persistence.Column(name = "VersionDate", nullable = false)
	public java.sql.Timestamp getVersionDate() {
		return this.VersionDate;
	}

	public void setVersionDate(java.sql.Timestamp VersionDate) {
		this.VersionDate = VersionDate;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}