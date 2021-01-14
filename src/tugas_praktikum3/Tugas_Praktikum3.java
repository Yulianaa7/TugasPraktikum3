/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_praktikum3;

/**
 *
 * @author Yuliana
 */
public class Tugas_Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,u,j=5; //menentukan nilai j
        for(p=1;p<=j;p++){ //untuk mencetak mendatar
            for(u=5;u>=1;u--){ //untuk mencetak miring
                if(p==u){
                    System.out.print("@");
                }else if(p==1 || p==5){ //jika p berada pada baris 1 atau p berada di baris 5, maka akan mencetak mendatar.
                    System.out.print("@");
                }else{ //jika selain dari perintah if diatas maka baris akan dibuat kosong.
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
