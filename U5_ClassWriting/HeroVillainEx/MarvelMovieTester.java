package U5_ClassWriting.HeroVillainEx;

import U5_ClassWriting.HeroVillainEx.Power;

public class MarvelMovieTester {
    public static void main(String[] args) {
        //create some superpower objects
        Power p1 = new Power("Super speed",10);
        Power p2 = new Power("Flight",8);

        SuperHero superMan = new SuperHero("Superman",p2);
        Villain reverseFlash = new Villain("Reverse Flash", p1);


        System.out.println("Total number of superheroes: " + SuperHero.getNumHeroes());


        System.out.println(superMan);
        System.out.println(reverseFlash);

        //Reduce reverseFlash's power from 10 to 6
        reverseFlash.getSuperPower().setStrength(6);
        System.out.println(superMan);
        System.out.println(reverseFlash);

        //Have these two battle each other
        battle(superMan, reverseFlash);
    }

    /**
     * Simulate a battle between hero and villain. Whoever has greater power strength wins.
     *     At the end of each battle: (If power levels are equal, then flip a coin)
     *         1. Winner will gain 10% of the loser's power level
     *         2. Loser will lose 5-35% of own power level (random)
     * @param h This is the hero object
     * @param v This is the villain object
     */
    public static void battle(SuperHero h, Villain v){
        double hStr = h.getSuperPower().getStrength();
        double vStr = v.getSuperPower().getStrength();

        if(hStr > vStr) {
            System.out.println("Hero wins!");

            double newHeroStr = hStr + 0.1 * vStr;
            h.getSuperPower().setStrength(newHeroStr);

            int lossPercent = (int)(Math.random()*(35-5+1)) + 5;
            double newVillainStr = vStr - (lossPercent/100.0)*vStr;
            v.getSuperPower().setStrength(newVillainStr);
        } else if(vStr > hStr){
            System.out.println("Villain wins!");

            double newVillainStr = vStr + 0.1 * hStr;
            v.getSuperPower().setStrength(newVillainStr);

            int lossPercent = (int)(Math.random()*(35-5+1)) + 5;
            double newHeroStr = hStr - (lossPercent/100.0)*hStr;
            h.getSuperPower().setStrength(newHeroStr);
        } else{
            if(Math.random() < 0.5){
                System.out.println("Hero wins!");

                double newHeroStr = hStr + 0.1 * vStr;
                h.getSuperPower().setStrength(newHeroStr);

                int lossPercent = (int)(Math.random()*(35-5+1)) + 5;
                double newVillainStr = vStr - (lossPercent/100.0)*vStr;
                v.getSuperPower().setStrength(newVillainStr);
            } else{
                System.out.println("Villain wins!");

                double newVillainStr = vStr + 0.1 * hStr;
                v.getSuperPower().setStrength(newVillainStr);

                int lossPercent = (int)(Math.random()*(35-5+1)) + 5;
                double newHeroStr = hStr - (lossPercent/100.0)*hStr;
                h.getSuperPower().setStrength(newHeroStr);
            }

        }
    }

}
