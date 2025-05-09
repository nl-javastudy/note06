abstract class Animal {

    protected String name;

    public Animal(String name){
        this.name = name;
    }

    abstract void makeSound();

    public void eat(){
        System.out.println(name + "이(가) 먹고 있습니다.");
    }

}// 공통된 로직을 구현하기 위함.

interface Flyable{
    void fly();
}// 다양한 클래스가 동일한 동작을 보장해야됨 -> interface

class Bird extends Animal implements Flyable{
    public Bird(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("짹쨱");
    }
    @Override
    public void fly(){
        System.out.println(name + "이(가) 날아갑니다.");
    }

}
