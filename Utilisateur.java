package spotizer;
import java.util.ArrayList;

public class Utilisateur {
    private String adresseMail;
    private String donneePersonnel;
    private float creditRestant;
    private boolean qualiteAudio;
    private ArrayList<Playlist> playlists;

    public Utilisateur(String adresseMail, String donneePersonnel) {
        this.adresseMail = adresseMail;
        this.donneePersonnel = donneePersonnel;
        this.playlists = new ArrayList<>();
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public String getDonneePersonnel() {
        return donneePersonnel;
    }

    public float getCreditRestant() {
        return creditRestant;
    }

    public void setCreditRestant(float creditRestant) {
        this.creditRestant = creditRestant;
    }

    public boolean isQualiteAudio() {
        return qualiteAudio;
    }

    public void setQualiteAudio(boolean qualiteAudio) {
        this.qualiteAudio = qualiteAudio;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void addPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }
}
 