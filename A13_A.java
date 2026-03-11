// Program to Understand Class, Object, and Methods with Parameters
// This program sets student details using a method and prints them.


// Student class
class Student
{
    int rollno;   // student roll number
    String name;  // student name

    // method to print details
    void printDetails()
    {
        System.out.println("Roll No: " + rollno);   // print roll number
        System.out.println("Name: " + name);        // print name
    }

    // method to set values using parameters
    void setDetails(int r, String n)
    {
        rollno = r;   // assign roll number
        name = n;     // assign name
    }
}


// main class
class A13_A
{
    public static void main(String aa[])
    {
        Student s1, s2, s3;  // reference variables

        // create objects
        s1 = new Student();
        s2 = new Student();
        s3 = new Student();

        // set values using method
        s1.setDetails(345, "Ajay");
        s2.setDetails(14, "Manoj");
        s3.setDetails(45, "Ashish");

        // print details
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
