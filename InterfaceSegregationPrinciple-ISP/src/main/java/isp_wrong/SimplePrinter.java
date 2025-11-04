package isp_wrong;

public class SimplePrinter implements Machine {

    @Override
    public void print(Document doc) {
        System.out.println("Printing: " + doc.getContent());
    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported by SimplePrinter");
    }

    @Override
    public void fax(Document doc) {
        throw new UnsupportedOperationException("Fax not supported by SimplePrinter");
    }
}
