// https://www.pepcoding.com/resources/online-java-foundation/graphs/perfect-friends-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {
   public static class Edge{
       int v; // vertex
       int n; // neighbour
       Edge(int v, int n){
           this.v = v;
           this.n = n;
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      // write your code here
      
      ArrayList<Edge>[] graph = new ArrayList[n];
      for(int v=0; v<n; v++){
          graph[v] = new ArrayList<>();
      }
      for(int e=0; e<k; e++){
          String line = br.readLine();
          int v1 = Integer.parseInt(line.split(" ")[0]);
          int v2 = Integer.parseInt(line.split(" ")[1]);
          
          graph[v1].add(new Edge(v1, v2));
          graph[v2].add(new Edge(v2, v1));
      }
      boolean[] visited = new boolean[n];
      ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
      for(int v=0; v<n; v++){
          if(visited[v]==false){
              ArrayList<Integer> comp = new ArrayList<>();
              drawTreeAndCreateComponent(graph, v, comp, visited);
              comps.add(comp);
          }
      }
      int pairs = 0;
      
      for(int i=0; i<comps.size(); i++){
          for(int j=i+1; j<comps.size(); j++){
              int count = comps.get(i).size() * comps.get(j).size();
              pairs += count;
          }
      }
      System.out.println(pairs);
   }
   
   public static void drawTreeAndCreateComponent(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp, boolean[] visited){
       visited[src] = true;
       comp.add(src);
       
       for(Edge e : graph[src]){
           if(visited[e.n]==false){
               drawTreeAndCreateComponent(graph, e.n, comp, visited);
           }
       }
   }

}