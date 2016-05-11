import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class zad_test_1
{
	public static void main (String[] args)
	{
		//wczytanie stringow
		Scanner input = new Scanner(System.in);
	   String s1= input.nextLine();
	   String s2= input.nextLine();
	 
	   //tworzenie tablicy ascii
	   int[] tablica = new int[128];
	   for (int i=0; i<128 ; i++)
		 tablica[i]=0;
	// tablica gotowa
	  		
	  	boolean czyAnagram = true; //zmienna informujaca czy frazy sa anagramami
	  	
	   if (s1.length() != s2.length()) //jak nie sa rownej dlugosci to od razu false
	   {
	   	czyAnagram = false;
	   }
	   else	
	   {
	   	for (int i=0; i<s1.length(); i++) //pierwsza fraza zlicza znaki w odpowiednie miejsca tabeli
	   	{
		char c = s1.charAt(i);
		int asci = c;
		tablica[asci]++;
	   	}
	   	for (int i=0; i<s1.length(); i++) //druga fraza udejmuje znaki z tabeli
	   	{
		char c = s2.charAt(i);
		int asci = c;
		tablica[asci]--;
	   	}
	   	
	   	//sprawdzenie czy cala tablica to zera (warunek ze to anagramy)
	   	for (int i=0 ; i<128 ; i++)
	   		if (tablica[i]!=0) 
	   		{
	   			czyAnagram = false;
	   			break;
	   		}
	   }
	    System.out.println(czyAnagram); //wynik dzialania programu
	}
}
