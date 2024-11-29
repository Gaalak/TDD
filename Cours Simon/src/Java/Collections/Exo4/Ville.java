package Java.Collections.Exo4;

import java.util.HashMap;
import java.util.Map;

public class Ville {

    private String name;
    private int code;
    private Departement dept;

    public Ville (String name, int code, Departement dept){
        this.name = name;
        this.code = code;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public Departement getDept() {
        return dept;
    }

    public int getCode() {
        return code;
    }

    public String getZipcode() {
        return String.format("%02d%d", dept.getNumero(), getCode());
    }
}
