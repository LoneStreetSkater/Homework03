package tamrin1;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Authentication name = new Authentication();
        Authentication userpass = new Authentication();
        System.out.println("Enter your name: ");
        String n = input.nextLine();
    try{
        name.authN(n);
    } catch (Exception e){
        System.out.println(e.getMessage());
        System.exit(0);
    }
    String user = input.nextLine();
    String pass = input.nextLine();
    try{
      userpass.authC(user, pass);
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
    }
}
