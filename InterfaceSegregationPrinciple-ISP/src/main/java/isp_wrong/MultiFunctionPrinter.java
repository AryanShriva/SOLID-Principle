package isp_wrong;

public class MultiFunctionPrinter implements Machine {
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
