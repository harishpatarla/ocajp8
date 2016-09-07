package chapter5.abstractclassandinterface;

interface Device {
    public void doIt();
}

/**
 * Created by harish on 8/26/2016.
 */ // All of this compiles without issues
public class Electronic implements Device {
    @Override
    public void doIt() {
    }
}
// below abstract class inherits all methods from Electronic
abstract class Phone1 extends Electronic {
}

// below abstract class inherits all methods from Electronic
abstract class Phone2 extends Electronic {
    public void doIt() {
    }
}

class Phone3 extends Electronic implements Device {
    public void doStuff() {
    }
}