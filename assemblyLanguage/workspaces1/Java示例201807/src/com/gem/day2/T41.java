package com.gem.day2;

//����Բ
import java.util.Scanner;

public class T41 {

	public static void main(String[] args) {
		new T41().print();

	}

	// ��Բ����
	void print() {
		System.out.println("����뾶��");
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();

		System.out.println("�����");
		for (int y = 0; y <= 2 * r; y += 2) {

			int x = (int) Math.round(r - Math.sqrt(r * r - (r - y) * (r - y)));

			int l = 2 * (r - x);
			for (int i = 0; i <= x; i++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int i = 0; i <= l; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
