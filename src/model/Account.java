package model;

import java.util.List;

/**
 * Created by Hamid on 6/4/2017.
 */
public class Account {

   private String actionCode="";
   private String accountNumber="";
   private String IBAN="";
   private String messageSequence="";
   private String accountType="";
   private String balance="";
   private String pin="";
   private String newPin="";
   private String callerID="";
   private String requestToSwitch="";
   private String responseFromSwitch="";
   private String startDateOfFax="";
   private String endDateOfFax="";
   private String destinationAccount="";
   private String amountOfTransfer="";
   private String transferType="";
   private String referenceCode="";
   private String installmentStatus="";
   private String finalResult="";
   private String mobileNumber="";
   private String kindOfPOSTransaction="";
   private String chequeNumber="";
   private String familyName="";
   private String ShetabNumber="";
   private List<Transaction> transactions;
   private List<TransactionPOS> transactionsPOS;
   private int kindOfFax;
   private int faxCount;



    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMessageSequence() {
        return messageSequence;
    }

    public void setMessageSequence(String messageSequence) {
        this.messageSequence = messageSequence;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCallerID() {
        return callerID;
    }

    public void setCallerID(String callerID) {
        this.callerID = callerID;
    }

    public String getRequestToSwitch() {
        return requestToSwitch;
    }

    public void setRequestToSwitch(String requestToSwitch) {
        this.requestToSwitch = requestToSwitch;
    }

    public String getResponseFromSwitch() {
        return responseFromSwitch;
    }

    public void setResponseFromSwitch(String responseFromSwitch) {
        this.responseFromSwitch = responseFromSwitch.trim();
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getKindOfFax() {
        return kindOfFax;
    }

    public void setKindOfFax(int kindOfFax) {
        this.kindOfFax = kindOfFax;
    }

    public int getFaxCount() {
        return faxCount;
    }

    public void setFaxCount(int faxCount) {
        this.faxCount = faxCount;
    }

    public String getStartDateOfFax() {
        return startDateOfFax;
    }

    public void setStartDateOfFax(String startDateOfFax) {
        this.startDateOfFax = startDateOfFax;
    }

    public String getEndDateOfFax() {
        return endDateOfFax;
    }

    public void setEndDateOfFax(String endDateOfFax) {
        this.endDateOfFax = endDateOfFax;
    }

    public String getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(String destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public String getAmountOfTransfer() {
        return amountOfTransfer;
    }

    public void setAmountOfTransfer(String amountOfTransfer) {
        this.amountOfTransfer = amountOfTransfer;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    public void setReferenceCode(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getNewPin() {
        return newPin;
    }

    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }

    public String getInstallmentStatus() {
        return installmentStatus;
    }

    public void setInstallmentStatus(String installmentStatus) {
        this.installmentStatus = installmentStatus;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<TransactionPOS> getTransactionsPOS() {
        return transactionsPOS;
    }

    public void setTransactionsPOS(List<TransactionPOS> transactionsPOS) {
        this.transactionsPOS = transactionsPOS;
    }

    public String getKindOfPOSTransaction() {
        return kindOfPOSTransaction;
    }

    public void setKindOfPOSTransaction(String kindOfPOSTransaction) {
        this.kindOfPOSTransaction = kindOfPOSTransaction;
    }

    public String getChequeNumber() {
        return chequeNumber;
    }

    public void setChequeNumber(String chequeNumber) {
        this.chequeNumber = chequeNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getShetabNumber() {
        return ShetabNumber;
    }

    public void setShetabNumber(String shetabNumber) {
        ShetabNumber = shetabNumber;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
}