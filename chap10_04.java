// Default 예제
public class chap10_04 {

    public static void main(String[] args) {
        chap10_03 defaultInstance = new chap10_03();

        defaultInstance.setNum(3);
        System.out.println(defaultInstance.getNum());
        System.out.println(defaultInstance.num);

    }
    
}
