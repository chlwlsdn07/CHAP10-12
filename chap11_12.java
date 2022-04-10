// 인터페이스 다중상속 예제 Accessible
public interface chap11_12 {
    public default void access(){
        System.out.println("access");
    }

    public default void print(){
        System.out.println("Accessible Print");
    }
    
}
