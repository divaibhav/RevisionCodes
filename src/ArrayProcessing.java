import java.util.Arrays;

/*
For the given array, process it and return a boolean array contain, true if given element of array is prime number,
 otherwise containing false
      2     |   7   |    9          | 10    |15 ---> array
       true     true    false       |false  |false --> flags
 */
public class ArrayProcessing {
    public static void main(String[] args) {
        int[] numbers = {2,7,9,10,15};
        ArrayProcessing object = new ArrayProcessing();
        boolean[] flags = object.checkPrime(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(flags));

    }
    public boolean[] checkPrime(int[] numbers){
        boolean[] response = new boolean[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(isPrime(numbers[i])){
                response[i] = true;
            }
        }

        return response;
    }

    public boolean isPrime(int number){
        // if number is divisible by any other number apart from 1 and itself, then number is not a prime number
        if(number > 1) {
            boolean response = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    response = false;
                    break;
                }
            }
            return response;
        }
        return false;
    }
}
