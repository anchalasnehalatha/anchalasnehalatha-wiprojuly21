package lab24_july;

abstract class vehicle {
    abstract void move();
}
//subclass1
class car extends vehicle {
    @Override
    void move() {
        System.out.println("car is moving on four wheels");
    }
}
//subclass2
class bike extends vehicle {
    @Override
    void move() {
        System.out.println("bike is moving on two wheels");
    }
}
//subclass3
class bus extends vehicle {
    @Override
    void move() {
        System.out.println("bus is moving on four wheels");
    }
}

public class Mainclass4 {
    public static void main(String[] args) {
        car c = new car();
        c.move();

        bike b = new bike();
        b.move();

        bus bu = new bus();
        bu.move();
    }
}


