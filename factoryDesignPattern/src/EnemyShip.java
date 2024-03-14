public abstract class EnemyShip {
    private String name;
    private Double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmtDamage() {
        return amtDamage;
    }

    public void setAmtDamage(Double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip(){
        System.out.println(getName()+ " is following hero ship");
    }

    public void displayEnemyShip(){
        System.out.println(getName() + " is on screen");
    }

    public void shootEnemyShip(){
        System.out.println(getName() + " attacts and does" + getAmtDamage());
    }

}
