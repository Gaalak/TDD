package Java.Collections.Exo4;

import java.util.HashMap;
import java.util.Map;

public class Ville {

    private String name;
    private int code;
    private HashMap<Integer,String> dept;

    public Ville (String name, int code, HashMap<Integer,String> dept){
        this.name = name;
        this.code = code;
        this.dept = dept;
    }

}
