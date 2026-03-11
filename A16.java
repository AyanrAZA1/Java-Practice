// Program to Understand Array Creation and Length in Java

class A16
{
    public static void main(String aa[])
    {
        int x[];                 // array reference
        x = new int[10];         // array of size 10

        int y[] = new int[17];   // array of size 17

        int z[] = new int[]{123,45,67,879,67,23,56}; // array with values

        int w[] = {123,45,67,879,67,23,56}; // another way to create array

        System.out.println(x.length);  // prints size of array x
        System.out.println(y.length);  // prints size of array y
        System.out.println(z.length);  // prints size of array z
        System.out.println(w.length);  // prints size of array w
    }
}
