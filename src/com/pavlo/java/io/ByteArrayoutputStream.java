package com.pavlo.java.io;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayoutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ByteArrayOutputStream f = new ByteArrayOutputStream();
		String s = "�� ������ ������� ���� ������� � �����.";
		byte [] buf = s.getBytes();
		
		try {
			f.write(buf);
		} catch (Exception e) {
			System.out.println("������� ������ � �����.");
			return;
		}
		System.out.println("����� � ������ ��������� ������.");
		System.out.println(f.toString());
		System.out.println("� �����.");
		byte [] b = f.toByteArray();
		for (int i = 0; i < b.length; i++) System.out.print((char) b[i]);
		System.out.println("\n� ���� ������ ���� OutputStream().");
		try (FileOutputStream f2 = new FileOutputStream("test.txt")) {
			f.writeTo(f2);
		} catch (IOException e) {
			System.out.println("������� �����-������ " + e);
			return;
		}
		
		System.out.println("���������� � ������� ���������");
		f.reset();
		
		for (int i = 0; i<3; i++) f.write('X');
		System.out.println(f.toString());
		
	}
	

}
