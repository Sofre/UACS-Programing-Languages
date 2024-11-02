public class Vehicle {
    private String model;
    private int num_passangers;
    private double gas_capacity;
    private double fuel_conspomtion;

    public String getModel() {
        return model;
    }

    public double distance(){
        double fuel_cons_1km = fuel_conspomtion/100;

        return gas_capacity/fuel_cons_1km;
    }
    public void compare(Vehicle other ){
        if(this.distance() > other.distance())
        {
            System.out.println(this.model + "can go further than " + other.model);
        }
        else if(this.distance()==other.distance()){System.out.println(this.model +"and" + other.model + "can traverse the same!");}
        else {System.out.println(other.model + " can go further than " +  this.model);}
    }


    public Vehicle(String model, int num_passangers, double gas_capacity, double fuel_conspomtion) {
        this.model = model;
        this.num_passangers = num_passangers;
        this.gas_capacity = gas_capacity;
        this.fuel_conspomtion = fuel_conspomtion;
    }
}

