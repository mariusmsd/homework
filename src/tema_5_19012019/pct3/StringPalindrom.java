package tema_5_19012019.pct3;

import java.io.*;
import java.util.*;

public class StringPalindrom {
	
	private String str;
	
	public StringPalindrom() {
		
	}
	
	public StringPalindrom(String str) {
		this.str = str;
	}

	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	public String checkPalindrom(String A) {
		
		String check;
		char c[] = new char[A.length()];
		
		for (int i = A.length() - 1; i >= 0; i--) {
			A.getChars(i, i + 1, c, A.length() - i - 1);
		}
		if (A.equals(String.valueOf(c))) {
			check=("Yes");
		} else {
			check=("No");
		}
		return check;
		
	}

	public static void main(String[] args) {
		


		Scanner sc = new Scanner(System.in);
		String A = sc.next();

		StringPalindrom str=new StringPalindrom(A);
		str.checkPalindrom(A);

	}



}
