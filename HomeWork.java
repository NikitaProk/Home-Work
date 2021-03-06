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
        System.out.format(format, "Inputs number", "Expected number", "Received number", "Boolean result");
        System.out.format(format, input, expected, com, com == expected);
        //end first task

        //start second task
        int size = 100;
        int[] arrTask2 = new int[size];
        System.out.println(Arrays.toString(task2(arrTask2)));

        int newSize = 50;
        System.out.println(Arrays.toString(task2(newSize)));
        // end second task

        //start third task
        int[] arrTask3 = new int[]{1, 2, 3, 4, 5};
        double expectedAverage = 3;
        double meanArithmeticTask3 = task3(arrTask3);

        String formatTask3Colomn = "|%1$20s|%2$20s|%3$20s|\n";
        System.out.format(formatTask3Colomn, "Expected number", "Received number", "Boolean result");
        System.out.format(formatTask3Colomn, expectedAverage, meanArithmeticTask3, expectedAverage == meanArithmeticTask3);

        double expectedGeo = 2.61;
        double meanGeo = Math.round(task3geo(arrTask3) * 100.0) / 100.0;
        System.out.format(formatTask3Colomn, "Expected number", "Received number", "Boolean result");
        System.out.format(formatTask3Colomn, expectedGeo, meanGeo, expectedGeo == meanGeo);

        double scanArray = Math.round(task3() * 100.0) / 100.0;
        System.out.format("\n" + formatTask3Colomn, "Expected number", "Received number", "Boolean result");
        System.out.format(formatTask3Colomn, expectedAverage, scanArray, expectedAverage == scanArray);
        // end third task

        //start fourth task
        int[] arrTask4 = {48, 98, 20, 85, 378, 902, 76};
        System.out.println(Arrays.toString(task4(arrTask4)));

        System.out.println("\nTask 4 Quick sort\n" + Arrays.toString(task4(arrTask4, 0, arrTask4.length - 1)));
        //end fourth task

        // start fifth task
        String stringTask5 = "Java School allows you to try java programming language on practice. Java one of the most popular programming languages. I love Java!!!";
        String substringTask5 = "Java";
        int expectedIncludes = 4;
        int includeStr = task5(stringTask5, substringTask5);
        System.out.format(formatTask3Colomn, "Expected includes", "Received includes", "Boolean result");
        System.out.format(formatTask3Colomn, expectedIncludes, includeStr, includeStr == expectedIncludes);

        int[] indexOfStrArr = task5IndexArr(stringTask5, substringTask5);
        System.out.print("Java School allows you to try java programming language on practice. Java one of the most popular programming languages. I love Java!!!" + " = " + Arrays.toString(indexOfStrArr));

        String inputsStrT2 = Arrays.toString(task5());
        System.out.println(inputsStrT2);
        //end fifth task

        //start optional task
        int[] temp = new int[29];
        System.out.println(Arrays.toString(optionalTask1(temp)));
        System.out.println(Arrays.toString(optionalTask2()));
        // end optional task
    }

    public static int task1(int input) {
        int[] symbols = new int[input];
        int sum1 = 0;
        for (int i = 0; i < symbols.length; i++) {
            sum1 = sum1 + (input % 10);
            input /= 10;
        }
        return sum1;
    }

    public static int[] task2(int[] arrTask2) {
        System.out.println("\nSecond task:");
        int n = 0;
        for (int i = 1; n < arrTask2.length; i++) {
            if (check(i)) {
                arrTask2[n] = i;
                n++;
            }
        }
        return arrTask2;
    }

    static boolean check(int n) {
        if (n == 1 || n <= 0) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] task2(int newSize) {
        System.out.println("\nOverriding task2");
        int[] arrTask21 = new int[newSize];
        return task2(arrTask21);
    }

    public static double task3(int[] arrTask3) {
        System.out.println("\nTak 3 Average");
        double meanArithmetic = 0;
        if (arrTask3.length > 0) {
            double sumArrTask3 = 0;
            for (int i = 0; i < arrTask3.length; i++) {
                sumArrTask3 = sumArrTask3 + arrTask3[i];
            }
            meanArithmetic = sumArrTask3 / arrTask3.length;
        }
        return meanArithmetic;
    }

    public static double task3geo(int[] arrTask3) {
        System.out.println("\nTask 3 Geometric mean");
        if (arrTask3.length == 0) {
            return 0;
        }
        double sum = 1.0;
        for (int i = 0; i < arrTask3.length; i++) {
            sum = sum * arrTask3[i];
        }
        return Math.pow(sum, 1.0 / arrTask3.length);
    }

    public static double task3() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nTask 3 Input size of Array: ");
        int sizeArr = scan.nextInt();
        int[] inputsArr = new int[sizeArr];

        System.out.println("Input array elements: ");
        for (int i = 0; i < sizeArr; i++) {
            inputsArr[i] = scan.nextInt();
        }
        return task3(inputsArr);
    }

    public static int[] task4(int[] arrTask4) {
        System.out.println("\n Task 4 bubble sort");
        boolean isSorted = false;
        int bub;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrTask4.length - 1; i++) {
                if (arrTask4[i] > arrTask4[i + 1]) {
                    isSorted = false;
                    bub = arrTask4[i];
                    arrTask4[i] = arrTask4[i + 1];
                    arrTask4[i + 1] = bub;
                }
            }
        }
        return arrTask4;
    }

    public static int[] task4(int[] arrTask4, int low, int high) {
        if (low >= high) {
            return arrTask4;
        }
        int stakEl = low + (high - low) / 2;
        int i = low, j = high;
        while (i < j) {
            while ((i < stakEl) && (arrTask4[i] <= arrTask4[stakEl])) {
                i++;
            }
            while ((j > stakEl) && (arrTask4[j] > arrTask4[stakEl])) {
                j--;
            }
            if (i <= j) {
                int temp = arrTask4[i];
                arrTask4[i] = arrTask4[j];
                arrTask4[j] = temp;
                if (i == stakEl) {
                    stakEl = j;
                } else if (j == stakEl) {
                    stakEl = i;
                }
            }
        }
        task4(arrTask4, low, stakEl);
        task4(arrTask4, stakEl + 1, high);
        return arrTask4;
    }

    public static int task5(String stringTask5, String substring1) {
        System.out.println("\nTask 5");
        String strFullString = stringTask5.toLowerCase();
        String strSubString = substring1.toLowerCase();
        int counter = 0;
        int indexPrevious = 0;
        while ((indexPrevious = strFullString.indexOf(strSubString, indexPrevious)) != -1) {
            counter++;
            indexPrevious += strSubString.length();
        }
        return counter;
    }

    public static int[] task5IndexArr(String stringTask5, String substring1) {
        System.out.println("\nTask 5_1");
        String strFullString = stringTask5.toLowerCase();
        String strSubString = substring1.toLowerCase();
        int count = 0;
        int[] res = new int[strFullString.length()];
        int index = 0;
        while ((index = strFullString.indexOf(strSubString, index)) != -1) {
            res[count] += index;
            index += strSubString.length();
            count++;
        }
        return Arrays.copyOf(res, count);
    }

    public static int[] task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTask 5 optional! Input string: ");
        String fullString = sc.nextLine();
        System.out.println("Input substring: ");
        String sub = sc.nextLine();

        return task5IndexArr(fullString, sub);
    }

    public static int[] optionalTask1(int[] temp) {
        System.out.println("\nOptional task 1");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = ((int) (Math.random() * 101) - (int) (Math.random() * 101));
            System.out.println("???????? " + (i + 1) + " " + temp[i] + " ????????????????");
        }
        return temp;
    }

    enum Weather {
        FREEZY,
        COLD,
        WORM,
        HOT
    }

    private static Weather getWeather(int temp) {
        if (temp > 0 && temp <= 15) {
            return Weather.COLD;
        } else if (temp < 0) {
            return Weather.FREEZY;
        } else if (temp > 15 && temp <= 25) {
            return Weather.WORM;
        } else {
            return Weather.HOT;
        }
    }

    private static String[] getClothing(Weather weather) {
        switch (weather) {
            case FREEZY:
                return new String[]{"????????", "??????????????"};
            case COLD:
                return new String[]{"????????????", "??????????????"};
            case WORM:
                return new String[]{"????????????", "??????????"};
            case HOT:
                return new String[]{"????????????????", "????????????????"};
            default:
                throw new IllegalArgumentException("Unsupported weather");
        }
    }
    public static String[] optionalTask2() {
        int[] temp = new int[29];
        optionalTask1(temp);
        System.out.println("\nOptional task 2");
        for (int i = 0; i < temp.length; i++) {
            Weather weather = getWeather(temp[i]);
            String[] clothing = getClothing(weather);
            System.out.println("???????? " + (i + 1) + " " + temp[i] + "\u2103".toUpperCase() + " " + weather + " : " + clothing[0] + "," + clothing[1]);
        }
        return Arrays.toString(temp).split(" ");
    }
}




