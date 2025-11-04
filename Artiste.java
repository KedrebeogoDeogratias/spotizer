package spotizer;

public class Artiste {
    private String nomArtiste;
    private float revenues;
    private Groupe groupe;
    private Album album;

    public Artiste(String nomArtiste, float revenues) {
        this.nomArtiste = nomArtiste;
        this.revenues = revenues;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }

    public void setNomArtiste(String nomArtiste) {
        this.nomArtiste = nomArtiste;
    }

    public float getRevenues() {
        return revenues;
    }

    public void setRevenues(float revenues) {
        this.revenues = revenues;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
