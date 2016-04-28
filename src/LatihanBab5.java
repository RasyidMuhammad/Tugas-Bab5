import java.util.Scanner;
class hitung{ 
    public static int penjumlahan(int a, int b) {
        return a + b;}
    public static int pengurangan(int a, int b) {
        return a - b;}
    public int perkalian(int a, int b) {
        return a * b;}
    public double pembagian(int a, int b) {
        return (double)a / b;}

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
}

 class LatihanBab1 {
    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       int pilih, a, b;
        do{
        System.out.println("PROGRAM PERHITUNGAN KABATAKU");
        System.out.println("----========MENU========----");
        System.out.println("1. Penjumlahan"              );
        System.out.println("2. Pengurangan"              );
        System.out.println("3. Perkalian"                );
        System.out.println("4. Pembagian"                );
        System.out.println("5. Penyederhanaan Pecahan"   );
        System.out.println("6. Exit"                     );
        System.out.println("------ooo000====000ooo------");
        System.out.print("Masukkan Pilihan Menu: "       );
        pilih = in.nextInt();
        switch(pilih){
            case 1: System.out.println("Program Penjumlahan");
                    System.out.print("Masukkan Bilangan 1: ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    b = in.nextInt();
                    System.out.println("hasil perhitungan:"+hitung.penjumlahan(a, b));
                    break;
            case 2: System.out.println("Program Pengurangan");
                    System.out.print("Masukkan Bilangan 1: ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    b = in.nextInt();
                    System.out.println("Hasil perhitungan"+hitung.pengurangan(a, b));
                    break;
            case 3: System.out.println("Program Perkalian");
                    hitung perkalian = new hitung();
                    System.out.print("Masukkan Bilangan 1: ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    b = in.nextInt();
                    System.out.println("hasil peritungan:"+perkalian.perkalian(a, b));
                    break;
            case 4: System.out.println("Program Pembagian");
                    hitung pembagian = new hitung();
                    System.out.print("Masukkan Bilangan 1: ");
                    a = in.nextInt();
                    System.out.print("Masukkan Bilangan 2: ");
                    b = in.nextInt();
                    System.out.println("hasil perhitungan:"+pembagian.pembagian(a, b ));
                    break;
            case 5: System.out.println("=PENYEDERHANAAN=");
                    hitung sederhana = new hitung();
                    System.out.print("Masukkan Pembilang : ");
                    a = in.nextInt();
                    System.out.print("Masukkan Penyebut  : ");
                    b = in.nextInt();
                    sederhana.sederhana(a, b );
                    break;
            case 0: System.out.println("Program diberhentikan");
                    break;
            default: System.out.println("Pilihan Tidak Tersedia!");
        }
       }while(pilih!=0);
    }    
    }
    
}
