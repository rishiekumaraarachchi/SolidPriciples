package DependancyInversion;

public class Demo {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb();
        Switch bulbPowerSwitch = new Switch(bulb);
        bulbPowerSwitch.turnOn();
        bulbPowerSwitch.turnOff();
    }
}

// High-level module (business logic)
//class Switch {
//    private LightBulb bulb;
//
//    public Switch(LightBulb bulb) {
//        this.bulb = bulb;
//    }
//
//    public void turnOn() {
//        bulb.turnOn();
//    }
//
//    public void turnOff() {
//        bulb.turnOff();
//    }
//}
//
//// Low-level module (physical light bulb)
//class LightBulb {
//    public void turnOn() {
//        System.out.println("Light bulb turned on");
//    }
//
//    public void turnOff() {
//        System.out.println("Light bulb turned off");
//    }
//}

// Abstraction adhering to DIP
interface Switchable {
    void turnOn();
    void turnOff();
}

// High-level module (business logic)
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}

// Low-level module (physical light bulb)
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light bulb turned off");
    }
}
