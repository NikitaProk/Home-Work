import java.util.Arrays;
import java.lang.String;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //start first task
        System.out.println("First task");
        int input = 1985;
        int expected = 23;
        String format = "|%1$15s|%2$15s|%3$15s|%4$15s|\n";
        int com = task1(input);
        System.out.format(format,"Inputs number","Expected number","Received number","Boolean result");
        System.out.format(format,input,expected,com,com == expected);
        //end first task

        //start second task
        int size = 100;
        int[] arr_1 = new int[size];
        int[] arr_2 = {};
        System.out.println(Arrays.toString(task2(arr_1)));
        System.out.println(Arrays.toString(task2(arr_2,size)));
        // end second task

        //start third task
        int[] arrTask3 = {};
        double expectedAverage = 3;
        double meanArithmeticTask3 = task3(arrTask3);
        double expectedGeo = 2.61;
        String formatTask3 = "|%1$15s|%2$15s|%3$15s|\n";
        System.out.format(formatTask3,"Expected number","Received number","Boolean result");
        System.out.format(formatTask3,String.valueOf(expectedAverage),String.valueOf(meanArithmeticTask3),String.valueOf(expectedAverage == meanArithmeticTask3));
        double meanGeo = Math.round(task3geo(arrTask3) * 100.0) / 100.0;
        System.out.format(formatTask3,"Expected number","Received number","Boolean result");
        System.out.format(formatTask3,String.valueOf(expectedGeo),String.valueOf(meanGeo),String.valueOf(expectedGeo == meanGeo));
        double scanArray = Math.round(task3() * 100.0) / 100.0;
        System.out.format("\n" + formatTask3,"Expected number","Received number","Boolean result");
        System.out.format(formatTask3,String.valueOf(expectedAverage),String.valueOf(scanArray),String.valueOf(expectedAverage == scanArray));
        // end third task
    }

    public static int task1(int input) {
        int[] symbols = new int[input];
        int sum1 = 0;
        for (int i = 0; i < symbols.length ; i++) {
            sum1 = sum1 + (input%10);
            input/=10;
        }
        return sum1;
    }



    public static int[] task2(int[] arr_1) {
        System.out.println("\nSecond task:");

        int n = 0;
        for (int i = 1; n < arr_1.length; i++) {
            if (check(i)) {
                arr_1[n] = i;
                n++;
            }
        }
        return arr_1;
    }

    static boolean check(int n) {
        if(n==1 || n<=0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
    }

    public static int[] task2(int[] arr_2,int size) {
        System.out.println("\nOverriding task2");
        int n = 0;
        arr_2 = new int[size];
        for (int i = 1; n < arr_2.length; i++) {
            if (check(i)) {
                arr_2[n] = i;
                n++;
            }
        }
        return arr_2;
    }
    public static double task3(int[] arrTask3) {
        System.out.println("\nTak 3 Average");
        arrTask3 = new int[]{1,2,3,4,5};
        double meanArithmetic = 0;
        if (arrTask3.length > 0) {
            double sumArrTask3 = 0;
            for (int g = 0; g < arrTask3.length ; g++) {
                sumArrTask3 = sumArrTask3 + arrTask3[g];
            }
            meanArithmetic = sumArrTask3  / arrTask3.length;
        }
        return meanArithmetic;
    }

    public static double task3geo(int[] arrTask3) {
        System.out.println("\nTask 3 Geometric mean");
        arrTask3 = new int[] {1,2,3,4,5};
        double sum = 1.0;
        if (arrTask3.length > 0) {
            for(int i = 0; i < arrTask3.length; i++){
                sum = sum * arrTask3[i];
            }
        }
        double geoMean = Math.pow(sum,1.0/arrTask3.length);
        return geoMean;
    }
    public static double task3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nTask 3 Input size of Array: ");
        int sizeArr = scan.nextInt();
        int[] inputsArr = new int[sizeArr];
        String inputsArr1 = "";
        double meanArithmetic = 0;
        System.out.println("Input array elements: ");
        for (int k = 0; k < sizeArr ; k++) {
            inputsArr[k] = scan.nextInt();
        }
        inputsArr1 = Arrays.toString(inputsArr);
        System.out.print(inputsArr1);

        if (inputsArr.length > 0) {
            double sumArrTask3 = 0;
            for (int g = 0; g < inputsArr.length; g++) {
                sumArrTask3 = sumArrTask3 + inputsArr[g];
            }
            meanArithmetic = sumArrTask3 / inputsArr.length;
        }
        return meanArithmetic;
    }
}




