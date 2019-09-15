package com.intervie.code.MostImportantQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeLadder {
    static class qentry  
    { 
        int cellN0;
        int dist; 
    } 
  
    static int getMinDiceThrows(int move[], int n)  
    { 
        boolean visited[] =new  boolean [n]; 
        Queue<qentry> q = new LinkedList<>(); 
        qentry qe = new qentry(); 
        qe.cellN0 = 0; 
        qe.dist = 0; 
   
        visited[0] = true; 
        q.add(qe); 
  
        while (!q.isEmpty())  
        { 
            qe = q.remove(); 
            int v = qe.cellN0; 
   
            if (v == n - 1) 
                break; 
   
            for (int j = v + 1; j <= (v + 6) && j < n; j++)  
            { 
           
                if (!visited[j]) 
                { 
                  
                    qentry a = new qentry(); 
                    a.dist = (qe.dist + 1); 
                    visited[j] = true; 
 
                    if (move[j] != -1) 
                        a.cellN0 = move[j]; 
                    else
                        a.cellN0 = j; 
                    q.add(a); 
                } 
            } 
        } 
 
        return qe.dist; 
	}

	public static void main(String[] args) {
		int N = 30;
		int moves[] = new int[N];
		for (int i = 0; i < N; i++)
			moves[i] = -1;

		// Ladders
		moves[2] = 21;
		moves[4] = 7;
		moves[10] = 25;
		moves[19] = 28;

		// Snakes
		moves[26] = 0;
		moves[20] = 8;
		moves[16] = 3;
		moves[18] = 6;

		System.out.println("Min Dice throws required is " + getMinDiceThrows(moves, N));
	}

}
