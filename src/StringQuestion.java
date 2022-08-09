/*
WAP to toggle the cases of characters present in given string. Toggle case means upper case character to lowercase,
 and lowercase characters to uppercase

 example
 input = "VaiBhav"
 output = "vAIbHAV"
 */
public class StringQuestion {
    public static void main(String[] args) {
        StringQuestion stringQuestion = new StringQuestion();
        String input = "VaiB123hav";
        String result = stringQuestion.toggleCase(input);
        System.out.println("input = " + input);
        System.out.println("result = " + result);
    }
    public String toggleCase( String input){
        String response = "";
        for (int i = 0; i < input.length(); i++) {
            char selectedChar = input.charAt(i);
            System.out.println("selectedChar = " + selectedChar);
            if(selectedChar >= 65 && selectedChar <= 90){
                selectedChar = (char)(selectedChar + 32);

                //response = response + selectedChar;
            } else if (selectedChar >= 97 && selectedChar <= 122) {
                selectedChar = (char)(selectedChar - 32);
                //response = response + selectedChar;
            }
            System.out.println("selectedChar = " + selectedChar);
            response = response + selectedChar;
        }

        return response;
    }

    public String toggleCase2(String input){
        String response = "";
        for (int i = 0; i < input.length(); i++) {
            char selectedChar = input.charAt(i) ;
            if(selectedChar >= 65 && selectedChar <= 90){
                String temp = selectedChar + "";
                response = response + temp.toLowerCase();
            }else if (selectedChar >= 97 && selectedChar <= 122) {
                String temp = selectedChar + "";
                response = response + temp.toUpperCase();
            }else{
                response = response + selectedChar;
            }

        }

        return response;
    }
}
