package spotizer;
import java.util.ArrayList;

public class Playlist {
    private int idPlaylist;
    private boolean publique;
    private ArrayList<Musique> musiques;

    public Playlist(int idPlaylist, boolean publique) {
        this.idPlaylist = idPlaylist;
        this.publique = publique;
        this.musiques = new ArrayList<>();
    }

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public boolean isPublique() {
        return publique;
    }

    public void setPublique(boolean publique) {
        this.publique = publique;
    }

    public ArrayList<Musique> getMusiques() {
        return musiques;
    }

    public void addMusique(Musique musique) {
        this.musiques.add(musique);
    }

    // Méthode du diagramme
    public void changementPubliquePrivee() {
        this.publique = !this.publique;
    }
}
