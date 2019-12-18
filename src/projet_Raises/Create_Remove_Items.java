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
        System.out.println("Add a item");

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

                if (rarity >= 0 && rarity <= 100)

                    if (!Finder.isReferenceExistInListRaises(reference, listRaise)) { // if ref not exist
                        Items createAddItem = new Items(title, reference, category, rarity);
                        listItems.add(createAddItem);
                        System.out.println("The item has been created with success!");
                        System.out.println(createAddItem);

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


    /**
     * [#9] removebook / removecar / removeitem / removepacket / removehouse / removestock
     * - cette commande prend en paramètre la référence de l'objet à modifier
     * - cette commande recherche un objet avec la meme référence rentrée et va le supprimer de la liste.
     * - si l'objet recherché n'existe pas, alors on affiche un message d'erreur comme quoi il est introuvable.
     * - si l'objet existe, il est supprimé de la liste en mémoire, et on affiche un message de réussite de l'effacement.
     * - si l'objet est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors l'effacement de cet objet ne pourra pas se faire et un message d'erreur sera affiché
     */

    public static void removeItem(List<Items> listItems, List<Raises> listRaises) {

        System.out.println("The reference of the item that you wants to delete: ");
        Scanner s = new Scanner(System.in);
        String ref = s.nextLine();

        boolean isInRaisesList = false;
        for (Raises raises : listRaises) {
            if (raises.getRef().equals(ref)) {
                isInRaisesList = true;
            }
        }

        try {
            for (Items items : listItems) {
                if (items.getReference().equals(ref)) {
                    if (isInRaisesList) {
                        System.out.println("The item can't be remove because it exist in the raises list.");
                    } else {
                        listItems.remove(items);
                        System.out.println("The item has been deleted with success.");
                    }
                } else {
                    System.out.println("n'exsite pas dans la liste de Items");
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}



