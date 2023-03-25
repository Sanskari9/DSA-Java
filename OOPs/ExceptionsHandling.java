class DivideByZeroException extends Exception{

}
public class ExceptionsHandling{
    public static int divide(int a, int b){
       
        return a/b;
    }
    public static void main(String [] args){
        try {
            divide(2,5);
            System.out.println("within");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Divide by Zero");
        }
        System.out.println("main");

    }
}
