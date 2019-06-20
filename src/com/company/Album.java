package com.company;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    private ArrayList<Song> trackList;
    private String artist;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        this.trackList = new ArrayList<>();
   }

    public Album(String albumTitle, ArrayList<Song> trackList) {
        this.albumTitle = albumTitle;
        this.trackList = trackList;
    }

    public Album(String albumTitle, String artist) {
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.trackList = new ArrayList<>();
    }


    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
      return albumTitle + ": " + artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getTrackList() {
        return trackList;
    }

    public boolean addSongToAlbum(String title, double duration){
       return addSongToAlbum(new Song(title, duration));
    }

    public boolean addSongToAlbum(Song song){
        if(findSong(song) == null) {
            trackList.add(song);
            return true;
        }
        return false;
    }

    public Song findSong(Song song){
        return findSong(song.getTitle());
    }

    public Song findSong(String title){
        for (int i = 0; i < trackList.size() ; i++) {
            if(trackList.get(i).getTitle().equals(title)){
                return trackList.get(i);
            }
        }
        return null;
    }

    public int numberOfTracks(){
        return trackList.size();
    }

    public int findTrack(Song song){

        for (int i = 0; i < trackList.size() ; i++) {
           if(trackList.get(i).getTitle().equals(song.getTitle())){
                return trackList.indexOf(song.getTitle());
            }
        }
        return -1;


    }

    public void printTrack(Song song){
        System.out.println("Track: " + findTrack(song));
    }

    public int findTrack(String title){
        return findTrack(new Song(title));
    }

    public boolean removeSong(Song song){
        return removeSong(song.getTitle());
    }

    public boolean removeSong(String title){
        for (int i = 0; i < trackList.size() ; i++) {
            if(trackList.get(i).getTitle().equals(title)){
                trackList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printAllTracks(){

        for (int i = 0; i < trackList.size(); i++) {
            System.out.println(trackList.get(i).toString());
        }

     /*   for (Song song: this.trackList
             ) {
            song.toString();
        }*/
    }
}
