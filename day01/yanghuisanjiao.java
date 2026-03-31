package day01;

import java.util.Scanner;

public class yanghuisanjiao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[i][j]);
                if(j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
