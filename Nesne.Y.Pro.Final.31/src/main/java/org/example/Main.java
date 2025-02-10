package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] m = getArray();
        int toplam = sum(m);
        System.out.println("Toplam: " + toplam);
    }
    public static int[][] getArray(){
        Scanner input = new Scanner(System.in);
        int[][] m = new int[3][4];
        System.out.println("Giris: " +m.length+ "x ve " + m[0].length + "y ");
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextInt();
            }
        }
        return m;
    }
    public static int sum(int[][] m){
        int total = 0;
        for(int x = 0; x < m.length; x++){
            for(int y = 0; y < m[x].length; y++){
                total += m[x][y];
            }
        }
        return total;
    }
}

