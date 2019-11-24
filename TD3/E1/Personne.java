/**
 * Personne
 */
import Sexe;
public class Personne {
    private String nom;
    private String prenom;
    private int age ;
    private Sexe sexe;

    public Personne(){}
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, int age){
        setNomEtPrenom(nom, prenom);
        setAge(age);
    }
    public Personne(String nom, String prenom, int age,Sexe sexe){
        setNomEtPrenom(nom, prenom);
        setAge(age);
        this.sexe = sexe;
    }
    public Personne(Personne p){
        new Personne(p.nom,p.prenom,p.age,p.sexe);
    }
    public void setNomEtPrenom(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public void setAge(int age){
        this.age = age > 0 && age <= 130 ? age : -999999999;
    }
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