import java.util.Arrays;
import java.util.Random;

class Shuffle {

	// Knuth's shuffle algorithm
	public void shuffle(int[] a) {
		Random r = new Random();
		
		for(int i = a.length - 1; i > 0; i--) {
			swap(a, i, r.nextInt(i + 1));
		}
	}

	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		Shuffle s = new Shuffle();

		int[] a = {1, 4, 7, 9, 0, 4, 2, 6, 8, 1};
		s.shuffle(a);
		System.out.println(Arrays.toString(a));
	}
}