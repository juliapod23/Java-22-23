package U3_Boolean_If_Statements.ChevroletDealership;

public class Chevy {
    private int year;
    private int miles;
    private double mpg;
    private int basePrice;
    private double priceWithUpgrades;
    private double grandTotal;
    private String model;
    private String color;
    private boolean luxuryPkg;
    private boolean fourWDPkg;
    private boolean sportPkg;
    private final String MAKE = "Chevrolet";
    private final double TAX_RATE = .122;
    private final double LUX_PKG_RATE = .2;
    private final int FOURWD_PKG_RATE = 3500;
    private final double SPORT_PKG_RATE = .2;
    private final double SPORT_PKG_MPG = .8;

    // full constructor
    public Chevy(int year, int miles, double mpg, int basePrice, String model, String color, boolean luxuryPkg, boolean fourWDPkg, boolean sportPkg) {
        this.year = year;
        this.miles = miles;
        this.mpg = mpg;
        this.basePrice = basePrice;
        this.priceWithUpgrades = priceWithUpgrades;
        this.grandTotal = grandTotal;
        this.model = model;
        this.color = color;
        this.luxuryPkg = false;
        this.fourWDPkg = false;
        this.sportPkg = false;
    }

    //default constructor
    public Chevy() {
        this.year = 2021;
        this.miles = 0;
        this.mpg = 35.0;
        this.basePrice = 16000;
        this.model = "Trax";
        this.color = "White";
        this.luxuryPkg = false;
        this.fourWDPkg = false;
        this.sportPkg =  false;

    }

    //getters and setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public double getPriceWithUpgrades() {
        calcPrice();
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(int priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        calcPrice();
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getLuxuryPkg() {
        return luxuryPkg;
    }

    public void setLuxuryPkg(boolean luxuryPkg) {
        this.luxuryPkg = luxuryPkg;
    }

    public boolean get4WDPkg() {
        return fourWDPkg;
    }

    public void set4WDPkg(boolean fourWDPkg) {
        this.fourWDPkg = fourWDPkg;
    }

    public boolean getSportsPkg() {
        return sportPkg;
    }

    public void setHasSportPkg(boolean sportPkg) {
        this.sportPkg = sportPkg;
    }

    public String getMAKE() {
        return MAKE;
    }

    //COMPARE TO
    public int compareTo(Chevy other){
        if(this.mpg > other.mpg){
            return -1;
        } else if(other.mpg > this.mpg){
            return 1;
        } else{
            return 0;
        }
    }

    //EQUALS
    public boolean equals(Chevy other){
        if(this.model.equals(other.model) && this.color.equals(other.color)){
            if((this.miles > 200) == (other.miles > 200)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    //TOSTRING
    public String toString(){
        calcPrice();
        String chevyStr = "*********************************\n";
        chevyStr += (year + " " + MAKE + " "+ model +" "+ "(" + color + ")\n" + "\tBASE PRICE: \t \t \t $" + basePrice + "\n\tMILES: \t \t \t\t\t" + miles + "\n\tFUEL EFFICIENCY: \t \t " + mpg + " mpg\n\t"
                + "PACKAGES: \n ");
        if(luxuryPkg){
            chevyStr += "\t- Luxury Package\n\t";
        }
        if(sportPkg){
            chevyStr += "- Sports Package\n\t";
        }
        if(fourWDPkg){
            chevyStr += "- 4 Wheel Drive Package\n\t";
        }
        if(!luxuryPkg && !sportPkg && !fourWDPkg){
            chevyStr += "\t- None \n";
        }
        if(luxuryPkg || sportPkg || fourWDPkg){
            chevyStr += "\n";
        }

        chevyStr += "\tPRICE WITH UPGRADES:\t$" + priceWithUpgrades + "\n\tFINAL PRICE WITH TAX:\t$" + grandTotal +"\n";
        chevyStr += "*********************************";
        return chevyStr;
    }

    //CALCPRICE
    public void calcPrice(){
        priceWithUpgrades = basePrice;
        if(luxuryPkg){
            priceWithUpgrades += priceWithUpgrades * LUX_PKG_RATE;
        }
        if(fourWDPkg){
            priceWithUpgrades += FOURWD_PKG_RATE;
        }
        if(sportPkg){
            priceWithUpgrades += priceWithUpgrades * SPORT_PKG_RATE;
            mpg = (mpg * SPORT_PKG_MPG);
        }
        grandTotal = priceWithUpgrades + (priceWithUpgrades * .122);
    }
}


