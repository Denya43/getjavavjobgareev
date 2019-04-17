package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 14.04.2019.
 */
public abstract class baseRound  extends base{
    public baseRound(int radius, int height){
        radius = getRadius();
        height = getHeight();
    }
    public double calculateBaseArea(int radius){
        return Math.PI*Math.pow(radius, 2);
    }

}
