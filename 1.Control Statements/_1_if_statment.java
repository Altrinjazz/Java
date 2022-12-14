public class _1_if_statment {
    static int a=5;static int b=3;
     public static void main(String[] args) {
        
        if(a>b)
        {
            int t=a;
            a=b;
            b=a;
        }
        System.out.println("output is "+a+"  "+b);
        System.out.println();
        System.out.println("1. if statment");
        System.out.println();
        System.out.println("if statement is the simplest of all control statment.");
        System.out.println("it makes one way based on single condition .");
        System.out.println(" if the condition is true body of if block executed otherwise not.");
    }
}
