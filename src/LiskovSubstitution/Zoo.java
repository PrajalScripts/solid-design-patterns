package LiskovSubstitution;

public class Zoo {
    public static void makeBirdFly(FlyingBird bird) {
        bird.fly();  // Safe: only flying birds here
    }
}