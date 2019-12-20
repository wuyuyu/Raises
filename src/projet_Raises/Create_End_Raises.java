package projet_Raises;


import java.util.List;
import java.util.Scanner;

public class Create_End_Raises {
    /**
     * [#11]
     * create and add a raise
     * this command takes as parameter the first and last name of a user as well as the reference of the associated object
     * if the user does not exist, an error is displayed.
     * if the object reference does not exist, an error is displayed.
     * if the object is already in use, ie in an entry in the third table but with a return date / arrival date / end date not filled in, then an error is displayed.
     * in all other cases, we store the entry with today's date (put a random history value to have different dates)
     * display the summary of the addition (last name, first name of the user, object ref, start date)
     * @param listUsers
     * @param listItems
     * @param listRaises
     */

    public static void createAddRaises (List<User> listUsers, List<Items> listItems,List<Raises> listRaises) {
        try {
            System.out.println("Create a raise");
            System.out.println("Enter your first name: ");
            Scanner sc = new Scanner(System.in);
            String firstName = sc.nextLine();
            System.out.println("Enter your last name: ");
            Scanner s = new Scanner(System.in);
            String lastName = s.nextLine();
            System.out.println("Enter the reference of your item : ");
            Scanner scan = new Scanner(System.in);
            String ref = scan.nextLine();
            System.out.println("Enter the date of purchase: ");
            Scanner ct = new Scanner(System.in);
            String db = ct.nextLine();

            boolean isINListItem = false;
            for (Items items : listItems) {
                if (items.getReference().equals(ref)) {
                    isINListItem = true;
                    break;
                }
            }
            boolean isInRaisesList = false;
            for (Raises raises : listRaises) {
                if (raises.getRef().equals(ref)) {
                    isInRaisesList = true;
                }
            }

            if(!Finder.isUserExist(firstName, lastName, listUsers)){// user didn't exist
                //error
                System.out.println("Error: the user don't exist, please try again.");
            }
            else {
                if(!isINListItem){//item didn't exist
                    //error
                    System.out.println("Error: the item is not exist, please try again.");
                }else{
                    if(isInRaisesList){//item exist already in the list raises dans la liste raise
                        //error
                        System.out.println("Error: the item is not available, please try again.");
                    }else{
                        //creation
                        Raises raiseCreated = new Raises(firstName, lastName, ref, db, "unpaid");
                        listRaises.add(raiseCreated);
                        System.out.println("Your raise has been create with success, detail:");
                        System.out.println("First name: " + firstName + "\n " + "Last name: " + lastName + "\n " + "Reference: " + ref + "\n " + "Date buy: " + db);

                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error.");
            e.getMessage();
        }
    }




    /**
     * [#12]
     *  this command takes as parameter the reference of an object
     *  if this reference does not exist in the third table, then an error is displayed
     *  if this object is not in a current entry, an error is displayed
     *  if this object is currently in a current entry, then we update the end date (put a random date
     *  but which is greater than the departure date)
     *  display the summary of the entry (last name, first name of the user, object ref, start date, end date)
     * @param listRaises
     */

    public static void endRaise(List<Raises> listRaises) {
        System.out.println("Enter the reference of raise that you want to pay.");
        Scanner s = new Scanner(System.in);
        String ref = s.nextLine();
        System.out.println("Enter the date the you wants to pay.");
        Scanner d = new Scanner(System.in);
        String dp = d.nextLine();
        if(Finder.findTheRaiseInListRaise(ref,listRaises)!=null){ // reference existe dans la troisième table
            if(Finder.findTheRaiseInListRaise(ref, listRaises).getDatePay().equals("unpaid")){// il faut que cette référence ne possède pas de date de fin (deuxieme check)
                Finder.findTheRaiseInListRaise(ref,listRaises).setDatePay(dp);
                System.out.println("Pay success!");
            }else {
                System.out.println("Error: the reference of the item has been paid.");
            }
        }else {
            System.out.println("Error: the reference did't exist in the raises list.");
        }
    }
}
