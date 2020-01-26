/*
Read the Class and Student classes provided below.
Assume that you are in a runner and you have created a 'Class' and
you have already filled every index in the 2d array with a student.

Class theClass=new Class("Janetka", "Comp Sci", someStudents);
//what is the name of the student in the first desk (row 0, column 0)?

//write the names of all the students that are sitting in the front row.

//write the code that would find the student with the highest percent in 
//the class and print their name and percent.



public class Class {    
    private Teacher teacher;
    private String title;
    private Student[][] students;     //row major
    
    public Class(Teacher teacher, String title, Student[][] students) {...}
    public Teacher getTeacher() {...}
    public String getTitle() {...}
    public Student[][] getStudents() {...}
    public Student getStudent(int row, int col) {...}
    public double getAverage() {...}
    public Student getBestStudent() {...}
    other methods not shown
}
    
public class Student {
    private String name;
    private int id;
    private double percent;
    
    public Student(String name, int id) {...}
    public double getPercent() {...}
    public void setPercent(double percent) {...}
    public String getName() {...}
    public id getId() {...}
    other methods not shown
}
 

*/
