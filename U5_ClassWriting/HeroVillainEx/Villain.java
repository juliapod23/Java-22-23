package U5_ClassWriting.HeroVillainEx;

public class Villain {
    private String name;
    private Power superPower;

    public Villain(String name, Power superPower){
        this.name = name;
        this.superPower = new Power(superPower.getName(), superPower.getStrength());
    }

    public String toString() {
        String output = "";

        output += "Name of the villain: " + this.name + "\n";
        output += superPower;

        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
