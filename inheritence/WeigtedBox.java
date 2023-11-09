public class WeigtedBox extends Box {
    int weight;

    WeigtedBox(){
        this.weight = 1;
    }

    WeigtedBox(int l, int h, int w, int weight){
        super(l, h, w);
        this.weight = weight;
    }

    WeigtedBox(WeigtedBox other){
        super(other);
        this.weight = other.weight;
    }
}
