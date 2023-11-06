// import singleton.Singleton;

public class one {
    public static void main(String[] args) {
        // Get the Singleton instance.
        Singleton obj1 = Singleton.getInstance();

        // Get the Singleton instance again.
        Singleton obj2 = Singleton.getInstance();

        // obj1 and obj2 should be the same instance.
        System.out.println(obj1 == obj2);  // This should print "true".
    }
}
