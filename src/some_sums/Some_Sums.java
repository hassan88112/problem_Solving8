package some_sums;

import java.util.Scanner;

public class Some_Sums {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int val1 = s.nextInt();
        int val2 = s.nextInt();
        int sum = 0;
        
        for (int i = 0; i <= num; i++) {

            if (i / 10 == 0) {
                if (i >= val1 && i <= val2) {

                    sum += i;

                }
            } else {
                int mysum = 0;
                int number = i;
                while (number != 0) {
                    int mynum = number % 10;
                    number /= 10;
                    mysum += mynum;

                }
                if (mysum >= val1 && mysum <= val2) {

                    sum += i;
                }

            }
        }

        System.out.println(sum);

    }

}
