package com.user.userdata.model;

public enum DetaxCardStatus {

	/** The pending. */
	ACCEPTANCE_PENDING("Acceptance Pending"),
	/** The kyc pending. */
	KYC_PENDING("Kyc Pending"),
	/** The kyc initiated. */
	KYC_INITIATED("Kyc Initiated"),
	/** The kyc under review. */
	KYC_UNDER_REVIEW("Kyc Submitted"),
	/** The kyc rejected. */
	KYC_REJECTED("Kyc Rejected"),
	/** The activation pending. */
	ACTIVATION_PENDING("Activation Pending"),
	/** The activated. */
	ACTIVATED("Activated"),
	/** The deactivated. */
	DEACTIVATED("Deactivated"),
	/** The blocked. */
	BLOCKED("Blocked"),
	/** The expired. */
	EXPIRED("Expired");

	/** The status. */
	private String status;

	/**
	 * Instantiates a new entity status.
	 *
	 * @param status the status
	 */
	private DetaxCardStatus(String status) {

		this.status = status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

}
