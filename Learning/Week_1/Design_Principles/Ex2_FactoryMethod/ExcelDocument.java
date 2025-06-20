package Learning.Week_1.Design_Principles.Ex2_FactoryMethod;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel document...");
    }
}