package ������;


	import java.util.InputMismatchException;
	import java.util.Scanner;
	public class Caishuzi { 
	public static void main(String[] args) {
	// ����һ�������
	int number = (int) (Math.random() * 100) + 1;
	// ����count
	int count = 0;
	// ������������ֵ������Сֵ
	int max = 100;
	int min = 1;
	while (true) {
	// ����¼������
	Scanner sc = new Scanner(System.in);
	System.out.println("��������Ҫ�µ����ݣ�(" + min + "~" + max + ")");
	try {
	count++;
	int guessNumber = sc.nextInt();
	// �ж�
	if (guessNumber > number) {
	max = guessNumber;
	System.out.println("��´���");
	} else if (guessNumber < number) {
	min = guessNumber;
	System.out.println("���С��");
	} else {
	System.out.println("��ϲ��,����" + count + "�ξͲ�����");
	// ���Ƿ����
	System.out.println("���ʻ�Ҫ������(yes)");
	sc = new Scanner(System.in);
	String str = sc.nextLine();
	if ("yes".equals(str)) {
	// ��д��ֵ�����
	number = (int) (Math.random() * 100) + 1;
	count = 0;
	max = 100;
	min = 1;
	} else {
	break;
	}
	}
	} catch (InputMismatchException e) {
	System.out.println("���������������");

		                        }

		                }

		        }

		}

