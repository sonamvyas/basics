package io.github.sonamvyas.basics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Employee emp= new Employee();
    	emp.setFirstname("Sonam");
    	emp.getId();
    	emp.setLastName("Vyas");
    	emp.getLastName();
    	emp.setId(001);
    	emp.getId();
    	System.out.println(emp);
        System.out.println( "Hello World!" );
    }

	
}
