package Learning.Week_1.Design_Principles.Ex2_FactoryMethod;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word document...");
    }
}