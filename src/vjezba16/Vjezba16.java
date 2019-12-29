package vjezba16;

public class Vjezba16 {

    public static void main(String[] args) {

        
        Shape object1 = new Circle(0, 0, "crna", "kruzic", 2);
        Shape object2 = new Rectangle(0, 0, "crvena", "pravougaonik", 2, 3);
        Shape object3 = new Square(0, 0, "zuta", "kvadrat", 3);
        printShapes(object1, object2, object3);
        
        
        
        
    }
    static void printShapes(Shape...shapes){
        for(Shape shape : shapes){
            printShapeArea(shape);
        }
    }
    static void printShapeArea(Shape shape){
        System.out.println("Povrsina shapa sa nazivom  " + shape.getName()+" = " + shape.calculateArea());
        
    }

}
