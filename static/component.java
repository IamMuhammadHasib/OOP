public class component {
    String name;
    String description;
    static int count;

    public component(String name, String description)
    {
        this.name = name;
        this.description = description;
        component.count += 1;
    }
}
