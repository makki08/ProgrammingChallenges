public class BinarianSolution {

	public static void main(String[] args) {
		int binarian = 0;
		int counter = 0;
		
		int[] A = {1, 0, 2, 0, 0, 2};
		
		binarian = getBinarian(A);
		
		do {
			binarian -= getSubtrahend(binarian);
			counter++;
		} while (binarian > 0);
		
		System.out.println(counter);
	}

	private static int getSubtrahend(int binarian) {
		int  i = 1;
		
		do {
			i *= 2;
		} while (i <= binarian);
			
		return i / 2;
	}

	private static int getBinarian(int[] a) {
		int binarian = 0;
		
		for (int i = 0; i < a.length; i++) {
			binarian += Math.pow(2, a[i]);
		}
		
		return (int)binarian;
	}
}
