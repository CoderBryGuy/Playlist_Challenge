package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static AlbumList albumList = new AlbumList();
    private static PlayList playList = new PlayList(albumList);

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

	    initiateAlbums();
	   // playSongs();
    }

    private static void playSongs() {
        LinkedList<Song> songLinkedList = playList.getPlayList();
        ListIterator<Song> listIterator = songLinkedList.listIterator();

        if(songLinkedList.isEmpty()){
            System.out.println("There are no songs in list");
        }else{
            System.out.println("Now playing " + listIterator.next().getTitle());
        }

        //was working here


    }

    private static void initiateAlbums() {

        int choice;
        boolean quit = false;
        Album currentAlbum = new Album("blank");
        Album createdAlbum = new Album("blank");

        while(!quit){
            System.out.println("Choose an option");
            System.out.print("0 - repeat menu\n" +
                    "1 - create new album \n" +
                 /*   "2 - add songs to album \n" +
                    "3 - save and another album\n" +*/
                    "4 - save and quit\n"+
                    "5 - print album list\n");

            choice = scanner.nextInt();

            switch(choice){
                case 0:
                    continue;
                case 1:
                   currentAlbum = createAlbum();
                    break;
            /*    case 2:
                    createdAlbum = addSongToAlbum(currentAlbum);
                     break;
                case 3:
                    //addAlbumToList(createdAlbum);

                    break;*/
                case 4:
                    quit = true;
                    break;
                case 5:
                    albumList.printAlbumList();
                    break;
            }
        }
    }

    private static Album createAlbum() {
        System.out.println("Enter album name :");
        scanner.nextLine();
        String albumName = scanner.nextLine();
        System.out.println("Enter artist name; ");
        String artistName = scanner.nextLine();
        Album album = new Album(albumName, artistName);
        album = addSongToAlbum(album);
        albumList.addAlbum(album);
        albumList.printAlbumList();
        return album;
    }

    private static boolean addAlbumToList(Album currentAlbum) {
        return albumList.addAlbum(currentAlbum);
    }

    private static Album addSongToAlbum(Album album) {
        boolean quit = false;
        int choice;
        String title;
        Double duration;


        while(!quit){
            System.out.print("0 - repeat menu\n" +
                    "1 - add song to album \n" +
                    "2 - save and quit \n");
             choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Track: " + (album.numberOfTracks() + 1) +
                            " \nEnter song title: ");
                    scanner.nextLine();
                    title = scanner.nextLine();
                    System.out.println("Enter song duration: ");
                    duration = scanner.nextDouble();
                    album.addSongToAlbum(new Song(title, duration));
                    break;
                case 2:
                    return album;

            }
        }
        return null;
    }


}
