public class Generation {

    public static void main(String[] args) {
        int amount = (int) (Math.random() * 20 + 1);
        int[] figuresNumbers = new int[amount];
        Figure[] figures = new Figure[amount];
        for (int i = 0; i < figuresNumbers.length; i++) {
            figuresNumbers[i] = (int) (Math.random() * 4 + 1);
            switch (figuresNumbers[i]) {
                case 1:
                    figures[i] = new Round();
                    break;
                case 2:
                    figures[i] = new Square();
                    break;
                case 3:
                    figures[i] = new Triangle();
                    break;
                case 4:
                    figures[i] = new Trapezoid();
                    break;
            }
        }
        for (Figure figure : figures) {
            figure.Print();
        }
        }
    }
