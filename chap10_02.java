// private 예제 
public class chap10_02 {
    public static void main(String[] args) {
        chap10_01 pObject = new chap10_01(); // cahp10_01 클래스에 접근 성공
        pObject.setNum(3); 
        System.out.println(pObject.getNum()); // chap10_01 멤버 함수 접근 성공

       // System.out.println(pObject.num); // num은 private로 선언되어 접근 불가
    }
}
