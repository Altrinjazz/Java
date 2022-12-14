/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package type_variable;

/**
 *
 * @author hilbe
 */
public abstract class generic_addition {
   public abstract void addthreenumbers();
   public  void addStringnumbers(String num1,String num2)
   {
      int no1=Integer.parseInt(num1);
      int no2=Integer.parseInt(num2);
      int sum=no1+no2;
      System.out.println("The Sum of two string number form abstract class is"+sum);
   }
}
