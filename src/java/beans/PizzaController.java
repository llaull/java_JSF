package beans;

import helpers.Taille;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
    
    private Map<String,Integer> taillesPizzas;
    private List<Ingredient> ingredientsPizzas;
    private Map<String,Integer> moyensPaiement;
    private Map<String,Integer> listeGenres;
    
    //constructor !!
    public PizzaController(){
        peuplerTailles();
      //  peuplerIngredients();
      //  peuplerMoyensPaiement();
      //  peuplerListeGenres();
        
    }
    
    public void methodePostConstruct(){
        getPizza().setPaiement(-1);
        System.out.println("");
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
    public Map<String,Integer> getTaillesPizzas() {
        return taillesPizzas;
    }

    /**
     * @param taillesPizzas the taillesPizzas to set
     */
    public void setTaillesPizzas(Map<String,Integer> taillesPizzas) {
        this.taillesPizzas = taillesPizzas;
    }
    
    
}
