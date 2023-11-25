package org.wgcodecompany.atmProject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerMainPage extends CustomerAccount{
    Scanner userMoneyInput = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat(" '$'###,##0.00");
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public void getLogin() throws IOException {
        int x = 1;

        do {
            try {
                data.put(1234,2233);
                data.put(5678,4455);

                System.out.println("Welcome to the Bank Project user login");
                System.out.println("Please enter customer ID number:"); // has to be one of the numbers from the first half of the HashMap  so either 1234/5678

                setCustomerIDNumber(userMoneyInput.nextInt());

                System.out.println("Please enter your 4-digit PIN:");
                setPinNumber(userMoneyInput.nextInt());
            }catch (Exception error){
                System.out.println("\n" + "Invalid input from user. Only number accepted." + "\n");
                x = 2;
            }

            int customerIdNumber = getCustomerIDNumber();
            int pinNumber = getPinNumber();

            if (data.containsKey(customerIdNumber) && data.get(customerIdNumber) == pinNumber){
                getAccountType();
            }else
                System.out.println("Incorrect Customer ID/Pin" + "\n");
        } while (x ==1);
//These are all basic validation checks above

    }
        public void getAccountType(){
            System.out.println("Please select which account you want to access:");
            System.out.println("Enter 1: Checking Account");
            System.out.println("Enter 2: Saving's Account");
            System.out.println("Enter 3: Exit");

            int selection = userMoneyInput.nextInt();

            switch (selection) {
                case 1:
                    getChecking();
                    break;

                case 2:
                    getSavings();
                    break;

                case 3:
                    System.out.println("Thank you! Please come again, goodbye! \n");
                    break;

                default:
                    System.out.println("Invalid selection" + "\n");
            }
    }

    private void getChecking() {
        System.out.println("Your Checking Account:");
        System.out.println("Select 1: - View Chceking Balance");
        System.out.println("Select 2: - Withdraw Funds from Checking Account");
        System.out.println("Select 3: Deposit Funds into Checking Account");
        System.out.println("Select 4: Exit Checking Account");
        System.out.println("Selection: ");

        int checkingSelection = userMoneyInput.nextInt();

        switch (checkingSelection){
            case 1:
                System.out.println("Checking Account Balance" + moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;

            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;

            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM, goodbye");

            default:
                System.out.println("\n" + "Invalid selection "+"\n");
                getChecking();
        }
    }
    private void getSavings() {
        System.out.println("Your Savings Account:");
        System.out.println("Select 1: - View Savings Balance");
        System.out.println("Select 2: - Withdraw Funds from Savings Account");
        System.out.println("Select 3: Deposit Funds into Savings Account");
        System.out.println("Select 4: Exit Savings Account");
        System.out.println("Selection : ");

        int savingsSelection = userMoneyInput.nextInt();

        switch (savingsSelection){
            case 1:
                System.out.println("Checking Account Balance" + moneyFormat.format(getSavingsBalance()));
                getAccountType();
                break;

            case 2:
                getSavingsWithdrawInput();
                getAccountType();
                break;

            case 3:
                getSavingsDepositInput();
                getAccountType();
                break;

            case 4:
                System.out.println("Thank you for using this ATM, goodbye");

            default:
                System.out.println("\n" + "Invalid selection "+"\n");
                getChecking();
        }
    }
}
