public class Main {
    public static void main(String[] args) {
        Box b1 = new Box(3);
        Box b2 = new Box(b1);

        System.out.println(b2.w);

        WeigtedBox b3 = new WeigtedBox();
        System.out.println(b3.h+" "+b3.weight);

        Box b4 = new WeigtedBox(2,3,4,5);
        // box(parent) is pointing to weightedbox(child) and child is trying to do the work of parent. but parent doesn't know about weight, so gives error
        // System.out.println(b4.weight);
        System.out.println("::"+b4.h);


        // similarly weightedbox(child) is pointing to box(parent) and parent is trying to be child. But this doesn't work, because only child can inherit parent, parent can't inherit child
        // WeigtedBox b5 = new Box(10, 11, 12);

        WeigtedBox b6 = new WeigtedBox(b3);
        System.out.println(">>"+b6.weight);
    }
}
