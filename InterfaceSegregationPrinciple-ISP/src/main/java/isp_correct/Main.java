package isp_correct;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document("ISP Correct Example");

        Printer printer = new SimplePrinter();
        printer.print(doc);

        PhotoCopier copier = new PhotoCopier();
        copier.scan(doc);

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.fax(doc);
    }
}
