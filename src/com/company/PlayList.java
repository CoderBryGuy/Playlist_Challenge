package com.company;

import java.util.LinkedList;

public class PlayList {

    private LinkedList<Song> playList;
    private AlbumList albumList;

    public PlayList(AlbumList albumList) {
        this.playList = new LinkedList<>();
        this.albumList = albumList;
    }

    public LinkedList<Song> getPlayList() {
        return playList;
    }

    public AlbumList getAlbumList() {
        return albumList;
    }

    public boolean addSongToPlaylist(Song song){
        if(albumList.findSongInAlbumList(song) != null){
           return playList.add(song);
        }

        return false;
    }

    public boolean addSongToPlaylist(String title){
       return addSongToPlaylist(new Song(title));
    }


}
