package Playlist;

import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {

        ArrayList <String> desertIslandPlaylist = new ArrayList<>();

        desertIslandPlaylist.add("SIGO NA SOMBRA");
        desertIslandPlaylist.add("COMMON GROUND");
        desertIslandPlaylist.add("UNIVERSO");
        desertIslandPlaylist.add("ANTES DOS GIGANTES CHEGAREM ");
        desertIslandPlaylist.add("CASTELOS & RUÍNAS");
        desertIslandPlaylist.add("MINHA CURA");

        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(5);
        desertIslandPlaylist.set(0,"QUADROS");

        System.out.println(desertIslandPlaylist);




    }
}
