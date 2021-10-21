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
		//Scanner 호출
		Scanner scan = new Scanner(System.in);
		//ObjectMapper 호출
		ObjectMapper mapper = new ObjectMapper();
		//정보들을 담을 JSONArray 객체 생성
		JSONArray array = new JSONArray();
		//각 정보를 담을 JSONObject 객체 생성
		JSONObject info = new JSONObject();
		
		myDic md = new myDic(null, null, 0);
		
		int num = 0;
		
		//영어사전 시작
		while(true) {
			//선택창 인트로
			System.out.println("==================");
			//영단어 입력 선택
			System.out.println("1.영단어 입력");
			//영단어 삭제 선택
			System.out.println("2.영단어 삭제");
			//영단어 검색 선택
			System.out.println("3.영단어 검색");
			//영단어 전체출력 선택
			System.out.println("4.영단어 전체출력");
			//프로그램 종료하기
			System.out.println("0.프로그램 종료");
			//선택창 아웃트로
			System.out.println("==================");
			
			//선택번호 저장변수
			int sel = 0;
			
			//작업수행 시작
			try {
				sel = scan.nextInt();
			//오류 발생시
			}catch(Exception e) {
				System.out.println("알 수 없는 에러가 발생하였습니다.");
			}finally {
				//선택번호가 위 리스트 안에 있는지 확인
				if(sel >= 0 || sel <= 4) {
					//1번 선택시 실행
					if(sel == 1) {
						//선택알림 메시지
						System.out.println("영단어 입력을 선택하셨습니다.");
						//영단어 입력
						System.out.println("영단어를 입력해주세요.");
						String SaveEng = scan.next();
						//영단어 뜻 입력
						System.out.println("영단어의 뜻을 입력해주세요.");
						String SaveKor = scan.next();
						
						md.insert(SaveEng, SaveKor);
						array.add(md.jo);
						
						//SaveEng와 SaveKor 이니셜라이징
						SaveEng = "";
						SaveKor = "";
						md.num ++;
						
					}
					
					//2번 선택시 실행
					if(sel == 2) {
						System.out.println("영단어 삭제를 선택하셨습니다.");
						System.out.println("삭제할 영단어를 입력해주세요.");
						String tempSave = scan.next();
						
						for(int i = 0; i<array.size(); i++) {
							if(array.get(i) == tempSave) {
								array.remove("단어" + i);
							}
						}
					}
					
					//3번 선택시 실행
					if(sel == 3) {
						
					}
					
					//4번 선택시 실행
					if(sel == 4) {
						for(int i = 0; i < array.size(); ++i) {
							System.out.println("==================");
							System.out.println("영단어 : " + md.jo.get("eng" + md.num));
							System.out.println("뜻 : " + ((JSONObject)info).get("뜻" + i));
							System.out.println("==================");
						}
					}
					
					//0번 선택시 실행
					if(sel == 0) {
						//프로그램 종료 문구 출력 후 while 종료
						System.out.println("프로그램을 종료합니다.");
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
