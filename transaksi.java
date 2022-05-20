
package cobaukl1;

import java.util.ArrayList;
import java.util.Scanner;

public class transaksi {
    
 private ArrayList<Integer> idBarang = new ArrayList<Integer>();
 private ArrayList<Integer> banyak = new ArrayList<Integer>();
 private ArrayList<Integer> idMember = new ArrayList<Integer>(); 
 
 public transaksi() {
    this.idMember.add(0);  //lutfi
    this.idBarang.add(0);  //coklat sliver
    this.banyak.add(2);    //jumlah yg dibeli
 
    this.idMember.add(0);  //lutfi
    this.idBarang.add(1);  //sabun live
    this.banyak.add(3);    //jumlah yg dibeli
 
    this.idMember.add(1);  //nana
    this.idBarang.add(0);  //coklat silver
    this.banyak.add(1);    //jumlah yg dibeli
 
    this.idMember.add(1);
    this.idBarang.add(2);
    this.banyak.add(2);
 }
 
 
 public void prosesTransaksi(member member, transaksi transaksi, barang barang){
    Scanner masukkan = new Scanner(System.in); 
 
    System.out.println("Silahkan belanja");
    System.out.println("Masukkan ID Member");
    System.out.print(">");
    int idMember = masukkan.nextInt();
 
    System.out.println("Selamat datang "+member.getNama(idMember));
    ArrayList<Integer> idBarangBeli = new ArrayList<Integer>();
    ArrayList<Integer> banyakBeli = new ArrayList<Integer>();
    int i=0;
    int temp=0;
 
 
 do{ //perulangan
 System.out.println("Masukkan kode barang :");
     System.out.print(">");
 temp=masukkan.nextInt();
 
    if (temp!=99){
    idBarangBeli.add(temp);
    System.out.println(barang.getNamaBarang(idBarangBeli.get(i)/* i nya diganti temp? */) +" sebanyak : "); //misal beli 2,kode 0&1
        System.out.print(">");
    banyakBeli.add(masukkan.nextInt());
    i++;
        System.out.println("====== KETIK '99' JIKA INGIN MENGAHIRI ====== ");
    }
 }while (temp!=99); 
 
    System.out.println("Transaksi belanja "+member.getNama(idMember)+" sebagai berikut");
    System.out.println("Nama Barang \tQty \tHarga \tJumlah \t");
 
 int total=0;
 int x = idBarangBeli.size(); // total nya 2 barang
    for (int j = 0; j < x; j++){
    int jumlah=banyakBeli.get(j) * barang.getHarga(idBarangBeli.get(j));
    total+=jumlah;
    System.out.println(barang.getNamaBarang(idBarangBeli.get(j))+"\t"+
    idBarangBeli.get(j)+"\t"+barang.getHarga(idBarangBeli.get(j))+"\t"+jumlah);
 
    transaksi.setTransaksi(barang, idMember, idBarangBeli.get(j), banyak.get(j));
    }
 
    System.out.println("Total Belanja : "+total);
    member.editSaldo(idMember, member.getSaldo(idMember)-total);
 
    }
 
 public void setTransaksi(barang barang, int idMember, int idBarang, int banyaknya){
    this.idMember.add(idMember);
    this.idBarang.add(idBarang);
    this.banyak.add(banyaknya);
     barang.editStok(idBarang, barang.getStok(idBarang)-banyaknya);
    }
 
 public int getIdBarang(int id){
    return this.idBarang.get(id);
    } 
 
 public int getBanyaknya(int id){
    return this.banyak.get(id);
    }
 
 public int getIdMember(int id){
    return this.idMember.get(id);
    } 
 
 public int getJmlTransaksi(){
    return this.idMember.size();
    } 
}
