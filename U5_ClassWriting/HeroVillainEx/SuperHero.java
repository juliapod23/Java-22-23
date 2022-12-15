package U5_ClassWriting.HeroVillainEx;

public class SuperHero {
    private String name;
    private Power superPower;

    // keep track of total number of SuperHero objects created so far
    private static int numHeroes = 0;

    public static int getNumHeroes(){
        return numHeroes;
    }

    public SuperHero(String name, Power superPower){
        // someone called the constructor, so we're creating a new SuperHero object, so update the count
        numHeroes++;
        this.name = name;
        this.superPower = new Power(superPower.getName(), superPower.getStrength());
    }


    public String toString(){
        String output = "";

        output += "Name of the hero: " + this.name + "\n";
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
