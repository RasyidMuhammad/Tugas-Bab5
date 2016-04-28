package tugas.bab5;
import java.util.Scanner;
class Jaket {
    private static final int jaketA = 100000, jaketB = 125000, jaketC = 175000;
    private static int total, totalA, totalB, totalC;
    public static void setJaketA(int jaketA) {
        if (jaketA >= 100) {
            totalA = (Jaket.jaketA - 5000) * jaketA;
        } else {
            totalA = Jaket.jaketA * jaketA;
        }
            total += totalA;      
    }
    public static void setJaketB(int jaketB) {
        if (jaketB >= 100) {
            totalB = (Jaket.jaketB - 5000) * jaketB;
        } else {
            totalB = Jaket.jaketB * jaketB;
        }
            total += totalB;        
    }
    public static void setJaketC(int jaketC) {
        if (jaketC >= 100) {
            totalC = (Jaket.jaketC - 15000) * jaketC;
        } else {
            totalC = Jaket.jaketC * jaketC;
        }
            total += totalC;   
    }
    public static int getTotal() {
        return total;
    }
    public static int getTotalA() {
        return totalA;
    }
    public static int getTotalB() {
        return totalB;
    }
    public static int getTotalC() {
        return totalC;
    }
}

public class TugasBab5 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int jaketA, jaketB, jaketC;
        System.out.println("1. Jaket A : Rp 100.000/pcs    >100 : Rp 95.000/pcs");
        System.out.println("2. Jaket B : Rp 125.000/pcs    >100 : Rp 120.000/pcs");
        System.out.println("3. Jaket C : Rp 175.000/pcs    >100 : Rp 160.000/pcs");
        System.out.println("Masukkan jumlah jaket yang ingin dipesan");
        System.out.print("Jaket A = ");
        jaketA = in.nextInt();
        Jaket.setJaketA(jaketA);
        System.out.print("Jaket B = ");
        jaketB = in.nextInt();
        Jaket.setJaketB(jaketB);
        System.out.print("Jaket C = ");
        jaketC = in.nextInt();
        Jaket.setJaketC(jaketC);
        System.out.println("Total harga " + jaketA + " jaket A = " + Jaket.getTotalA());
        System.out.println("Total harga " + jaketB + " jaket B = " + Jaket.getTotalB());
        System.out.println("Total harga " + jaketC + " jaket C = " + Jaket.getTotalC());
        System.out.println("Total seluruh jaket "+Jaket.getTotal());
    }
}

   
  
