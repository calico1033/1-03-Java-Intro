public class HelloWorld {

    /*    pvsm - shortcut for public
        sout - shortcut for print

        short, int, Integer, long, Long ------
         stores an integer ( whole numbers ) EX. 42, 1024

        float, Float, double, Double --------
         stores decimals EX. 42.123, 2.5

         char ------
         ( for characters) single characters surrounded by quotation marks EX. 'a', 'A'

         String --------
         ( for Strings ) double quotation marks EX. "hello", "how are you"


     */
    public static int doSquare(int num) {           // says we are only going to use 1 #
        return num * num;                           // whatever # that is, to multiply it by itself
    }


    public static int sumOfSquare(int num1, int num2){      // says we are going to use 2 numbers EX. (1, 2)
        return num1 * num1 + num2 * num2;                  // written as ( num1 * num1 ) + ( num2 * num2 )
    }

    public static int usingOutputOfSquare(int num1, int num2){  // we are able to use the output of another function and return it
        return doSquare(num1) + doSquare( (num2));     // doSquare is num * num . we are multiplying each side, then adding the results together
    }

    public static int addNumbers (int number){
        int sum = 0;

        for (int i = 1; i <= number; i++){
            sum = sum + i;
        }
        return sum;
    }





    public static void main(String[] args) {       // must be added to print result


        System.out.println( addNumbers(5) );
        // <=15

        System.out.println( usingOutputOfSquare(2, 4) );  // 2*2 = 4, 4*4 = 16, then add the results ( 4 + 16 )
        // <= 20

        System.out.println( sumOfSquare(3, 1) );      // says that 3*3 = 9, 1*1 = 1, then add the results ( 9 + 1 )
        // <= 10

        System.out.println( doSquare(2) );         // says to multiply 2 by 2
        // <= 4
    }
}
//
//        //write a method to add all the numbers in this progression:
//        // 1 * 2 * 3 * 4 +    2 * 3 * 4 * 5 +    3 * 4 * 5 * 6 +   4 * 5 * 6 * 7 =
//
//        public static int example(int n){
//            int sum = 0;
//
//            for(int i = 1; i <= n; i++){
//                sum += i * (i + 1) * (i + 2) * (i + 3);
//                //after first iteration i = 1 so
//                // 0 * ( 0 + 1 ) * ( 0 + 2 ) * ( 0 + 3 ) = 1 * 2 * 3
//                // 1 * ( 1 + 1 ) * ( 1 + 2 ) * ( 1 + 3 )  = 1 * 2 * 3 * 4 +
//                //
//            }
//            return sum;
//        }
//
//        //given a year(int) figure out if it is a leap year or not
//        // if its divisible by 4 its a leap year
//        // if its divisible by 100, it also has to be divisible by 400
//
//        public static boolean isLeapYear(int year){
//
//            if (year % 4 == 0){
//                if (year % 100 == 0){
//                    if(year % 400 == 0){
//                        return true;
//                    } else return false;
//                } else return true;
//            }
//            return false;
//        }
//
//        public static boolean startsWithVowel(String str){
//
//            if(str.charAt(0) == 'a' || str.charAt(0) == 'e'|| str.charAt(0) == 'i'|| str.charAt(0) == 'o'|| str.charAt(0) == 'u'){
//                return true;
//            }
//            if(str.charAt(0) == 'A' || str.charAt(0) == 'E'|| str.charAt(0) == 'I'|| str.charAt(0) == 'O'|| str.charAt(0) == 'U'){
//                return true;
//            }
//            return false;
//        }
//
//
//        // Write a method to figure out if an input string is a palindrome or not?
//// "abcba" ---> "abcba"
////         "abba"
//
//        public static boolean isPalindrome(String str){
//
//            int i = 0, j = str.length() - 1;
//
//            while(i <= j){      //(i < str.length()  && j >= 0){
//
//                if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) return false;
//
//                i++;
//                j--;
//
//            }
//            return true;
//        }
//
//        public static int graterThan(int num1, int num2, int num3){
//
//            return Math.max(Math.max(num1, num2), num2);
//        }
//
////    Fizz buzz is a game about division. Create a program that will iterate through numbers 1 to 101, and log each number in the console.
////    If the number is divisible by three, the word fizz should be logged instead of logging the number itself.
////    If the number is divisible by five, the word buzz should be logged.
////    If the number is divisible by both three and five, the word fizzbuzz should be logged.
//
//
////    Give an array of Integers, return the sum
//
//        public static int sumOfArray(int [] arr){
//
//            int sum = 0;
//
//            for(int i =0; i < arr.length; i++){
//                sum += arr[i];
//            }
//            return sum;
//        }
//
//        // Given an array of Integers, find the biggest number in the array
//
////    public static int biggestNumber(int[] arr){
////
////        int num = 0;
////
////        for(int i =0; i < arr.length; i++){
////
////        }
////return
////    }
//
//        // Given a positive integer, return the sum of it's digits!
//
//        public static int sumOfDigits(int num){
//
//            num = 0;
//
//
//
//        }
//
//        // Given a positive Integer, return it's reverse Integer
//
//        public static int reverseInt(int num){
//
//
//
//        }
//
//
//
//        // main is the name of the method
//        // void is the return type of a method
//
//        //static means belonging to the whole class
//
//        // public means open to the world
//
//        public static void main(String[] args) { //psvm

//
//
//            char ch = '1';  // double quotation means string , single quotation means character
//            int number = 5;
//            double gpa = 3.7;
//            String str = "My name is Erica";  //String is basically a class so we capitalize it
//            System.out.println( str.charAt(0) );
//            long bigNumber = 1000;
//            float variable = 5.6f;
//            boolean b = true;
//
//            System.out.println( Integer.MAX_VALUE );
//            System.out.println( Integer.MIN_VALUE );
//            System.out.println( str.indexOf("n")); // this is how to find the index of a certain character
//            System.out.println( Math.pow(2.1,2));
//            System.out.println(Integer.parseInt("231673"));  // converting a string to a integer
//            System.out.println( addNumbers(10) ); // for looping in java
//            System.out.println(example(4));
//
//            System.out.println( isLeapYear(1995) );  // false
//            System.out.println( isLeapYear(1996) );   //true
//            System.out.println( isLeapYear(2000) );   // true
//            System.out.println( isLeapYear(1900) );   // false
//
//            System.out.println(startsWithVowel("eat"));  //true
//
//            System.out.println(isPalindrome("race"));
//
//            int[] array1 = new int[]{5,10,15};
//            System.out.println(sumOfArray(array1));
//
//
//
//
//        }



