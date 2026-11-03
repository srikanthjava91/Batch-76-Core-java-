package com.oops.loanapp;

public class HomeLoan extends Loan {

	public static void main(String[] args) {

		HomeLoan hl = new HomeLoan();

		if (hl.getEmployeeSalary() > 500000.00 && hl.getCibiliScore() >= 300 && hl.getCibiliScore() <= 900) {
			System.out.println("Lets check more details for Home Loan ");

			if (hl.isAadharValid() && hl.isPanValid() && hl.isPhoneValid()) {
				System.out.println("Congrulations Your Home Loan got apporved : ");
				System.out.println("Home Loan ROI is : " + hl.getROI());
			} else {
				System.out.println("Something Went wrong !");
			}

		} else {
			System.out.println("HOme Loan got rejected ");
		}

	}

}
