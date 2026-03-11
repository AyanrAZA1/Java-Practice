// Program to Understand Type Casting

class A4 {
    public static void main(String aa[]) {

        float x = 23.67F;
        double y;

        y = x;          // implicit casting (float → double)
        x = (float) y;  // explicit casting (double → float)

        System.out.println(x);
        System.out.println(y);
    }
}
