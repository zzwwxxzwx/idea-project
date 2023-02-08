package args3Interface;

public class JumpingOperator {
    public void useJumpping(Jumping j){//Jumping j = new Cat()
        j.jump();
    }

    public Jumping getJummpping(){
        Jumping j = new Cat();
        return j;
    }
}
