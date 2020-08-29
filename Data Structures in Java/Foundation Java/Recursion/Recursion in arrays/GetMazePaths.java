//https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-maze-paths-official/ojquestion#

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        ArrayList<String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sc == dc && sr == dr){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> hpaths = new ArrayList<String>();
        ArrayList<String> vpaths = new ArrayList<String>();
        
        if(sc < dc){
            hpaths = getMazePaths(sr, sc+1, dr, dc);
        }
        if(sr < dr){
            vpaths = getMazePaths(sr+1, sc, dr, dc);
        }
        
        ArrayList<String> path = new ArrayList<>();
        
        for(String hpath : hpaths){
            path.add("h" + hpath);
        }
        for(String vpath : vpaths){
            path.add("v" + vpath);
        }

     return path;   
    }

}