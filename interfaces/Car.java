public class Car implements Engine, Brake {

    @Override
    public void brake() {
        System.out.println("normal car brake");
    }

    @Override
    public void start() {
        System.out.println("normal car start");
    }

    @Override
    public void stop() {
        System.out.println("normal car stop");
    }

    @Override
    public void acc() {
        System.out.println("normal car acc");
    }

}
