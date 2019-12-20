package projet_Raises;

import java.util.List;
import java.util.Scanner;

/**
 * [#8]
 * this command takes as a parameter the reference of the object to modify
 * the command will modify an already registered object
 * the command searches for an object with exactly the reference entered. If the object exists, then the command asks to enter all
 * the new parameters one by one. If for a parameter we enter an empty string, we keep the previous value
 * the command will then check the new information entered (as the add command does) and save the modifications of the object IN THE
 * SAME OBJECT (we modify the object, we do not create a new one). If an error occurred in the entry of the values ​​then the object is
 * not modified and an error message is displayed.
 * if the object sought does not exist in the list, then an error message is displayed.
 * if the object is used in the third table (loans, rentals, auctions, deliveries, actions, transactions), then the modification of
 * this object cannot be done and an error message will be displayed
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
            if (items.getReference().equals(ref)) {// item exist
                if (!isRefExistInRaise) {//item didn't exist in list raises
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
                    //item exist in list raises
                    System.out.println("The item can't be edit because it exist in raise list. ");
                }
            } else {
                System.out.println("objet n'existe pas ");
            }
        }
    }
}