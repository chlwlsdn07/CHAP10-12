// 인터페이스 다중상속 예제 Clickable
public interface chap11_11 {
    public default void click(){
        System.out.println("Click");
    }

    public default void print(){
        System.out.println("Clickable Print");
    }
    
}
