package _001Zoo;

/**
 * Created by stevebowling on 10/14/16.
 */
public enum Exhibits {

    LION("Big Cat House"),
    BEAR("Bear Cave"),
    SNAKE("Reptile House");


    String location;

    Exhibits(String location){
        this.location=location;
    }

    public String getLocation(){
        return location;
    }
    public static String getSpecie(String specie){
        return specie;
    }

}
