
public class Project {

	public static void main(String[] args) {
		final Integer M = 10, N = 2;
		int[][] p = new int[10][N];
		int[] t = new int[M];
		Perceptron perceptron = new Perceptron();
		
		//****UCZENIE******//
		p[0][0] = -9;
		p[0][1] = -10;
		p[1][0] = -6;
		p[1][1] = -25;
		p[2][0] = -6;
		p[2][1] = -5;
		p[3][0] = -2;
		p[3][1] = -10;
		p[4][0] = -8;
		p[4][1] = 20;
		p[5][0] = 1;
		p[5][1] = -10;
		p[6][0] = 2;
		p[6][1] = 20;
		p[7][0] = 4;
		p[7][1] = -16;
		p[8][0] = 4;
		p[8][1] = 25;
		p[9][0] = 5;
		p[9][1] = 9;

		t[0] = 1;
		t[1] = 0;
		t[2] = 1;
		t[3] = 0;
		t[4] = 1;
		t[5] = 0;
		t[6] = 1;
		t[7] = 0;
		t[8] = 1;
		t[9] = 0;
		System.out.println("UCZENIE");
		perceptron.execute(p,M,t);
		//****UCZENIE******//
		//****WERYFIKACJA******//
		System.out.println("WERYFIKACJA POPRAWNOŒCI DZIA£ANIA");
		int[][] wer = new int[4][N];
		int[] t2 = new int[4];
		wer[0][0] = -9;
		wer[0][1] = 20;
		wer[1][0] = -2;
		wer[1][1] = -25;
		wer[2][0] = 4;
		wer[2][1] = -5;
		wer[3][0] = 0;
		wer[3][1] = 20;
		
		t2[0] = 1;
		t2[1] = 0;
		t2[2] = 0;
		t2[3] = 1;
		perceptron.execute(wer,4,t2);
		//****WERYFIKACJA******//
	}

}
