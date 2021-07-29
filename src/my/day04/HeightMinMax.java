package my.day04;

import java.util.Scanner;

public class HeightMinMax {

	String name[] = { "����", "ö��", "�浿", "����", "����" };
	int[] height = new int[5];
	int sum = 0;
	int minH = 0;
	int minIndex = 0;
	int maxH = 0;
	int maxIndex = 0;

	public void inputHeight() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < height.length; i++) {
			System.out.println(name[i] + "�� Ű�� �Է� : ");
			height[i] = sc.nextInt();
			sum += height[i];
		}
	}

	public void avgHeight() {
		System.out.println("�л����� ��� ���� : " + sum / height.length);
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
		System.out.println("�л��� �ִ� ���� : " + hmn.maxHeight());
		System.out.println("�л��� �ּ� ���� : " + hmn.minHeight());
	}

}
