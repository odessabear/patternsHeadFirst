package chapter1.ducks.testTask;

public class King extends Character {

    public King(){
        weapon = new KnifeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("I'm a King!");
    }
}
