public class Main {
    public static void main(String[] args) {
       Lightbulb bulb = new Lightbulb("Ericsson","idle","NONE"," OFF");
       Thermostat thermostat = new Thermostat("Xperia","idle",26,"Monday to Friday , 16:00 pm to 12:00 am","OFF");
       SmartSpeaker smartSpeaker = new SmartSpeaker("Bose","idle",100,"NONE","OFF");
       Fan fan = new Fan("Dell","idle",50);


       System.out.println("Lightbulb");
       bulb.getDeviceName();
       bulb.getStatus();
       bulb.increaseSetting();
       bulb.decreaseSetting();
       bulb.scheduleON("ON");
       bulb.scheduleOFF("OFF");
       bulb.turnOn();
       bulb.turnOff();

        System.out.println("Thermostat:");
        thermostat.getDeviceName();
        thermostat.getStatus();
        thermostat.increaseSetting();
        thermostat.decreaseSetting();
        thermostat.scheduleON("ON");
        thermostat.scheduleOFF("OFF");






    }
}