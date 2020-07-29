public class Square extends Figure{

    private double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
    }

    public Square() {
        this.side = Math.random() * 100 + 1;
        this.setRandomColor();
    }

    public double Perimeter() {
        return side * 4;
    }

    public double Area() {
        return side * side;
    }

    public void Print() {
            System.out.println("Я квадрат, я квадрат, мне на экране каждый рад! Периметр: "
                    + Perimeter() + "Площадь: " + Area() + "Сторона: " + getSide() + "Цвет: " + getColor());
    }

    public double getSide() {
        return side;
    }

}
