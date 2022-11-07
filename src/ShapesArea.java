import java.util.Scanner;

public class ShapesArea {
    public void triangle() 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.print("Alap:");
            String baseStr = scanner.nextLine();

            System.out.print("Magasság:");
            String heightStr = scanner.nextLine();
            
            Triangle triangle = new Triangle();
            boolean good = true;
            good = triangle.isGoodInput(baseStr);
            good = triangle.isGoodInput(heightStr);

            if(good) 
            {
                triangle.base = Double.parseDouble(baseStr);
                triangle.height = Double.parseDouble(heightStr);
                triangle.calcArea();
                System.out.println("Háromszög terület: "+triangle.area);
            }
        }
    }
}
