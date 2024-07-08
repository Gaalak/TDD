package Java.genericite.exogenericite.pair;

public class Pair<T> {

    private final T element1;
    private final T element2;

    public Pair(T pair1,T pair2){
        this.element1 = pair1;
        this.element2 = pair2;
    }

    public boolean areEquals() {
        return element1.equals(element2);
    }

    public Pair<T> getInversePair(){

        return new Pair<>(element2, element1);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "pair1=" + element1 +
                ", pair2=" + element2 +
                '}';
    }
}
