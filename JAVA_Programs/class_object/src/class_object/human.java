/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package class_object;

/**
 *
 * @author hilbe
 */
class monkey{
    public void walking()
    {
        System.out.println("walking");
    }
   public void eating()
   {
        System.out.println("eating");
   }
}
public class human extends monkey {
    public String name;
    public String gender;
    public float height;
    public float width;
    human()
    {
        name="Ramu";
        gender="male";
        height=56;
        width=45;
        System.out.println("Name:" + name + ",Gender:"+ gender + ",Height:"+ height + ",Width" + width);
    }
    human(String name1,String gender1,float height1,float width1)
    {
        name=name1;
        gender=gender1;
        height=height1;
        width=width1;
        System.out.println("Name:" + name + ",Gender:"+ gender + ",Height:"+ height + ",Width" + width);
    }
   public String get_details()
   {
    return("Name:" + name + ",Gender:"+ gender + ",Height:"+ height + ",Width" + width); 
   }
   public String get_details(String status)
   {
       String value="";
     if(status=="name")
     {
       value= "Name:"+name;
     }
     else if(status=="height")
     {
         value="Height:"+ height;
     }
     return value;
   }
  public void eating()
  {
      System.out.println("Human eat only hygenic food");
  }
    
}
