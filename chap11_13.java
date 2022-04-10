public class chap11_13 implements chap11_11, chap11_12{
    @Override
    public void print(){
        chap11_11.super.print();
        chap11_12.super.print();
    }

    public static void main(String[] args) {
        chap11_13 button = new chap11_13();
        button.click();
        button.access();
        button.print();
    }
    
}
