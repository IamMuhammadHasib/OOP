public class Main {
    public static void main(String[] args) {
        Access obj = new Access(10, "Abu-Bakr");

        // private attributes can not be accessed directly
        // System.out.println(obj.num);

        // access via public method
        System.out.println(obj.getNum());
    }
}
