public class _4_if_else_if_lader {
    public static void main(String[] args) {
        int mark=77;char grade;
        if(mark==95)
        {
            grade='S';
           System.out.println("output is  "+grade);
        }
        else if(mark>=90)
        {
            grade='A';
           System.out.println("output is  "+grade);
        }
        else if(mark>=80)
        {
            grade='B';
           System.out.println("output is  "+grade);
        }
        else if(mark>=70)
        {
            grade='C';
           System.out.println("output is  "+grade);
        }
        else if(mark>=60)
        {
            grade='D';
           System.out.println("output is  "+grade);
        }
        else if(mark>=50)
        {
            grade='E';
           System.out.println("output is  "+grade);
        }
        else 
        {
            grade='U';
            System.out.println("output is  "+grade);
        }
        System.out.println();
        System.out.println("4. else if ladder.");
        System.out.println();
        System.out.println("In an nested if....else statement if each block is associated with else block then it is known as else if ladder.");
    }
}
