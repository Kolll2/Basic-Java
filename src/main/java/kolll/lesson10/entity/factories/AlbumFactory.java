package kolll.lesson10.entity.factories;

import kolll.lesson10.entity.Album;

import java.util.List;

public class AlbumFactory {

    public Album getAlbum (){

        Album result;

        result = new Album();

        return result;
    }

    public List<Album> getAlbums(){

        return null;
    }

    private Album getRandomAlbum(){

        return null;

    }


}
