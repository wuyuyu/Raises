package projet_Raises;


import javax.swing.*;
import java.util.List;
import java.util.Scanner;

/**
 * the user
 * first name(string)
 * last name(string)
 * country(string)
 * age(integer) between 10 and 99
 * specialty
 *
 * [>] Les acquéreurs
 * - le prénom (chaine de caractères)
 * - le nom (chaine de caractères)
 * - le pays de naissance (chaine de caractères
 * - l'age (entier)
 * - la spécialité de l'acquéreur (chaine de caractère comme 'antiquités', 'horloges', 'vases', 'sculptures', ...)
 */
public class User {
    private String firstName;
    private String name;
    private String country;
    private int age;
    private String specialty;

    public User(String firstName, String name, String country, int age, String specialty) {
        this.firstName = firstName;
        this.name = name;
        this.country = country;
        this.age = age;
        this.specialty = specialty;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", age=" + age +
                ", specialty='" + specialty + '\'' +
                '}';
    }

}
