import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args){
        
        double apple, armut, tomatoe, banana, patlıcan;

        Scanner inp = new Scanner(System.in);

        System.out.println("how money kilograms did you buy apple : ");
        apple = inp.nextDouble();
        
        System.out.println("how money kilograms did you buy armut : ");
        armut = inp.nextDouble();
        
        System.out.println("how money kilograms did you buy tomatoe : ");
        tomatoe = inp.nextDouble();
        
        System.out.println("how money kilograms did you buy banana : ");
        banana = inp.nextDouble();
        
        System.out.println("how money kilograms did you buy patlıcan : ");
        patlıcan = inp.nextDouble();
        
        double total = (armut*2.14) + (apple*3.67) + (tomatoe*1.11) + (banana*0.95) + (patlıcan*5.00);

        System.out.println("Your cost is  : " + total);

    }
    
}
