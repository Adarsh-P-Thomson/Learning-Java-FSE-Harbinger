package Learning.Week_1.Design_Principles.Ex1_SingletonPattern;



public class Logger {
    private static Logger logger;
    
    private Logger(){

    }
    public static Logger getInstance(){
        if(logger==null){
            logger=new Logger();
        }
        return logger;
    }
    public void display(String str)
    {
        System.out.println(str);
    }

}
