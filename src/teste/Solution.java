package teste;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] w1=new int[a.length()];
        int[] w2=new int[b.length()];
        boolean isA=false;

        if (a.length()!=b.length()){ 
            isA=false; }
        else{
            if (lettercheck(a,b)==false) {isA=false;}
                else{
                    if(lettercheck(b,a)==false) {isA=false;}
                    else {
                        if (lettercountcheck(a,b)==false)
                        {isA=false;}
                        else
                            {isA=true;}
                    }
                }
        }

        return isA;
    }

    static boolean lettercheck(String a, String b) {

        boolean r = true;
        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < b.length(); i++) {

            if (a.contains(b.valueOf(b.charAt(i))) == false) {
                r = false;
                break;
            }

        }
        return r;
    }
    static int lettercount(char x,String y) {
        int count=0;
        for (int i=0;i<y.length();i++){
            if (y.indexOf(x,i)==i) {count++;}
            
        }
        
        return count;
    }
    static boolean lettercountcheck(String a,String b) {
        boolean r = true;
        char x;
        for (int i=0;i<a.length();i++){
            x=a.charAt(i);

            if(lettercount(x,a)!=lettercount(x,b)){r=false;}
        }
        System.out.println(" a "+lettercount('a',a));
        System.out.println(" a "+lettercount('a',b));
        return r;
    }

  public static void main(String[] args) {
    
//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
	  
	  String a="anagram";
	  String b="margana";
        boolean ret = isAnagram(a, b);
//       System.out.println( lettercount('m',a));
//       System.out.println( lettercount('m',b));
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}