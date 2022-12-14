/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package type_variable;

/**
 *
 * @author hilbe
 */
public class addition implements  generic_additon_interface {
    int inst_no1;
    int inst_no2;
   static String name="gavaskar";
   addition()
   {
       inst_no1=20;
       inst_no2=30;
       int sum=inst_no1+inst_no2;
       System.out.println("The sum of 20 and 30 is"+ sum);
   }
   addition(int num1,int num2)
   {
     int  sum=num1+num2;
     System.out.println("The addition of two number is "+ sum);
   }
    public void addnumbers()
    {
        int no1=10;
        int no2=10;
        int sum=no1+no2;
        System.out.println("The sum is "+ sum);
    }
    public void addition(int num1,int num2)
    {
        int sum=num1+num2;
        System.out.println("The sum of 20 and 30 is"+ sum);
    }
    public void addnumbers_instance()
    {
        int sum=inst_no1+inst_no2;
        System.out.println("The sum is "+ sum);
    }

    @Override
    public void addthreenumbers() {
       int no1=20;
      int no2=30;
     int no3=40;
     int sum=no1+no2+no3;
     System.out.println("The sum on three numbers is "+sum);
    }

    @Override
    public void addStringnumbers(String num1, String num2) {
       int no1=Integer.parseInt(num1);
      int no2=Integer.parseInt(num2);
      int sum=no1+no2;
      System.out.println("The Sum of two string number form abstract class is"+sum);
    }
}
