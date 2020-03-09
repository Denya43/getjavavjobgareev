package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;


import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.Base;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.CylinderB;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.PrismB;

/**
 * Created by Denis on 13.04.2019.
 */
public class Cylinder  {
    private final double radius;
    private final double height;
    private Base cylinderBase;

    public Cylinder(double radius, double height) {
        cylinderBase = new CylinderB(radius);
        this.radius = radius;
        this.height = height;
    }

    public double baseArea() {
        return cylinderBase.area();
    }

    public double sectionArea() {
        return baseArea();
    }

    public double fullArea() {
        return 2 * Math.PI * radius * height;
    }

    public double value() {
        return Math.PI * Math.pow(radius, 2) * height;
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
        result = (int) (prime * result + Double.doubleToLongBits(radius));
        result = (int) (prime * result + Double.doubleToLongBits(height));
        return result;
    }
    @Override
    public Cylinder clone() throws CloneNotSupportedException {
        Cylinder cylinder = (Cylinder) super.clone();
        cylinderBase = new CylinderB(radius);
        return cylinder;
    }
}
