package rectangle.area;
/**
 *
 * @author MAZLAN
 */
import java.util.Scanner;

public class RectangleArea{
    
    double length;
    double width;
    double area;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double length =sc.nextDouble();
        double width =sc.nextDouble();
        double area = length*width;
        System.out.println("Area of Rectangle :"+area);
    }
}
