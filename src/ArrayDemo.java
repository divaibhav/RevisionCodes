public class ArrayDemo {
    public static void main(String[] args) {
       /* int[] arr;
        arr = new int[10];*/
        String[] arr = new String[10];
        // how to print the array or access each element, by using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println("value at given index = " + i +" is equal to = " + arr[i]);
        }
        boolean[] flags = new boolean[10];
        for (int i = 0; i < flags.length; i++) {
            System.out.println(flags[i]);
        }
        char[] chars = new char[10];
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
         // declare and initialize an array with given element
        // type[] name = {value1, value2,.......}
        // now an array of given number of elements is created,
        // with each index initialize to given corresponding value
        int[] marks = {10,20,30,40,60};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("value at given index = " + i +" is equal to = " + marks[i]);
        }
        System.out.println(marks);

        marks = new int[]{5,100,150,200,250};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("value at given index = " + i +" is equal to = " + marks[i]);
        }
        System.out.println(marks);
        Sample[] sampleValues = new Sample[10];
        for (int i = 0; i < sampleValues.length; i++) {
            System.out.println(sampleValues[i]);
        }
        Sample sample = new Sample();
        System.out.println("sample = " + sample);


        //double dimension array
        // type[][] identifier = new type[int rows][int columns]
        int[][] arr2D = new int[5][5];
        for (int i = 0; i < arr2D.length; i++) {
            // for each row process the column
            for(int j = 0; j < arr2D[i].length; j++){
                System.out.print(arr2D[i][j] + ", ");
            }
            System.out.println();

        }
        int[][] array2D = new int[5][];
        array2D[0] = new int[5];
        array2D[1] = new int[3];
        array2D[2] = new int[4];
        array2D[3] = new int[6];
        array2D[4] = new int[7];

        System.out.println("2d array with different column size");
        for (int i = 0; i < array2D.length; i++) {
            // for each row process the column
            for(int j = 0; j < array2D[i].length; j++){
                System.out.print(array2D[i][j] + ", ");
            }
            System.out.println();

        }
        System.out.println();
        int[][] sampleArray = {{10,20,30,40,50},{100,200,300,400,500},
                {1,2,3,4,5}};

        for (int i = 0; i < sampleArray.length; i++) {
            // for each row process the column
            for(int j = 0; j < sampleArray[i].length; j++){
                System.out.print(sampleArray[i][j] + ", ");
            }
            System.out.println();

        }
        //Create an 2D array with 5 rows and 5 columns, print the array, and calculate the sum of all the elements
        int[][] marks1 = {
                {10,20,30,40,50},
                {10,20,30,40,50},
                {10,20,30,40,50},
                {10,20,30,40,50},
                {10,20,30,40,50}
        };
        for (int i = 0; i < marks1.length; i++) {
            for (int j = 0; j < marks1[i].length; j++) {
                System.out.print(marks1[i][j] + ", ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < marks1.length; i++) {
            for (int j = 0; j < marks1[i].length; j++) {
               sum = sum + marks1[i][j];
            }

        }
        System.out.println("sum = " + sum);

    }
}
//Create an 2D array with 5 rows and 5 columns, print the array, and calculate the sum of all the elements
//print sum