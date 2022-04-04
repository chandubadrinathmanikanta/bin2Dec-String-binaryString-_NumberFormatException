import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String bS = sc.nextLine();
        try
        {
            int decimal = Integer.parseInt(bS,2);
            System.out.println("Value = "+decimal);
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex.getClass() .getName()+": The Input String is not Binary");
        }
    }
}