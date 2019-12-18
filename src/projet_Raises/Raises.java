package projet_Raises;

/**
 * [>] Les enchères
 * - nom de l'acquéreur (chaine de caractères)
 * - le prénom de l'acquéreur (chaine de caractères)
 * - la référence de l'objet (chaine de caractères)
 * - la date du jour de l'enchère (vous êtes libres du format exact à implémenter)
 * - la date de paiement de l'enchère (vous êtes libres du format exact à implémenter. N'oubliez pas de spécifier la valeur à utiliser pour une enchère qui n'a pas encore été payée)
 */

public class Raises {
    private String firstName;
    private String lastName;
    private String ref;
    private String dateBuy;
    private String datePay;

    public Raises(String firstName, String lastName, String ref, String dateBuy, String datePay) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ref = ref;
        this.dateBuy = dateBuy;
        this.datePay = datePay;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDateBuy() {
        return dateBuy;
    }

    public void setDateBuy(String dateBuy) {
        this.dateBuy = dateBuy;
    }

    public String getDatePay() {
        return datePay;
    }

    public void setDatePay(String datePay) {
        this.datePay = datePay;
    }

    @Override
    public String toString() {
        return "Raises{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ref='" + ref + '\'' +
                ", dateBuy='" + dateBuy + '\'' +
                ", datePay='" + datePay + '\'' +
                '}';
    }
}