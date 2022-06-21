import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
   
    int tab1[]={0,1,1,0,0,0,1};
    int tab2[]=new int[tab1.length];
    int licznik=0;
    for(int k=0;k<tab1.length;k++){
      if(tab1[k]==0){
        tab2[k]=0;
        licznik++;
      }
    }
    for(int d=licznik;d<tab1.length;d++){
      tab2[d]=1;
    }
    System.out.println("Drukuję tablicę 1: ");
    for(int z=0;z<tab1.length;z++)System.out.print(tab1[z]);
     System.out.println();
      System.out.println("Drukuję tablicę 2: ");
    for(int s=0;s<tab2.length;s++)System.out.print(tab2[s]);
      }
  
}