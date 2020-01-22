package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 14.04.2019.
 */
public abstract class BasePolygon extends Base {
    public BasePolygon(int height, int numOfAngels, int lngthOfEdge){
        height = getHeight();
        numOfAngels = getNumOfAngles();
        lngthOfEdge = getLngthOfEdge();
    }
    public double calculateBaseArea(int radius, double numOfAngels, int lngthOfEdge){
        return (numOfAngels*Math.pow(lngthOfEdge,2))/(4*Math.tan(360/2*numOfAngels));
    }

}
