import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dict {

     static String add(String enter,Map<String,String> dictionary){
         String definition = "pas de $ trouvé";
         if (enter.contains("$")) {
                int index = enter.indexOf("$");
                int lastindex = enter.indexOf("$",index +1);
                String dictio = enter.substring(index+1,lastindex);
                System.out.println(dictio);

              definition = dictionary.get(dictio);
             if (definition == null) {
                 definition = "le mot n'est pas présent dans le dictionnaire";
             }
             return definition;
         }
         return definition;
    }


}
