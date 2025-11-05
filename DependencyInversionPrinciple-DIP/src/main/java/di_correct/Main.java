package di_correct;

// Abstraction
interface Database {
    void save(String data);
}

// Low-level module 1
class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}

// Low-level module 2
class MongoDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving data to MongoDB: " + data);
    }
}

// High-level module
class OrderService {
    private Database database; // depends on abstraction, not concrete class

    // Dependency Injection via constructor
    public OrderService(Database database) {
        this.database = database;
    }

    public void saveOrder() {
        database.save("Order data");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Database mysql = new MySQLDatabase();
        OrderService mysqlService = new OrderService(mysql);
        mysqlService.saveOrder();

        Database mongo = new MongoDatabase();
        OrderService mongoService = new OrderService(mongo);
        mongoService.saveOrder();
    }
}
