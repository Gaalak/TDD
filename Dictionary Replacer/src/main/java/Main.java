import java.util.Dictionary;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        “\$temp\$“, dict [“temp”, “temporary”], output: “temporary”
        String result = Dict.add("$temp$", Map.of("temp","temporary"));
        System.out.println(result);
    }
}
