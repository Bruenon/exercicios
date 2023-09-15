import java.util.Scanner;

public class math {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\tvalor a: ");
        double a = input.nextDouble();
        input.nextLine();

        System.out.print("\tvalor b: ");
        double b = input.nextDouble();
        input.nextLine();

        System.out.print("\tvalor c: ");
        double c = input.nextDouble();
        input.nextLine();

        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("\tdelta negativo");
        } else {
            double rdelta = Math.sqrt(delta);

            double x1 = (-b - rdelta) / 2;
            double x2 = (-b + rdelta) / 2;

            System.out.printf("\tdelta: %f\n\tx1: %f\n\tx2: %f", delta, x1, x2);
        }


//        double raizx = Math.sqrt(x), raizy = Math.sqrt(y);
//        System.out.printf("\n\traiz x: %f\n\traiz y: %f", raizx, raizy);
//
//        double powx = Math.pow(x, 2), powy = Math.pow(y, 2);
//        System.out.printf("\n\tx^2: %f\n\ty^2: %f", powx, powy);
//
//        double absx = Math.abs(x), absy = Math.abs(y);
//        System.out.printf("\n\tvalor absoluto de x: %f\n\tvalor absoluto de y: %f", absx, absy);

        input.close();
    }

    public static Object exp(int num1) {
        return null;
    }
}