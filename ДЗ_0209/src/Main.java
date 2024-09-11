import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Родимушкин 4ИСИП-421

        // Задача 1

        Scanner in1 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num1 = in1.nextInt();

        if (num1 % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

        System.out.println();

        // Задача 2

        Scanner in2 = new Scanner(System.in);
        System.out.println("Write 3 numbers: ");
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++){
            arr[i] = in2.nextInt();
            System.out.println(arr[i]);
        }

        System.out.println(String.format("Min number: %d", Arrays.stream(arr).min().getAsInt()));
        System.out.println();

        // Задача 3

        for (int i = 1; i <= 10; i++){
            System.out.printf(String.format("%d ", 5*i));
        }
        System.out.println();

        // Задача 4

        Scanner in3 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num2 = in3.nextInt();
        int res = 0;

        for (int i = 0; i <= num2; i++){
            res += i;
        }

        System.out.println(String.format("Sum: %d", res));
        System.out.println();

        // Задача 5

        Scanner in4 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int count = in4.nextInt();
        int[] fibo = new int[count];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < count; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        for (int i = 0; i < count; i++){
            System.out.printf(String.format("%d ", fibo[i]));
        }

        System.out.println();


        // Задача 6

        Scanner in6 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num6 = in6.nextInt();
        boolean result = true;

        if (num6 <= 1){
            result = false;
        }
        else {
            for (int i = 2; i < num6; i++){
                if ( num6 % i == 0){
                    result = false;
                    break;
                }
            }
        }

        if (result == true){
            System.out.println("Число простое");
        }
        else {
            System.out.println("Число не простое");
        }
        System.out.println();

        // Задача 7

        Scanner in7 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num7 = in7.nextInt();

        if (num7 > 0){
            for (int i = num7; i >= 1; i--){
                System.out.println(i);
            }
        }
        else if (num7 < 0){
            for (int i = num7; i <= 1; i++){
                System.out.println(i);
            }
        }
        else {
            System.out.println(0);
            System.out.println(1);
        }
        System.out.println();

        // Задача 8

        Scanner in8 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num8_1 = in8.nextInt();
        int num8_2 = in8.nextInt();
        int result1 = 0;

        for (int i = num8_1; i <= num8_2; i++){
            if (i % 2 == 0){
                result1 += i;
            }
        }

        System.out.println(result);
        System.out.println();


        // Задача 9

        Scanner in9 = new Scanner(System.in);
        System.out.println("Write a string: ");
        String string9 = in9.next();

        System.out.println(new StringBuilder(string9).reverse());

        // Задача 10

        Scanner in10 = new Scanner(System.in);
        System.out.println("Write a number: ");
        String string10 = in10.next();
        boolean flag = true;

        for (int i = 0; i < string10.length(); i++){
            if (!Character.isDigit(string10.charAt(i))){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println(string10.length());
        }
        System.out.println();

        // Задача 11

        Scanner in11 = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num11 = in11.nextInt();
        int result11 = 1;

        if (num11 == 0){
            System.out.println(result);
        }
        else if (num11 > 0){
            for (int i = 1; i <= result11; i++){
                result11 *= i;
            }
            System.out.println(result);
        }

        System.out.println();

        // Задача 12

        Scanner in12 = new Scanner(System.in);
        System.out.println("Write a number: ");
        String string12 = in12.next();
        int result12 = 0;

        for (int i = 0; i < string12.length(); i++){
            if (Character.isDigit(string12.charAt(i))){
                result12 += Character.getNumericValue(string12.charAt(i));
            }
        }

        System.out.println(result);
        System.out.println();

        // Задача 13

        Scanner in13 = new Scanner(System.in);
        System.out.println("Write a string: ");
        String string13 = in13.next();
        boolean flag13 = true;

        for (int i = 0; i <= string13.length()/2; i++){
            char c1 = string13.charAt(i), c2 = string13.charAt(string13.length()-1-i);

            if (c1 != c2) {
                flag13 = false;
                break;
            }
        }

        if (flag){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a paindrome");
        }
        System.out.println();

        // Задача 14

        Scanner in14_1 = new Scanner(System.in);
        System.out.println("Write a massive length: ");
        int num14_1 = in14_1.nextInt();

        Scanner in14_2 = new Scanner(System.in);
        System.out.println("Write an elements: ");
        int[] arr14 = new int[num14_1];

        for (int i = 0; i < num14_1; i++){
            arr14[i] = in14_2.nextInt();
        }

        System.out.println(Arrays.stream(arr14).max().getAsInt());
        System.out.println();

        // Задача 15

        Scanner in15_1 = new Scanner(System.in);
        System.out.println("Write a massive length: ");
        int num15_1 = in15_1.nextInt();

        Scanner in15_2 = new Scanner(System.in);
        System.out.println("Write an elements: ");
        int[] arr15 = new int[num15_1];

        for (int i = 0; i < num15_1; i++){
            arr15[i] = in15_2.nextInt();
        }

        System.out.println(Arrays.stream(arr15).sum());
        System.out.println();

        // Задача 16

        Scanner in16_1 = new Scanner(System.in);
        System.out.println("Write a massive length: ");
        int num16_1 = in16_1.nextInt();

        Scanner in16_2 = new Scanner(System.in);
        System.out.println("Write an elements: ");
        int[] arr16 = new int[num16_1];
        int more = 0, less = 0;

        for (int i = 0; i < num16_1; i++){
            arr16[i] = in16_2.nextInt();

            if (arr16[i] > 0){
                more++;
            }
            else if (arr16[i] < 0){
                less++;
            }
        }

        System.out.println(String.format("More than 0: %d", more));
        System.out.println(String.format("Less than 0: %d", less));
        System.out.println();

        // Задача 17

        Scanner in17 = new Scanner(System.in);
        System.out.println("Write a numbers: ");
        int num17_1 = in17.nextInt();
        int num17_2 = in17.nextInt();

        for (int i = num17_1; i <= num17_2; i++){
            boolean flag17 = true;

            if (i > 1){

                for (int j = 2; j < i; j++){
                    if ( i % j == 0){
                        flag = false;
                        break;
                    }
                }

                if (flag){
                    System.out.println(i);
                }
            }
        }

        System.out.println();

        // Задача 18

        Scanner in18 = new Scanner(System.in);
        System.out.println("Write a string: ");
        String string18 = in18.nextLine();
        int vowels = 0, not_vowels = 0;

        String alpha_vowel18 = "eyuioaуеыаоэяию";

        for (int i = 0; i < string18.length(); i++){
            if (!Character.isDigit(string18.charAt(i)) && string18.charAt(i) != ' '){
                if (alpha_vowel18.contains(new String(new char[] {string18.charAt(i)}))){
                    vowels++;
                }
                else{
                    not_vowels++;
                }
            }
        }

        System.out.println(String.format("Vowels: %d", vowels));
        System.out.println(String.format("Not vowels: %d", not_vowels));

        // Задача 19

        Scanner in19 = new Scanner(System.in);
        System.out.println("Write a string: ");
        String[] strings19 = in19.nextLine().split(" ");

        for (int i = strings19.length-1; i >= 0; i--){
            System.out.println(strings19[i]);
        }

        System.out.println();

        // Задача 20

        Scanner in20 = new Scanner(System.in);
        System.out.println("Write a number: ");
        String string20 = in20.next();
        int sum = 0;

        for (int i = 0; i < string20.length(); i++){
            sum += (int)Math.pow(Character.getNumericValue(string20.charAt(i)), string20.length());
        }

        if (sum == Integer.parseInt(string20)){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }

        System.out.println();
    }
}