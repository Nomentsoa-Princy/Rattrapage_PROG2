package school.hei;

public class Clothes {
    private String name;
    private Height height;
    private double price;
    private Material material;

    public Clothes(String name, Height height, double price, Material material) {
        this.name = name;
        this.height = height;
        this.price = price;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public Height getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public Material getMaterial() {
        return material;
    }
}
