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
            int age;

            do {
                    System.out.println("Enter your age (between 18 and 99): ");

                    Scanner a = new Scanner(System.in);
                    String ag = a.next();
                    age = Integer.parseInt(ag);
            } while (age <= 18 || age >= 99);


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


        }catch (NumberFormatException e){
            System.out.println("Error, please enter a number for your age. ");
            e.getMessage();
        } catch (Exception e) {
            System.out.println("Error.");
            e.getMessage();
        }


    }

    public static void editUser() {


    }
}
