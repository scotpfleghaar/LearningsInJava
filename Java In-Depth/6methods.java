public class 6methods {
    public static void main(String[] args) {
    //////// Methods ////////
    //Method Syntax:
    //returnType methodName(type param1, type param2, ...){
        // return someValue;
    //}   

    // Invocation Syntax:
    // type var = methodName(arg1, arg2,...);

    //////// Return types ////////
    // Void -> nothing to return
    void print(){
        System.err.println("I am returning nothing!");
    }

    // Primitive or Object Reference -> must return value
    int getId(){
        byte x = 5;
        return x;
    }

    byte getId(){
        int x = 5;
        return (byte) x;
    }

    //////// Method Benefits ////////
    // Avoid duplicate code
    // Divide and conquer (complex login into smaller pieces)
    //      - Software reuse
    //      - Clean and Readable code
    
    // For example:
    // instead of:
    // int search (int[] list, int key){
        // Step 1: Sort
        // Step 2: Binary search
    //}

    // move the methods created in the above class to be individual methods
    //int search (int[] list, int key){
        //sort(list);
        //binarySearch(list, key);
    //}


    //////// Instance Methods ////////
    // Object-level methods
    // Invocation: objectRef.methodName();
    // Affect object state
    //      - instance methods


    //////// Static Methods ////////
    // has keyword 'static' in declaration
    static void go(){
    }
    // Class-level methods
    //      - No access to state, i.e. can't access instance variable/methods
    // Can access static variables
    // Invocation: className.methodName();
    // main method is static
    // Can access other static methods

    //////// Methods Passing Data ////////
    void updateId(int newId){
        newId = 1001;
    }
    int id = 1000;
    updateId(id); //Does id get updated?
    // id is still 1000 and does not get updated

    void updateId2(Student s1){
        s1.id = 1001;
    }
    Student s = new Student();
    s.id = 1000;
    updatId2(s); //Does it update?
    // s.id GETS UPDATED to 1001

    //////// Pass by value not reference ////////
    int id3 = 1000; // <logical name, memory address, value>
    Student s = new Student(); //<Refers to the original spot of the object in memory>

    // Value of argument is passed to parameter (a copy is made)
    //      - Primitive argument - value is primitive
    //      - Object reference argument - value is memory address
     
    //////// Java is always pass by value ////////

    //////// Method Overloading ////////
    // Same name, different parameter lists
    // Must change parameter list
    //      # parameters or parameter type or both must vary
    // Applies to instance and static methods

    //Valid examples:
    boolean updateProfile(int newID){}
    boolean updateProfile(int newID, char gender){}
    boolean updateProfile(char gender, int newID){}
    void overload(int i){}
    void overload(byte b){}
    

    //////// varargs ////////
    // varargs variable-length arguments
    // Last parameter can tack variable# arguments
    //      Can be the only parameter
    // syntax and invocation: three dots following parameter type
    foo(boolean flag, int... items);
    // Array:
    foo(true, new int[]{1, 2, 3});
    // Comma-seperated arguments:
    foo(true, 1,2,3,4);
    // Omitted
    foo(true);
    // printf has varargs 
    System.out.printf("DOBL %d/%d/%d/", 1, 1, 1978);
    }
}
