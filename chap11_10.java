public class chap11_10 implements chap11_09 {

    public static void staticPrint(String str) {
        System.out.println("MyInterfaceImpl.staticPrint" +str);

    }
    public static void main(String[] args) {
        chap11_09 myInterface = new chap11_10();
        myInterface.defaultPrint("try");
    }
    
}
