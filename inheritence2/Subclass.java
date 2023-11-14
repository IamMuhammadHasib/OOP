public class Subclass extends Super {
    public Subclass(String num){
        super(num);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass("Age");
        System.out.println(obj.age);
    }

}
