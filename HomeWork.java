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
        System.out.format(format, input , expected , com , com == expected);
        //end first task

        //start second task
        int size = 100;
        int[] arrTask2 = new int[size];
        String firstHundredSimp = Arrays.toString(task2(arrTask2));
        System.out.println(firstHundredSimp);

        int[] arrTask21 = {};
        int newSize = 50;
        String remakeArrSimp = Arrays.toString(task2(arrTask21,newSize));
        System.out.println(remakeArrSimp);
        // end second task

        //start third task
        int[] arrTask3 = new int[]{1,2,3,4,5};
        double expectedAverage = 3;
        double meanArithmeticTask3 = task3(arrTask3);

        String formatTask3 = "|%1$20s|%2$20s|%3$20s|\n";
        System.out.format(formatTask3, "Expected number" , "Received number" , "Boolean result");
        System.out.format(formatTask3, expectedAverage, meanArithmeticTask3 , expectedAverage == meanArithmeticTask3);

        double expectedGeo = 2.61;
        double meanGeo = Math.round(task3geo(arrTask3) * 100.0) / 100.0;
        System.out.format(formatTask3, "Expected number", "Received number", "Boolean result");
        System.out.format(formatTask3, expectedGeo, meanGeo, expectedGeo == meanGeo);

        double scanArray = Math.round(task3() * 100.0) / 100.0;
        System.out.format("\n" + formatTask3, "Expected number", "Received number", "Boolean result");
        System.out.format(formatTask3, expectedAverage , scanArray , expectedAverage == scanArray);
        // end third task

        //start fourth task
        int[] arrTask4 = {48,98,20,85,378,902,76};
        String bubbleSort = Arrays.toString(task4(arrTask4));
        System.out.println(bubbleSort);

        String quickSort = Arrays.toString(task4(arrTask4,0,arrTask4.length-1));
        System.out.println(" Task 4 Quick sort\n" + quickSort);
        //жаль что нельзя воспользоваться Arrays.sort(), где метод sort() в классе Arrays реализован алгоритмом быстрой сортировки ;)
        //end fourth task

        // start fifth task
        String stringTask5 = "Java , Java School allows you to try java programming language on practice. Java one of the most popular programming languages. I love Java!!!";
        String substring1 = "Java";
        int expectedIncludes = 5;
        int includeStr = task5(stringTask5,substring1);
        System.out.format(formatTask3, "Expected includes", "Received includes", "Boolean result");
        System.out.format(formatTask3, expectedIncludes , includeStr , includeStr == expectedIncludes);

        String indexOfStrArr = Arrays.toString(task5o(stringTask5,substring1));
        System.out.println("Java , Java School allows you to try java programming language on practice. Java one of the most popular programming languages. I love Java!!!" + " = " + indexOfStrArr);

        String inputsStrT2 = Arrays.toString(task5());
        System.out.println(inputsStrT2);
        //end fifth task

        //start optional task
        int[] temp = new int[30];
        System.out.println(Arrays.toString(optionalTask1(temp)));
        System.out.println(Arrays.toString(optionalTask2(temp)));
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

    public static int[] task2(int[] arrTask21,int newSize) {
        System.out.println("\nOverriding task2");
        arrTask21 = new int[newSize];
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
            meanArithmetic = sumArrTask3  / arrTask3.length;
        }
        return meanArithmetic;
    }

    public static double task3geo(int[] arrTask3) {
        System.out.println("\nTask 3 Geometric mean");
        if (arrTask3.length == 0){
            return 0;
        }
        double sum = 1.0;
            for(int i = 0; i < arrTask3.length; i++){
                sum = sum * arrTask3[i];
            }
        return Math.pow(sum, 1.0 / arrTask3.length);
    }
    public static double task3(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nTask 3 Input size of Array: ");
        int sizeArr = scan.nextInt();
        int[] inputsArr = new int[sizeArr];

        System.out.println("Input array elements: ");
        for (int i = 0; i < sizeArr ; i++) {
            inputsArr[i] = scan.nextInt();
        }
        return task3(inputsArr);
    }

    public static int[] task4(int[] arrTask4) {
        System.out.println("\n Task 4 bubble sort");
        boolean isSorted = false;
        int bub;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrTask4.length-1; i++) {
                if(arrTask4[i] > arrTask4[i+1]){
                    isSorted = false;
                    bub = arrTask4[i];
                    arrTask4[i] = arrTask4[i+1];
                    arrTask4[i+1] = bub;
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
                } else if (j == stakEl){
                    stakEl = i;
                }
            }
        }
        task4(arrTask4, low, stakEl);
        task4(arrTask4, stakEl + 1, high);
        return arrTask4;
    }
    public static int task5(String stringTask5,String substring1) {
        System.out.println("\nTask 5");
        String strnew = stringTask5.toLowerCase();
        String strnew2 = substring1.toLowerCase();
        return (strnew.length() - strnew.replace(strnew2, "").length()) / strnew2.length();
    }
    public static int[] task5o(String stringTask5,String substring1) {
        System.out.println("\nTask 5_1");
        String strnew = stringTask5.toLowerCase();
        String strnew2 = substring1.toLowerCase();

        int[] res = new int[strnew.length()];
        int count = 0;
        int base = 0;
        while(strnew.contains(strnew2)) {
            int index = strnew.indexOf(strnew2);
            res[count] = index + base;
            base += index + strnew2.length();
            strnew = strnew.substring(strnew.indexOf(strnew2) + strnew2.length());
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

        return task5o(fullString,sub);
    }

    public static int[] optionalTask1(int[] temp) {
        System.out.println("\nOptional task 1");
        int j = 1;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = ((int)(Math.random()*101) - (int)(Math.random()*101));
            System.out.println("День " + j + " "  + temp[i] + " градусов");
            j++;
        }
        return temp;
    }

