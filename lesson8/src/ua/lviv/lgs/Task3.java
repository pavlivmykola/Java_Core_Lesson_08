package ua.lviv.lgs;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� ����� �����");
		if (sc.hasNextInt()) {
			a=sc.nextInt();
		} else {
			System.out.println("�� ���������� ���");
			return;
		}
		if (sc.hasNextInt()) {
			b=sc.nextInt();
			System.out.println("���� �������� ����� = "+(a+b));
		} else {
			System.out.println("�� ���������� ���");
			
		}
		

	}

}
