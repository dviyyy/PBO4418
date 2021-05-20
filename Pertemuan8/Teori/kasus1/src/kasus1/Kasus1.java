/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus1;

/**
 *
 * @author DEVI
 */
import java.util.Scanner;
import java.util.ArrayList;

class Universitas{
    public String matkul, mtkuliah, setjdwl, nmdsn, nmmhs, nim, nidn, matkulpengampu;
    public int nilaimatkulpokok;
    public int nilaimatkultmb;
    int nilaiakhir;
    ArrayList<String> dosen=new ArrayList<String>();
    public static ArrayList<ArrayList<String>> jadwal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mahasiswa = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> pengampu1 = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> pengampu2 = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mapelmhs = new ArrayList<ArrayList<String>>();
    
    public int set_nilaimatkulpokok(){
        Scanner inputnilai=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nilai matakuliah pokok: ");
        nilaimatkulpokok=inputnilai.nextInt();
        return nilaimatkulpokok;   
    }
    
    public int set_nilaimatkultmb(){
        Scanner inputnilaitambah=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nilai matakuliah tambah: ");
        nilaimatkultmb=inputnilaitambah.nextInt();
        return nilaimatkultmb;   
    }
    
    public int get_nilaiakhir(){
        nilaiakhir=(((60/100)*nilaimatkulpokok)+((40/100)*nilaimatkultmb));
            System.out.print(nilaiakhir);
        return nilaiakhir;
    }
    
    public void set_matkul(){
        this.matkul=matkul;
    }
    
    public void set_nmmhs(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama Mahasiswa: ");  
        nmmhs=inputmhs.nextLine();
        this.nmmhs=nmmhs;
    }
    
    public void set_nim(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nim anda: ");
        nim=inputmhs.nextLine();
        this.nim=nim;
    }
    
    public void set_mtkuliah(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan matakuliah yang ingin anda ambil: ");
        mtkuliah=inputmhs.nextLine();
        this.mtkuliah=mtkuliah;
    }
    
    public void set_nmdsn(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nama Dosen: ");
        nmdsn=inputdosen.nextLine();
        this.nmdsn=nmdsn;
    }
    
    public void set_nidn(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan nip anda: ");
        nidn=inputdosen.nextLine();
        this.nidn=nidn;
    }

    public void set_matkulpengampu(){
        Scanner inputdata=new Scanner(System.in);
        System.out.print("\nSilahkan masukkan matakuliah yang anda ampu: ");
        matkulpengampu=inputdata.nextLine();
        this.matkulpengampu=matkulpengampu;
    }
    
    public void get_datadosen(){
        System.out.println("_____________________________");
        System.out.println("Data Dosen: ");
        for(int i=0; i < pengampu2.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+x);
            System.out.println("Nama     :"+pengampu2.get(i).get(0));
            System.out.println("NIP      :"+pengampu2.get(i).get(1));
            System.out.println("Matkul yang di ampu "+pengampu2.get(i).get(2));
            System.out.println("");
        }
    }
    
    public void set_dosenpengampu(){
        int p=pengampu2.size();
        
        set_nmdsn();
        set_nidn();
        set_matkulpengampu();
        pengampu2.add(new ArrayList<String>());
        pengampu2.get(p).add(0,nmdsn);
        pengampu2.get(p).add(1,nidn);
        pengampu2.get(p).add(2,matkulpengampu);
        
    }
    
    public void set_matkulmhs(){
        int p=mapelmhs.size();
        
        set_nmmhs();
        set_nim();
        set_mtkuliah();
        mapelmhs.add(new ArrayList<String>());
        mapelmhs.get(p).add(0,nmmhs);
        mapelmhs.get(p).add(1,nim);
        mapelmhs.get(p).add(2,mtkuliah);
    }
    
    public void get_listmhsampu(){
         for(int i=0; i < mapelmhs.size(); i++){
             for(int j=0; j < pengampu2.size(); j++){
                 if(pengampu2.get(j).get(2).equals(mapelmhs.get(i).get(2))){
                    int p=pengampu1.size();
                    pengampu1.add(new ArrayList<String>());
                    pengampu1.get(p).add(mapelmhs.get(i).get(0));
                     
                 }
             }
        }
    }
    
    public void set_jadwal(){
        Scanner inputjadwal=new Scanner(System.in);
        System.out.print("Silahkan masukkan jadwal mengajar anda:");
        setjdwl=inputjadwal.nextLine();
        int p=jadwal.size();
            jadwal.add(new ArrayList<String>());
            jadwal.get(p).add(0,setjdwl);
    }
}

