package com.mycom.word;

import java.util.Scanner;

public class WordManager {

    Scanner s = new Scanner(System.in);
    WordCRUD wordCRUD;
    WordManager() {
        wordCRUD = new WordCRUD(s);
    }
    public int selectMenu() {
        System.out.print("""

                ********************
                1. 모든 단어 보기
                2. 수준별 단어 보기
                3. 단어 검색
                4. 단어 추가
                5. 단어 수정
                6. 단어 삭제
                7. 파일 저장
                0. 나가기
                ********************
                => 원하는 메뉴는?\s""");

        return s.nextInt();
    }
    public void start() {

        wordCRUD.loadFile();
        System.out.println("*** 영단어 마스터 ***");
        while(true){
            int menu = selectMenu();
            if(menu == 0){
                System.out.println("프로그램 종료! 다음에 만나요~");
                break;
            }
            else if(menu == 4){ //create
                wordCRUD.addItem();
            }
            else if(menu == 1){ //show list
                wordCRUD.listAll();
            }
            else if(menu == 2){ // search
                wordCRUD.searchLevel();
            }
            else if(menu == 3){ // search
                wordCRUD.searchWord();
            }
            else if(menu == 5){ //update
                wordCRUD.updateItem();
            }
            else if(menu == 6){ //delete
                wordCRUD.deleteItem();
            }
            else if(menu == 7){ //save file
                wordCRUD.saveFile();
            }
        }
    }
}
