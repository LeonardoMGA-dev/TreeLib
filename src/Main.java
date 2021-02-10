import Algorithms.AlgorithmCreator;
import Tree.*;

public class Main {

    public static void main(String[] args) {



        Tree<String, String> tree = new Tree("172.0.1.2"
                , AlgorithmCreator.breadthFirstSearch());

        tree.setComparator((key, compareItem) ->
             compareItem.equals(key));

        tree.addNode("172.0.1.2", "172.0.1.3", "172.0.1.4", "172.0.1.5");
        tree.addNode("172.0.1.3", "172.0.2.2", "172.0.2.3");
        tree.addNode("172.0.1.4", "172.0.3.2", "172.0.3.3");
        tree.addNode("172.0.1.5", "172.0.4.2", "172.0.4.3");

        System.out.println("\n---------");

        String value =  tree.getValue("172.0.1.5");

        if(value != null){
            System.out.printf("\nNodo encontrado");
        }

    }

}
