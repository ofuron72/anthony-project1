public class SquareCalculating {
    public double CalculateSquareOfFigure(double smallRadius, double bigRadius){
        double squareOfCircle = Math.PI*Math.pow(smallRadius,2);//

        double partOfSmallCircle = squareOfCircle*3/8;

        double squareOfBigCircle = Math.PI*Math.pow(bigRadius,2);

        double partOfBigCircle = (squareOfBigCircle - squareOfCircle)/4;

        double squareOfSmallSquare  = Math.pow(bigRadius,2);

        double squareOfOtherPart = (squareOfSmallSquare - squareOfBigCircle*1/4)/2;

        double result = partOfBigCircle + partOfSmallCircle + squareOfOtherPart;

        return result;
    }
}
