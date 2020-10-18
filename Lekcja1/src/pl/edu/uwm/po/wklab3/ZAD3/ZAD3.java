package pl.edu.uwm.po.wklab3.ZAD3;

import java.util.Random;

public class ZAD3 {
    public static void wypisz(int m,int n, int[][] a) {
        for (int i = 0; i < m; i++) {
            System.out.print("[");
            for (int j = 0; j < n-1; j++) {
                System.out.printf("%d, ", a[i][j]);
            }
            System.out.println(a[i][n-1] + "]");
        }
    }
    public static void wypelnij(int n, int m, int a[][]){
        Random rd = new Random();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = rd.nextInt(10)+1;
            }
        }
    }
    public static void nazwa(int m, int n, int k){
        Random rd = new Random();
        int[][] a = new int[m][n];
        int[][] b = new int[n][k];
        int[][] c = new int[m][k];

        wypelnij(m,n,a);
        wypisz(m,n,a);
        wypelnij(n,k,b);
        wypisz(n,k,b);

        for(int i=0; i<m; i++){
//            int il = 1;
            for(int j=0; j<k; j++){
                int suma = 0;
                for(int z=0; z<n;z++){
                    suma += a[i][z]*b[z][j];
                }
                c[i][j] = suma;
            }
        }
        System.out.println("macierz m x k");
        wypisz(m,k,c);
    }
}
