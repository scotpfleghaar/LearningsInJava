//$ clear && javac 5Array.java && java Array
class Array {
    public static void main(String[] args) {
        /////// Array creation //////////
        // First way
        int[] myArray = new int[3];
        myArray[0] = 9;
        myArray[1] = 3;
        myArray[2] = 7;

        // Second Way
        int[] myArray2 = new int[] { 9, 11, 2, 4, 7, 3, 54 };

        // Third Way
        int[] myArray3 = { 6, 2, 6, 4425, 8, 64, 3, 45 };

        // Alternate way to write:
        int myArray4[] = { 3, 4, 5, 2, 4 }; //Note where the [] are.

        /////// Array Methods //////////
        // length of array?
        myArray.length;

        //Array of object references
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();
        students[0].name = "John";
        students[1].name = "Raj";


        /////// 2D Array //////////
        // two rows and two columns

        //Creating a 2d array
        int[][] myArray5 = new int [4][2]; // the 4 = rows. the 2 = columns 

        // Another example
        int[][] myArray6 = new int[][] { 
                                            {9, 11}, 
                                            {2, 4}, 
                                            {7, 3}
                                        };
        // Irregular rows useful with a Symmetric Matrix
        int[][] myArray7 = new int[][] { 
                                            {9, 11, 5, 6, 7}, 
                                            {2, 4}, 
                                            {7, 3, 5, 2, 7}
                                        };

        /////// 3D Array //////////  
        // Very rare usage:
        int[][][] myArray8 = new int[][][] { 
                                                { 
                                                    {9, 11}, 
                                                    {2, 4}, 
                                                    {7, 3}, 
                                                    {9, 11}, 
                                                    {2, 4}, 
                                                    {7, 3,}
                                                }, 
                                                {
                                                    {9, 11}, 
                                                    {2, 4}, 
                                                    {7, 3}, 
                                                    {9, 11}, 
                                                    {2, 4}, 
                                                    {7, 3}
                                                }, 
                                                {
                                                    {9, 11}, 
                                                    {2, 4}, 
                                                    {7, 3}, 
                                                    {9, 11}, 
                                                    {2, 4}, 
                                                    {7, 3,}
                                                }
        };   

    }
}
