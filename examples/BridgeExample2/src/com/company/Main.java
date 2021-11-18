package com.company;

public class Main {

    public static void main(String[] args) {
        AbstractMessageSender email = new EmailSender();
        AbstractMessageSender queue = new MsmqSender();
        AbstractMessageSender web = new WebServiceSender();

        Message message = new Message(email, "Error", "an error occured", 1);
        message.send();


        message.setMessageSender(queue);
        message.send();

        message.setMessageSender(web);
        message.send();

        UserEditedMessage userEdited = new UserEditedMessage(
                "Error",
                "An error occured",
                1,
                "Crashed when I clicked submit"
        );

        userEdited.setMessageSender(email);
        userEdited.send();
    }
}

