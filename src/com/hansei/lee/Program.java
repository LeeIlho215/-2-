package com.hansei.lee;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Program {

	public static void main(String[] args) {
		//��ĳ�� ȣ��
		Scanner sc = new Scanner(System.in);
		
		int run = 1;
		while(run == 1) {
			//������� ��Ʈ�θ޽���
			System.out.println("��������� �̿����ּż� �����մϴ�.");
			//����â ��Ʈ��
			System.out.println("==================");
			//���ܾ� �Է� ����
			System.out.println("1.���ܾ� �Է�");
			//���ܾ� ���� ����
			System.out.println("2.���ܾ� ����");
			//���ܾ� �˻� ����
			System.out.println("3.���ܾ� �˻�");
			//���ܾ� ��ü��� ����
			System.out.println("4.���ܾ� ��ü���");
			//���α׷� �����ϱ�
			System.out.println("0.���α׷� ����");
			//����â �ƿ�Ʈ��
			System.out.println("==================");
			
			//���ù�ȣ ���庯��
			int sel = sc.nextInt();
			
			//�۾����� ����
			try {
				//���ù�ȣ�� �� ����Ʈ �ȿ� �ִ��� Ȯ��
				if(sel >= 0 || sel <= 4) {
					//1�� ���ý� ����
					if(sel == 1) {
						//���þ˸� �޽���
						System.out.println("���ܾ� �Է��� �����ϼ̽��ϴ�.");
						//���ܾ� �Է�
						System.out.println("���ܾ �Է����ּ���.");
						String SavementEng = sc.next();
						//���ܾ� �� �Է�
						System.out.println("���ܾ��� ���� �Է����ּ���.");
						String SvaementKor = sc.next();
						
						
					}
				}
			//���� �߻���
			}catch(Exception e) {
				System.out.println("�� �� ���� ������ �߻��Ͽ����ϴ�.");
			}
		}
	}

}
