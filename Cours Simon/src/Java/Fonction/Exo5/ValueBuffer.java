package Java.Fonction.Exo5;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class ValueBuffer<T> {

    List<UnaryOperator<T>> modifyValue= new ArrayList<>();
    private final T t;
    public ValueBuffer(T t){
        this.t = t;
    }

    public ValueBuffer<T> map(UnaryOperator<T> operation){
        this.modifyValue.add(operation);
        return this;
    }

    public ValueBuffer<T> compile(){
        var temp = t;
        System.out.println(temp);
        for (var operation : modifyValue){
            temp = operation.apply(temp);
            System.out.println(temp);
        }
        return this;
    }



}
