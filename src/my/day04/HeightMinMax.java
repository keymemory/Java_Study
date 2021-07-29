package my.day04;

import java.util.Scanner;

public class HeightMinMax {

	String name[] = { "영희", "철수", "길동", "영수", "말자" };
	int[] height = new int[5];
	int sum = 0;
	int minH = 0;
	int minIndex = 0;
	int maxH = 0;
	int maxIndex = 0;

	public void inputHeight() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < height.length; i++) {
			System.out.println(name[i] + "의 키를 입력 : ");
			height[i] = sc.nextInt();
			sum += height[i];
		}
	}

	public void avgHeight() {
		System.out.println("학생들의 평균 신장 : " + sum / height.length);
	}

	public int maxHeight() {
		for (int i = 0; i < height.length; i++) {
			if (height[i] > maxH) {
				maxH = height[i];
				maxIndex = i;
			}
		}
		return maxH;
	}

	public int minHeight() {
		minH = maxH;
		for (int i = 0; i < height.length; i++) {
			if (height[i] < minH) {
				minH = height[i];
				minIndex = i;
			}
		}
		return minH;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightMinMax hmn = new HeightMinMax();
		hmn.inputHeight();
		hmn.avgHeight();
		System.out.println("학생의 최대 신장 : " + hmn.maxHeight());
		System.out.println("학생의 최소 신장 : " + hmn.minHeight());
	}

}
