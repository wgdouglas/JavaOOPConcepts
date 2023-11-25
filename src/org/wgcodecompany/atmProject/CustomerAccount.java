package org.wgcodecompany.atmProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CustomerAccount {

    private int customerIDNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingsBalance = 0;

    Scanner userInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int setCustomerIDNumber(int customerIDNumber){
        this.customerIDNumber = customerIDNumber;
        return customerIDNumber;
    }

    public int getCustomerIDNumber(){
        return customerIDNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Amount you want to withdraw from Checking Account");
        double enteredAmount = userInput.nextDouble();

        if ((checkingBalance - enteredAmount) >=0){
            calculateCheckingWithdraw(enteredAmount);
            System.out.println("New checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance Cannot be overdrawn or negative." + "\n");
        }
    }
    public void getCheckingDepositInput(){
        System.out.println("Amount you want to withdraw from Checking Account");
        double enteredAmount = userInput.nextDouble();

        if ((checkingBalance + enteredAmount) >=0){
            calculateCheckingDeposit(enteredAmount);
            System.out.println("New checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance Cannot be overdrawn or negative." + "\n");
        }
    }

    public void getSavingsWithdrawInput(){
        System.out.println("Saving Account Balance: " +moneyFormat.format(savingsBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double enteredAmount = userInput.nextDouble();

        if ((savingsBalance - enteredAmount) >= 0){
            calculateSavingsWithdraw(enteredAmount);
            System.out.println("New saving account balance: " + moneyFormat.format(savingsBalance));
        } else {
            System.out.println("Balance Cannot be overdrawn or negative." + "\n");
        }
    }
    public void getSavingsDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingsBalance));
        System.out.println("Amount you want to deposit from Saving Account: ");
        double enteredAmount = userInput.nextDouble();

        if ((savingsBalance + enteredAmount) >= 0){
            calculateSavingsDeposit(enteredAmount);
            System.out.println("New saving account balance: " + moneyFormat.format(savingsBalance));
        } else {
            System.out.println("Balance Cannot be overdrawn or negative." + "\n");
        }
    }



    public double calculateSavingsDeposit(double enteredAmount) {
        savingsBalance = (savingsBalance + enteredAmount);
        return savingsBalance;
    }
    public double calculateSavingsWithdraw(double enteredAmount) {
        savingsBalance = (savingsBalance - enteredAmount);
        return savingsBalance;
    }

    public double calculateCheckingDeposit(double enteredAmount){
        checkingBalance += enteredAmount;
        return checkingBalance;
    }
    public double calculateCheckingWithdraw(double enteredAmount){
        checkingBalance -= enteredAmount;
        return checkingBalance;
    }
}
