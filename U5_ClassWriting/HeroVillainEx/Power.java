package U5_ClassWriting.HeroVillainEx;

public class Power {
    private String name;
    private double strength;

    /**
     * Full constructor for Power objects
     * @param name Name of the superpower
     * @param strength This is the strength of the superpower (1-10)
     */
    public Power(String name, double strength){
        this.name = name;
        this.strength = strength;
    }

    public String toString(){
        String output = "";

        output += "Name of the superpower: " + this.name + "\n";
        output += "Power strength: " + this.strength + "\n";

        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }
}
