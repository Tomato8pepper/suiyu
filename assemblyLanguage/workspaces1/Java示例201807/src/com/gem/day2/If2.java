package com.gem.day2;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("请输入分数 ：");
			int score = scanner.nextInt();
			if (score >= 60) {

				System.out.println("及格！");
			} else {
				System.out.println("不及格！");
			}
		}
	}
}
