package beans;

import helpers.Taille;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Moi
 */
@Named
@RequestScoped
public class PizzaController {

    @Inject
    private Pizza pizza;

    private Map<String, Integer> taillesPizzas;
    private List<Ingredient> ingredientsPizzas;
    private Map<String, Integer> moyensPaiement;
    private Map<String, Integer> listeGenres;

    //constructor !!
    public PizzaController() {
        peuplerTailles();
        peuplerIngredients();
        peuplerMoyensPaiement();
        peuplerListeGenres();

    }

    @PostConstruct
    public void plup() {
        pizza.setPaiement(-1);
        System.out.println("select pairement -1 ");
    }

    /**
     *
     */
    private void peuplerTailles() {
        taillesPizzas = new LinkedHashMap<>();

        for (Taille t : Taille.values()) {
            getTaillesPizzas().put(t.toString(), t.taille);

        }

    }

    /**
     * @return the pizza
     */
    public Pizza getPizza() {
        return pizza;
    }

    /**
     * @param pizza the pizza to set
     */
    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    /**
     * @return the taillesPizzas
     */
    public Map<String, Integer> getTaillesPizzas() {
        return taillesPizzas;
    }

    /**
     * @param taillesPizzas the taillesPizzas to set
     */
    public void setTaillesPizzas(Map<String, Integer> taillesPizzas) {
        this.taillesPizzas = taillesPizzas;
    }

    /**
     *
     */
    private void peuplerIngredients() {

        setIngredientsPizzas(new LinkedList<>());

        String[] libelles = {"fromage", "olives", "champignons", "poulet", "merguez"};

        for (int i = 0; i < libelles.length; i++) {
            Ingredient ingred = new Ingredient();

            ingred.setId(i);
            ingred.setLibelle(libelles[i]);
            ingred.setAutrePropo("yo " + i);
            getIngredientsPizzas().add(ingred);

        }

        for (Ingredient i : getIngredientsPizzas()) {
            System.out.println("ingredient dispo : " + i.getLibelle());
        }
    }

    /**
     * @return the ingredientsPizzas
     */
    public List<Ingredient> getIngredientsPizzas() {
        return ingredientsPizzas;
    }

    /**
     * @param ingredientsPizzas the ingredientsPizzas to set
     */
    public void setIngredientsPizzas(List<Ingredient> ingredientsPizzas) {
        this.ingredientsPizzas = ingredientsPizzas;
    }

    private void peuplerMoyensPaiement() {
        moyensPaiement = new LinkedHashMap<>();
        moyensPaiement.put("Nature", 0);
        moyensPaiement.put("CB", 1);
        moyensPaiement.put("PayPal", 2);
    }

    public Map<String, Integer> getMoyensPaiement() {
        return moyensPaiement;
    }
    
    private void peuplerListeGenres(){
        listeGenres = new LinkedHashMap<>();
        
        listeGenres.put("Naturel et sauvage",0);
        listeGenres.put("Nocture et urban",1);
        listeGenres.put("doux et calin",2);
        listeGenres.put("Fan des jedis",3);
    }
    
    public Map<String,Integer> getListeGenres(){
        return listeGenres;
    }

}
