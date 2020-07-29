public class Trapezoid extends Figure{

    private final double[] bases = new double[2];

    private final double[] sides = new double[2];

    private double height;

    public double Perimeter() {
        return bases[0] + bases[1] + sides[0] + sides[1];
    }

    public double Area() {
        return height * (bases[0] + bases[1]) / 2;
    }

    public void Print() {
        System.out.println("Я трапеция, я трапеция, у меня нет рифмы! Периметр: "
                + Perimeter() + "Площадь: " + Area() + "Основания: " + bases[0] + bases[1]
                + "Стороны: " + sides[0] + sides[1] + "Цвет: " + getColor());
    }

    public Trapezoid(double[] sides, double[] bases, double height, String color) {
        for(int i = 0; i < sides.length; i++) {
            this.sides[i] = sides[i];
            this.bases[i] = bases[i];
        }
        this.height = height;
        this.setColor(color);
    }

    public Trapezoid() {
        this.setRandomColor();
        bases[0] = Math.random() * 100 + 1;
        bases[1] = Math.random() * 100 + 1;
        sides[0] = Math.random() * (bases[0] + bases[1]) + 1;
        sides[1] = bases[0] + bases[1] - sides[0];
        height = Math.sqrt(sides[0] * sides[0] - Math.pow((Math.pow((bases[0] - bases[1]), 2)
                + sides[0] * sides[0] - sides[1] * sides[1])/(2 * (bases[0] - bases[1])), 2));
    }
}
