package DependenctyInversionPrinciple.dipFriendly;


public class MySQLDatabase implements App.Database{
        public void connect() {
            System.out.println("Connected to MySQL");
        }
    }

    