package tamrin3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringCheck x = new StringCheck();
        System.out.println("Enter a string");
        String str = input.nextLine();
        try{
            x.strC(str);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
