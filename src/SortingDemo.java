import java.util.Arrays;

public class SortingDemo {
    //Check whether the given array is sorted or not, if sorted your method returns true otherwise false
    public boolean isSorted(int[] arr){
        boolean response = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                response = false;
                break;
            }
        }
        return response;
    }

    public static void main(String[] args) {
        SortingDemo sortingDemo = new SortingDemo();
        int[] arr = {20,18,2,8,6};
        /*
        System.out.println(sortingDemo.isSorted(arr));
        int[] brr = {200,500,300,400,2,1};
        int[] sorted = sortingDemo.bubbleSort(brr);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
        String callingString = "ZBCD";
        String argumentString = "ABC";
        System.out.println("callingString.compareTo(argumentString) = " + callingString.compareTo(argumentString));


        String[] name = {"Vaibhav" , "Josy", "Sandeep", "Rajiv" ,"Ravi" };
        String[] sortedNames = sortingDemo.bubbleSortString(name);
        System.out.println("Arrays.toString(sortedNames) = " + Arrays.toString(sortedNames));*/
        int[] sorted1 = sortingDemo.insertionSort(arr);

    }

    public int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }

    // you have given names of the student sort them according to the name
    public String[] bubbleSortString(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j].compareToIgnoreCase(arr[j+1]) > 0){
                    //swap them
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] insertionSort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {

            for (int j = i ; j > 0 ; j--) {
                    if(arr[j] < arr[j-1]){
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
