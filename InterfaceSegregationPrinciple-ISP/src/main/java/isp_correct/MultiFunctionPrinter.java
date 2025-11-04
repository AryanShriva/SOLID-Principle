package isp_correct;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {
    @Override
    public void print(Document doc) {
        System.out.println("Printing: " + doc.getContent());
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning: " + doc.getContent());
    }

    @Override
    public void fax(Document doc) {
        System.out.println("Faxing: " + doc.getContent());
    }
}
