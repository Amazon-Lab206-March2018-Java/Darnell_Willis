
import java.util.ArrayList;
import java.lang.*;

public class BasicJava {

    public static void print1To255() {

        for (int i = 1; i < 256; i++) {

            System.out.println(i);
        }
    }

    public static void printOddTo255() {

        for (int i = 1; i < 256; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void printSum() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            System.out.println("New number: " + i + " " + "Sum: " + sum);
        }
    }

    public static void IterateArray(int arr[]) {
        
        for (int i = 0; i < arr.length; i++)  {
            int numbers = arr[i];
            System.out.println(numbers);
        }
    }

    public static void findMax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++)  {
           if (arr[i] > max) {
            max = arr[i];
           }
        }
        System.out.println(max);
    }

    public static void average(int avgArr[]) {
        float avg;
        int sum = 0;
        for (int i = 0; i < avgArr.length; i++)  {
           sum += avgArr[i];
        }
        avg = sum / avgArr.length;
        System.out.println(avg);
    }
    
    public static void oddNums() {

        ArrayList<Integer> y = new ArrayList<Integer>();

        for (int i = 1; i < 256; i++)  {
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        System.out.println(y);
    }


    public static void greatThanY(int greatArr[], int y) {
        int count = 0;
        for (int i = 1; i < greatArr.length; i++)  {
            if (greatArr[i] > y) {
                count ++;
            }
        }
        System.out.println(count);
    }


    public static void square(int sqArr[]) {
        int squares;
        for (int i = 0; i < sqArr.length; i++)  {
            squares = (int) Math.pow(sqArr[i], 2);
            System.out.println(squares);
        }
    }


    public static void negNums(int x[]) {
        for (int i = 0; i < x.length; i++)  {
            if (x[i] < 0) {
                x[i] = 0;
            }
            System.out.println(x[i]);
        }
    }


    public static void maxMinAvg(int minx[]) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        int min = 0;
        int max = 0;
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < minx.length; i++)  {
            if (minx[i] > max) {
                max = minx[i];
            }
            else if (minx[i] < min) {
                min = minx[i];
            }
            sum += minx[i];
    
            avg = sum / minx.length;
        }
        newArr.add(max);
        newArr.add(min);

        newArr.add(avg);

        System.out.println(newArr);
    }


    public static void shiftValues(int shiftx[]) {
        for (int i = 1; i < shiftx.length; i ++)  {
            shiftx[i - 1] = shiftx[i];
            shiftx[shiftx.length - 1] = 0;
            System.out.println(shiftx[i]);
        }
    }

}