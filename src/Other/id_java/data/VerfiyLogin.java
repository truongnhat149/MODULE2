package id_java.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VerfiyLogin {
    private static Scanner x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();
        String filepath = "D:\\JAVA\\2code\\src\\id_java\\data\\data.txt";

        verifyLogin(username, password, filepath);
    }
    public static void verifyLogin(String username, String password, String filepath)
    {
        boolean found = false;
        String tempUsername = "";
        String tempPassword = "";
        try
        {
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while (x.hasNext() && !found)
            {
                tempUsername = x.next();
                tempPassword = x.next();

                if (tempUsername.trim().equals(username.trim()) && tempPassword.trim().equals(password.trim()))
                {
                    found = true;
                }
                x.close();
                System.out.println(found);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
