package chapter1.ducks.testTask;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Only my axe defences me!");
    }
}
