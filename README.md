# TreeLib
Librería para implementación de estructuras de arboles y algoritmos en Java

Esta librería es flexible ya que funciona mediante nodos, estos nodos pueden contener el tipo de valor deseado ya que hace uso de genéricos. El funcionamiento es fácil de entender, la clase Tree requiere de 2 parámetros en su constructor para crear una instancia, un valor inicial y un algoritmo de búsqueda (en este caso el algoritmo Breadth First Search) generado por la clase AlgorithmCreator.
Posteriormente esta instancia requiere de un Comparator, este elemento lo que hace es determinar de forma interna si el elemento n coincide con la llave de búsqueda. 
Finalmente con el uso del método addNode(clave padre, valores nuevos), se le agregan nuevos nodos al árbol de forma dinámica, haciendo uso el algoritmo de búsqueda previamente establecido para encontrar el nodo padre a través de una clave y agregar los nodos hijos correspondientes a este.
Finalmente, se puede encontrar un valor a través del método getValue(clave).

