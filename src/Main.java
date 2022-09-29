import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1 - 2 ");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] number2 = {1.57, 7.654, 9.986};
        char[] number3 = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < number2.length; i++) {
            System.out.print(number2[i]);
            if (i != number2.length) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < number3.length; i++) {
            System.out.print(number3[i]);
            if (i != number3.length) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println(" Задание 3 ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = number2.length - 1; i >= 0; i--) {
            System.out.print(number2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = number3.length - 1; i >= 0; i--) {
            System.out.print(number3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println(" Задание 4 ");
        for (int i = 0; i < number.length; i++){
            if (number[i] % 2 != 0){
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
