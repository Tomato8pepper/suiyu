package com.gem.day2;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("��������� ��");
			int score = scanner.nextInt();
			if (score >= 60) {

				System.out.println("����");
			} else {
				System.out.println("������");
			}
		}
	}
}
