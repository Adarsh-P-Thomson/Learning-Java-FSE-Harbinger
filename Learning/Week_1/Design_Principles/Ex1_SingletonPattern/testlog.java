package Learning.Week_1.Design_Principles.Ex1_SingletonPattern;

public class testlog {
public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.display("Hello from logger1");
        logger2.display("Hello from logger2");

        System.out.println(logger1 == logger2);
    }
}
