package com.hansei.lee;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class Program {

	public static void main(String[] args) {
		//스캐너 호출
		Scanner sc = new Scanner(System.in);
		
		int run = 1;
		while(run == 1) {
			//영어사전 인트로메시지
			System.out.println("영어사전을 이용해주셔서 감사합니다.");
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
			int sel = sc.nextInt();
			
			//작업수행 시작
			try {
				//선택번호가 위 리스트 안에 있는지 확인
				if(sel >= 0 || sel <= 4) {
					//1번 선택시 실행
					if(sel == 1) {
						//선택알림 메시지
						System.out.println("영단어 입력을 선택하셨습니다.");
						//영단어 입력
						System.out.println("영단어를 입력해주세요.");
						String SavementEng = sc.next();
						//영단어 뜻 입력
						System.out.println("영단어의 뜻을 입력해주세요.");
						String SvaementKor = sc.next();
						
						
					}
				}
			//오류 발생시
			}catch(Exception e) {
				System.out.println("알 수 없는 에러가 발생하였습니다.");
			}
		}
	}

}
