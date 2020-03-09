package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.Base;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.PyramidB;


/**
 * Created by Denis on 22.01.2020.
 */
public class Pyramid {
    private final double height;
    private final int numberOfAngles;
    private final double edgeLength;
    private Base pyramidBase;

    public Pyramid(int numberOfAngles, double edgeLength, double height) {
        pyramidBase = new PyramidB(numberOfAngles, edgeLength);
        this.numberOfAngles = numberOfAngles;
        this.edgeLength = edgeLength;
        this.height = height;
    }

    public double baseArea() {
        return pyramidBase.area();
    }

    public double sectionArea(double sectionHeight) {
        return Math.pow((height - sectionHeight) / height, 2) * baseArea();
    }

    public double fullArea() {
        return numberOfAngles * edgeLength * Math.sqrt(Math.pow(height, 2)
                + Math.pow(edgeLength / (2 * Math.tan(Math.toRadians(180 / numberOfAngles))), 2)) / 2
                + baseArea();
    }

    public double value() {
        return (baseArea() * height) / 3;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        if (obj == this) {
            return true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (int) (prime * result + Double.doubleToLongBits(numberOfAngles));
        result = (int) (prime * result + Double.doubleToLongBits(height));
        return result;
    }
    @Override
    public Pyramid clone() throws CloneNotSupportedException {
        Pyramid pyramid = (Pyramid) super.clone();
        pyramidBase = new PyramidB(numberOfAngles, edgeLength);
        return pyramid;
    }
}
