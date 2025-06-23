package singleResponsibility;

import OpenClosedPrinciple.EmailNotifier;
import OpenClosedPrinciple.SMSNotifier;

public class NotificationService{
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }

    public void sendNotification(EmailNotifier emailNotifier, String helloViaEmail) {
    }

    public void sendNotification(SMSNotifier smsNotifier, String helloViaSms) {
    }
}