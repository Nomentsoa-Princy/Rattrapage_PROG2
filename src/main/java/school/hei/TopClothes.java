package school.hei;

public class TopClothes extends Clothes {
private Sleeves sleeves;

    public TopClothes(String name, Height height, double price, Material material, Sleeves sleeves) {
        super(name, height, price, material);
        this.sleeves = sleeves;
    }

    public Sleeves getSleeves() {
        return sleeves;
    }
}
