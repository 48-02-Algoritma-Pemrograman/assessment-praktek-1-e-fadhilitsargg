import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Nomor2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hargaProduk = new HashMap<>();
        hargaProduk.put("Labubu", 300000);
        hargaProduk.put("Jenglot", 250000);
        hargaProduk.put("Voodo", 200000);
        
        Map<String, Double> totalPendapatan = new HashMap<>();
        totalPendapatan.put("Labubu", 0.0);
        totalPendapatan.put("Jenglot", 0.0);
        totalPendapatan.put("Voodo", 0.0);
        
        int totalTransaksi = 0;
        String inputLagi = "Y";
        
        while (inputLagi.equalsIgnoreCase("Y")) {
            System.out.print("Masukkan nama produk [Labubu/Jenglot/Voodo]: ");
            String produk = scanner.nextLine();
            if (!hargaProduk.containsKey(produk)) {
                System.out.println("Produk tidak valid, coba lagi.");
                continue;
            }

            System.out.print("Jumlah pembelian: ");
            int jumlahPembelian = scanner.nextInt();
            scanner.nextLine();
            
            double totalHarga = jumlahPembelian * hargaProduk.get(produk);
            
            if (totalHarga >= 1000000) {
                totalHarga *= 0.85; 
            } else if (totalHarga >= 500000) {
                totalHarga *= 0.90; 
            }
            
            totalPendapatan.put(produk, totalPendapatan.get(produk) + totalHarga);
            totalTransaksi++;
            
            System.out.print("Input lagi (Y/N)?: ");
            inputLagi = scanner.nextLine();
        }
        
        double totalUangDiterima = totalPendapatan.values().stream().mapToDouble(Double::doubleValue).sum();
        
        System.out.printf("Total transaksi yang terjadi = %d%n", totalTransaksi);
        System.out.printf("Jumlah uang yang diterima = %.1f%n", totalUangDiterima);
        
        scanner.close();
    }
}

    }
}
