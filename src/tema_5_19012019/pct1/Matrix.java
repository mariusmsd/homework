package tema_5_19012019.pct1;

import java.util.*;

public class Matrix {
	
	private int[][] mx=new int[5][5];

	public Matrix() {
		for(int i=0;i<=4;i++) {
			for (int j=0;j<=4;j++) {
			this.mx[i][j]=(int) (Math.random()*100);
			}
		}
	}
	
	public void afisarePrimaLinie(Matrix m) {
		for(int j=0;j<=4;j++) {
			System.out.print(m.getMx()[0][j]+" ");
		}
	}
	
	public int sumaDiagP(int[][] mx) {
		int s=0;
		
		for (int i=0;i<mx.length;i++) {
			s=s+mx[i][i];
		}
		return s;
	}
	
	public int sumaDiagS(int[][] mx) {
		int s=0;
		
		for (int i=0;i<mx.length;i++) {
			s=s+mx[i][(mx.length-1-i)];
		}
		return s;
	}
	
	public int maxDiagP(int[][] mx) {
		int max=mx[0][0];
		
		for (int i=0;i<mx.length;i++) {
			if(max<mx[i][i]) {max=mx[i][i];}
		}
		return max;
	}
	
	public int maxDiagS(int[][] mx) {
		int max=mx[0][4];
		
		for (int i=0;i<mx.length;i++) {
			if(max<mx[i][(mx.length-1-i)]) {max=mx[i][(mx.length-1-i)];}
		}
		return max;
	}
	
	public int[][] getMx() {
		return mx;
	}
	
	public void setMx(int[][] mx) {
		this.mx = mx;
	}
	
	
//	public static void main(String args[]) {
//		Matrix m=new Matrix();
//		
//		for(int i=0;i<=4;i++) {
//			for (int j=0;j<=4;j++) {
//				System.out.print(m.getMx()[i][j]+" ");
//			}
//			System.out.println();
//		}
//		System.out.println(m.maxDiagS(m.getMx()));
//					
//	}






}


	
