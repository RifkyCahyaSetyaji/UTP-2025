import java.util.Scanner;

public class UTP_1 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int matakuliah = sc.nextInt();
        int nilai[]=new int[matakuliah];
        double total =0;
        
        for(int i=0;i<nilai.length;i++){
            System.out.print("Masukkan nilai ke-"+(i+1)+": ");
            nilai[i]=sc.nextInt();
            total+=nilai[i];
        }
        double rata= total/matakuliah;
        System.out.printf("%s %.2f %n","Rata-rata nilai:",rata);
        if(rata>=85){
            System.out.print("Kategori: Sangat Baik");
        } else if(rata>=70&&rata<=84){
            System.out.print("Kategori: Baik");
        } else if(rata>=55&&rata<=69){
            System.out.print("Kategori: Cukup");
        } else{
            System.out.print("Kategori: Kurang");
        }
    }
}
