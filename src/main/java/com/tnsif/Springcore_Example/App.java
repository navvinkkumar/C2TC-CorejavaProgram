package com.tnsif.Springcore_Example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
   ApplicationContext var= new ClassPathXmlApplicationContext("applicatioincontext.xml");
  
   College c1=var.getBean("smvec",College.class);
   
   c1.display();
    }
}
