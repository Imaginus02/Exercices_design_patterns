package com.goodExample.sender;

public class MsmqSender extends AbstractMessageSender {
    @Override
    public void sendMessage(String title, String body, int importance) {
        System.out.println("MSMQ : " + title + "\n" + body + "\nImportance : " + importance + "\n\n");
    }
}
