public class 2typeCasting {
    public static void main(String[] args) {
        castingExamples();
    }

    public static void castingExamples() {
        //Assing variable or literal of one type to variable of another type
        // int <- long
        // int <- byte
        //note: Cannot cast boolean.

        /////// Implicit Casting ///////
        //Samller to larger (widening conversion)
        //Example:
        int x = 65;
        long y = x; //(Implicit casting by compiler)

        /////// Explicit Casting ///////
        // Larger to smaller (narrowing conversion)
        long a = 65;
        int b = (int) a; //(Explicit casting by developer)

        /////// Out-of-range ///////
        byte narrowedByte = (byte) 123456; //returns 64, only the 123 are considered and the 456 are out-of-range.
        System.out.println(narrowedByte);

        /////// Truncation ///////
        //Floating-point to intefer/char will always trucate
        int z = (int) 3.14f; // z = 3
        int c = (int) 0.9f; // c = 0
        char d = (char) 65.5; // d = -> 65 -> 'A'.
        System.out.println(z);

        /////// Loss of percision ///////
        // int -> float
        // long -> float
        // long -> double
        int oldVal = 1234567890;
        float f = oldVal;
        int newVal = (int) f; // 123456789

    }
}
