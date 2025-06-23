package DependenctyInversionPrinciple.voilation;

class App {
    private MySQLDatabase db = new MySQLDatabase();

    public void start() {
        db.connect();
    }
}
