package com.javastart.streamcollections.song;

import java.util.List;
import java.util.stream.Collectors;

import static com.javastart.streamcollections.song.Song.Genre.POP;


class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", POP)
        );

        long time = calculateTime(songs, Song.Genre.METAL);
        System.out.println(String.format("Time of all metal songs: '%s' s.", time));

        long metallica = countArtists(songs, "Metallica");
        System.out.println(String.format("No of metallica songs in a list: '%s' s.", metallica));

        List<Song> songList = filterSongsByType(songs, POP);
        songList.stream()
                .forEach(System.out::println);
    }

    private static List<Song> filterSongsByType(List<Song> songs, Song.Genre type) {
        return songs.stream()
                .filter(song -> !song.getGenre().equals(type))
                .distinct()
                .collect(Collectors.toList());
    }

    private static long countArtists(List<Song> songs, String artist) {
        return songs.stream()
                .filter(song -> song.getArtist().equals(artist))
                .count();
    }

    private static long calculateTime(List<Song> songs, Song.Genre type) {

        return songs.stream()
                .filter(song -> song.getGenre().equals(type))
                .mapToLong(Song::getLength)
                .sum();
    }

}