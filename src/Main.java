import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    static double reqSalry = 2500;
    static double reqCredit = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    float f=0;
        NumberFormat n = NumberFormat.getInstance();
        n.setMaximumFractionDigits(2);
        System.out.println(n.format(f));
        System.out.println(f++==++f);

    }
}