
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class ArrayListDemos {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Beth");

        System.out.println(names.get(0));
        System.out.println(names.get(1));

        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        names.add(0, "Beth");
        names.set(1, "Bob");

        System.out.println(names);

        System.out.println(names.size());
        
        
        ArrayList<Integer> months = new ArrayList<Integer>();
        months.add(1);
        months.add(2);
                
        ArrayList<Double> moneys = new ArrayList<Double>();
    }
}
