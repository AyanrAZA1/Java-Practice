// Program to Understand Static, Instance and Local Variables in Java

class A15
{
    static int x;  // static variable (default value = 0)
    int y;         // instance variable (default value = 0)

    public static void main(String aa[])
    {
        System.out.println(x);   // static variable can be accessed directly

        // System.out.println(y); // ERROR: instance variable cannot be used without object

        A15 a = new A15();       // create object
        System.out.println(a.y); // access instance variable using object

        int z;   // local variable
        z = 67;

        System.out.println(z);   // print local variable
    }
}
