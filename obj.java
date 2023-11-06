public class obj{
    public static void main(String[] args) {
        Student one = new Student();
        one.marks = 92.5f;
        one.name = "Imran";
        one.roll = 3;

        System.out.println(one.name);

    }
}

class Student{
    int roll;
    String name;
    float marks;
}