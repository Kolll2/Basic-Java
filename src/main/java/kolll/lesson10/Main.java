package kolll.lesson10;

import kolll.lesson10.entity.Artist;
import kolll.lesson10.entity.factories.ArtistFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArtistFactory artistFactory = new ArtistFactory();

        System.out.println(artistFactory.getSinger().toString());

//        artistFactory.getSingers(100)
//                .stream()
//                .forEach(artist -> System.out.println(artist.toString()));

        allArtistsFromCountry();
    }

    public static void allArtistsFromCountry (){

        ArtistFactory artistFactory = new ArtistFactory();

        List<Artist> artists = artistFactory.getSingers(100);

        artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .forEach(artist -> {
                    System.out.println(" \t " + artist.toString());
                });

        long countArtists = artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .count();

        System.out.println("total artists from London " + countArtists);

        artists = artists.stream()
                .filter(artist -> artist.isFrom("Samara"))
                .collect(Collectors.toList());

        artists.stream()
                .forEach(artist -> System.out.println(artist.toString()));
    }

}

