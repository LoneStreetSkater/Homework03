package tamrin3;

public class StringCheck {
    public void strC(String str) throws Exception{
        if(str.contains("1") || str.contains("2") || str.contains("3") || str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7") || str.contains("8") || str.contains("9") || str.contains("0"))
            throw new NumberException("There must not be any number in the string");
        else
            System.out.println("The length of the string is " + str.length() + " characters");
    }
}
