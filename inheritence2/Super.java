public class Super {
    int num;
    // protected can only be accessed in its child classes (wheather in same package or not)
    protected String age;

    public Super(String num){
        this.num = 10;
        this.age = num;
    }
}
