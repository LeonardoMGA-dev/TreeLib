package Algorithms;

import Tree.Node;

import java.util.ArrayList;
import java.util.List;

public abstract class AlgorithmCreator {
    public static Algorithm  breadthFirstSearch(){
        /*
            Metodo de busqueda por profundidad
         */
            /*
                - Crear una lista de tipo FIFO
                - Obtener los nodos hijos del nodo raiz
                - Obtiene los hijos del primer nodo de la lista y lo remueve
                - Agrega los hijos del nodo al final de lista
                - Si encuentra el nodo buscado lo devuelve
             */
        return (startNode, endValue, comparator) -> {
            List<Node> FIFO = new ArrayList<>();

            FIFO.add(startNode);

            boolean ThereAreNodes = true;

            while(ThereAreNodes){
                for(Node item : FIFO){
                    boolean isEqual = comparator.compare(endValue, item.getValue());
                    System.out.print(item.getValue() + "-");
                    if(isEqual){ return item;}
                }
                System.out.println();
                Node firstNode = FIFO.remove(0);
                List<Node> nodesToAdd = firstNode.getChildrenNodes();
                for(Node node : nodesToAdd){
                    FIFO.add(node);
                }
            }
            return null;
        };
    }

    public static Algorithm depthFirstSearch(){
        /*
            - Crea una LIFO
            - Obtiene y quita el primer nodo de la pila
            - Agrega los hijos del nodo a la pila

         */
        return (startNode, searchValue, comparator) -> {
            List<Node> LIFO = new ArrayList<>();
            boolean thereAreNodes = true;
            LIFO.add(startNode);
            Node lastNode = startNode;
            while(thereAreNodes){
                if(lastNode.hasChildren()){
                    List<Node> nodes = lastNode.getChildrenNodes();
                    for(Node item : nodes){
                        System.out.print(item.getValue() + "-");
                        LIFO.add(item);
                    }
                    System.out.println();
                }
                lastNode = LIFO.remove(LIFO.size() - 1 );
                if(comparator.compare(searchValue, lastNode.getValue())){
                    return lastNode;
                }
            }

            return null;
        };
    }



}
