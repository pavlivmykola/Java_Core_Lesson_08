package ua.lviv.lgs;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �����");
		if (sc.hasNextInt()) {
			int i=sc.nextInt();
			System.out.println((i%2==0) ? "������� ����� � ������":"������� ����� � ��������");
		} else {
			System.out.println("�� ���������� ���");
		}

	}

}
