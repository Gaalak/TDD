package Java.Heritage;

import java.util.List;
import java.util.stream.Stream;

class Pelican extends Animal {


    Pelican () {
        super(17, "Pépé le goéland");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Lol, moi je vole.");
    }

    @Override
    public String doStuffDeFou() {
        var trucDeFou =  super.doStuffDeFou();

        return trucDeFou + "oui, non, on ne s'excite pas. Ouvrons le bec";
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;

        if (!(obj instanceof Pelican peliCompared)) return false;

        if (peliCompared.age != this.age) return false;
        if (!peliCompared.name.equals(this.name)) return false;


        return true;
    }

    @Override
    public int hashCode() {
        return age * Stream.of(this.name.toCharArray()).mapToInt(c -> Integer.parseInt(c.toString())).sum();
    }
}
