/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package college_program;

/**
 *
 * @author hilbe
 */
public class college {
    String collegename;
    String university;
    String address;
    String email;
    String website;
    String phonenumber;
    static String dept_name;
    int no_of_faculty;
    int no_of_student;
    void display_college_name()
    {
        System.out.println("College Name:"+ collegename);
    }
    void display_total_strength()
    {
        System.out.println("Total Strength:"+ (no_of_faculty + no_of_student));
    }
   static void display_defaultcollge()
   {
       System.out.println("College Name:NMCC");
   }
}
