/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package exception;

/**
 *
 * @author hilbe
 */
import java.lang.Exception;
public class division {
    void divide()
    {
       try
        {
        int numerator=20;
        int denominator=0;
        int value=numerator/denominator;
         System.out.println(value);
        }
     catch(Exception e)
        {
           System.out.println(e.getMessage());
       }
    }
}

