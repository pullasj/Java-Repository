public class MoterBikeRunner {
    public static void main(String[] args)
    {
    MoterBike dukati = new MoterBike();
    MoterBike honda = new MoterBike();

    dukati.speed();
    honda.speed();

    dukati.setSpeed(100);
    honda.setSpeed(81);
    dukati.printspeed();
    honda.printspeed();

    dukati.printspeed();
    // increasing speed by 100
        dukati.increaseSpeed(100);
        dukati.printspeed();

    // decreasing speed by 50
        dukati.decreaseSpeed(50);
        dukati.printspeed();


        //Constructor class
        constructorMoterbike hero = new constructorMoterbike(185);
        hero.getspeed();
    }

}
