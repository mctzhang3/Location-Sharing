package com.mzhang.locationsharing.features.locationTrack;

/**
 * Created by v579294 on 9/5/17.
 */

public class AlertMessage {
    private String messageTo;
    private String messageBody;

    public AlertMessage() {
        messageTo = null;
        messageBody = null;
    }

    public AlertMessage(String messageTo, String messageBody) {
        this.messageTo = messageTo;
        this.messageBody = messageBody;
    }

    public String getMessageTo() {
        return messageTo;
    }

    public void setMessageTo(String messageTo) {
        this.messageTo = messageTo;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
