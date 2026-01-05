package product2;


public class Produit {
    int id;
    String nom;
    double prix;
    String categorie;

    public Produit(int id, String nom, double prix, String categorie) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.categorie = categorie;
    }


    public String getNom() { return nom; }
    public double getPrix() { return prix; }
    public String getCategorie() {
        return categorie;}

    public void method (){
        this.
    }


    @Override
    public String toString() {
        return "Produit{nom='" + nom + "', prix=" + prix + "}";
    }
}