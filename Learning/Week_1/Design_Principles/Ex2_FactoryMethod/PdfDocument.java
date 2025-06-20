package Learning.Week_1.Design_Principles.Ex2_FactoryMethod;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF document...");
    }
}