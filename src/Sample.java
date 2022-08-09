public class Sample {
    // perform some mathematics calculation
    public int addition(int num1, int num2){
        return num1 + num2;
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
    public float division(float num1, float num2){
        return num1 / num2;
    }
}
