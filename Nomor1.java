import java.util.Scanner;
public class Nomor1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan jumlah anggota keluarga");
        int jumlahanggota = scanner.nextInt();

        double tunjangankesehatan = 0.0;

        if (jumlahanggota <= 3) {
            tunjangankesehatan = jumlahanggota * 100000;
        } else {
            tunjangankesehatan = 3 * 100000;
            int sisaAnggota = jumlahanggota - 3;
            tunjangankesehatan += sisaAnggota * 50000;
        }
        System.out.printf("jumlah anggota keluarga: %d%n", jumlahanggota);
        System.out.printf("Besar tunjangan kesehatan: %.1f%n", tunjangankesehatan);

        scanner.close();
    }
}

    }
}
