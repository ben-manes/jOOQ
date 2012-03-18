/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductReview", schema = "Production")
public class ProductReview implements java.io.Serializable {

	private static final long serialVersionUID = -623037092;

	private java.lang.Integer  ProductReviewID;
	private java.lang.Integer  ProductID;
	private java.lang.String   ReviewerName;
	private java.sql.Timestamp ReviewDate;
	private java.lang.String   EmailAddress;
	private java.lang.Integer  Rating;
	private java.lang.String   Comments;
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductReviewID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductReviewID() {
		return this.ProductReviewID;
	}

	public void setProductReviewID(java.lang.Integer ProductReviewID) {
		this.ProductReviewID = ProductReviewID;
	}

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "ReviewerName", nullable = false, length = 50)
	public java.lang.String getReviewerName() {
		return this.ReviewerName;
	}

	public void setReviewerName(java.lang.String ReviewerName) {
		this.ReviewerName = ReviewerName;
	}

	@javax.persistence.Column(name = "ReviewDate", nullable = false)
	public java.sql.Timestamp getReviewDate() {
		return this.ReviewDate;
	}

	public void setReviewDate(java.sql.Timestamp ReviewDate) {
		this.ReviewDate = ReviewDate;
	}

	@javax.persistence.Column(name = "EmailAddress", nullable = false, length = 50)
	public java.lang.String getEmailAddress() {
		return this.EmailAddress;
	}

	public void setEmailAddress(java.lang.String EmailAddress) {
		this.EmailAddress = EmailAddress;
	}

	@javax.persistence.Column(name = "Rating", nullable = false, precision = 10)
	public java.lang.Integer getRating() {
		return this.Rating;
	}

	public void setRating(java.lang.Integer Rating) {
		this.Rating = Rating;
	}

	@javax.persistence.Column(name = "Comments", length = 3850)
	public java.lang.String getComments() {
		return this.Comments;
	}

	public void setComments(java.lang.String Comments) {
		this.Comments = Comments;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}