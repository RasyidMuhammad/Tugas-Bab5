import java.util.Scanner;
class hitung{ 
       public static void Penjumlahan(int bil1, int bil2){
        int nilai = bil1 + bil2;
        System.out.println("Hasil Penjumlahan : "+nilai);
    }
    public static void Pengurangan(int bil1, int bil2){
        int nilai = bil1 - bil2;
        System.out.println("Hasil Pengurangan : "+nilai);
    }
    public void Perkalian(int bil1, int bil2){
        int nilai = bil1 * bil2;
        System.out.println("Hasil Perkalian : "+nilai);
    }
    public void Pembagian(int bil1, int bil2){
        double nilai = (double) bil1 / bil2;
        System.out.println("Hasil Pembagian : "+nilai);
    }
    public void sederhana(int a, int b){
        int pembilang = a, penyebut = b;
        int temp,A,B;
        if(penyebut == 0){
            return;
        }
        A = (pembilang < penyebut)? penyebut : pembilang;
        B = (pembilang < penyebut)?pembilang : penyebut;
        while (B != 0){
            temp = A % B;
            A = B;
            B = temp;
        
        }
        pembilang /= A;
        penyebut /=A;
        System.out.println(pembilang+"/"+penyebut);
    }
public class LatihanBab1 {
    public static void main(String[] args) {
        
        
    }
    
}
