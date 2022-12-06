package com.example.demoruleengine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MessageContent {

    private String ownerName;
    private String cardNumber;
    private String expireMonth;
    private String expireYear;
    private String securityCode;
    private String currency;
    private String amount;

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public String getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(String expireYear) {
        this.expireYear = expireYear;
    }

    public static boolean onlyDigits(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static boolean compareDates(String expireMonth, String expireYear) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yyyy");
        simpleDateFormat.setLenient(false);
        Date expiry = simpleDateFormat.parse(expireMonth + "/" + expireYear);
        boolean expired = expiry.before(new Date());
        if (expired == true) {
            return false;
        }
        return true;
    }
}
