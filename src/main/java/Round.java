public class Round extends Figure{

    private double radius;

    public double Perimeter() {
        return 6.28 * radius;
    }

    public double Area() {
        return 3.14 * radius * radius;
    }

    public void Print() {
        System.out.println("Я кружок, я кружок, нарисованным быть ок! Периметр: "
                + Perimeter() + "Площадь: " + Area() + "Радиус: " + getRadius() + "Цвет: " + getColor());
    }

    public Double getRadius() {
        return radius;
    }

    public Round() {
        this.radius = Math.random() * 100 + 1;
        this.setRandomColor();
    }


}
