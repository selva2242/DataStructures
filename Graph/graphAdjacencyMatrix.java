import java.util.LinkedList; 
public class graphAdjacencyMatrix{
     static class Graph{
         int V;
         int[][] adjacencyMatrix;
         Graph(int size){
            V = size;
            adjacencyMatrix = new int[V][V];
         }
     }
     
     static void addEdge(Graph g, int start, int end){
         g.adjacencyMatrix[start][end] = 1;
     }
     
     static void printGraph(Graph g){
         for(int i=0;i<g.V;i++){
             System.out.println("Adjacent vertices of Vertex " + i );
             System.out.print("Head");
             for(int j=0;j<g.V;j++){
                 if(g.adjacencyMatrix[i][j]==1)
                    System.out.print("->"+j);
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