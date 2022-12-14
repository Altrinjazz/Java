public class _5_switch_statement {
    public static void main(String[] args) {
        int number=3;
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Invalid Number");
                break;
        }
        System.out.println();
        System.out.println("5. Switch Statement.");
        System.out.println();
        System.out.println("Switch is a multi-way branching statement.");
       System.out.println("Based on the value of an expression the control is transferred to one of the many possible points.");
       System.out.println(" If no match is there then default block is excecated.");
       System.out.println("Every case block should be terminated with a brake statement.");
    }
}
