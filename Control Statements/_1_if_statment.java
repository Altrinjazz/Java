public class _1_if_statment {
    static int a=5;static int b=3;
     public static void main(String[] args) {
        
        if(a>b)
        {
            int t=a;
            a=b;
            b=a;
        }
    
    System.out.println("if statement is the simplest of all control statment.it makes one way based on single condition . if the condition is true body of if block executed otherwise not.");
    System.out.println("output is "+a+"  "+b);
    }
}
