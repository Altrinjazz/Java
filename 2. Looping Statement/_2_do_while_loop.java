public class _2_do_while_loop {
    public static void main(String[] args) {
        int i=1,sum=0;
       do
        {
            sum=sum+1;
            i++;
        }
        while(i<10);
        System.out.println("output is "+sum);
        System.out.println();
        System.out.println("2. Do While Loop");
        System.out.println();
        System.out.println("Do while is known as exit cheek loop because the condition is checked at the end of the body.");
        System.out.println("This loop executes the body at least once even the condition is false.");
    }
}
