/*9
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodClass;

import java.util.Scanner;
import MethodClass.mhs;
/**
 *
 * @author lenovo
 */
public class datamhs {
    private static double nilakhir;
    private static String grade;
    public static void main (String [] args){
        Scanner input=new Scanner (System.in);
        mhs[] MHS=new mhs[0];
        int jml, x, pil;
        double nuts,nuas;
        
        do{
            System.out.println("Pilih Menu");
            System.out.println("======================");
            System.out.println("1. Input data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Keluar Program");
            System.out.println("=====================");
            
            System.out.print("Pilih Menu?");
            pil = input.nextInt();
            System.out.print("");
            
            switch (pil){
                case 1:
                    System.out.print("Jumlah data :");
                    jml = input.nextInt();
                    MHS=new mhs[jml];
                    for (x=0;x<jml;x++){
                        MHS[x]=new mhs();
                        System.out.println("Data :" + (x+1));
                        System.out.print("Nim   :");MHS[x].setNim(input.next());
                        System.out.print("Nama    :");MHS[x].setNama(input.next());
                        System.out.print("Nilai UTS :"); nuts=input.nextFloat();
                        System.out.print("Nilai UAS   :");nuas=input.nextFloat();
                        
                        MHS[x].setUts((float)nuts);
                        MHS[x].setUas((float)nuas);
                    }
                    break;
                    
                case 2:
                    System.out.print("Tampil Data");
                    x=0;
                    while (x<MHS.length){
                        System.out.println("Data    :"+x+1);
                        System.out.println("Nim: "+MHS[x].getNim());
                        System.out.println("Nama: "+MHS[x].getNama());
                        System.out.println("Nilai UTS:"+MHS[x].getUts());
                        System.out.println("Nilai UAS:"+MHS[x].getUas());
                        System.out.println("Nilai Nilai Akhir :"+MHS[x].getNilAkhir());
                        System.out.println("Nilai Grade: "+MHS[x].getGrade());
                        x++;
                    }
                    break;
                case 3:
                    System.out.print("Selesai");
                    break;
                    
            }
        } while (pil!=3);
    }
}
