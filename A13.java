// Program to Understand Class, Object and Method in Java
// This program creates multiple Student objects and prints their details.

class Student
{
    int rollno;   // student roll number
    String name;  // student name

    // method to print student details
    void printDetails()
    {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
    }
}


// Main class
class A13
{
    public static void main(String aa[])
    {
        Student s1, s2, s3;   // reference variables

        // creating objects
        s1 = new Student();
        s2 = new Student();
        s3 = new Student();

        // assigning values
        s1.rollno = 45;
        s1.name = "Rajat";

        s2.rollno = 65;
        s2.name = "Jayesh";

        s3.rollno = 67;
        s3.name = "Sumit";

        // calling method to print details
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
