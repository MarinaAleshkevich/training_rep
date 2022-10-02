public class Main {
    public static void main(String[] args) {
        Rectangle sq = new Rectangle (9, 4);
          System.out.println("sq = " + sq.printArea());
          System.out.println(sq.printRectangleKind() );
        Rectangle sq1 = new Rectangle( 5, 5);
          System.out.println("sq1 = " + sq1.printArea());
          System.out.println(sq1.printRectangleKind() );
        Rectangle sq3 = new Rectangle (4, 9);
          System.out.println("sq3 = " + sq3.printArea());
          System.out.println(sq3.printRectangleKind());
        System.out.println( sq.IsTheSameRectangle(sq3));
        sq3.printRectanglesCount();
        Rectangle.printClassName(true);
    }
}
