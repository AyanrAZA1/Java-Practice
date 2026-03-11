// Example of Class and Static

class Student {

    String name;           // instance variable (different for each object)
    static String college; // static variable (same for all objects)

}

class A12 {
    public static void main(String aa[]) {

        Student s1, s2;       // object references
        s1 = new Student();   // creating object
        s2 = new Student();

        Student s3 = new Student();

        Student.college = "ABC";  // static variable set using class name

        s1.name = "Rajat";
        s2.name = "Amit";
        s3.name = "Sumit";

        System.out.println(s1.name);
        System.out.println(s1.college);

        System.out.println(s2.name);
        System.out.println(s2.college);

        System.out.println(s3.name);
        System.out.println(s3.college);
    }
}
