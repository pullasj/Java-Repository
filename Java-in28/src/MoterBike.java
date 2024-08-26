public class MoterBike {
    private int speed;
    void speed(){
        System.out.println("Bike is moving");
    }

    void setSpeed(int speed){
        this.speed = speed;
    }
    void printspeed(){
        System.out.println(speed);
    }
    void increaseSpeed(int howmuch){
        this.speed = this.speed + howmuch;
    }

    void decreaseSpeed(int howmuch){
        this.speed = this.speed - howmuch;
    }

}
