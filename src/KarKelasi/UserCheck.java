package KarKelasi;

public class UserCheck {
    public void check(String[] user1, String[] user2) throws SameInfoException {
        if( user1[0].equals(user2[0]) && user1[1].equals(user2[1]) && user1[2].equals(user2[2]) )
            throw new SameInfoException("Two users cannot have same info");
        else
            System.out.println("Welcome, users " + user1[0] + " and " + user2[0]);
    }

}


