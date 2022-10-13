/*collection em java Conta*/


import java.io.*;
import java.util.*;

public class colecoeslita8 {
    public static void main(String[] args){
        //criando instancias de arrays

        //String conta1, conta2, conta3,conta4 = null;
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String>h = new Hashtable();

        //Adicionando elementos no vetor

        v.addElement(1);
        v.addElement(2);

        //Adicionando elementos hashtable

        h.put(1, "Conta1");
        h.put(2,"Conta2");

        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
        System.out.println(h.get(2));


    }
}
