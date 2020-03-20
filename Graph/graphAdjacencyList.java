import java.util.LinkedList; 
public class graphAdjacencyList{
     static class Graph{
         int V;
         LinkedList<Integer> adjacencyListArray[];
         Graph(int size){
            V = size;
            adjacencyListArray = new LinkedList[5];
            for(int i=0;i<V;i++){
                adjacencyListArray[i] = new LinkedList<>();
            }
         }
     }
     
     static void addEdge(Graph g, int start, int end){
         g.adjacencyListArray[start].add(end);
     }
     
     static void printGraph(Graph g){
         for(int i=0;i<g.V;i++){
             System.out.println("Adjacent vertices of Vertex " + i );
             System.out.print("Head");
             for(Integer node:g.adjacencyListArray[i]){
                 System.out.print("->"+node);
             }
             System.out.println();
         }
     }
     public static void main(String []args){
         Graph adjacencyListGraph = new Graph(5);
         addEdge(adjacencyListGraph, 0, 1);
         addEdge(adjacencyListGraph, 0, 2);
         addEdge(adjacencyListGraph, 0, 3);
         addEdge(adjacencyListGraph, 0, 4);
         addEdge(adjacencyListGraph, 1, 2);
         addEdge(adjacencyListGraph, 1, 4);
         addEdge(adjacencyListGraph, 1, 0);
         addEdge(adjacencyListGraph, 3, 1);
         addEdge(adjacencyListGraph, 4, 1);
         addEdge(adjacencyListGraph, 2, 1);
         addEdge(adjacencyListGraph, 2, 4);
         addEdge(adjacencyListGraph, 3, 4);
         printGraph(adjacencyListGraph);
     }
}