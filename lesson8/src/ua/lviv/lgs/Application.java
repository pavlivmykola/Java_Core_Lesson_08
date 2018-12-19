package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Seasons season = null;
		int days = 0;
		
		System.out.println("������ ����� �����");
		Scanner sc = new Scanner(System.in);
		String month = sc.next().toUpperCase();
		Monthes [] monthArray = Monthes.values();
		Seasons [] seasonArray = Seasons.values();
		boolean flag = false;
		for(Monthes m:monthArray) {
			if (m.name().equals(month)) {
				System.out.println("����� ����� ����");
				season = m.season;
				days=m.days;
				flag=true;
			}
		}
		if (!flag) {
			System.out.println("������ ����� ����");
			return;
		}
		System.out.println("̳���� � ����� ���� "+season.name());
		for (Monthes m:monthArray) {
			if (m.season.equals(season)) {
				System.out.println(m.name());
			}
		}
		System.out.println("̳���� � ��������� ������� ��� "+days);
		for (Monthes m:monthArray) {
				if (m.days==days) {
					System.out.println(m.name());
				}
		}
		System.out.println("̳���� � ������ ������� ��� "+days);
		for (Monthes m:monthArray) {
				if (m.days<days) {
					System.out.println(m.name());
				}
		}
		System.out.println("̳���� � ������ ������ ��� "+days);
		for (Monthes m:monthArray) {
				if (m.days>days) {
					System.out.println(m.name());
				}
		}
		int ordinal = 1+season.ordinal();
		if (ordinal==seasonArray.length) {
			ordinal=0;
		};
		System.out.println("�������� ���� ���� "+seasonArray[ordinal]);
		ordinal = season.ordinal()-1;
		if (ordinal<0) {
			ordinal=seasonArray.length-1;
		};
		System.out.println("��������� ���� ���� "+seasonArray[ordinal]);
		System.out.println("̳���� � ������ ������� ��� ");
		for (Monthes m:monthArray) {
				if (m.days%2==0) {
					System.out.println(m.name());
				}
		}
		System.out.println("̳���� � �������� ������� ��� ");
		for (Monthes m:monthArray) {
				if (m.days%2==1) {
					System.out.println(m.name());
				}
		}
		System.out.println((days%2==0) ? "�������� ����� �� ����� ������� ���":"�������� ����� �� ������� ������� ���");

	}

}
