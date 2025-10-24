import java.util.Scanner;

public class UTP_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String input[][]=new String[n][4];
        double kill[]=new double[n];
        double assist[]=new double[n];
        double death[]=new double[n];
        double ip[]=new double[n];
        String kategori[]=new String[n];
        double rata=0;
        double besar=0;
        
        double bonus=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                input[i][j]=sc.next();
            }
        }
        for(int i=0;i<n;i++){
            kill[i]=Double.parseDouble(input[i][1]);
            assist[i]=Double.parseDouble(input[i][2]);
            death[i]=Double.parseDouble(input[i][3]);
        }
         for(int i=0;i<n;i++){
             if(kill[i]>death[i]*2){
                 bonus=15;
             }else if(kill[i]>death[i]){
                 bonus=10;
             }else if(kill[i]==death[i]){
                 bonus=5;
             }else{
                 bonus=0;
             }
             ip[i]=(((2*kill[i])+assist[i])/(Math.sqrt((death[i]+1))))+bonus;
             rata+=ip[i];
             if(ip[i]>=100){
                 kategori[i]="MVP";
             }else if(ip[i]>=70){
                 kategori[i]="Pro Player";
             }else if(ip[i]>=40){
                 kategori[i]="Average"; 
             }else{
                 kategori[i]="Needs Practice";
             }
         }
        besar = ip[0];
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (ip[i] > besar) {
                besar = ip[i];
                a = i;
            }
        }
         for(int i=0;i<n;i++){
             System.out.printf("%s %.2f %s %n",input[i][0],ip[i],kategori[i]);
         }
        System.out.println("Top Player: "+input[a][0]);
        System.out.printf("%s %.2f","Rata-rata:",rata/n);
    }
}
