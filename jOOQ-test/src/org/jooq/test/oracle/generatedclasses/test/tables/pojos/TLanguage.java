/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_LANGUAGE", schema = "TEST")
public class TLanguage implements java.io.Serializable {

	private static final long serialVersionUID = 239555792;


	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 2)
	private java.lang.String  cd;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String  description;

	@javax.validation.constraints.Size(max = 50)
	private java.lang.String  descriptionEnglish;

	@javax.validation.constraints.NotNull
	private java.lang.Integer id;

	@javax.persistence.Column(name = "CD", nullable = false, length = 2)
	public java.lang.String getCd() {
		return this.cd;
	}

	public void setCd(java.lang.String cd) {
		this.cd = cd;
	}

	@javax.persistence.Column(name = "DESCRIPTION", length = 50)
	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	@javax.persistence.Column(name = "DESCRIPTION_ENGLISH", length = 50)
	public java.lang.String getDescriptionEnglish() {
		return this.descriptionEnglish;
	}

	public void setDescriptionEnglish(java.lang.String descriptionEnglish) {
		this.descriptionEnglish = descriptionEnglish;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}
}