package extendsDemoPhone;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p =new Phone();
        p.call("zwx");
        System.out.println("------------");
        NewPhone np=new NewPhone();
        np.call("zwxnp");
    }
}
