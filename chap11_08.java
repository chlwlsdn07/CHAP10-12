// 인터페이스 예제 Bird Manager
public class chap11_08 { 

    void relocate(chap11_05[] birds){
        for(chap11_05 bird : birds){
            bird.move();
        }
    }

    public static void main(String[] args) {
        chap11_05[] birds = new chap11_05[3];

        birds[0] = new chap11_06(); 
        birds[1] = new chap11_07();
        birds[2] = new chap11_06();

        chap11_08 birdManager = new chap11_08();
        birdManager.relocate(birds);
    }
    
}
