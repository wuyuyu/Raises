package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Order {
    public Order() {
    }

    public static void help() {
        System.out.println("MENU : ");
        System.out.println("Step 1 for help ... ");
        System.out.println("Step 2 to exit.");
        System.out.println("Step 3 to add a user. ");
        System.out.println("Step 4 to edited a user. ");
        System.out.println("step 5 to remove a user.");
        System.out.println("step 6 to list all user.");
        System.out.println("step 7 to add a item.");
        System.out.println("step 8 to edited a object.");
        System.out.println("Step 9 to remove a object. ");
        System.out.println("Step 10 to list all objects.");
        System.out.println("Step 11 to create a raise.");
        System.out.println("Step 12 to end a raise.");
        System.out.println("Step 13 to list all raises.");
        System.out.println("Step 14 to save.");
        System.out.println("Step 15 to restore.");
    }

    public static int getUserChoice() {
        System.out.println("====== Enter your order here : ");
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

    public static void processCmd(int cmdNumber, List<User> listUsers, List<Items> listItems, List<Raises> listRaises) {

        if (cmdNumber == 1) {
            Order.help();
        }
        if (cmdNumber == 3) {
            OperationUsers.createAddUser(listUsers);
        }
        if (cmdNumber == 4) {
            EditAUser.editUser(listUsers);
        }
        if (cmdNumber == 5) {
            OperationUsers.removeUser(listUsers);
        }
        if (cmdNumber == 6) {
        }
        if (cmdNumber == 7) {
        }
        if (cmdNumber == 8) {
            System.out.println("88888");
        }
        if (cmdNumber == 9) {
        }
        if (cmdNumber == 10) {
        }
        if (cmdNumber == 11) {
        }
        if (cmdNumber == 12) {
        }
        if (cmdNumber == 13) {
        }
        if (cmdNumber == 14) {
        }
        if (cmdNumber == 15) {
            System.out.println("1155555");
        }

    }
}