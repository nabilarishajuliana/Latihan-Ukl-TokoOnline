
package cobaukl1;
import java.util.ArrayList;
public class member implements user {
 
 private ArrayList<String> namaMember = new ArrayList<String>();
 private  ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> saldo = new ArrayList<Integer>();

 public member() {
    this.namaMember.add("yaya");
    this.alamat.add("sawojajar");
    this.telepon.add("08123458906");
    this.saldo.add(100000);

    this.namaMember.add("lili");
    this.alamat.add("belimbing");
    this.telepon.add("081226733344");
    this.saldo.add(200000);
 }
 public void setSaldo(int saldo){
 this.saldo.add(saldo);
 }
 public int getSaldo(int idMember){ // buat ngambil nilai,sesuai no id trus buat ngambil di arraylistny
 return this.saldo.get(idMember);
 }
 public void editSaldo(int idMember, int saldo){
 this.saldo.set(idMember, saldo); //set= untuk mengganti atau mengubah data arraylist 
                                  //rumus=this.saldo.set(no data arraylist,yang mau diganti )
 }
 public int getJmlMember(){
    return this.namaMember.size();
   }
 
 @Override
 public void setNama(String namaMember ){
 this.namaMember.add(namaMember);
 }
 
 @Override
 public void setAlamat(String alamat ){
 this.alamat.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.telepon.add(telepon);
 }
 
 @Override
 public String getNama(int idMember){
 return this.namaMember.get(idMember);
 }
 
 @Override
 public String getAlamat(int idMember){
 return this.alamat.get(idMember);
 }
 
 @Override
 public String getTelepon(int idMember){
 return this.telepon.get(idMember);
 }
 
 //    
//    private ArrayList<String> namaMember = new ArrayList<String>();
//    private ArrayList<String> alamat = new ArrayList<String>();
//    private ArrayList<String> telepon = new ArrayList<String>();
//    private ArrayList<Integer> saldo = new ArrayList<Integer>();
//    
//    public member(){
//        this.namaMember.add("adi");
//        this.alamat.add("sawojajar");
//        this.telepon.add("08123456666");
//        this.saldo.add(100000);
//        
//        this.namaMember.add("budi");
//        this.alamat.add("bululawang");
//        this.telepon.add("081222233344");
//        this.saldo.add(200000);    
//    }
//    public void setSaldo(int saldo){
//        this.saldo.add(saldo);
//    }
//    public int getSaldo(int idMember){
//        return this.saldo.get(idMember);
//    }
//    public void editSaldo(int idMember, int saldo){
//        this.saldo.set(idMember, saldo);
//    }
//    public int getJmlMember(){
//        return this.saldo.size();
//    }
//    
//    //override
//    public void setNama(String namaMember){
//        this.namaMember.add(namaMember);
//    }
//    public void setAlamat(String alamat){
//        this.alamat.add(alamat);
//    }
//    public void setTelepon(String telepon){
//        this.telepon.add(telepon);
//    }
//    
//    //override
//    public String getNama(int idMember){
//        return this.namaMember.get(idMember);
//    }
//    public String getAlamat(int idMember){
//        return this.alamat.get(idMember);
//    }
//    public String getTelepon(int idMember){
//        return this.telepon.get(idMember);
//    }
//    
}