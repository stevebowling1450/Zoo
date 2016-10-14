package _001Zoo;

/**
 * Created by stevebowling on 10/13/16.
 */
public class People extends Zoo {
   static int phone;
    static int zip;


    public People(String n, int a, String g, int p, int z) {
        super(n, a, g);
        phone=p;
        zip=z;
    }
}
