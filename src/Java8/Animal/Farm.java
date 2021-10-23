package Java8.Animal;

public class Farm {
    private Animal[] animals;

    public Farm(Animal[] animals) {
        this.animals = animals;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String toString() {
        String bendras = "";
        for(int i = 0; i < animals.length; i++) {
            bendras = bendras + animals[i].toString() + "\n";
        }
        return bendras;
    }
}
