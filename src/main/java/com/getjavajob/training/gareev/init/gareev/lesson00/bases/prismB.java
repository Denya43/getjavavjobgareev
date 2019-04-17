package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 13.04.2019.
 */
public class prismB extends basePolygon {
    public prismB(int height, int numOfAngels, int lngthOfEdge) {
        super(height, numOfAngels, lngthOfEdge);
    }


    public double calculateBaseArea(double numOfAngels, int lngthOfEdge) {
        return (numOfAngels*Math.pow(lngthOfEdge,2)/(4*Math.tan(360/2*numOfAngels)));
    }
}
