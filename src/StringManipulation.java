public class StringManipulation {
    public static void main(String[] args) {
        String str = "Hello";

        //String replace = str.replace('l', 'a');
       /* String replaceFirst = str.replaceFirst("l", "m");
        System.out.println(str);
        System.out.println(replaceFirst);
        // capitalize all the character on even index
        String name = "vaibhav";
        for (int i = 0; i < name.length(); i++) {
            if(i % 2 == 0) {
                System.out.print((char)(name.charAt(i) -32));
            }
            else{
                System.out.print(name.charAt(i));
            }
            if(i != name.length() - 1)
                System.out.print(", ");
        }*/

        // toCharArray
       /* char[] chars = name.toCharArray();
        System.out.println();
        String sample = "" + '\uffff';
        System.out.println(sample.codePointAt(0));
        System.out.println(sample.codePointBefore(1));*/
        String input = "A prime number is a whole number greater than 1 whose only factors are 1 and itself. " +
                "A factor is a whole number that can be divided evenly into another number. " +
                "The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29. ";
        String[] split = input.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }


    }
}
