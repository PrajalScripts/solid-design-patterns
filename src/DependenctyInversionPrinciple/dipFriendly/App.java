package DependenctyInversionPrinciple.dipFriendly;

public class App {
private final Database db;

public App(Database db) {
    this.db = db;
}

public void start() {
    db.connect();
}



public static class MongoDBDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MongoDB");
    }
}

    static interface Database {
        void connect();
    }
}
