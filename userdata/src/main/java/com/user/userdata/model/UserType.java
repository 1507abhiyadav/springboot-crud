package com.user.userdata.model;

// public class UserType {
    
// }
public enum UserType {
	/** The role ncaish admin. */
	ROLE_NCAISH_ADMIN("Ncaish Admin"),
	/** The role corporate applicant. */
	ROLE_CORPORATE_APPLICANT("Corporate Applicant"),
	/** The role corporate admin. */
	ROLE_CORPORATE_ADMIN("Corporate Admin"),
	/** The role retail investor. */
	ROLE_RETAIL_INVESTOR("Retail Investor"),
	/** The role corporate employee. */
	ROLE_CORPORATE_EMPLOYEE("Corporate Employee"),
	/** The role fx trial applicant. */
	ROLE_FX_TRIAL_APPLICANT("Trial Applicant"),
	/** The role fx trial. */
	ROLE_FX_TRIAL("Fx Trial");

	/** The type. */
	private String type;

	/**
	 * Instantiates a new user type.
	 *
	 * @param type the type
	 */
	private UserType(String type) {
		this.type = type;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
}
