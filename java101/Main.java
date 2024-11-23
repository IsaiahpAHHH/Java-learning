package java101;
import java.util.ArrayList;
import java102.Grid;
import java102.LibraryItem;
import java102.Book;
import java102.DVD;
import java102.Point;
import java102.A;
import java102.B;
import java102.Circle;
import java102.Shape;
import java102.Square;

public class Main {
    static int plusOne(int ask) {
        return ask = 1;
    }
    public static void main(String[] args) {
        //yowza it worked !!! :O
        //make sure to have semicolon; got it;>
        //ew camelcase yucky
        System.out.println("TYSON VS PAUL 8:00 pm est 11/15!!!! MUST WATCH!!");
        //my code wasnt running lmao i had main instead of Main
        int x = 100;
        //grr i hate having to type static evry time AHH
        if (x == 100) {
            System.out.println("Wowza that sure is 100!");
        }
        //messing around
        //it would print 10, then 6, then true?
        int a = 6;
		System.out.println(a + 4);
		System.out.println(a);
		System.out.println(a % 2 == 0);
        double[] arrr = {1,2,3,4.5};
        System.out.println(arrr.length);
        //this didnt work till i manually retyped it 
        boolean[] grr = new boolean[100];
        System.out.println(grr[1] || grr[2]);
        int[][][] grid = new int[8][8][8];
        int firstVal = grid[0][0][0];
        System.out.println(firstVal);
        while (x == 100) {
            System.out.println("YOURE GOING TO DIE AHHAHHA");
            //lmao
            x = x + 1;
        }
        double sum = 0;
        for (double e : arrr) {
            sum = sum + e;
            System.out.println(sum);
        }
        //so smart
        int sign = 2;
        plusOne(sign); {
            System.out.println(sign);
        }
        int[] arr = {1,2,2,3,4,5,6,7};
        double[][] board = {{1.8,2,3},{4,5,6.2}};
        int n = 2;
        int f = 1928391972;
        System.out.println(n + " shouws up " + PRACTICE.countOccurences(arr,n) + " times.");
        //YAY
        System.out.println("here's the reverse array loser " + PRACTICE.printIntArray(PRACTICE.reVerso(arr)));
        System.out.println("oh my sigma! heres the sum of the grid! " + PRACTICE.sumBoard(board));
        System.out.println("pinecone " + PRACTICE.fib(f));
        Point point = new Point(8, 7);
        System.out.println("x: " + point.x + "y: " + point.y);
        Point xTranslation = point.translateX(99);
        Point yTranslation = point.translateY(-70);
        Point xyTranslation = point.translateX(-8).translateY(-7);
        System.out.println("x transl: " + xTranslation);
        System.out.println("y transl: " + yTranslation);
        System.out.println("xy transl: " + xyTranslation);
        Point s = new Point(0,4);
        Point d = new Point(0,20);
        System.out.println(Point.distance(s, d));
        int germ = 0;
        System.out.println("calculating clean \n" + PRACTICE.germs(germ));
        Point[] points = {
            new Point(1,2),
            new Point(3,4),
            new Point(5,9)
        };
        System.out.println("center of mass " + Point.centerOfMass(points));
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Hello");
        ar.add("World");
        System.out.println(ar);
        ar.set(0, "Goodbye");
        System.out.println(ar);
        ArrayList<Boolean> conditions = new ArrayList<>();
        conditions.add(true);
        conditions.add(ar.get(0) == "Goodbye");
        conditions.add(conditions.get(0) || conditions.get(1));
        System.out.println(conditions);
        ArrayList<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
	        intArr.add(0);
        }
        System.out.println(intArr.size());
        System.out.println(intArr.get(49));
        Grid<Integer> greed = new Grid<>(5, 0);
        greed.set(0, 0, 4);
        System.out.println(greed);
        Grid<Boolean> greet = new Grid<>(10,true);
        greet.set(5,5,false);
        System.out.println(greet);
        Integer[] g = {1,2,3,4,5};
        System.out.print(arrayToString(g) + "\n");
        System.out.print(greet.get(5,5) + "\n");
        Grid<Integer> gridd = new Grid<>(9,9);
        gridd.set(1,1,1);
        System.out.println(Grid.maxSideLength() +"\n");
        
        Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
				  new Square(new Point(100, 2.1), 5.4),
				  new Circle(new Point(0, 0), 1),
				  new Circle(new Point(4, 9.123), 98.32),
				  new Square(new Point(-321, 0), 0.02)};
        System.out.println(sumArea(shapes));
        //i get 30414.0865986652
        Shape[] scaled = {new Circle(new Point(1.8, -20), 2), 
				  new Square(new Point(100, 2.1), 5.4),
				  new Circle(new Point(0, 0), 1),
				  new Circle(new Point(4, 9.123), 98.32),
				  new Square(new Point(-321, 0), 0.02)};
        scaled = scaleAll(scaled, 320.0);
        System.out.println(sumArea(scaled));
        A ag = new A(12.3, 430);
        B b = new B(-12.31, "hello");
        ag.method1();
        b.method1();
        b.method2();
        A bInDisguise = new B(1002.013, "world");
        bInDisguise.method2();
        LibraryItem[] items = {
        new Book("alice in my back hurts","b1","lewis imgonnadoit",543),
        new Book("super shmingo","b2","me",2000000),
        new Book("that time i died the end","b3","Something japanese idk", 2),
        new DVD("elmo tapes","d1",100.97),
        };
        System.out.println(arrayToString(items));
        returnAll(items);
        System.out.println(arrayToString(items));
        System.out.println(availableItems(items));


    

//no work
//ALL WORK AND NO PLAY MAKES A SMALL ASIAN BOY GO INSANE
        


    }
    static <T> String arrayToString(T[] g) {
        String str = "[";
        for (int i = 0; i < g.length - 1; i++) {
            str += g[i] + ", ";
        }
        return str + g[g.length - 1] + "]";
    }
    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }

    public static void returnAll(LibraryItem[] items) {
        for(int item = 0; item < items.length; item++) {
            LibraryItem.returnItem();
            items[item] = new LibraryItem("null", "null");
        }
        
    }
    public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
        ArrayList<LibraryItem> availablethigns = new ArrayList<>();
        for(int item = 0; item <items.length; item++) {
            availablethigns.add(items[item]);
        }
        return availablethigns;
    }
}
