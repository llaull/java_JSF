package beans;

/**
 *
 * @author Moi
 */
public class Ingredient {
    
    private int id;
    private String libelle;
    private String autrePropo;
    
    public Ingredient(){
    
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the autrePropo
     */
    public String getAutrePropo() {
        return autrePropo;
    }

    /**
     * @param autrePropo the autrePropo to set
     */
    public void setAutrePropo(String autrePropo) {
        this.autrePropo = autrePropo;
    }
}
