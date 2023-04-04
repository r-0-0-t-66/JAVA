public class Car {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return make;
    }

    public int getDoors() {
        return doors;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
      if (make == null) make = "Unknown";
      String lowercaseMake = make.toLowerCase();
      switch (lowercaseMake){
          case "holden", "porsche", "tesla" -> this.make = make;
          default -> {
              this.make = "Unsuported!";
          }
      }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void describeCar(){
        System.out.println(doors+ "-door "+
                color + " " +
                make + " " +
                model + " " +
                (convertible ? " " : ""));
    }
}
