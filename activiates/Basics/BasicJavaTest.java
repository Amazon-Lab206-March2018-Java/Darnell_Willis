
public class BasicJavaTest {

    public static void main(String[] args) {

        BasicJava nums = new BasicJava();

        nums.print1To255();
        System.out.println("----------");
        nums.printOddTo255();

        System.out.println("----------");
        nums.printSum();

        System.out.println("----------");
        int arr[] = {1,2,3,4,5,6,7};
        nums.IterateArray(arr);

        System.out.println("----------");
        int maxArr[] = {1,222,35,67};
        nums.findMax(maxArr);

        System.out.println("----------");
        int avgArr[] = {1,2,5,7};
        nums.average(avgArr);    

        System.out.println("----------");
        nums.oddNums(); 

        System.out.println("----------");
        int sqArr[] = {13,2,5,7};
        nums.square(sqArr);

        System.out.println("----------");
        int x[] = {-13,2,-5,7};
        nums.negNums(x);

        System.out.println("----------");
        int minx[] = {1,5,10,-2};
        nums.maxMinAvg(minx);

        System.out.println("----------");
        int shiftx[] = {1,5,10, 7,-2};
        nums.shiftValues(shiftx);

    }
    
}