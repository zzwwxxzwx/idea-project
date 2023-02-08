package InterfacePrime.InterfaceDemo5Coach;

public class PingPangPlayer extends Player implements SpeakEnglish{
    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃B套餐");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员学英语");
    }

    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }
}
