public class Shapes {
    // we are overriding this method in its child classes
    void area(){
        System.out.println("Area of the shapes");
    }

    // final method can not be overriden
    final void area1(){}
}
