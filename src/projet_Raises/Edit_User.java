package projet_Raises;

import java.util.List;
import java.util.Scanner;

public class Edit_User {

    /**
     [# 4] edit user <firstname> <lastname>
     the command will modify an already registered user
     - the command searches for a user with the exact surname entered. If the user exists, then the command asks to enter all the new
     parameters one by one. If for a parameter we enter an empty string, we keep the previous value
     - the command will then check the new information entered (as done by adduser) and save the user's modifications IN THE SAME OBJECT
     (we modify the user, we don't create a new one). If an error has occurred in the entry of the new values ​​(ex: the new name and the
     new first name already exist, or else an integer field which contains letters) then we do not modify the user and we display a
     message d 'mistake.
     - if the user sought does not exist in the list, then an error message is displayed.
     - if the user is used in the third table (loans, rentals, auctions, deliveries, actions, transactions), then the modification of this
     user cannot be made and an error message will be displayed
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
                    System.out.println("Edit your age (between 10 and 99), step 'Enter' for keep the same age. ");
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
            } while (ag < 10 || ag > 99 );
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
            userWantEdit.setAge(ag);
            userWantEdit.setCountry(country);
            userWantEdit.setSpecialty(specialty);

            System.out.println("The user has been edited. ");
            System.out.println(userWantEdit);

        } else {
            System.out.println("Error: the user is not found in our list users, please try again.");
        }
    }
}
