
package grafo;

import static grafo.Grafo.bfs;
import java.util.List;
import java.util.Scanner;


public class MainGrafo {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de vértices do grafo: ");
        int numVertices = sc.nextInt();
        int sumArestas = 0;
        int grauMin = -1;
        int grauMax = 0;
        int[][] grafo = new int[numVertices + 1][numVertices + 1];
        for (int i = 0; i < numVertices; i++) {
            System.out.println("Digite o número de arestas para o vértice " + (i + 1) + ": ");
            int numArestas = sc.nextInt();
            for (int j = 0; j < numArestas; j++) {
                System.out.println("Digite o vértice conectado à aresta " + (j + 1) + " do vértice " + (i + 1) + ": ");
                int verticeConectado = sc.nextInt() - 1;
                grafo[i][verticeConectado] = 1;
                grafo[verticeConectado][i] = 1;
            }
            
            if(grauMin == -1 || grauMin > numArestas){
                grauMin = numArestas;
            }
            if(grauMax < numArestas){
                grauMax = numArestas;
            }
            
            
            
            sumArestas += numArestas;
            
        }
        System.out.println("A matriz representativa do grafo é:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(grafo[i][j] + " ");
            }
            System.out.println();           
        
        }
        
        System.out.println("O número de vértices é: " + numVertices);
        System.out.println("O número de arestas é: " + sumArestas);
        System.out.println("O grau mínimo é: " + grauMin);
        System.out.println("O grau máximo é: " + grauMax);  
        
        int[][] adjMatrix = {
                {0, 1, 0, 1},
                {1, 0, 1, 1},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(bfs(adjMatrix, 0));
        
                
    }
       
    
}
    

