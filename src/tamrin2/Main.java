package tamrin2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Delta D = new Delta();
        int i = 1;
        while (i == 1) {
            System.out.println("Enter equation coefficients: ");
            String coeff1 = input.nextLine();
            int a = Integer.parseInt(coeff1);
            String coeff2 = input.nextLine();
            int b = Integer.parseInt(coeff2);
            String coeff3 = input.nextLine();
            int c = Integer.parseInt(coeff3);
            try {
                D.delta(a, b, c);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                //System.out.println(e.getClass());
            } finally {
                System.out.println("Do you want to restart?\n 1.Yes\n 2.No");
                String str = input.nextLine();
                i = Integer.parseInt(str);
            }
        }
    }
}
