package Tree;

import Algorithms.Algorithm;

public class Tree<KEY, T> {

    private Comparator<KEY, T> comparator;
    private Algorithm<KEY, T> algorithm;
    private Node<T> mainNode;

    public Tree(T mainValue, Algorithm algorithm){
        mainNode = new Node(mainValue);
        this.algorithm = algorithm;
    }

    public void setComparator(Comparator<KEY, T> comparator) {
        this.comparator = comparator;
    }

    public void setAlgorithm(Algorithm<KEY, T> algorithm) {
        this.algorithm = algorithm;
    }

    private Node<T> getNode(KEY searchValue){
        Node<T> foundNode = algorithm.run(mainNode, searchValue, comparator);
        return foundNode;
    }

    public void addNode(KEY parentValue, T... childrenValue){
        Node<T> parentNode = algorithm.run(mainNode, parentValue, comparator);
        parentNode.addChildrenNodes(childrenValue);
    }

    public void connectNode(KEY parentValue, KEY childrenValue){
        Node<T> parentNode = algorithm.run(mainNode, parentValue, comparator);
        Node<T> childNode = algorithm.run(mainNode, childrenValue, comparator);
        parentNode.addChildrenNodes(childNode);
    }



    public T getValue(KEY searchValue){
        Node<T> foundNode = algorithm.run(mainNode, searchValue, comparator);
        return foundNode.getValue();
    }





}
