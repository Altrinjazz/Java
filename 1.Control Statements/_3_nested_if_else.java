public class _3_nested_if_else {
    public static void main(String[] args) {
        int a=77, b=33, c=37, max;
        if(a>b)
        {
            if(a>c)
            {
                max=a;
                System.out.println("output is  "+max);
            }
            else
            {
                max=c;
                System.out.println("output is  "+max);
            }
        }
        else
        {
            if(b>c)
            {
                max=b;
                System.out.println("output is  "+max);
            }
            else
            {
                max=c;
                System.out.println("output is  "+max);
            }
        }
        System.out.println();
        System.out.println("3. Nested if else statement.");
        System.out.println();
        System.out.println("An if or if....else statement can be placed inside another if...else statement.");
        System.out.println("This is known as if...else statement. ");
        System.out.println("These are used when a series of decision are involved.");
    }
}
