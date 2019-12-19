package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Edit_User {

    public Edit_User() {

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
        String firstName = f.nextLine();
        System.out.println("Last name of the user who you wants to edit.");
        Scanner l = new Scanner(System.in);
        String lastName = f.nextLine();

        User userWantEdit = Finder.findTheUserExistInList(firstName,lastName,listUsers);

        if (Finder.isUserExist(firstName, lastName, listUsers)) {
            System.out.println("Edit your first name, step 'Enter' for keep the same first name. ");
            Scanner nf = new Scanner(System.in);
            String firstNameNew = nf.nextLine();
            System.out.println("Edit your last name, step 'Enter' for keep the same last name.");
            Scanner nl = new Scanner(System.in);
            String lastNameNew = nl.nextLine();
            System.out.println("Edit your country, step 'Enter' for keep the same country.");
            Scanner nc = new Scanner(System.in);
            String country = nc.nextLine();
            int ag = 0;
            do {

                try {
                    System.out.println("Edit your age (between 18 and 99), step 'Enter' for keep the same age. ");
                    Scanner a = new Scanner(System.in);
                    String s = a.nextLine();
                    if(s.equals("")){
                        ag = Finder.findTheUserExistInList(firstName,lastName,listUsers).getAge();
                        break;
                    }
                    else {
                        ag = Integer.parseInt(s);
                    }

                }
                catch (NumberFormatException e){
                    System.out.println("Error, please enter a number. ");
                    e.getMessage();
                }
            } while (ag < 18 || ag > 99 );
            System.out.println("Edit your specialty, step 'Enter' for keep the same specialty.");
            Scanner ns = new Scanner(System.in);
            String specialty = ns.nextLine();


            if(firstNameNew.equals("")){
                firstNameNew = firstName;
            }
            if(lastNameNew.equals("")){
                lastNameNew = lastName;
            }
            if(country.equals("")){
                country = Finder.findTheUserExistInList(firstName,lastName,listUsers).getCountry();
            }
            if(specialty.equals("")){
                specialty = Finder.findTheUserExistInList(firstName,lastName,listUsers).getSpecialty();
            }

            userWantEdit.setFirstName(firstNameNew);
            userWantEdit.setName(lastNameNew);
            userWantEdit.setCountry(country);
            userWantEdit.setSpecialty(specialty);

            System.out.println("The user has been edited. ");
            System.out.println(userWantEdit);

        } else {
            System.out.println("Error: the user is not found in our list users, please try again.");
        }
    }
}
