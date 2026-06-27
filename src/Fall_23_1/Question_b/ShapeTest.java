package Fall_23_1.Question_b;

public class ShapeTest {
   static public void draw(Shape shape){
        if(shape instanceof Rectangle){
            System.out.println("Drawing over"+shape.getArea()+"area");
        }
        else if(shape instanceof Square){
            System.out.println("Drawing over"+shape.getArea()+"area");
        }
    }
    public static void main(String[] args) {
       Shape r = new Rectangle(5,6) ;
       Shape s= new Square(3);
       draw(r);
       draw(s);
    }
}
