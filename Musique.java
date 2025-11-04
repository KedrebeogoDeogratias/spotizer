package spotizer;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Musique {
    private String titreMusique;
    private DateTimeFormatter dureeMusique;
    private short tempo;
    private DateTimeFormatter dateDeSortie;

    private Album album;
    private ArrayList<StyleMusical> styles;
    private ArrayList<Illustration> illustrations;

    public Musique(String titreMusique, short tempo) {
        this.titreMusique = titreMusique;
        this.tempo = tempo;
        this.styles = new ArrayList<>();
        this.illustrations = new ArrayList<>();
    }

    public String getTitreMusique() {
        return titreMusique;
    }

    public void setTitreMusique(String titreMusique) {
        this.titreMusique = titreMusique;
    }

    public DateTimeFormatter getDureeMusique() {
        return dureeMusique;
    }

    public void setDureeMusique(DateTimeFormatter dureeMusique) {
        this.dureeMusique = dureeMusique;
    }

    public short getTempo() {
        return tempo;
    }

    public void setTempo(short tempo) {
        this.tempo = tempo;
    }

    public DateTimeFormatter getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(DateTimeFormatter dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }

    public ArrayList<StyleMusical> getStyles() {
        return styles;
    }

    public void addStyle(StyleMusical style) {
        this.styles.add(style);
    }

    public ArrayList<Illustration> getIllustrations() {
        return illustrations;
    }

    public void addIllustration(Illustration illustration) {
        this.illustrations.add(illustration);
    }
}
