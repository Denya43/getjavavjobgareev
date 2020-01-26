package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 14.04.2019.
 */

abstract class BasePolygon implements Base {
    private final int numberOfAngles;
    private final double edgeLength;

    BasePolygon(int numberOfAngles, double edgeLength) {
        this.numberOfAngles = numberOfAngles;
        this.edgeLength = edgeLength;
    }

    @Override
    public double area() {
        return (numberOfAngles * Math.pow(edgeLength, 2)) / (4 * Math.tan(Math.toRadians(180 / numberOfAngles)));
    }
}