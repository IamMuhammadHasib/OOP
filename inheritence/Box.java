package inheritence;

public class Box {
    int l, h, w;

    Box(){
        this.l = 0;
        this.h = 0;
        this.w = 0;
    }

    Box(int side)
    {
        this.l = side;
        this.h = side;
        this.w = side;
    }
}
