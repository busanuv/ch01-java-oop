package ex03;

import java.time.LocalDateTime;

class Data{

    // 행위가 있을 때 잠시 기억하는 변수는 stack에 담긴다.
    public void think() throws InterruptedException {
        // start 변수 = 지역변수 = stack 변수
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.print(".");
        }
        // end 변수 = 지역변수 = stack 변수
        LocalDateTime end = LocalDateTime.now();
        System.out.println("시작시간 : "+start);
        System.out.println("끝시간 : "+end);
    }
}

public class MethodEx01 {
    public static void main(String[] args) {
        Data d1 = new Data();
        try {
            d1.think();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
