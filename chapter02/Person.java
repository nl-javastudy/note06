public class Person implements Cloneable {
    //여기서 Cloneable 은 'java'에서 객체를 복제 할 수 있게 해주는 마커 인터페이스 역할

    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person[name=" + name + ", age=" + age + "]";
    }
    @Override
    public boolean equals(Object obj){
        boolean expr1 = this == obj;
        if(expr1) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
    @Override
    public int hashCode(){
        return 31*name.hashCode() + age;
    }
    @Override
    public Person clone() throws CloneNotSupportedException{
        return (Person) super.clone();
    }
}