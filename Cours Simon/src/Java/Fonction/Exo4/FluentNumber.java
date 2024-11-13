package Java.Fonction.Exo4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class FluentNumber {

    private final Integer number;
    List<UnaryOperator<Integer>> modifyNumber= new ArrayList<>();


    public FluentNumber(Integer number){
        this.number = number;
    }

    public FluentNumber and(UnaryOperator<Integer> operation){
        this.modifyNumber.add(operation);
        return this;
    }

    public Integer compile(){
        var temp = number;
        for (var operation : modifyNumber){
           temp = operation.apply(temp);
        }
        return temp;
    }

    public FluentNumber printHere(){
        System.out.println(compile());
        return this;
    }
}
