/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName", 0); 
    Student t = new Student("Testname", 1);
    Student r = new Student("New Name", 2);
    Student ank = new Student("ANK", 2023);
    Student frank = new Student("FRANK", 2023);


    // Below two statements are equivalent 
    System.out.println(s.equals(t)); 
    System.out.println(s.equals(r));
    System.out.println(ank.equals(frank));
    System.out.println(ank.toString()); 
  } 
} 