public class Triangle extends Figure{

    private final double[] sides = new double[3];

    public double Perimeter() {
        return sides[0] + sides[1] + sides[2];
    }

    public double Area() {
        return Math.sqrt(Perimeter() / 2 * (Perimeter()/2 - sides[0]) *
                (Perimeter()/2 - sides[1]) * (Perimeter()/2 - sides[2]));
    }

    public void Print() {
            System.out.println("Я треугольник, я треугольник, самый крутой многоугольник! Периметр: "
                    + Perimeter() + "Площадь: " + Area() + "Стороны: " + sides[0] + sides[1] + sides[2] +
                    "Углы: " + "Цвет: " + getColor());
    }

    public Triangle(double[] sides, String color) {
        for(int i = 0; i < sides.length; i++) {
            this.sides[i] = sides[i];
        }
        this.setColor(color);
    }

    public Triangle() {
        this.setRandomColor();
        sides[0] = Math.random() * 100 + 1;
        sides[1] = Math.random() * 100 + 1;
        sides[2] = Math.random() * 100 + 1;

    }


}
