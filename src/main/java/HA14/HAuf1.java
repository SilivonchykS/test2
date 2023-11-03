package HA14;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;

public class HAuf1 {
    public static void main(String[] args) {
        //Создайте список типа String: в одном имена, в другом фамилии.
        // Создайте третий список: имена и фамилии. Третий список вывести на экран
        var name = new ArrayList<String>();
        Collections.addAll(name, "Mark", "Daniel", "Sandra", "Svetlana");
        //name.add("Mark");
        //name.add("Daniel");
        // name.add("Sandra");
        //  name.add("Svetlana");
        var familiename = new ArrayList<String>();
        Collections.addAll(familiename, "Muller", "Apfelholz", "Ruppert", "Silivonchik");
        // familiename.add("Muller");
        // familiename.add("Apfelholz");
        // familiename.add("Ruppert");
        //  familiename.add("Silivonchik");
            System.out.println("Error");
        for (int i=0;i<name.size();i++){
        // String result= name.get(i) + "   " +familiename.get(i));
       // System.out.println(result);

    }
}}
