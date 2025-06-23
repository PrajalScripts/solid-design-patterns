package InterfaceSegregationPrinciple.voilation
        ;

import InterfaceSegregationPrinciple.voilation.Worker;

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working...");
    }

    public void eat() {
        
        throw new UnsupportedOperationException("Robot doesn't eat");
    // Robot is forced to implement eat(), which it does’t need — violating ISP.
    }
}
