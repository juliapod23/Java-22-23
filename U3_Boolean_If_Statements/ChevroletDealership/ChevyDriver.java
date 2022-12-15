package U3_Boolean_If_Statements.ChevroletDealership;

public class ChevyDriver {
    public static void main(String[] args) {
        // Create objects
        Chevy traxBase = new Chevy();
        Chevy traxLux = new Chevy();

        // Set traxBase mileage to 15
        traxBase.setMiles(15);
        // Set traxLux mileage to 175 with both a luxury and 4WD package
        traxLux.setMiles(175);
        traxLux.set4WDPkg(true);
        traxLux.setLuxuryPkg(true);
        // Printouts
        System.out.println("*** VEHICLE PRINTOUTS ***");
        System.out.println(traxBase);
        System.out.println("After giving the base car a luxury pkg, 4WD package, \nand updating " +
                "miles to 175, its data prints out as:");
        System.out.println(traxLux);

        // Create two Chevy Corvettes to test compareTo and Equals

        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)",
                "Fire Red", true, false, false);
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)",
                "Fire Red", true, false, true);

        // Display mileage comparison
        System.out.println("*** COMPARE BY MILEAGE ***");
        System.out.println("\tClassic Corvette vs. Sport Corvette");
        System.out.print("\tWhich car has the least miles?\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***

    /*
        if (_________________________________)
            System.out.println("Classic Corvette has less miles than Sport Corvette");
        else if (___________________________________)
            System.out.println("Sport Corvette has less miles than Classic Corvette");
        else
            System.out.println("Tie, both have " + corvetteClassic.getMiles() + " miles");
    */
        if(corvetteClassic.compareTo(corvetteSport) > 0){
            System.out.println("Classic Corvette has less miles than Sport Corvette");
        } else if (corvetteClassic.compareTo(corvetteSport) < 0) {
            System.out.println("Sport Corvette has less miles than Classic Corvette");
        } else{
            System.out.println("Tie, both have " + corvetteClassic.getMiles() + " miles");
        }

        // Display equality

    /*
        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if  if (_________________________________)
            System.out.println("Same car");
        else
            System.out.println("Not same car");

     */

        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        if(traxBase.equals(traxLux)){
            System.out.print("Same car");
        } else {
            System.out.print("Not same car");
        }
    }
}