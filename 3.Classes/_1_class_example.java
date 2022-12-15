import java.io.*;
public class _1_class_example {
    int num1,num2,sum;
    void Int_num( int n1,int n2)
    {
        num1=n1;
        num2=n2;
    }
    void _1_class_example_num()
    {
        sum=num1+num2;
    }
    void print_num()
    {
        System.out.println("Num 1 ="+num1);
        System.out.println("Num 2 ="+num2);
        System.out.println("Sum ="+sum);
        System.out.println("class example program");
    }
}
class MAIN_CLASS
{
    public static void main(String[] args) {
        _1_class_example obb=new _1_class_example();
        obb.Int_num( 10,20);
        obb._1_class_example_num();
        obb.print_num();
    }
}
