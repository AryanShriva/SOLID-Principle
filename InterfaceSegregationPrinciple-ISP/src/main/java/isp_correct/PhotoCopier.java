package isp_correct;

public class PhotoCopier implements Printer, Scanner {
    @Override
    public void print(Document doc) {
        System.out.println("Printing: " + doc.getContent());
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Scanning: " + doc.getContent());
    }
}
