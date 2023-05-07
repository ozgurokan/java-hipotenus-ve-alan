import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double  c,u,alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Kenar: ");
        a = input.nextInt();
        System.out.print("İkinci Kenar: ");
        b = input.nextInt();

        c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : " + c);

        // u  = çevre
        u = (a+b+c)/ 2;

        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) formülü
        alan = Math.sqrt(u * ((u-a)*(u-b)*(u-c)));
        System.out.println("Alan : " + alan);

    }
}