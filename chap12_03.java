// 메소드 로컬 내부 클래스
public class chap12_03 {
    int oNum;

    void outerMethod(int oP){
        int localV = 0;
        class InnerClass{
            int iNum;

            void innerMethod(int iP){
                iNum = iP;
                System.out.println("This is an inner class" +iP +" "+oNum +" "+oP +" "+localV);
                oNum=1;

            }
        }

        oNum = oP;
        InnerClass inner = new InnerClass();
        inner.innerMethod(oP);
        System.out.println("This is ac outer class"+oP +" "+inner.iNum);
    }

    public static void main(String[] args) {
        chap12_03 outer = new chap12_03();
        outer.outerMethod(3);

    }
    
}
