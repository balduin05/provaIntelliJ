import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // ARRAYLIST:
//ciaoooo
        ArrayList<String> aL = new ArrayList<>();

        System.out.println(" - ARRAY LIST - ");
        System.out.println();
        System.out.println("Size: " + aL.size());

        aL.add("ciao");
        System.out.println(aL);
        System.out.println("Size: " + aL.size());
        System.out.println();

        aL.add("Buonasera");
        System.out.println(aL);
        System.out.println("Size: " + aL.size());
        System.out.println();

        aL.remove(0);
        System.out.println(aL);
        System.out.println("Size: " + aL.size());

        System.out.println(" ----------------------------- ");

        // VECTOR:

        Vector<String> v = new Vector<>(5, 1);

        System.out.println(" - VECTOR - ");
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Size: " + v.size());
        System.out.println();

        v.add("Ciao");
        System.out.println(v);
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Size: " + v.size());
        System.out.println();

        v.add("Notte");
        System.out.println(v);
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Size: " + v.size());
        System.out.println();

        v.add("Notte");
        v.add("Notte");
        v.add("Notte");
        v.add("Notte");
        v.add("Notte");
        v.add("Notte");
        v.add("Notte");
        v.add("Notte");
        System.out.println(v);
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Size: " + v.size());
        System.out.println();

        v.add("Giorno");
        System.out.println(v);
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Size: " + v.size());


    }
}