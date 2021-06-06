package generic_database;

public class TestDatabase {
    public static void main(String[] args) {
        Database<User> db = new Database<>();
        User u1 = new User(1, "pesho");
        User u2 = new User(2, "nepesho");

        db.addToTable(u1);
        db.addToTable(u2);
        db.writeToDatabase(false);
    }
}
