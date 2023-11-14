public class NiceCar {
    private Engine engine;
    private Media media = new ScreenPlayer();

    public NiceCar(){
        engine = new ElectricEngine();
    }

    public void start(){
        engine.start();
    }

    public void startMedia(){
        media.start();
    }

    public void stopMedia(){
        media.stop();
    }
}
