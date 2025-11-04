package isp_wrong;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("ISP Violation Example");

        Machine printer = new SimplePrinter();
        printer.print(doc);

        try {
            printer.scan(doc); // This will throw an exception
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
