package com.sapient.exception;

//by externding the class from Exception class,
//you give an oppurtunity to throw that class
class MinimumLengthException extends Exception {
	private String message;

	public MinimumLengthException() {
		this.message = "Sorry minimal name";
	}

	public MinimumLengthException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MinimalSalary Exception = " + message;
	}
}

class MinimalSalaryException extends Exception {
	private String message;

	public MinimalSalaryException() {
		this.message = "Sorry minimal salary";
	}

	public MinimalSalaryException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MinimalSalary Exception = " + message;
	}
}

public class ExceptionExample02 {

	public static void processIncomeTax(String name, int salary) throws MinimumLengthException, MinimalSalaryException {

		if (name.length() < 5) {
			throw new MinimumLengthException("Invalid name");
		}
		if (salary < 10000) {
			// wrong case
			throw new RuntimeException("Sorry Invalid Salary for " + name);
		} else if (salary >= 10000 && salary < 20000) {
			// minimal wages
			throw new MinimalSalaryException("Sorry minimal salary given of " + salary + "Mr/Mrs" + name);
		} else {
			System.out.println("Thank you its being filed " + name);
		}
	}

	public static void main(String[] args) {
		try {
			processIncomeTax("Saa", 15000);

		} catch (MinimumLengthException e) {
			System.out.println("Sorry");

		} catch (MinimalSalaryException mse) {
			System.out.println("Sorry");

		}
	}
}
