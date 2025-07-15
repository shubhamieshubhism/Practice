package Java;

public class InterviewTheory {
}

class PolyMorPhiSM {
    //method overloading
    public static void methodA() {
        System.out.println("In method A");
    }

    public static int methodA(int A) {
        System.out.println("In method A with Number " + A);
        return A;
    }

    public static void main(String[] args) {
        methodA();
        methodA(3);
    }
}

//Method Overriding
class Animal {
    public static void sound() {
        System.out.println("Animal make sound");
    }
}

class dog extends Animal {
    public static void sound() {
        System.out.println("Dog make sound bark bark");
    }

    public static void main(String[] args) {
        dog myAnimal = new dog();
        //it will print the output for which class we have make the object
        myAnimal.sound();
    }
}

abstract class instrument {
    abstract void instrumentName();

    void instrumentSound() {
        System.out.println("This is Instrument sound");
    }
}

interface instrumentInfo {
    void instrumentPrice();

    void instrumentwarranty();
}

class guitar extends instrument implements instrumentInfo {
    void instrumentName() {
        System.out.println("Instrument name is guitar");
    }

    @Override
    public void instrumentPrice() {
        System.out.println("The instrument price is displayed on instrument itself");
    }

    @Override
    public void instrumentwarranty() {
        System.out.println("Instrument warranty is on the box");
    }

    public static void main(String[] args) {
        guitar myguitar = new guitar();
        myguitar.instrumentSound();
        myguitar.instrumentName();
        myguitar.instrumentPrice();
        myguitar.instrumentwarranty();
    }
}




