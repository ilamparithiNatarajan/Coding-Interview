package samples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//import org.apache.commons.codec.binary.Base64;
//
public class Base {
    public static void main(String[] args) {
        HashMap<Integer, Integer> ilam = new HashMap<>();
        ilam.put(1, 10);
        ilam.put(2, 11);
        ilam.put(3, 12);
        ilam.put(3, 13);
        ilam.put(4, 14);
        ilam.put(5, 15);
        for (Map.Entry<Integer, Integer> integerIntegerEntry : ilam.entrySet()) {
            Map.Entry me = integerIntegerEntry;
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
