package test_try_21_9;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        System.out.println("Hello World");

        ArrayList<Workers> listWorkers = new ArrayList<Workers>();
        listWorkers.add(new Workers("Franta","Mrazek", 36000));
        listWorkers.add(new Workers("Vasek","Dostal", 32000));
        listWorkers.add(new Workers("Adam","Matis", 50000));

        //Collections.sort(listWorkers,Collections.reverseOrder());

        System.out.println();
    }

}
