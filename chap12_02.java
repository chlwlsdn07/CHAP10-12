// Static Inner 클래스 예제
public class chap12_02 {
    static private int oNum;

    static class InnerClass{
        private int iNum;

        void innerMethod(int iP){
            iNum = iP;
            System.out.println("This is an inner class "+iP + " " +oNum);
        }
    }

    void outerMethod(int oP){
        oNum = oP;
        InnerClass inner = new InnerClass();
        inner.innerMethod(oP);

        System.out.println("This is an outer class"+oP + " "+inner.iNum);
    }

    public static void main(String[] args) {
        chap12_02 outer = new chap12_02();
        outer.outerMethod(3);

        chap12_02.InnerClass newInner = new chap12_02.InnerClass();
        newInner.innerMethod(4);
    }
    
}
