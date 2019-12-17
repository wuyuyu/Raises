package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class EditAUser {
    private static int age;

    public EditAUser() {

    }
    /**
     * - la commande va modifier un utilisateur déjà enregistré
     * - la commande recherche un utilisateur avec exactement le patronyme rentré.
     * Si l'utilisateur existe, alors la commande demande d'entrer tous les nouveaux paramètres un à un.
     * Si pour un paramètre on entre une chaine vide, on garde la valeur précédente
     *
     *
     * - la commande va ensuite vérifier les nouvelles informations entrées (comme le fait adduser) et enregistrer les modifications
     * de l'utilisateur DANS LE MEME OBJET (on modifie l'utilisateur, on n'en créé pas de nouveau).
     * SI une erreur est survenue dans la saisie des nouvelles valeurs (ex : le nouveau nom et le nouveau prénom existent deja, ou bien un champ de type entier qui contient des lettres) alors on ne modifie pas l'utilisateur et on affiche un message d'erreur.
     * - si l'utilisateur recherché n'existe pas dans la liste, alors on affiche un message d'erreur.
     * - si l'utilisateur est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors la modification de cet utilisateur ne pourra pas se faire et un message d'erreur sera affiché
     * @param listUsers
     */

    public static void editUser(List<User> listUsers) {

        System.out.println("First name of the user who you wants to edit.");
        Scanner f = new Scanner(System.in);
        String firstName = f.next();
        System.out.println("Last name of the user who you wants to edit.");
        Scanner l = new Scanner(System.in);
        String lastName = f.next();

        User userWantEdit = ListUsers.foundTheUserExistInList(firstName,lastName,listUsers);

        if (ListUsers.isUserExist(firstName, lastName, listUsers)) {
            System.out.println("Edit your first name, step 'Enter' for keep the same first name. ");
            Scanner nf = new Scanner(System.in);
            String firstNameNew = nf.next();
            System.out.println("Edit your last name:");
            Scanner nl = new Scanner(System.in);
            String lastNameNew = f.next();
            System.out.println("Edit your country:");
            Scanner nc = new Scanner(System.in);
            String country = nc.next();
            do {
                try {
                    System.out.println("Edit your age (between 18 and 99): ");
                    Scanner a = new Scanner(System.in);
                    String ag = a.next();
                    age = Integer.parseInt(ag);
                }catch (NumberFormatException e){
                    System.out.println("Error, please enter a number. ");
                    e.getMessage();
                }

            } while (age < 18 || age > 99);
            System.out.println("Edit your specialty:");
            Scanner ns = new Scanner(System.in);
            String specialty = ns.next();
            if(firstNameNew == null){
                firstNameNew = firstName;
            }
            if(lastNameNew == null){
                lastNameNew = lastName;
            }
            if(country == null){
                country = ListUsers.foundTheUserExistInList(firstName,lastName,listUsers).getCountry();
            }
            /*
            if(age == null){
                age = ListUsers.foundTheUserExistInList(firstName,lastName,listUsers).getAge();
            }

             */
            if(specialty == null){
                specialty = ListUsers.foundTheUserExistInList(firstName,lastName,listUsers).getSpecialty();
            }


            User userEdited = new User(firstNameNew, lastNameNew, country, age, specialty);
            userWantEdit = userEdited;

            System.out.println("The user has been edited. ");

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
