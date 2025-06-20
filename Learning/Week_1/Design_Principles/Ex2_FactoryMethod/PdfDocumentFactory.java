package Learning.Week_1.Design_Principles.Ex2_FactoryMethod;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}