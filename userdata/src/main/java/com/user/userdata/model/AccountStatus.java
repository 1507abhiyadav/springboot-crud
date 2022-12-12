package com.user.userdata.model;

// public class AccountStatus {
    
// }

public enum AccountStatus {

	/** The active. */
	ACTIVE("Active"),
	/** The inactive. */
	INACTIVE("Inactive"),
	/** The blocked. */
	BLOCKED("Blocked");

	/** The status. */
	private String status;

	/**
	 * Instantiates a new entity status.
	 *
	 * @param status the status
	 */
	private AccountStatus(String status) {

		this.status = status;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
}

