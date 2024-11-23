package java101;
public class PRACTICE {
    public static int countOccurences(int[] arr, int n) {
        int count = 0;
        for (int loop = 0; loop < arr.length; loop++) {
            if (arr[loop] == n) {
                count++;
            }
        }
        return count;

    }
    public static int[] reVerso (int[] arr) {
        int legnth = arr.length;
        int[] reversed = new int[legnth];
        for (int looop = 0; looop < arr.length; looop++) {
            reversed[looop] = arr[legnth - 1 - looop];
            //being so real chatgpt carried this one
        }
        return reversed;
    }
    public static String printIntArray(int[] arr) {
        String str = "(";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) {
                str += ", ";
            }
        }
        return str + ")";
    }
    public static double sumBoard(double[][] board) {
        double um = 0.0;
        for (int eggs = 0; eggs < board.length; eggs++) {
            for (int bacon = 0; bacon < board[eggs].length; bacon++) {
                um += board[eggs][bacon];
                //i hate nest eggs or whatever
            }
        }
        return um;
    }
    public static int fib(int f) {
        if (f == 0) {
            return 0;
        }
        if (f == 1) {
            return 1;
        }
        //had to get ai help for the two top parts i couldnt figure it out
        int one = 0, two = 1;
        int find = 0;
        for(int e = 2; e <= f; e++) {
            find = one + two;
            one = two;
            two = find;
        }
        return find;
    }
    public static String germs(int germ) {
        if (germ == 0) {
            return ("wow so clean!");
        }
        if (germ > 0) {
            return ("disgusting RAT!");
        }
        return ("thats ur cleanliness rating");
    }
}
