package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Create_Remove_Users {
    public Create_Remove_Users() {
    }


    private static int age;

    /**
     *
     * @param listUsers
     */
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
            do {
                try {
                    System.out.println("Enter your age (between 10 and 99): ");
                    Scanner a = new Scanner(System.in);
                    String ag = a.next();
                    age = Integer.parseInt(ag);
                }catch (NumberFormatException e){
                    System.out.println("Error, please enter a number for your age. ");
                    e.getMessage();
                }
            } while (age < 10 || age > 99);
            System.out.println("Enter your specialty: ");
            Scanner s = new Scanner(System.in);
            String specialty = s.next();
            User createAddUser = new User(firstName, name, country, age, specialty);

            if(!Founder.isUserExist(firstName, name, listUsers)){
                listUsers.add(createAddUser);
                System.out.println("The user has been created with success!");
            }
            else{
                System.out.println("Error: the user exist already, please try again.");
            }

        } catch (Exception e) {
            System.out.println("Error.");
            e.getMessage();
        }

    }



    /**
     *
     * @param listUsers
     */

    public static void removeUser(List<User> listUsers){
        System.out.println("First name of the user who you wants to delete.");
        Scanner f = new Scanner(System.in);
        String firstName = f.next();
        System.out.println("Last name of the user who you wants to delete.");
        Scanner l = new Scanner(System.in);
        String lastName = f.next();

            if (Founder.isUserExist(firstName, lastName, listUsers)) {

                    listUsers.remove(Founder.foundTheUserExistInList(firstName, lastName, listUsers));
                    System.out.println("The user has been deleted. ");

            } else {
                System.out.println("Error: the user is not found in our list users, please try again.");
            }

        /**
         * !!!!!!!!!!!!!!!!!!!!
         * si l'utilisateur est utilisé dans la troisième table enchères,,
         * alors l'effacement de cet utilisateur ne pourra pas se faire et un message d'erreur sera affiché
         */
    }
}