package di_wrong;

// High-level module directly depends on low-level module
class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}

class OrderService {
    private MySQLDatabase database = new MySQLDatabase(); // tightly coupled

    public void saveOrder() {
        database.save("Order data");
    }
}

public class Main {
    public static void main(String[] args) {
        OrderService service = new OrderService();
        service.saveOrder();
    }
}
