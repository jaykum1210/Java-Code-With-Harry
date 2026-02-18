
// Question 1
abstract class Pen{
    abstract void write();
    abstract void refill();
}

// Question 2
class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("Writing");
    }
    @Override
    public void refill(){
        System.out.println("Refill");
    }
    public void changenib(){
        System.out.println("change nib");
    }
}

// Question 3
class Monkey{
    public void jump(){
        System.out.println("Jumping");
    }
    public void bite(){
        System.out.println("Bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating");
    }
    @Override
    public void sleep(){
        System.out.println("Sleep");
    }
}

// Question 4
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
    public void type1(){
        System.out.println("Telephone");
    }
}

class Phone extends Telephone{
    @Override
    public void ring(){
        System.out.println("Ringing");
    }
    @Override
    public void lift(){
        System.out.println("pick up call");
    }
    @Override
    public void disconnect(){
        System.out.println("Call End");
    }
    public void type(){
        System.out.println("Phone Not Telephone");
    }
}

// Question 6

interface TvRemote{
    void play();
    void resume();
    void increasevolumn();
    void decreasevolumn();
}

interface SmartTvRemote extends TvRemote{
    void openyoutube();
    void voiceassistant();
}

class Tv implements TvRemote{
    @Override
    public void play(){
        System.out.println("Play");
    }
    @Override
    public void resume(){
        System.out.println("resume");
    }
    @Override
    public void increasevolumn(){
        System.out.println("increasevolumn");
    }
    @Override
    public void decreasevolumn(){
        System.out.println("decreasevolumn");
    }
}

public class Chapter11{
    public static void main(String[] args) {

        // Question 1,2
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.changenib();

        // Question 3
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();

        // Question 4
        Telephone t = new Phone();
        t.ring();
        t.lift();
        t.disconnect();
        t.type1();

        // t.type();

        // Question 5
        Monkey m = new Human();
        m.jump();
        m.bite();

        // Question 6
        Tv tv = new Tv();
        tv.play();
        tv.resume();
        tv.decreasevolumn();
        tv.increasevolumn();
    }
}