interface Bike{
    int speed = 10;
    void Applybrake(int decrement);
    void SpeedUp(int increment);
}

interface Car{
    void Top();
    void Best();
}

class Honda implements Bike,Car{
    @Override
    public void Applybrake(int decrement){
        System.out.println("Applying Brakes");
    }

    @Override
    public void SpeedUp(int increment){
        System.out.println("Speed up");
    }

    @Override
    public void Top(){
        System.out.println("This is the top model");
    }
    @Override
    public void Best(){
        System.out.println("This is the best Car");
    }
}



public class Interface{
    public static void main(String[] args) {
        Honda h = new Honda();
        h.Applybrake(11);
        h.SpeedUp(10);
        System.out.println("Speed : " + h.speed);
        // h.speed = 100;

        h.Top();
        h.Best();
    }
}