enum Weather {
    FREEZY("Шуба","Валенки"),
    COLD("Куртка", "Ботинки"),
    WORM("Свитер","Туфли"),
    HOT("Футболка", "Шлепанци");
        Weather() {
        }
        private String clothesUp;
        private String clothesDown;
        Weather(String clothesUp, String clothesDown) {
            this.clothesUp = clothesUp;
            this.clothesDown = clothesDown;

        }
        public String[] getClothing(String clothesUp, String clothesDown) {
            return new String[]{clothesUp,clothesDown};
        }
}
    public static String[] optionalTask2(int[] temp) {
        System.out.println("\nOptional task 2");
        Weather weather = Weather.COLD;
        Weather weather1 = Weather.HOT;
        Weather weather2 = Weather.WORM;
        Weather weather3 = Weather.FREEZY;
        int j = 1;
        for (int i = 0; i < temp.length; i++) {
            temp[i] = ((int)(Math.random()*101) - (int)(Math.random()*101));
            if (temp[i] > 0 && temp[i] <= 15) {
                System.out.println("День " + j + " "  + temp[i] + " градусов" + " " + Arrays.toString(weather.getClothing(weather.clothesUp, weather.clothesDown)));
            } else if (temp[i] < 0){
                System.out.println("День " + j + " "  + temp[i] + " градусов" + " " + Arrays.toString(weather3.getClothing(weather3.clothesUp, weather3.clothesDown)));
            } else if (temp[i] > 15 && temp[i] <= 25) {
                System.out.println("День " + j + " "  + temp[i] + " градусов" + " " + Arrays.toString(weather2.getClothing(weather2.clothesUp, weather2.clothesDown)));
            } else {
                System.out.println("День " + j + " "  + temp[i] + " градусов" + " " + Arrays.toString(weather1.getClothing(weather1.clothesUp, weather1.clothesDown)));
            }
            j++;
        }
        return Arrays.toString(temp).split(" ");
    }
}




