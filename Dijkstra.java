import java.util.*;

public class Dijkstra {

    private static int inf = Integer.MAX_VALUE; // Represents infinity
    private int numVertices;
    private int[][] adjacencyMatrix;

    public Dijkstra(int[][] adjacencyMatrix) {
        this.numVertices = adjacencyMatrix.length;
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public void dijkstraAlgorithm(int startVertex) {

        int[] shortestDistances = new int[numVertices]; // stores the shortest distances from the start vertex
        boolean[] visited = new boolean[numVertices]; // keeps track of which vertices have been visited

        // Initialize all distances as infinity and visited as false
        for (int i = 0; i < numVertices; i++) {
            shortestDistances[i] = inf;
            visited[i] = false;
        }

        // Distance to the start vertex is 0
        shortestDistances[startVertex] = 0;

        // Loop through all vertices
        for (int i = 0; i < numVertices - 1; i++) {

            // Find the vertex with the minimum distance from the start vertex
            int minVertex = findMinVertex(shortestDistances, visited);

            // Mark this vertex as visited
            visited[minVertex] = true;

            // Update the distances to adjacent vertices
            for (int j = 0; j < numVertices; j++) {
                if (adjacencyMatrix[minVertex][j] != 0 && !visited[j]) {
                    int newDistance = shortestDistances[minVertex] + adjacencyMatrix[minVertex][j];
                    if (newDistance < shortestDistances[j]) {
                        shortestDistances[j] = newDistance;
                    }
                }
            }
        }

        // Print the shortest distances to all vertices
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Shortest distance from " + startVertex + " to " + i + " is: " + shortestDistances[i]);
        }
    }

    private int findMinVertex(int[] shortestDistances, boolean[] visited) {

        int minVertex = -1;
        for (int i = 0; i < numVertices; i++) {
            if (!visited[i] && (minVertex == -1 || shortestDistances[i] < shortestDistances[minVertex])) {
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {

        int[][] adjacencyMatrix = {
                {0, 2, 0, 6, 0},
                {2, 0, 3, 8, 5},
                {0, 3, 0, 0, 7},
                {6, 8, 0, 0, 9},
                {0, 5, 7, 9, 0}
        };

        Dijkstra dijkstra = new Dijkstra(adjacencyMatrix);
        dijkstra.dijkstraAlgorithm(0);
    }
}
