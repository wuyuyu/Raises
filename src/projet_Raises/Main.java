package projet_Raises;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public Main(){
    }
    public static void main(String[] args) {
        System.out.println("Application has started");
        List<User> listUsers = new ArrayList();
        List<Items> listItems = new ArrayList();
        List<Raises> listRaises = new ArrayList();
        Order.help();

        int ch;
        do {
            ch = Order.getUserChoice();
            if (ch != -1) {
                Order.processCmd(ch, listUsers,listItems,listRaises);
            }
        } while(ch != 2);

    }
}
