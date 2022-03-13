package tamrin1;

public class Authentication {
    public void authN(String name) throws Exception {
        if(name != null && name.equals("Pouya") )
            System.out.println("Welcome " + name + "\nEnter your credentials(username and password): ");
        else
            throw new WrongNameException("Wrong name");
    }
    public void authC(String user, String pass) throws Exception{
        if(user != null && pass != null && user.equals("LoneStreetSkater") && pass.equals("P@ss1234"))
            System.out.println("Success!");
        else
            throw new WrongCredentialsException("Username or password is incorrect");
    }
}
