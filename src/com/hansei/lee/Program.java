package com.hansei.lee;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

class myDic {
	JSONObject jo = new JSONObject();
	
	public String kor;
	public String eng;
	public int num;
	public myDic(String kor, String eng, int num) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.num = num;
	}
	
	public void insert(String a, String b) {
		jo.put("eng" + num, a);
		jo.put("kor" + num, b);
	}
}

public class Program {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws JsonProcessingException {
		//Scanner ȣ��
		Scanner scan = new Scanner(System.in);
		//ObjectMapper ȣ��
		ObjectMapper mapper = new ObjectMapper();
		//�������� ���� JSONArray ��ü ����
		JSONArray array = new JSONArray();
		//�� ������ ���� JSONObject ��ü ����
		JSONObject info = new JSONObject();
		
		myDic md = new myDic(null, null, 0);
		
		int num = 0;
		
		//������� ����
		while(true) {
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
			int sel = 0;
			
			//�۾����� ����
			try {
				sel = scan.nextInt();
			//���� �߻���
			}catch(Exception e) {
				System.out.println("�� �� ���� ������ �߻��Ͽ����ϴ�.");
			}finally {
				//���ù�ȣ�� �� ����Ʈ �ȿ� �ִ��� Ȯ��
				if(sel >= 0 || sel <= 4) {
					//1�� ���ý� ����
					if(sel == 1) {
						//���þ˸� �޽���
						System.out.println("���ܾ� �Է��� �����ϼ̽��ϴ�.");
						//���ܾ� �Է�
						System.out.println("���ܾ �Է����ּ���.");
						String SaveEng = scan.next();
						//���ܾ� �� �Է�
						System.out.println("���ܾ��� ���� �Է����ּ���.");
						String SaveKor = scan.next();
						
						md.insert(SaveEng, SaveKor);
						array.add(md.jo);
						
						//SaveEng�� SaveKor �̴ϼȶ���¡
						SaveEng = "";
						SaveKor = "";
						md.num ++;
						
					}
					
					//2�� ���ý� ����
					if(sel == 2) {
						System.out.println("���ܾ� ������ �����ϼ̽��ϴ�.");
						System.out.println("������ ���ܾ �Է����ּ���.");
						String tempSave = scan.next();
						
						for(int i = 0; i<array.size(); i++) {
							if(array.get(i) == tempSave) {
								array.remove("�ܾ�" + i);
							}
						}
					}
					
					//3�� ���ý� ����
					if(sel == 3) {
						
					}
					
					//4�� ���ý� ����
					if(sel == 4) {
						for(int i = 0; i < array.size(); ++i) {
							System.out.println("==================");
							System.out.println("���ܾ� : " + md.jo.get("eng" + md.num));
							System.out.println("�� : " + ((JSONObject)info).get("��" + i));
							System.out.println("==================");
						}
					}
					
					//0�� ���ý� ����
					if(sel == 0) {
						//���α׷� ���� ���� ��� �� while ����
						System.out.println("���α׷��� �����մϴ�.");
						break;
					}
					
					if(sel == 24) {
						System.out.println(mapper.writeValueAsString(info));
					}
				}
			}
		}
	}

}
