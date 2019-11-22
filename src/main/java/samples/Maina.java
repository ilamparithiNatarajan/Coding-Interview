package samples;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

public class Maina {
    static Logger logger = Logger.getLogger(Maina.class.getName());

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();
//        set2 = null;
        set1.add("ilam");
        set1.retainAll(set2);
        if (set1.isEmpty()) {
//            System.out.println("Hello World!");
            logger.info("Hello world");
//            logger.log(LOGGER. , "HELLO");
            System.out.printf("");
        }


    }
}
