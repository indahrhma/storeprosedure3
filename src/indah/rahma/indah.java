         package indah.rahma;

import java.util.Scanner;

public class indah {
static String nama;
int usia;
char inisial;
public static String getNama(String inNama){
	nama=inNama;
	return nama;
}
public int grtUsia(int inUsia){
	usia=inUsia;
	return usia;
}
public static void showNama(){
	Scanner input = new Scanner(System.in);
	System.out.println("nama :");
	String valNama=input.nextLine();
	getNama(valNama);
} 
public static void main(String[]args){
	showNama();
	System.out.println("Nama ini "+nama);
}
}