package tugas.bab5;
import java.util.Scanner;

class Jaket {
    private static int jaketA = 100000, jaketB = 125000, jaketC = 175000;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
