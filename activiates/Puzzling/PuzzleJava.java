import java.util.*;
import java.lang.*;


public class PuzzleJava {


    public static ArrayList<Integer> task1(int arr[]) {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                newArr.add(arr[i]);
            }
            sum += arr[i];
        }
            System.out.println(sum);
            return newArr;
        
    }


    public static List<String> task2(String names[]) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            solution.add(names[i]);
        }
        Collections.shuffle(solution);
        return solution;

    }


    public static List<String> task3(String alpha[]) {
        List<String> solution = new ArrayList<>();
        for (int i = 0; i < alpha.length; i++) {
            solution.add(alpha[i]);
        }
        Collections.shuffle(solution);
        System.out.println("First: " + solution.get(0));
        System.out.println("Last: " + solution.get(22));
        return solution;

    }


    public static List<Integer> task4() {
        ArrayList<Integer> newArr = new ArrayList<Integer>();

        Random rand = new Random();

        
        for (int i = 0; i < 10; i++) {
            int rand_int1 = rand.nextInt((100 - 55) + 1) + 55;
            newArr.add(rand_int1);
        }

        return newArr;
    }


    public static List<Integer> task5() {
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        int max = 0;
        int min = 0; 
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int rand_int1 = rand.nextInt((100 - 55) + 1) + 55;
            newArr.add(rand_int1);

            for (int j = 0; j < newArr.size(); j++) {
                if (newArr.get(j) > max) {
                    max = newArr.get(j);
                }
                else if (newArr.get(j) < min) {
                    min = newArr.get(j);
                }
                
            }

            Collections.sort(newArr);

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        return newArr;
    }


    public static String task6() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();

        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }


    public static List<String> task7() {
        ArrayList<String> newArr = new ArrayList<String>();
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < 10; i++) {
            
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
            newArr.add(saltStr);
        }
        return newArr;
    }
        

}