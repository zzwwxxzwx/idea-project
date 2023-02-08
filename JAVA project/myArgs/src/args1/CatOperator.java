package args1;

public class CatOperator {
    public void  useCat(Cat c){//注1：需要传入一个对象,Cat c = new Cat()
        c.eat();
    }

    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}
