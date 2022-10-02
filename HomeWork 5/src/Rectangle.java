public class Rectangle {
    double x;
     double y;
        public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
        createdRectangles++;
    }
    public Rectangle(double x) {
        this.x = x;
        this.y = x;
        createdRectangles++;
    }
    public double calculateArea() {
        return x * y;
    }
    public double printArea() {
        return calculateArea();
    }
    public String printRectangleKind() {
        if (this.x == this.y) {
            System.out.println("Это квадрат");
        } else {
            System.out.println("Это прямоугольник");
        }
        return "";
    }
    public boolean IsTheSameRectangle(Rectangle rectangle) {
           return this.x == rectangle.x && this.y == rectangle.y ||
            this.x == rectangle.y && this.y == rectangle.x;
       }
    private static int createdRectangles;
    public static void printRectanglesCount (){
        System.out.println("Всего создано " + createdRectangles + " прямоугольника" );
    }
     private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
     private final static String ENGLISH_CLASS_NAME = "Rectangle";
    public static void printClassName (boolean printInRussian){
              System.out.println(RUSSIAN_CLASS_NAME);
    }
}

