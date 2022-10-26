
import java.util.*;

/**
 * 
 */
public class Kühlschrank {

    /**
     * Default constructor
     */
    public Kühlschrank() {
    }

    /**
     * 
     */
    public String modell;

    /**
     * 
     */
    public String version;

    /**
     * 
     */
    public AccountManager accountmanager;

    /**
     * 
     */
    public EinkaufManager einkaufsmanager;

    /**
     * 
     */
    public Bestandscontroler nahrungsmittelmanager;

    /**
     * 
     */
    private Number bestandszahl;

    /**
     * 
     */
    public ErnährungsplanManager ernährungsplanmanager;

    /**
     * 
     */
    public RezeptManager rezeptmanager;

    /**
     * 
     */
    public int temperatur;

    /**
     * 
     */
    public boolean offen;

    /**
     * 
     */
    private ArrayList<ErnährungsplanT> ernährungspläne;    //?

    /**
     * 
     */
    private ArrayList<EinkaufslisteT> einkaufsliste;

    /**
     * 
     */
    private ArrayList<Rezept> rezeptliste;

    /**
     * 
     */
    private static Kühlschrank singleton;

    /**
     * 
     */
    public ArrayList<Nahrungsmittel> bestand;

    /**
     * 
     */
    private int kapazität;

    /**
     * 
     */
    public void Kühlschrank() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Nahrungsmittel_anzeigen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Nahrungsmittel_hinzufügen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Nahrungsmittel_entfernen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Nahrungsmittel_bearbeiten() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Nahrungsmittel_suchen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Einkaufsliste_anzeigen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Einkauf_anlegen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Einkauf_löschen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Einkaufsliste_bearbeiten() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Rezepte_anzeigen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Einkaufslisten_suchen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Ernährungsplan_anzeigen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Ernährungsplan_anlegen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Ernährungsplan_löschen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Ernährungsplan_bearbeiten() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Ernährungspläne_suchen() {
        // TODO implement here
    }

    /**
     * 
     */
    public void Rezept_suchen() {
        // TODO implement here
    }

    /**
     * @param temperatur 
     * @return
     */
    private void setTemperatur(double temperatur) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int getTemperatur() {
        // TODO implement here
        return 0;
    }

    /**
     * @param msg 
     * @return
     */
    public void sendMessage(String msg) {
        // TODO implement here
    }

    /**
     * @return
     */
    public static Kühlschrank getInstance() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public ArrayList<Nahrungsmittel> bestandAnzeigen() {
        // TODO implement here
        return null;
    }

    /**
     * @param n 
     * @return
     */
    public boolean bestandErweitern(Nahrungsmittel n) {
        // TODO implement here
        return false;
    }

    /**
     * @param nahrungsmittel  
     * @param x 
     * @return
     */
    public boolean bestandVerringern(Nahrungsmittel nahrungsmittel , int x) {
        // TODO implement here
        return false;
    }

    /**
     * @return
     */
    public ArrayList<Nahrungsmittel> bestandAnalysieren() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    private ArrayList<Nahrungsmittel> kontrollieren() {
        // TODO implement here
        return null;
    }

    /**
     * @param s 
     * @return
     */
    public Nahrungsmittel suchen(String s) {
        // TODO implement here
        return null;
    }

    /**
     * 
     */
    public void Operation1() {
        // TODO implement here
    }

}