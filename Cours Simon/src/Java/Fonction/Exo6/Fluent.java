package Java.Fonction.Exo6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Fluent<T>{

    T t;

    List<UnaryOperator<T>> modifyType = new ArrayList<>();

    public Fluent (T t){
        this.t = t;
    }

    public Fluent<T> map (UnaryOperator<T> operator){
       this.modifyType.add(operator);
       return this;
    }

    public Fluent<T> compile(){
        var temp = t;
        for (var iteration : modifyType){
            temp = iteration.apply(t);
        }
        System.out.println(temp);
        return this;
    }


    public Fluent<T> toValue (){
        return compile();
    }
}
