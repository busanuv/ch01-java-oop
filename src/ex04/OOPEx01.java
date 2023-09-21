package ex04;

/**
 * 토키 굴 속에 갇힌 엘리스
 * 토키 굴 끝에 작은 문이 보였다.
 * 탁자위 황금 열쇠로 문을 열었지만, 문이 너무 작아서 나갈 수 없었다.
 * 작은 병에 든 것을 마셨더니 키가 10인치로 작아졌다. (상태는 행위를 통해 변경된다)
 */
class Ellis {
    public int height;
}

public class OOPEx01 {
    public static void main(String[] args) {
        Ellis ellis = new Ellis();
        // 이렇게 변경되는 것은 마법이다.
        ellis.height = 10;
        System.out.println("엘리스의 키 : "+ellis.height);
    }
}
