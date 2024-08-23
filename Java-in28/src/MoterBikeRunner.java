public class MoterBikeRunner {
    public static void main(String[] args)
    {
    MoterBike dukati = new MoterBike();
    MoterBike honda = new MoterBike();

    dukati.speed();
    honda.speed();

    dukati.speed = 100;
    honda.speed = 81;
    System.out.println(dukati.speed);
    System.out.println(honda.speed);

    dukati.speed = 20;
    honda.speed = 81;

        System.out.println(dukati.speed);
        System.out.println(honda.speed);

    }
}
