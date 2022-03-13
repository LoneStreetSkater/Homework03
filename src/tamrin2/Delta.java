package tamrin2;

public class Delta {
    public void delta (int a, int b, int c) throws Exception
    {
        int D = ( b * b ) - ( 4 * a * c );
        if( D < 0 )
            throw new Exception ("No possible answers \n");
        else{
            double x1, x2;
            x1 = (-b + Math.sqrt(D) )/(2 * a);
            x2 = (-b - Math.sqrt(D) )/(2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
            System.out.println("\n\t -= Operation successful! =- \n");
        }

    }

}
