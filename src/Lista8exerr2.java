
import java.util.ArrayList;
import java.util.Collections;

public class Collection {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
        al.add("Saldo");
        al.add("Saldo1");
        al.add("Saldo2");
        al.add("Saldo3");
        al.add("Saldo4");

        /*Collection método*/

        Collections.sort(al);
        System.out.println("Lista :"+"Collection.sort():\n"+al);
    }
}
