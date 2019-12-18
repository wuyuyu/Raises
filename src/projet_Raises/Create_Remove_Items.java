package projet_Raises;

import java.util.List;
import java.util.Scanner;

/**
 * - ajoute un objet dans la liste conformément à la deuxième table
 * - la commande prend tous les champs décrits dans la table plus haut
 * - la commande cherche d'abord si la référence de l'objet est présente dans la troisème table, et si l'objet existe dejà un message
 * d'erreur s'affiche
 * - si la reference de l'objet n'existe pas, alors on le créé dans une liste
 */


public class Create_Remove_Items {
    private static int rarity;

    public static void createAddItem(List<Items> listItems, List<Raises> listRaise) {

        try {
            System.out.println("Enter the title of your object: ");
            Scanner sc = new Scanner(System.in);
            String title = sc.next();
            System.out.println("Enter the reference of your object: ");
            Scanner scan = new Scanner(System.in);
            String reference = scan.next();
            System.out.println("Enter the category of your object: ");
            Scanner ct = new Scanner(System.in);
            String category = ct.next();

            try {
                System.out.println("Enter the rarity of your object (between 0 and 100): ");
                Scanner a = new Scanner(System.in);
                String ag = a.next();
                rarity = Integer.parseInt(ag);

                if (rarity < 0 || rarity > 100)

                    if (!Finder.isReferenceExistInListRaises(reference, listRaise)) { // if ref not exist
                        Items createAddItem = new Items(title, reference, category, rarity);
                        listItems.add(createAddItem);
                        System.out.println("The item has been created with success!");

                    } else {
                        System.out.println("Error: the item is not available.");
                    }
            } catch (NumberFormatException ex) {
                System.out.println("Error: please enter a number. ");
                ex.getMessage();
            }
        } catch (Exception e) {
            e.getMessage();
        }

    }
}



            // la commande cherche d'abord si la référence de l'objet est présente dans la troisème table,
            // et si l'objet existe dejà un message d'erreur s'affiche
            // si la reference de l'objet n'existe pas, alors on le créé dans une liste



/*

    public static void removeItem() {
        System.out.println("First name of the user who you wants to delete.");
        Scanner f = new Scanner(System.in);
        String firstName = f.next();
        System.out.println("Last name of the user who you wants to delete.");
        Scanner l = new Scanner(System.in);
        String lastName = l.next();

        if (Finder.isUserExist(firstName, lastName, listUsers)) {

            listUsers.remove(Finder.findTheUserExistInList(firstName, lastName, listUsers));
            System.out.println("The user has been deleted. ");

        } else {
            System.out.println("Error: the user is not found in our list users, please try again.");
        }
    }
}


 */