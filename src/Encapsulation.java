class Dog {
    private String breedname;
    private int lifespan;
    private int price;
    private String food;

    public String getBreedname() {
        return breedname;
    }

    public void setBreedname(String breedname) {
        this.breedname = breedname;
    }

    public int getLifespan() {
        return lifespan;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

}

public class Encapsulation {
    public static void main(String[] args) {

        Dog dg = new Dog();
        dg.setBreedname("Golden Retriever");
        dg.setLifespan(12);
        dg.setPrice(15000);
        dg.setFood("Healthy foods");

        System.out.println(dg.getBreedname());
        System.out.println(dg.getLifespan());
        System.out.println(dg.getPrice());
        System.out.println(dg.getFood());
    }
}
