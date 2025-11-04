package spotizer;
import java.util.ArrayList;

public class Groupe {
    private ArrayList<Artiste> listeArtistes;

    public Groupe() {
        this.listeArtistes = new ArrayList<>();
    }

    public ArrayList<Artiste> getListeArtistes() {
        return listeArtistes;
    }

    public void addArtiste(Artiste artiste) {
        this.listeArtistes.add(artiste);
    }
}
