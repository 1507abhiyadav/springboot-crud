package com.user.userdata.model;

// public class data {
    
// }
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: Auto-generated Javadoc
/**
 * To string.
 *
 * @return the java.lang. string
 */

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * Instantiates a new account verification.
 *
 * @param mobile the mobile
 * @param email  the email
 * @param aadhar the aadhar
 */

/**
 * Instantiates a new account verification.
 *
 * @param mobile the mobile.
 * @param email  the email.
 * @param aadhar the aadhar.
 */
@AllArgsConstructor

/**
 * Instantiates a new account verification.
 */

/**
 * Instantiates a new account verification.
 */
@NoArgsConstructor
public class AccountVerification {

	/** The mobile. */
	private boolean mobile;

	/** The email. */
	private boolean email;

	/** The aadhar. */
	private boolean aadhar;

	/**
	 * Instantiates a new account verification.
	 *
	 * @param mobile the mobile.
	 * @param email  the email.
	 */
	public AccountVerification(boolean mobile, boolean email) {
		this.mobile = mobile;
		this.email = email;
	}
}

