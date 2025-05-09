public class ObjectTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("홍길동", 20);
        Person p2 = new Person("홍길동", 20);
        Person p3 = p1.clone();


        // toString() 테스트
        System.out.println("p1: "+ p1.toString());


        // equals() 테스트
        System.out.println("p1.equals(p2): " + p1.equals(p2));

        // hashCode() 테스트
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p1.hashCode(): " + p1.hashCode());

        // getClass() 테스트
        System.out.println("p1.getClass(): " + p1.getClass());

        //clone() 테스트
        System.out.println("p3 " + p3.toString());
        System.out.println("p1 == p3: " + (p1 == p3));// 주소가 같을까? 다를까?
    }
}
