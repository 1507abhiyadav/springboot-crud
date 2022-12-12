package com.user.userdata.model;

import lombok.Data;

// public class SalaryConfig {
    
// }
@Data
public class SalaryConfig {

	/** The mode. */
	// private ModeOfSalary mode;

	/** The salary. */
	private double salary;

	/** The basic salary. */
	private double basicSalary;

	/** The allowence. */
	private double allowance;
}
