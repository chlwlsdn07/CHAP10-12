// 익명 내부 클래스 예제
public class chap12_04 {
    int oNum;

    abstract class InnerClass {
        int iNum;
        abstract void innerMethod(int iP);
    }
    
    InnerClass inner = new InnerClass(){

        void innerMethod(int iP){
            iNum = iP;
            System.out.println("This is an Inner class "+iP+ " "+oNum);
        }
    };

    void outerMethod(int oP){
        oNum = oP;
        inner.innerMethod(oP);
        System.out.println("This is an outer class "+oP+" "+inner.iNum);
    }
    public static void main(String[] args) {
        chap12_04 outer = new chap12_04();
        outer.outerMethod(3);
    }
}
