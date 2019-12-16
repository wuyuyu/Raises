package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class OperationUsers {
    public OperationUsers() {
    }

    public static void createAddUser(List<User> listUsers) {

        try {
            System.out.println("Enter your first name: ");
            Scanner sc = new Scanner(System.in);
            String firstName = sc.next();
            System.out.println("Enter your last name: ");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            System.out.println("Enter your country: ");
            Scanner ct = new Scanner(System.in);
            String country = ct.next();
            System.out.println("Enter your age: ");

            Scanner a = new Scanner(System.in);
            String ag = a.next();
            int age = Integer.parseInt(ag);
            System.out.println("Enter your specialty: ");
            Scanner s = new Scanner(System.in);
            String specialty = s.next();

            User createAddUser = new User(firstName, name, country, age, specialty);

            if(!ListUsers.isUserExist(firstName, name, listUsers)){
                listUsers.add(createAddUser);
                System.out.println("The user has been created with success!");
            }
            else{
                System.out.println("The user exist already.");
            }




        } catch (Exception e) {
            System.out.println("Age is a number, please enter a number.");
            e.getMessage();
        }


    }

    public static void editUser() {


    }
}
