/**
 * Personne
 */
enum Sexe{ Masculin,Feminin}
public class Personne {
    private String nom;
    private String prenom;
    private int age ;
    private Sexe sexe;

    public Personne(){}
    /**
     * Constructeur avec comme parametre nom et prenom
     * @param nom
     * @param prenom
     */
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    /**
     * Constructeur avec comme parametre nom,prenom et age
     * @param nom
     * @param prenom
     * @param age
     */
    public Personne(String nom, String prenom, int age){
        setNomEtPrenom(nom, prenom);
        setAge(age);
    }
    /**
     * Constructeur avec tous les attributs de la classe personne
     * @param nom
     * @param prenom
     * @param age
     * @param sexe
     */
    public Personne(String nom, String prenom, int age,Sexe sexe){
        setNomEtPrenom(nom, prenom);
        setAge(age);
        this.sexe = sexe;
    }
    /**
     * Constructeur avec comme parametre une personne
     * @param p
     */
    public Personne(Personne p){
        new Personne(p.nom,p.prenom,p.age,p.sexe);
    }
    /**
     * Setter des champs nom et prenom
     * @param nom
     * @param prenom
     */
    public void setNomEtPrenom(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    /**
     * Setter du champs age
     * @param age
     */
    public void setAge(int age){
        this.age = age > 0 && age <= 130 ? age : -999999999;
    }
    /**
     * Redefinition de la methode toString 
     */
    public String toString(){
        if(this.sexe == null && this.age != 0)
            return "Je m'appelle "+this.prenom+" "+this.nom+", j'ai "+this.age;
        if(this.age == 0 && this.nom != null && this.prenom != null)
            return "Je m'appelle "+this.prenom+" "+this.nom;
        if(this.nom ==null && this.prenom == null)
            return "";
        return "Je m'appelle "+this.prenom+" "+this.nom+", j'ai "+this.age+" et je suis de sexe "+
        this.sexe;
    }
}