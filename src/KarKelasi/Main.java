package KarKelasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] user1 = new String[3];
        String[] user2 = new String[3];
        //String name1, name2, family1, family2, age1, age2;
        int i, j;
        UserCheck obj = new UserCheck();
        Scanner input = new Scanner(System.in);

        System.out.print("User1 enter your info(Name, Lastname, and age consequently) : ");
        for(i = 0; i < 3; i++) {
            user1[i] = input.nextLine();
        }

        System.out.print("User2 enter your info(Name, Lastname, and age consequently) : ");
        for(j = 0; j < 3; j++)
            user2[j] = input.nextLine();

        try {
            obj.check(user1, user2);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}

