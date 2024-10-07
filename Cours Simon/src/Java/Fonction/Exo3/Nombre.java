package Java.Fonction.Exo3;

public class Nombre {

    public static void main(String[] args) {
        var result = AjoutNombre(9).apply(68465165);
        System.out.println(result);
    }

    public static ConcatenationNombre AjoutNombre(Integer nombre){
        return new ConcatenationNombre(nombre);
    }

}
