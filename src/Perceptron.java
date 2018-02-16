import java.util.Random;

public class Perceptron {
	double w1, w2, b, x, y, a;
	final int M = 10, N = 2;
	int[][] p = new int[10][N];
	int[] t = new int[M];

	public Perceptron() {
		p[0][0] = -9;
		p[0][0] = -10;
		p[1][0] = -8;
		p[1][1] = 20;
		p[2][0] = -6;
		p[2][1] = -5;
		p[3][0] = -6;
		p[3][1] = -25;
		// JESCZE TROCHE TRZEBA DODAC;

		Random rand = new Random();
		w1 = rand.nextDouble();
		w2 = rand.nextDouble();
		b = rand.nextDouble();
	}

	public void calculateSignalValue(int x, int y) {
		a = w1 * x + w2 * y + b;
		System.out.println("a = " + a);
	}

	public void execute() {
		for (int i = 0; i < 3; i++) {
			calculateSignalValue(p[i][0], p[i][1]);
		}
	}

}
