/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package type_variable;

/**
 *
 * @author hilbe
 */
public class special_addition implements addition_float,addition_double{
   public void addnumbers()
   {
       float num1=10f;
       float num2=30f;
       float sum=num1 + num2;
       System.out.println("The sum in special class is"+sum);
   }

    @Override
    public void float_addition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void double_addition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
