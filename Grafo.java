/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo;




/**
 *
 * @author Bruno Volpiani
 */

    import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Grafo {

    public static List<Integer> bfs(int[][] matrix, int start) {
        // Verificar se a matriz de adjacência está vazia ou se o vértice de início é inválido
        if (matrix.length == 0 || start < 0 || start >= matrix.length) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        // Adicionar o vértice inicial à fila e marcar como visitado
        queue.offer(start);
        visited[start] = true;

        // Realizar a busca em largura
        while (!queue.isEmpty()) {
            int vertex = queue.poll(); // Remove o primeiro elemento da fila

            // Processar o vértice atual
            result.add(vertex+1);

            // Obter os vizinhos não visitados do vértice atual
            List<Integer> neighbors = new ArrayList<>();
            for (int i = 0; i < matrix[vertex].length; i++) {
                if (matrix[vertex][i] == 1 && !visited[i]) {
                    neighbors.add(i);
                    visited[i] = true;
                }
            }

            // Adicionar os vizinhos à fila e marcar como visitados
            for (int neighbor : neighbors) {
                queue.offer(neighbor);
            }
        }

        return result;
    }

 
}


    
    
    

