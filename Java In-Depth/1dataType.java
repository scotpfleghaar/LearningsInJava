public class 1dataType {
    public static void main(String[] args) {
        primitives();
    }

    public static void primitives() {

        ////////// Numbers /////////////
        System.out.println("Inside primitives");

        // Can write Hexidecimal numbers
        int intHex = 0x0041;
        System.out.println("intHex: " + intHex);

        // Can write binary numbers
        int intBinary = 0b01000001;
        System.out.println("intBinary: " + intBinary);

        // Can add _ for readablilty
        int intUnderscore = 1_234_567;
        System.out.println("intUnderscore: " + intUnderscore);

        //Bit Depth: 8-bit, Value Range: -2^7 to (2^7 - 1), Default: 0
        byte byteNum = 127;

        //Bit Depth: 16-bit, Value Range: -2^15 to (2^15 - 1), Default: 0
        short shortNum = 1000;

        //Bit Depth: 32-bit, Value Range: -2^31 to (2^31 - 1), Default: 0
        int intNum = 10001;

        //Bit Depth: 64-bit, Value Range: -2^63 to (2^63 - 1), Default: 0
        long longNum = 100011000010L; // NOTE: the "L" at the end

        //Float Bit Depth: 32-bits, Value Range: -3.4E38 to 3.4E38, Default 0.0f
        float floatNum = 3.45f; // NOTE: MUST have the "f" at the end

        //Double Bit Depth: 64-bits, Value Range: -1.7E308 to 1.7E308, Default 0.0d (Prefered due to more decimal points thus more accurate);
        double doubleNum = 10.434d; // NOTE: the "d" at the end is optional and usually left out by convention.

        /////////// Characters /////////////
        //char Bit Depth: 16-bits, Value Range: (0 to 2^16 - 1), Defualt: '\u0000', note: cann print due to being null.
        char charValue = 'A'; //NOTE: the single quotes: ''
        char unicodeExample = 65; //Prints A. in Unicode 65 -> A.
        char utf16Example = '\u0042'; //Prints A, 4*16^1 + 1 * 16^0 -> 65 -> 'A'.
        char hexExample = 0x41; //Prints A, 4*16^1 + 1 * 16^0 -> 65 -> 'A'
        char binaryExample = 0b01000001; //Prints A, binary -> 65 -> 'A'

        /////////// Boolean /////////////
        //Bit Depth: JCM specific (machine specific), Value Range: true or false, Default: false.
    }
}
