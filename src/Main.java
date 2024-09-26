//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double smallRadius =  1.0;

        double bigRadius = 2.0;

        SquareCalculating squareCalculating = new SquareCalculating();
        System.out.println("Square of figure: "+ squareCalculating.CalculateSquareOfFigure(smallRadius,bigRadius));
    }



}