package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Create_Remove_Users {
    public Create_Remove_Users() {
    }
    private static int age;

    /**
     * [#3]
     * create and add user,
     * ask user to step all information necessary
     * A user must be considered as already existing if the name AND the first name correspond perfectly to an former user .
     * In this case an error message will be displayed
     * @param listUsers
     */
    public static void createAddUser(List<User> listUsers) {

        try {
            System.out.println("Enter your first name === Entrez votre Prénom: ");
            Scanner sc = new Scanner(System.in);
            String firstName = sc.next();
            System.out.println("Enter your last name === Entrez votre nom: ");
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            System.out.println("Enter your country === Entrez votre pays: ");
            Scanner ct = new Scanner(System.in);
            String country = ct.next();
            do {
                try {
                    System.out.println("Enter your age (between 10 and 99) === Entrez votre age (entre 10 et 99): ");
                    Scanner a = new Scanner(System.in);
                    String ag = a.next();
                    age = Integer.parseInt(ag);
                }catch (NumberFormatException e){
                    System.out.println("Error, please enter a number for your age === Erreur: age est un nombre. ");
                    e.getMessage();
                }
            } while (age < 10 || age > 99);
            System.out.println("Enter your specialty === Entrez otre spécialité: ");
            Scanner s = new Scanner(System.in);
            String specialty = s.next();
            User createAddUser = new User(firstName, name, country, age, specialty);

            if(!Finder.isUserExist(firstName, name, listUsers)){
                listUsers.add(createAddUser);
                System.out.println("The user has been created with success === Votre compte est créé!");
            }
            else{
                System.out.println("Error: the user exist already, please try again === Erreur: le compte est déjà existé.");
            }

        } catch (Exception e) {
            System.out.println("Error.");
            e.getMessage();
        }

    }

    /**
     * this command searches for a user with the same name AND first name entered and will delete it from the list.
     * if the user sought does not exist, then an error message is displayed stating that it cannot be found.
     * if the user exists, it is deleted from the list in memory, and a message of successful deletion is displayed.
     * if the user is used in the third table, then this user cannot be deleted and an error message will be displayed
     * @param listUsers
     * @param listRaise
     */

    public static void removeUser(List<User> listUsers,List<Raises> listRaise){
        System.out.println("First name of the user who you wants to delete === Le prénom du compte que vous voulez supprimer.");
        Scanner f = new Scanner(System.in);
        String firstName = f.next();
        System.out.println("Last name of the user who you wants to delete === Le nom du compte que vous voulez supprimer.");
        Scanner l = new Scanner(System.in);
        String lastName = l.next();

        if (Finder.isUserExist(firstName, lastName, listUsers)) {
                /**
                 *if the user is used in the third raises table,
                 * then the deletion of this user cannot be done and an error message will be displayed
                 */
                if(Finder.isUserExistInRaisesList(firstName,lastName,listRaise)){
                    System.out.println("The user have a raise, you can't delete the user === Cette compte est lié à une enchère, vous ne pouvez pas la supprimer. ");

                }else {
                    listUsers.remove(Finder.findTheUserExistInList(firstName, lastName, listUsers));
                    System.out.println("The user has been deleted === le compte est bien supprimé. ");
                }

            } else {
            System.out.println("Error: the user is not found in our list users, please try again === Erreur: le compte n'existe pas.");
        }
    }
}
