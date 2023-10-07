package fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu.entities;

public class Product {

    private long id;
    private String name;

    private Manufacturer manufacturer;

    public Product() {
    }

    public Product(long id, String name, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public Manufacturer getManufacturer() {
        return manufacturer;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name +
                ", manufacturer=" + manufacturer +
                '}';
    }



}
