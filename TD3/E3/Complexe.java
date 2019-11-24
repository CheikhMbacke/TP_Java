/**
 * Complexe
 */
public class Complexe {

    private int partieReelle;
    private int partieImaginaire;
    public Complexe(){}
    public Complexe(int partieReelle,int partieImaginaire){
        setPartieReelle(partieReelle);
        setPartieImaginaire(partieImaginaire);
    }
    public Complexe(Complexe c){
        setPartieReelle(c.partieReelle);
        setPartieImaginaire(c.partieImaginaire);
    }
    public void setPartieReelle(int partieReelle){
        this.partieReelle = partieReelle;
    }
    public void setPartieImaginaire(int partieImaginaire){
        this.partieImaginaire = partieImaginaire;
    }
    public int getPartieReelle(){
        return this.partieReelle;
    }
    public int getPartieImaginaire(){
        return this.partieImaginaire;
    }
    public Complexe ajouter(Complexe c){
        return new Complexe(this.partieReelle + c.partieReelle,this.partieImaginaire + c.partieImaginaire);
    }
    public Complexe soustraire(Complexe c){
        return new Complexe(this.partieReelle - c.partieReelle,this.partieImaginaire - c.partieImaginaire);
    }
    public String toString() {
        return this.partieReelle+" + i"+this.partieImaginaire;
    }
}