class Mahasiswa extends Universitas{
    
    public void setmapelmhs(){
        super.set_matkulmhs();
        
    }
    
    public void getdatamhs(){
        System.out.println("Data Mahasiswa: "+super.mapelmhs);
        
    }
    
    public void get_jadwal(){
        if(super.mapelmhs.equals(super.matkulpengampu)){
            System.out.println("anda memiliki jadwal pada: "+super.jadwal);
        }
    }
}

class Matakuliah extends Universitas{
    String matkul;
    public void set_Matkul(){
        super.set_matkul();
    }
}

class Matkulpokok extends Matakuliah{
    ArrayList<String> matkulpokok=new ArrayList<String>();
    public void set_matkulpokok(String matakuliahpokok){
        matkulpokok.add(matakuliahpokok);
    }
    
    public void get_matkulpokok(){
        System.out.println("Matakuliah pokok: "+matkulpokok);
    }
}

class Matkultambahan extends Matakuliah{
    ArrayList<String> matkultambahan=new ArrayList<String>();
    public void set_matkultambahan(String matkultambah){
        matkultambahan.add(matkultambah);
    }
    
    public void get_matkultambah(){
        System.out.println("Matakuliah Tambahan:"+matkultambahan);
    }
}

class Dosenpengampu extends Universitas{
    public void setDosen(){
        super.set_dosenpengampu();
    }
    
    public void get_mtkuliahampu(){
        System.out.println("Daftar dosen dan matakuliah ampu: "+super.pengampu2);
    }
} 

class DosenPengampu extends Universitas{
    public void setDsn(){
        super.set_dosenpengampu();
        super.set_jadwal();
        super.get_datadosen();
    }
    
    public void setMhs(){
        super.set_matkulmhs();
    }
    
    public void getMhsAmpu(){
        super.get_listmhsampu();
    }
    
    public void getList(){
        if(super.pengampu1.isEmpty()||super.mtkuliah.equals(super.matkulpengampu)){
            for(int i=0; i < super.pengampu2.size(); i++){
                System.out.println("Mahasiswa yang diampu bapak/ibu "+super.pengampu2.get(i).get(0)+":");
                System.out.println("________________________________");
                for(int o=0; o < super.pengampu1.size(); o++){
                    System.out.println("Mahasiswa dapat mengikuti perkuliahan pada jam:"+super.jadwal.get(i).get(0));
                }
                System.out.println("mahasiswa dapat mengikuti perkuliahan pada jam: "+super.jadwal.get(i).get(0));
            }
        
    }
        else{
            for(int i=0; i < super.jadwal.size(); i++){
                
                System.out.println("Mahasiswa yang diampu bapak/ibu"+super.pengampu2.get(i).get(0)+":"+super.pengampu1.get(i).get(0));
                System.out.println("Mahasiswa yang mengikuti perkuliahan pada jam: "+super.jadwal.get(i).get(0));
            }
        }
    }
}

public class Kasus1{
    public static void main(String args[]){
        Matkulpokok matakuliahpokok=new Matkulpokok();
        matakuliahpokok.set_matkulpokok("PBO");
        Matkultambahan matakuliahtambah=new Matkultambahan();
        matakuliahtambah.set_matkultambahan("INTERAKSI MANUSIA DAN KOMPUTER");
        Universitas campus=new Universitas();
        DosenPengampu cek=new DosenPengampu();
        cek.setDsn();
        matakuliahpokok.get_matkulpokok();
        matakuliahtambah.set_nilaimatkulpokok();
        matakuliahtambah.get_matkultambah();
        matakuliahtambah.set_nilaimatkulpokok();
        matakuliahtambah.get_nilaiakhir();
        cek.setMhs();
        cek.setMhs();
        cek.getMhsAmpu();
        cek.getList();
    }
}