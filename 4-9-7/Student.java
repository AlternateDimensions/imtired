/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = "";  
  private int id = 0;

  // Constructor 
  Student(String inputName, int year) 
  { 
    name = inputName;
    id = year;
  } 

  public int getID(){
    return id;
  }

  public boolean equals(Student other){
    return other.id == this.id;
  }

  public String toString(){
    return (String.valueOf(this.id)+","+name);
  }

} 