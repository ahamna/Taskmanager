public class Planet {
    String name;
    String rotationPeriod;

    public Planet() {
    }

    public Planet(String name, String rotationPeriod) {
        this.name = name;
        this.rotationPeriod = rotationPeriod;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", rotationPeriod='" + rotationPeriod + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }
}
