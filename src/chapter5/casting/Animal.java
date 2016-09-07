package chapter5.casting;

import com.sun.org.apache.xerces.internal.impl.dv.xs.AnyURIDV;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Animal {
    protected void eat() throws IOException {
        System.out.println("Animal eating...");
    }
}
class Horse extends Animal {
    // This is an override.FileNotFoundException is a subtype of IOException,can be thrown. Cannot throw Exception(broader),cannot
    // throw SQLException(newer)
    protected void eat() throws FileNotFoundException {
        System.out.println("Horse eating...");
    }
    public void playDead() { // This is normal method
        System.out.println("Horse Walking...");
    }
}
class Main {
    public static void main(String[] args) throws IOException, SQLException {
        ((Animal)new Horse()).eat();//override, so calls actual object Horse's eat() method.
        //((Animal)new Horse()).playDead();// upcast.safe since it is compile time decision. horse of Animal reference type does not know about playDead(). compile time decision
        ((Horse)new Animal()).eat(); // down cast. compiles but throws a class cast exception at runtime.
        ((Horse)new Animal()).playDead(); // down cast. compiles but throws a class cast exception at runtime. Does not matter which method is called
    }
}


