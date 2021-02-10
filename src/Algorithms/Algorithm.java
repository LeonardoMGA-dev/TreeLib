package Algorithms;

import Tree.Comparator;
import Tree.Node;

import java.util.ArrayList;

public interface Algorithm<KEY, T> {
    Node<T> run(Node<T> startNode, KEY searchValue, Comparator comparator);
}
