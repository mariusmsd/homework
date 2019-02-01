package tema_5_19012019.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tema_5_19012019.pct1.Matrix;

public class Pct_1_test_suma_diag_p {
	
	private Matrix mtrx;
	
	@Before
	public void setUp() {
	 mtrx=new Matrix();
	 //ce zici daca iti setai asa elementele metricei, si apoi te foloseai de ea in teste?
	 //in felul asta ai fi eliminat duplicarea deranjanta a declararii si initializarii unui array bidimensional 
	 //in fiecare test case
	 mtrx.setMx(new int[][] {
			 {2, 3, 4, 5, 6}, 
			 {3, 4, 5, 6, 7}, 
			 {4, 5, 6, 7, 8}, 
			 {5, 6, 7, 8, 9}, 
			 {6, 7, 8, 9, 10}
	 });
	}
	
	@Test
	public void test_suma_diag_p1() {
		assertEquals(30, mtrx.sumaDiagP(mtrx.getMx()));
		//assertEquals(5,result,0.0);	
	}
	
	@Test
	public void test_suma_diag_p2() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=i;
			}
		}	
		int result=mtrx.sumaDiagP(m);
		assertEquals(10,result);	
		//assertEquals(10,result,0.0);	
	}
	
	@Test
	public void test_suma_diag_p3() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=i-j;
			}
		}	
		int result=mtrx.sumaDiagP(m);
		assertEquals(0,result);	
		//assertEquals(0,result,0.0);	
	}
	
	@Test
	public void test_suma_diag_s1() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=1;
			}
		}	
		int result=mtrx.sumaDiagS(m);
		assertEquals(5,result,0.0);	
		assertEquals(5,result,0.0);	
	}
	
	@Test
	public void test_suma_diag_s2() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=(j-i);
			}
		}	
		int result=mtrx.sumaDiagS(m);
		assertEquals(0,result,0.0);	
	}
	
	@Test
	public void test_suma_diag_s3() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=j;
			}
		}	
		int result=mtrx.sumaDiagS(m);
		assertEquals(10,result,0.0);	
	}
	
	@Test
	public void test_max_diag_p1() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=1;
			}
		}	
		int result=mtrx.maxDiagP(m);
		assertEquals(1,result,0.0);	
	}
	
	@Test
	public void test_max_diag_p2() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=(j-i);
			}
		}	
		int result=mtrx.maxDiagP(m);
		assertEquals(0,result,0.0);	
	}
	
	@Test
	public void test_max_diag_p3() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=j*i;
			}
		}	
		int result=mtrx.maxDiagP(m);
		assertEquals(16,result,0.0);	
	}
	
	@Test
	public void test_max_diag_s1() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=i;
			}
		}	
		int result=mtrx.maxDiagS(m);
		assertEquals(4,result,0.0);	
	}
	
	@Test
	public void test_max_diag_s2() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=(j-i);
			}
		}	
		int result=mtrx.maxDiagS(m);
		assertEquals(4,result,0.0);	
	}
	
	@Test
	public void test_max_diag_s3() {
		
		int[][] m=new int[5][5];		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= 4; j++) {
				m[i][j]=j*i;
			}
		}	
		int result=mtrx.maxDiagS(m);
		assertEquals(4,result,0.0);	
	}
	
	
	
	

}
