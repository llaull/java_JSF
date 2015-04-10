
package beans;

import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author MOI
 */
@RequestScoped
public class Pizza {
    
    private String login;
    private int taille;
    private List<Integer> ingredients;
    private int paiement;
    private List<Integer> genres;
    private boolean keep = false;
    private String commentaire;
    private String email;

    public Pizza() {
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the taille
     */
    public int getTaille() {
        return taille;
    }

    /**
     * @param taille the taille to set
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     * @return the ingredients
     */
    public List<Integer> getIngredients() {
        return ingredients;
    }

    /**
     * @param ingredients the ingredients to set
     */
    public void setIngredients(List<Integer> ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * @return the paiement
     */
    public int getPaiement() {
        return paiement;
    }

    /**
     * @param paiement the paiement to set
     */
    public void setPaiement(int paiement) {
        this.paiement = paiement;
    }

    /**
     * @return the genres
     */
    public List<Integer> getGenres() {
        return genres;
    }

    /**
     * @param genres the genres to set
     */
    public void setGenres(List<Integer> genres) {
        this.genres = genres;
    }

    /**
     * @return the keep
     */
    public boolean isKeep() {
        return keep;
    }

    /**
     * @param keep the keep to set
     */
    public void setKeep(boolean keep) {
        this.keep = keep;
    }

    /**
     * @return the commentaire
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @param commentaire the commentaire to set
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
