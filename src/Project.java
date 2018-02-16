
public class Project {

	public static void main(String[] args) {
		final Integer M = 10, N = 2;
		int[][] p = new int[10][N];
		int[] t = new int[M];
		Perceptron perceptron = new Perceptron();
		
		//****UCZENIE******//
		p[0][0] = -9;
		p[0][0] = -10;
		p[1][0] = -8;
		p[1][1] = 20;
		p[2][0] = -6;
		p[2][1] = -5;
		p[3][0] = -6;
		p[3][1] = -25;
		p[4][0] = -2;
		p[4][1] = -10;
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
		t[1] = 1;
		t[2] = 1;
		t[3] = 0;
		t[4] = 0;
		t[5] = 0;
		t[6] = 1;
		t[7] = 0;
		t[8] = 1;
		t[9] = 0;

		perceptron.execute(p,M,t);
		//****UCZENIE******//
	}

}
