package LiskovSubstitution;

interface FlyingBird extends Bird {
    void fly();   //this adds another functionally which was causing runtime error there 
}