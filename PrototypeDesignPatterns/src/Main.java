//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CloneFactory cloneFactory = new CloneFactory();
        Sheep sally =  new Sheep();
        Sheep clonedSheep = (Sheep) cloneFactory.getClone(sally);
        System.out.println(sally);
        System.out.println(clonedSheep);
        System.out.println("sally hashcode: "+ sally.hashCode());
        System.out.println("cloned Sheep hashcode: "+ clonedSheep.hashCode());
    }
}