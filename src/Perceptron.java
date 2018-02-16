import java.util.Random;

public class Perceptron {
	Double w1, w2, b, x, y, a; 
	Integer e;

	public Perceptron() {
		Random rand = new Random();
		w1 = rand.nextDouble();
		w2 = rand.nextDouble();
		b = rand.nextDouble();
		e = 0;
	}

	public void calculateSignalValue(int x, int y) {
		a = w1 * x + w2 * y + b;
		System.out.println("a = " + a);
	}

	public int functionOfActivation() {
		if (a > 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public void calculateError(int t) {
		e = t - functionOfActivation();
		System.out.println("e = " + e);
	}

	public void setNewWagesAndShift(int x, int y)
	{
		w1 = w1 + e * x;
		w2 = w2 + e * y;
		b = b + e;
		System.out.println("w1 nowe:" + w1);
		System.out.println("w2 nowe:" + w2);
		System.out.println("b nowe:" + b);
	}
	
	public void checkIfCorrect(int t)
	{
		if (t == functionOfActivation())
		{
			System.out.println("Uda³o siê :)");
		}
	}
	
	public void execute(int[][] p, int M, int[] t) {
		for (int i = 0; i < M; i++) {
			System.out.println("X: " + p[i][0] + " Y: " + p[i][1]);
			calculateSignalValue(p[i][0], p[i][1]);
			checkIfCorrect(t[i]);
			calculateError(t[i]);
			if (e!=0)
			{
				setNewWagesAndShift(p[i][0], p[i][1]);
			}
		}
	}

}
