package spotizer;

import java.util.ArrayList;

public class Album {
    private String titreAlbum;
    private ArrayList<Musique> musiques;

    public Album(String titreAlbum) {
        this.titreAlbum = titreAlbum;
        this.musiques = new ArrayList<>();
    }

    public String getTitreAlbum() {
        return titreAlbum;
    }

    public void setTitreAlbum(String titreAlbum) {
        this.titreAlbum = titreAlbum;
    }

    public ArrayList<Musique> getMusiques() {
        return musiques;
    }

    public void addMusique(Musique musique) {
        this.musiques.add(musique);
    }
}
