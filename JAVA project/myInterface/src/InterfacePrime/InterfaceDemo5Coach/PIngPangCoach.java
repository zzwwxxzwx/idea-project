package InterfacePrime.InterfaceDemo5Coach;

public class PIngPangCoach extends Coach implements SpeakEnglish{
    public PIngPangCoach() {
    }

    public PIngPangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }


    @Override
    public void eat() {
        System.out.println("乒乓球教练吃乒乓球A套餐");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
