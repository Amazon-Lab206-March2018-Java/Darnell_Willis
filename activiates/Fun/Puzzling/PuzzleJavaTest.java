public class PuzzleJavaTest {

        public static void main(String[] args) {

            PuzzleJava tacks = new PuzzleJava();

            int[] arr={3,5,1,2,7,9,8,13,25,32};
            System.out.println(tacks.task1(arr));
            System.out.println("-------");

            String[] names = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"} ;
            System.out.println(tacks.task2(names));
            System.out.println("-------");

            String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "V", "X", "Y", "Z"} ;
            System.out.println(tacks.task3(alpha));
            System.out.println("-------");

            System.out.println(tacks.task4());
            System.out.println("-------");

            System.out.println(tacks.task5());
            System.out.println("-------");

            System.out.println(tacks.task6());
            System.out.println("-------");

            System.out.println(tacks.task7());
            System.out.println("-------");
            
        }
    
}