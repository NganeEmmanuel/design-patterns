public class Animal {
    String name;
    String animalType;
    Flys flys;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Flys getFlys() {
        return flys;
    }

    public void setFlys(Flys flys) {
        this.flys = flys;
    }

    public String tryToFly(){
        return flys.fly();
    }
}
