package com.user.userdata.model;

public enum NpsAccountStatus {

	/** The pending. */
	ACCEPTANCE_PENDING("Acceptance Pending"),
	/** The activated. */
	ACTIVATED("Activated"),
	/** The deactivated. */
	DEACTIVATED("Deactivated"),
	/** The cancelled. */
	CANCELLED("Cancelled");

	/** The status. */
	private String status;

	/**
	 * Instantiates a new entity status.
	 *
	 * @param status the status
	 */
	private NpsAccountStatus(String status) {

		this.status = status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

}
