/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Memperlihatkan Hasil Sendiri atau Bukan
 */

import java.util.Scanner;
public class IF110119036Latihan30 {

    /**
     * @param args the command line arguments
     */
    final Scanner scan = new Scanner(System.in);
    String color[] = {"\033[38;2;255;0;0m", "\033[38;2;71;81;255m", "\033[38;2;255;255;0m", "\033[38;2;255;0;255m", "\033[38;2;0;255;0m", "\033[38;2;0;255;255m"};
    String netral = "\033[0m";
    String jawab;
    private void masukkanJawaban(){
        System.out.println(color[0].concat("Kamu ").concat(color[4]).concat("ngerjain sendiri ")
                .concat(color[2]).concat("latihan 17 sampe ").concat(color[1]).concat("latihan 30 ini?"));
        System.out.print(color[1].concat("Jawab ").concat(color[0]).concat("(Yoi/Enggak) : "));
        jawab = scan.next().toUpperCase();
    }

    private void tampilJawaban(){
        String jawab= null;
        if (this.jawab.equals("YOI")){
            jawab = color[0].concat("\nCakep Bener. ").concat(color[3]).concat("Good Job");
        }else if(this.jawab.equals("ENGGAK")){
            jawab = color[0].concat("Tetep cakep sih.\n").concat(color[5])
                    .concat("Sing penting paham konsep nya yee.\n").concat(netral)
                    .concat("Keep the code works dude");
        }
        System.out.print(jawab);
    }

    public static void main(String[] args) {
	// write your code here
        IF110119036Latihan30 data = new IF110119036Latihan30();
        data.masukkanJawaban();
        data.tampilJawaban();
	System.out.println("Developed by : Alfi Nurizkya");
    }
}
