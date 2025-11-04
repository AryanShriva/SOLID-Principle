package lsp_wrong;

public class Main {
    public static void main(String[] args) {
        Rectangle rect = new Square(); // LSP violated here
        rect.setWidth(5);
        rect.setHeight(10);

        System.out.println("Expected area = 50");
        System.out.println("Actual area = " + rect.getArea());
    }
}
