// Program to Understand Typecasting

class A5 {
    public static void main(String aa[]) {

        int a = 100;
        int b = 320;

        byte x, y;

        x = (byte) a;   // explicit casting: int → byte (value fits in byte)
        y = (byte) b;   // explicit casting: int → byte (value exceeds byte range)

        System.out.println(x);  // prints 100
        System.out.println(y);  // overflow occurs

    }
}
