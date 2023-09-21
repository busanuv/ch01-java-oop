package ex05;

/**
 * 오직 추상화에 목적이 있다
 * 추상화를 통해 다형성을 구현할 수 있다.
 */
abstract class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}

public class ExtendsEx03 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog(); // 강아지는 강아지이고, 동물이다. (다형성)
        animals[1] = new Cat(); // 고양이는 고양이고, 동물이다. (다형성)
    }
}
