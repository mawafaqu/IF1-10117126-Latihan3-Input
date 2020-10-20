/*
 * 
 * @author
 * NAMA : MAWA FAQU ROCHMAN
 * KELAS : PBO1
 * NIM : 10117126
 * Deskripsi Program : Program ini berisi tentang Memasukan nilai dari keyboard
 */
package if1.pkg10117126.latihan3.input;

import java.util.Scanner;

public class IF110117126Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Memasukan nama anda: ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.print("Nama anda adalah " + nama);

    }

}
