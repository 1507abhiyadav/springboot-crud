package com.user.userdata.model;

// public class NcaishAdd {
    
// }
// import javax.validation.constraints.NotBlank;
// import javax.validation.constraints.Pattern;
// import javax.validation.constraints.Size;

// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// /**
//  * To string.
//  *
//  * @return the java.lang. string
//  */
// @Data

// /**
//  * Instantiates a new ncaish address info.
//  */
// @NoArgsConstructor

// /**
//  * Instantiates a new ncaish address info.
//  *
//  * @param address the address
//  * @param country the country
//  * @param state   the state
//  * @param city    the city
//  * @param pinCode the pin code
//  */
// @AllArgsConstructor
// public class NcaishAddressInfo {

// 	/** The address. */
// 	@NotBlank(message = "Address can't be null or empty")
// 	@Size(max = 200, message = "Address can't have more than 200 chars")
// 	@Pattern(regexp = "^[-a-zA-Z0-9._&,';:()!#/\\s-]+", message = "Invalid address.only (._&,';:!#/) special chars are allowed")
// 	private String address;

// 	/** The country. */
// 	@NotBlank(message = "Country can't be null or empty")
// 	@Size(max = 30, message = "Country can't have more than 30 chars")
// 	@Pattern(regexp = "^[-a-zA-Z\\s]+", message = "Country can't have special chars and numbers")
// 	private String country;

// 	/** The state. */
// 	@NotBlank(message = "State can't be null or empty")
// 	@Size(max = 30, message = "state can't have more than 30 chars")
// 	@Pattern(regexp = "^[-a-zA-Z\\s]+", message = "State can't have special chars and numbers")
// 	private String state;

// 	/** The city. */
// 	@NotBlank(message = "City should't be null or empty")
// 	@Pattern(regexp = "^[a-zA-Z\\s]+", message = "City can't have special chars and numbers")
// 	@Size(max = 80, message = "city can't have more than 80 chars")
// 	private String city;

// 	/** The pin code. */
// 	@NotBlank(message = "PinCode can't be null or empty")
// 	@Pattern(regexp = "^\\d{6}$", message = "Pincode should have 6 digits")
// 	private String pinCode;

// 	@Override
// 	public String toString() {
// 		return address + country + state + city + pinCode;
// 	}

// }

