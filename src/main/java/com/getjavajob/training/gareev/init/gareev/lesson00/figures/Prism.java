package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.Base;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.PrismB;

/**
 * Created by Denis on 26.01.2020.
 */
public class Prism {
    private final double height;
    private final int numberOfAngles;
    private final double edgeLength;
    private Base prismBase;

    public Prism(int numberOfAngles, double edgeLength, double height) {
        prismBase = new PrismB(numberOfAngles, edgeLength);
        this.numberOfAngles = numberOfAngles;
        this.edgeLength = edgeLength;
        this.height = height;
    }

    public double baseArea() {
        return prismBase.area();
    }

    public double sectionArea() {
        return baseArea();
    }

    public double fullArea() {
        return numberOfAngles * edgeLength * height + (2 * baseArea());
    }

    public double value() {
        return baseArea() * height;
    }

}
