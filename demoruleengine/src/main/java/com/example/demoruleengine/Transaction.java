package com.example.demoruleengine;

public class Transaction {
    private Tenant tenant;
    private String messageType;
    private MessageContent messageContent;
    private boolean cardNumberValidation;
    private boolean expirationDateValidation;
    private boolean securityCodeValidation;

    public boolean getExpirationDateValidation() {
        return expirationDateValidation;
    }

    public void setExpirationDateValidation(boolean expirationDateValidation) {
        this.expirationDateValidation = expirationDateValidation;
    }

    public boolean getSecurityCodeValidation() {
        return securityCodeValidation;
    }

    public void setSecurityCodeValidation(boolean securityCodeValidation) {
        this.securityCodeValidation = securityCodeValidation;
    }

    public boolean getCardNumberValidation() {
        return cardNumberValidation;
    }
    public void setCardNumberValidation(boolean cardNumberValidation) {
        this.cardNumberValidation = cardNumberValidation;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

  public MessageContent getMessageContent() {
        return messageContent;
  }

  public void setMessageContent(MessageContent messageContent) {
        this.messageContent = messageContent;
  }

  public String getMessageType() {
        return messageType;
  }

  public void setMessageType(String messageType) {
        this.messageType = messageType;
  }
}
