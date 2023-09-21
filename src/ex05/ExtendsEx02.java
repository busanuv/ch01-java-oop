package ex05;

/**
 * 상속은 반드시 추상화 되어야 한다.
 * 재사용은 부가적인 효과이다.
 */
class Button {
    String color = "blue";
    String shape = "circle";
    boolean border = true;
}

class TextButton extends Button{
    String text = "완료";
}

public class ExtendsEx02 {
    public static void main(String[] args) {
        TextButton tb = new TextButton();
        System.out.println(tb.text);
        System.out.println(tb.color);
        System.out.println(tb.shape);
        System.out.println(tb.border);
    }
}
