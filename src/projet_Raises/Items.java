package projet_Raises;

/**
 * the items
 * title(string)
 * reference(string)
 * category(string)
 * rarity(integer) between 0 and 100
 *
 * [>] Les objets
 * - l'intitulé (chaine de caractères)
 * - la référence (chaine de caractères arbitraire et unique, ex: B312)
 * - la catégorie (chaine de caracteres
 * - la rareté (entier en pourcentage de 0 à 100)
 */

public class Items {
    private String title;
    private String reference;
    private String category;
    private int rarity;

    public Items(String title, String reference, String category, int rarity) {
        this.title = title;
        this.reference = reference;
        this.category = category;
        this.rarity = rarity;
    }

    public String getTitle() {
        return title;
    }

    public String getReference() {
        return reference;
    }

    public String getCategory() {
        return category;
    }

    public int getRarity() {
        return rarity;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    @Override
    public String toString() {
        return "Items{" +
                "title='" + title + '\'' +
                ", reference='" + reference + '\'' +
                ", category='" + category + '\'' +
                ", rarity=" + rarity +
                '}';
    }
}
