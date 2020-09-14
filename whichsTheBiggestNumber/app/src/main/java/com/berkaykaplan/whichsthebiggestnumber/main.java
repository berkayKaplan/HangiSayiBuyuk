package com.berkaykaplan.whichsthebiggestnumber;

public class main {
    public static void main (String[] args){
       int a=25 ;
       int b=20;
       int c=5;
       if (a>b && b>c && a>c){
           System.out.println("En Büyük a dır");
       }
       else if (b>a&&a>c&&b>c){
           System.out.println("En Büyük b dır");
       }
       else {
           System.out.println( "En Büyük c dir");
       }
    }
}
