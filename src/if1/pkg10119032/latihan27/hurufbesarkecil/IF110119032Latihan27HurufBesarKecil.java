package if1.pkg10119032.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author Ginanjar
 */
public class IF110119032Latihan27HurufBesarKecil {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String kalimat = scan.nextLine();
        
        System.out.println("\n===== Hasil Formatting =====");
        String hasilBesar = String.format("%s", kalimat).toUpperCase();
        System.out.println("Huruf Besar : " + hasilBesar);
        String hasilKecil = String.format("%s", kalimat).toLowerCase();
        System.out.println("Huruf Kecil : " + hasilKecil);
    }
    
}
