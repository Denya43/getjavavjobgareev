package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 14.04.2019.
 */
public abstract class basePolygon extends base {
    public basePolygon(int height, int numOfAngels, int LngthOfEdge){
        height = getHeight();
        numOfAngels = getNumOfAngles();
         LngthOfEdge = getLngthOfEdge();
    }
    public double calculateBaseArea(int radius, double numOfAngels, int lngthOfEdge){
        return (numOfAngels*Math.pow(lngthOfEdge,2))/(4*Math.tan(360/2*numOfAngels));
    }

}
