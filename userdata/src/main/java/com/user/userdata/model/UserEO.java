package com.user.userdata.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
// public class User {
    
//     @Id
//     private String objectId;
//     // private String email;
//     private Boolean accountNonLocked;
//     private long lockedAt;
//     private Integer loginAttempts;
   
    
// }
// @AllArgsConstructor
public class UserEO extends BaseEntity {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The person id. */
	private String personId;

	/** The name. */
	private String name;

	/** The email. */
	private String email;

	/** The mobile. */
	private String mobile;

	/** The gender. */
	// private Gender gender;

	/** The profile img. */
	private String profileImg;

	/** The designation. */
	private String designation;

	/** The dob. */
	private String dob;

	private String newDob;

	/** The doj. */
	private String doj;

	private String newDoj;

	/** The verification. */
	// private AccountVerification verification;

	/** The role id. */
	private String roleId;

	/** The user types. */
	private UserType userType;

	/** The address. */
	// private NcaishAddressInfo address;

	/** The status. */
	private AccountStatus status = AccountStatus.ACTIVE;

	/** The salary info. */
	private SalaryConfig salaryInfo;

	/** The password. */
	private String password;

	/** The app id. */
	private String appId;

	/** The corp id. */
	private String cid;

	/** The detax card status. */
	private DetaxCardStatus detaxCardStatus;

	/** The nps status. */
	private NpsAccountStatus npsStatus;

	/** The init pass changed. */
	private boolean initPassChanged;

	private List<NcaishServicesType> services;

	private List<String> passwordHistory;

	private boolean accountNonLocked;

	private long lockedAt;

	private int loginAttempts;

	private boolean switchAccount;

	private long lastFailedAttempt;
}