package Tree;

import java.util.*;
import java.util.stream.Collectors;

public class Node <T> implements Comparable<T> {
    private T value;
    private int level;
    private TreeSet<Node<T>> childrenNodes;

    public Node(T value) {
        this.value = value;
        childrenNodes = new TreeSet<>();
    }

    public T getValue(){
        return value;
    }

    public void addChildrenNodes(T... childrenNodes){
        for(T item : childrenNodes){
            this.childrenNodes.add(new Node<T>(item));
        }
    }

    public void addChildrenNodes(Node<T>... childrenNodes){
        for(Node<T> item : childrenNodes){
            this.childrenNodes.add(item);
        }
    }

    public List<Node<T>> getChildrenNodes(){
        return childrenNodes.stream().collect(Collectors.toList());
    }

    public boolean hasChildren(){
        return !childrenNodes.isEmpty();
    }


    @Override
    public int compareTo(T o) {
        return o.hashCode();
    }
}
