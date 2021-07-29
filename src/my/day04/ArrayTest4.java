package my.day04;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = { 12, 3, 19, 6, 18, 8, 12, 4, 1, 19 };
		int min, max;

		min = s[0];
		max = s[0];

		for (int i = 1; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			} 
			else if (s[i] > max) {
				max = s[i];
			}
		}
		System.out.println("ÃÖ¼Ú°ª : " + min);
		System.out.println("ÃÖ´ñ°ª : " + max);

	}

}
