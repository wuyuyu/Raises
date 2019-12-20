package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Order {
    public Order() {
    }

    /**
     * help
     */
    public static void help() {
        System.out.println("================MENU========= 菜单 ================MENU====================");
        System.out.println("Step 1 for help ＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙");
        System.out.println("Step 2 to exit.");
        System.out.println("Step 3 to add a user. ");
        System.out.println("Step 4 to edited a user. ");
        System.out.println("step 5 to remove a user.");
        System.out.println("step 6 to list all user.");
        System.out.println("step 7 to add a item.");
        System.out.println("step 8 to edited a item.");
        System.out.println("Step 9 to remove a item. ");
        System.out.println("Step 10 to list all item.");
        System.out.println("Step 11 to create a raise.");
        System.out.println("Step 12 to end a raise.");
        System.out.println("Step 13 to list all raises.");
        System.out.println("Step 14 to save.");
        System.out.println("Step 15 to restore.＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／＼⊙＿⊙／");
    }

    /**
     * get choice and
     * @return
     */
    public static int getUserChoice() {
        System.out.println("Enter your order here ==== 请输入您的指令 ==== Rentrez un numéro de commande");
        Scanner sc = new Scanner(System.in);

        int choice;
        try {
            choice = sc.nextInt();
        } catch (Exception var3) {
            System.out.println("Error: Please enter a number between 1 and 15.");
            choice = -1;
        }
        if (choice < 0) {
            choice = -1;
        }
        return choice;
    }

    /**
     *
     * @param cmdNumber
     * @param listUsers
     * @param listItems
     * @param listRaises
     */
    public static void processCmd(int cmdNumber, List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {

        if (cmdNumber == 1) {
            Order.help();
        }
        if (cmdNumber == 3) {
            Create_Remove_Users.createAddUser(listUsers);
        }
        if (cmdNumber == 4) {
            Edit_User.editUser(listUsers);
        }
        if (cmdNumber == 5) {
            Create_Remove_Users.removeUser(listUsers,listRaises);
        }
        if (cmdNumber == 6) {
            if(!listUsers.isEmpty()) {
                for (User user : listUsers) {
                    System.out.println(user);
                }
            }
            else {
                System.out.println("User list is empty, please create the users.");
            }
        }
        if (cmdNumber == 7) {
            Create_Remove_Items.createAddItem(listItems,listRaises);
        }
        if (cmdNumber == 8) {
            Edit_Items.editItem(listItems,listRaises);
        }
        if (cmdNumber == 9) {
            Create_Remove_Items.removeItem(listItems,listRaises);
        }
        if (cmdNumber == 10) {
            if(!listItems.isEmpty()) {
                for (Items items: listItems) {
                    System.out.println(items);
                }
            }
            else {
                System.out.println("Item list is empty, please create the items.");
            }
        }
        if (cmdNumber == 11) {
            Create_End_Raises.createAddRaises(listUsers,listItems,listRaises);
        }
        if (cmdNumber == 12) {
            Create_End_Raises.endRaise(listRaises);
        }
        if (cmdNumber == 13) {
            if(!listRaises.isEmpty()){
                for(Raises raises: listRaises){
                    System.out.println(raises);
                }
            }else {
                System.out.println("Raises list is empty, please create the raises.");
            }
        }
        if (cmdNumber == 14) {
            Save_Restore.save(listUsers,listItems,listRaises);
        }
        if (cmdNumber == 15) {
            Save_Restore.restore(listUsers,listItems,listRaises);
            System.out.println("bibimbap");
        }

    }
}