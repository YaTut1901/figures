

public abstract class Figure {

    private String color;

    public abstract double Perimeter();

    public abstract double Area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRandomColor() {
        String[] colorsArray = new String[]{"RED", "BLUE", "YELLOW", "BLACK", "GRAY",
                "BROWN", "WHITE", "PINKY", "GREEN", "GOLDEN"};
        this.color = colorsArray[(int)(Math.random() * 10)];
    }

    public abstract void Print();

}
