package EclipseJavaCodes;
import java.util.*;
import java.text.*;
public class main113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int tp = sc.nextInt();
        int discount = 0;
        if (tp < 50) {
            discount = 0;
        } else if (tp >= 50 && tp <= 100) {
            discount = 10;
        } else if (tp >= 101 && tp <= 200) {
            discount = 20;
        } else if (tp >= 201 && tp <= 400) {
            discount = 30;
        } else if (tp >= 401 && tp <= 500) {
            discount = 40;
        } else {
            discount = 50;
        }
        double totalCost = tc * tp;
        double discountedCost = totalCost - (totalCost * discount / 100);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(discountedCost));
    }
}

