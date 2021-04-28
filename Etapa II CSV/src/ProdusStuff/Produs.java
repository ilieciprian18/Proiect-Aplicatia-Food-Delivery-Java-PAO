package ProdusStuff;

import java.util.ArrayList;
import java.util.List;

public class Produs {
    protected String nume;
    protected float pret;
    private List<Ingredient> ingrediente = new ArrayList<Ingredient>();

    public Produs() {
    }

    public Produs(String nume, float pret, List<Ingredient> ingrediente) {
        this.nume = nume;
        this.pret = pret;
        this.ingrediente = ingrediente;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public List<Ingredient> getIngrediente() {
        return ingrediente;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public void setIngrediente(List<Ingredient> ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        return "Nume Produs: " + nume + ", pret: " + pret +
                ", ingrediente: " + ingrediente +'\n';
    }

    /*
    @Override
    public int compareTo(Produs p){
        return this.getNume().compareTo(p.getNume());
    }
     */
}
