public class _1_if_statment {
    static int a=5;static int b=3;
     public static void main(String[] args) {
        
        if(a>b)
        {
            int t=a;
            a=b;
            b=a;
        }
    System.out.println(a+"  "+b);
    }
}
