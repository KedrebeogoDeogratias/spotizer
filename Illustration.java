package spotizer;
public class Illustration {
    private int idIllustration;
    private byte[] image;

    public Illustration(int idIllustration, byte[] image) {
        this.idIllustration = idIllustration;
        this.image = image;
    }

    public int getIdIllustration() {
        return idIllustration;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
