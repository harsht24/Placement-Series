//https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-path-with-jumps-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n-1, m-1);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
         ArrayList<String> paths = new ArrayList<>();
         
        // horizontal
        for(int ms = 1; ms <= dc-sc; ms++){
           ArrayList<String>  hpaths = getMazePaths(sr, sc+ms, dr, dc);
            
            for(String hpath : hpaths){
                 paths.add("h"+ ms + hpath);
            }
        }
        
        // vertical
        for(int ms = 1; ms <= dr-sr; ms++){
            ArrayList<String> vpaths = getMazePaths(sr+ms, sc, dr, dc);
            
            for(String vpath : vpaths){
                paths.add("v"+ ms + vpath);
            }
        }
        
        // diagonal
         for(int ms = 1; ms <= dr-sr && ms <= dc-sc; ms++){
            ArrayList<String> dpaths = getMazePaths(sr+ms, sc+ms, dr, dc);
            
            for(String dpath : dpaths){
                paths.add("d"+ ms + dpath);
            }
        }
        
        
        
        return paths;
    }

}