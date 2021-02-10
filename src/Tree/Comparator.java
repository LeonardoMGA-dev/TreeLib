package Tree;

public interface Comparator <KEY, T>{

    boolean compare(KEY lastValue, T newValue);

}
