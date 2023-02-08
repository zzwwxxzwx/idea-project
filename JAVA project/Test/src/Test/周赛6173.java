package Test;

import java.util.Arrays;

public class 周赛6173 {
    public static void main(String[] args) {
        int[][] mat ={{0,0,0},{1,0,1},{0,1,1},{0,0,1}};

        int cols = 2;
        System.out.println(maximumRows(mat,cols));
    }

    public static int maximumRows(int[][] mat, int cols) {
        int[][] colIndex= new int[mat.length][2];
        for(int i = 0 ; i<colIndex[0].length ; i++){
            colIndex[i][0]=i;
        }
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<mat[i].length;j++){
                if(mat[i][j]==1){
                    colIndex[1][j]++;
                }
            }
        }
        int index = 0;
        Arrays.sort(colIndex,(a, b)->b[0]-a[0]);
        // Arrays.sort(colIndex,(a,b)->b[0]-a[0]);
        int contain1=0;
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<cols-1;j++){
                mat[i][colIndex[0][j]]=0;
            }
        }
        for(int i = 0 ; i<mat.length ; i++){
            for(int j = 0 ; j<mat[i].length;j++){
                if(mat[i][j]==1){
                    contain1++;
                    break;
                }
            }
        }
        int result=mat.length-contain1;
        return result;
    }
}
