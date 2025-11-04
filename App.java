package spotizer;

import java.time.format.DateTimeFormatter;


public class App{
public static void main(String[] args) {

        // === Création d’un style musical ===
        StyleMusical pop = new StyleMusical("Pop");
        StyleMusical rock = new StyleMusical("Rock");

        // === Création d’illustrations ===
        Illustration cover = new Illustration(1, new byte[]{});
        Illustration logo = new Illustration(2, new byte[]{});

        // === Création d’un artiste et d’un groupe ===
        Groupe groupe = new Groupe();
        Artiste artiste = new Artiste("John Doe", 10000.0f);
        groupe.addArtiste(artiste);
        artiste.setGroupe(groupe);

        // === Création d’un album ===
        Album album = new Album("Greatest Hits");
        artiste.setAlbum(album);

        // === Création de musiques ===
        Musique musique1 = new Musique("Sunshine", (short) 120);
        musique1.setDateDeSortie(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        musique1.addStyle(pop);
        musique1.addIllustration(cover);

        Musique musique2 = new Musique("Night Drive", (short) 95);
        musique2.setDateDeSortie(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        musique2.addStyle(rock);
        musique2.addIllustration(logo);

        // Ajout des musiques à l’album
        album.addMusique(musique1);
        album.addMusique(musique2);

        // === Création d’un utilisateur ===
        Utilisateur utilisateur = new Utilisateur("user@example.com", "Données confidentielles");
        utilisateur.setCreditRestant(12.5f);
        utilisateur.setQualiteAudio(true);

        // === Création d’une playlist ===
        Playlist playlist = new Playlist(1, true);
        playlist.addMusique(musique1);
        playlist.addMusique(musique2);
        utilisateur.addPlaylist(playlist);

        // === Affichage d’informations ===
        System.out.println("🎧 Utilisateur : " + utilisateur.getAdresseMail());
        System.out.println("Qualité audio : " + (utilisateur.isQualiteAudio() ? "Haute" : "Standard"));
        System.out.println("Playlist publique : " + playlist.isPublique());
        System.out.println("Nombre de musiques dans la playlist : " + playlist.getMusiques().size());
        System.out.println("Première musique : " + playlist.getMusiques().get(0).getTitreMusique());

        // === Test du changement Public/Privé ===
        playlist.changementPubliquePrivee();
        System.out.println("Playlist publique après changement : " + playlist.isPublique());
    }
}




