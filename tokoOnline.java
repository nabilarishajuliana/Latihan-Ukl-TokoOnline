
package cobaukl1;
import java.util.Scanner;
public class tokoOnline {
static Scanner masukkan= new Scanner (System.in);
 
    public static void main(String[] args) {
        barang barang = new barang();
        kariyawan karyawan = new kariyawan();
        laporan laporan = new laporan();
        member member = new member();
        transaksi transaksi = new transaksi();
    
        laporan.laporan(barang);
        laporan.laporan(member);
        laporan.laporan(transaksi,barang);
        System.out.println("");
        transaksi.prosesTransaksi(member, transaksi, barang);
    
        
    }
}