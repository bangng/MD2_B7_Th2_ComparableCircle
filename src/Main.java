import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("============Square=============");
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square("yellow",true,5.8);
        System.out.println(square);

        System.out.println("=================Comparable=============");
        ComparableCircle[] circles = new  ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo", false,3.5);

        System.out.println("Pre-sorted:");
        for (ComparableCircle comparableCircle :
             circles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);
        System.out.println("Apter-sorted:");
        for (ComparableCircle comparableCircle :
             circles) {
            System.out.println(comparableCircle);
        }

    }

}
