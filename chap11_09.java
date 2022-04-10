// 본체 있는 인터페이스 메소드 예제
public interface chap11_09 {
    public default void defaultPrint(String str){
        System.out.println("MyInterface.defaultPrint : "+str);
        staticPrint(str);
        privatePrint(str);
        privateStaticPrint(str);
    }

    public static void staticPrint(String str){
        System.out.println("MyInterface.staticPrint : "+str);
        // privateStaticPrint(str);
        
    }

    private void privatePrint(String str){
        System.out.println("MyInterface.privatePrint : "+str);
        privateStaticPrint(str);
    }

    private void privateStaticPrint(String str){
        System.out.println("MyInterface.privatestaticPrint : "+str);
    }
}
    

