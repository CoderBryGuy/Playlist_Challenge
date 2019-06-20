package com.company;

import java.util.ArrayList;


public class AlbumList {

    private ArrayList<Album> albumArrayList;

    public AlbumList() {
        this.albumArrayList = new ArrayList<>();
    }

    public Album findAlbum(Album album){
        for (int i = 0; i < albumArrayList.size(); i++) {
            if(albumArrayList.get(i).equals(album)){
                return album;
            }
        }
        /*return findAlbum(album.getAlbumTitle());*/
        return null;
    }

    public Album findAlbum(String albumTitle){
       return findAlbum(new Album(albumTitle));
    }

    public boolean addAlbum(String title){
        return addAlbum(new Album(title));
    }

    public boolean addAlbum(Album album){
        if(findAlbum(album) == null) {
            System.out.println("adding album");
            albumArrayList.add(album);
            return true;
        }
        return false;
    }

    public boolean removeAlbum(Album album){
        return removeAlbum(album.getAlbumTitle());
    }

    public boolean removeAlbum(String title){
        for (int i = 0; i < albumArrayList.size() ; i++) {
            if(albumArrayList.get(i).getAlbumTitle().equals(title)){
                albumArrayList.remove(i);
              return true;
            }
        }
        return false;
    }

    public Song findSongInAlbumList(String title){
        return findSongInAlbumList(new Song(title));
    }

    public Song findSongInAlbumList(Song song){
        for (int i = 0; i < albumArrayList.size() ; i++) {
            Album album = albumArrayList.get(i);
            if(album.findSong(song) != null) {
                return album.findSong(song);

            }
        }
        return null;
    }

    public void printAlbumList(){


        System.out.println("do something 2");

        for (int i = 0; i < albumArrayList.size() ; i++) {
            System.out.println( albumArrayList.get(i).toString());
        }

 /*      for (Album album : this.albumArrayList) {
           System.out.println(album.toString());
            for (Song song: album.getTrackList()) {
                System.out.println("do something 3");
                album.printTrack(song);
                System.out.println(song.toString());
            }
        }*/
    }
}
