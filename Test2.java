public class Test2 extends Terminal {
    public static void main(String[] args) {
        Shape[] shapes= new Shape[]{
             new Square(5),
             new Square(7),
             new Square(10),
             new Rectangle(4,6),
             new Rectangle(2,8),
             new Rectangle(3,9),
             new Circle(3),
             new Circle(4),
             new Circle(5),
             new Ellipse(5,3),
             new Ellipse(6,2),
             new Ellipse(7,4),
             new Triangle(3,4,5),
             new Triangle(7,8,10),
             new Triangle(6,7,8),
           };        
        


        float areaTotal =0, perimTotal=0;
        for (Shape shape: shapes){
            
            areaTotal += shape.getArea();
            perimTotal += shape.getPerimeter();

        }
        printLine("Area Total=%.2f, Perimetro Total=%.2f",areaTotal,perimTotal); 

        for(var s: shapes){
            printLine(s.toString());
            printLine("Area: %.2f, Perimetro: %.2f", s.getArea(), s.getPerimeter());
            printLine();
        }
    }


    
}
