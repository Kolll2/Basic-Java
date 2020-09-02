package kolll.lesson10.entity.factories;

import kolll.lesson10.entity.Artist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArtistFactory {

    List<String> nameList;
    List<String> originList;
    List<String> memberList;

    public ArtistFactory() {
        init();
    }

    public Artist getSinger (){
        return getRandomSinger();
    }

    public List<Artist> getSingers (Integer quantity){

        List<Artist> result = new ArrayList<>();

        for (int i = 0; i < quantity ; i++) {
            result.add(getRandomSinger());
        }

        return result;
    }

    private Artist getRandomSinger (){

        Random random = new Random();

        random.nextInt(nameList.size()-1);

        return new Artist(nameList.get(random.nextInt(nameList.size()-1)),
                          memberList.get(random.nextInt(memberList.size())) + " " + random.nextInt(200),
                          originList.get(random.nextInt(originList.size()-1))
                         );
    }

    private void init(){

        nameList = new ArrayList<>();

        nameList.add("Автограф рок группа");
        nameList.add("Агаларов Эмин");
        nameList.add("Агата Кристи");
        nameList.add("Агафонов Владислав");
        nameList.add("Алиса рок группа");
        nameList.add("Ария рок группа");

        memberList = new ArrayList<>();

        memberList.add("Member");

        originList = new ArrayList<>();

        originList.add("London");
        originList.add("Moscow");
        originList.add("Samara");
        originList.add("Lvov");
        originList.add("Paris");
        originList.add("Verde");
        originList.add("Kemer");
        originList.add("Sochi");
        originList.add("Kiev");




    }


}
