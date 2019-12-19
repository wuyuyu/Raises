package projet_Raises;

import java.util.List;
import java.util.Scanner;

/**
 * [#8]
 * - cette commande prend en paramètre la référence de l'objet à modifier
 * - la commande va modifier un objet déjà enregistré
 * - la commande recherche un objet avec exactement la référence entrée. Si l'objet existe, alors la commande demande d'entrer tous
 * les nouveaux paramètres un à un. Si pour un paramètre on entre une chaine vide, on garde la valeur précédente
 * - la commande va ensuite vérifier les nouvelles informations entrées (comme le fait la commande add) et enregistrer les modifications
 * de l'objet DANS LE MEME OBJET (on modifie l'objet, on n'en créé pas de nouveau). SI une erreur est survenue dans la saisie des
 * valeurs alors on ne modifie pas l'objet et on affiche un message d'erreur.
 * - si l'objet recherché n'existe pas dans la liste, alors on affiche un message d'erreur.
 * - si l'objet est utilisé dans la troisième table (emprunts, locations, enchères, livraisons, actions, transactions), alors la
 * modification de cet objet ne pourra pas se faire et un message d'erreur sera affiché
 * private String title;
 *     private String reference;
 *     private String category;
 *     private int rarity;
 */
public class Edit_Items {

    private static int rarity;
    private static String rar;

    public static void editItem(List<Items> listItems, List<Raises> listRaises) {

        System.out.println("The reference of item that your want to edit: ");
        Scanner s = new Scanner(System.in);
        String ref = s.nextLine();

        boolean isRefExistInRaise = false;
        for (Raises raises : listRaises) {
            if (raises.getRef().equals(ref)) {
                isRefExistInRaise = true;
            }
        }

        for (Items items : listItems) {
            if (items.getReference().equals(ref)) {//l'objet exist
                if (!isRefExistInRaise) {//l'objet n'existe pas dans la troisime tableau
                    System.out.println("Edit the title, step 'Enter' for keep the same.");
                    Scanner t = new Scanner(System.in);
                    String title = t.nextLine();
                    System.out.println("Edit the reference, step 'Enter' for keep the same.");
                    Scanner r = new Scanner(System.in);
                    String refNew = r.nextLine();
                    System.out.println("Edit the category, step 'Enter' for keep the same.");
                    Scanner c = new Scanner(System.in);
                    String category = c.nextLine();


                    try {
                        do {
                            System.out.println("Edit the rarity, step 'Enter' for keep the same.");
                            Scanner ra = new Scanner(System.in);
                            rar = ra.nextLine();
                            rarity = Integer.parseInt(rar);
                        } while (rarity >= 0 && rarity <= 100);
                    } catch (NumberFormatException e) {
                        e.getMessage();
                        System.out.println("Please enter a number between 0 and 100 not the letters");
                    }


                    if (title.equals("")) {
                        title = items.getTitle();
                    }
                    if (refNew.equals("")) {
                        refNew = ref;
                    }
                    if (category.equals("")) {
                        category = items.getCategory();
                    }
                    if (rar.equals("")) {
                        rarity = items.getRarity();
                    }

                    items.setTitle(title);
                    items.setReference(refNew);
                    items.setCategory(category);
                    items.setRarity(rarity);
                    System.out.println("your item has been edited with success!");
                    System.out.println("title: " + title + " ,reference: " + refNew + " , category: " + category + " ,rarity: " + rarity);
                } else {
                    //l'objet existe dans la 3ème tableau
                    System.out.println("The item can't be edit because it exist in raise list. ");
                }
            } else {
                System.out.println("objet n'existe pas ");
            }
        }
    }
}