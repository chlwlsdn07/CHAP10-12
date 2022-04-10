// 추상 클래스 예제 Bird
public abstract class chap11_01 {
    void moves(){                   // 추상 메소드 move를 3번 실행
        for(int i=0; i<3; i++){
            move();
        }
    }
    
    abstract void move();
}
