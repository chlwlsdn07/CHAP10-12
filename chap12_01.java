// Inner 클래스 예제
public class chap12_01 {
    private int oNum;

    class InnerClass{
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
        chap12_01 outer = new chap12_01();
        outer.outerMethod(3);

        chap12_01.InnerClass newInner = outer.new InnerClass();
        newInner.innerMethod(4);
    }
    
}
