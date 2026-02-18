
interface Camera {

    void TakePic();

    void Video();

    private void greet() {
        System.out.println("Hello");
    }

    default void record() {
        greet();
        System.out.println("Recoding");
    }
}

interface wifi {

    String[] networkStrings();

    void connecttoNetwork(String network);
}

class CellPhone {

    public void PickCall(int Number) {
        System.out.println("Call from " + Number);
    }

    public void Calling(int Number) {
        System.out.println("Calling " + Number);
    }
}

class MySmartphone extends CellPhone implements wifi, Camera {

    @Override
    public void TakePic() {
        System.out.println("Taking pic");
    }

    @Override
    public void Video() {
        System.out.println("Taking Video");
    }

    @Override
    public String[] networkStrings() {
        String[] list = {"Jay", "Tanmay", "riyanshi"};
        return list;
    }

    @Override
    public void connecttoNetwork(String network) {
        System.out.println("Connect to : " + network);
    }

    // @Override
    // public void record(){
    //     System.out.println("Record Override");
    // }
}

public class Polymorphism {

    public static void main(String[] args) {
        Camera c = new MySmartphone();
        c.record();
        c.TakePic();
    }
}
