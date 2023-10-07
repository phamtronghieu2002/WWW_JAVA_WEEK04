package fit.iuh.edu.week04_lapspringbot_20062501_phamtronghieu.entities;

public class Manufacturer {

    private  long id;
    private String name;
    private String email;

    public Manufacturer() {
    }

    public Manufacturer( String name, String email) {

        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
