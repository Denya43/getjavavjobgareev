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
}
