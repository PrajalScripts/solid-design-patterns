import DependenctyInversionPrinciple.dipFriendly.App;
import DependenctyInversionPrinciple.dipFriendly.MySQLDatabase;
import InterfaceSegregationPrinciple.ispComplaint.Eatable;
import InterfaceSegregationPrinciple.ispComplaint.Human;
import InterfaceSegregationPrinciple.ispComplaint.Workable;
import LiskovSubstitution.Sparrow;
import LiskovSubstitution.Zoo;
import OpenClosedPrinciple.*;
import OpenClosedPrinciple.SMSNotifier;
import singleResponsibility.NotificationService;
import DependenctyInversionPrinciple.*;

import java.awt.*;


public class Main {
        public static void main(String[] args) {

            // OCP Test
            System.out.println("OCP:");
            NotificationService ocpService = new NotificationService();
            ocpService.sendNotification(new EmailNotifier(), "Hello via Email");
            ocpService.sendNotification(new SMSNotifier(), "Hello via SMS");

            // LSP Test
            System.out.println("\nLSP:");
            Zoo.makeBirdFly(new Sparrow());
            // Zoo.makeBirdFly(new Ostrich()); // Uncommenting this would cause a compiler error — safe!

            // ISP Test
            System.out.println("\nISP:");
            Workable humanWorker = new Human();
            humanWorker.work();
            Eatable humanEater = new Human();
            humanEater.eat();
            Workable robotWorker = new Human();
            robotWorker.work();

            // DIP Test
            System.out.println("\nDIP:");
            App app1 = new App(new MySQLDatabase());
            app1.start();
            App app2 = new App(new App.MongoDBDatabase());
            app2.start();
        }
    }
    