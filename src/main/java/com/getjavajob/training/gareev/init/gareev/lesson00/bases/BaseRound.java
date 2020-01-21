package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 14.04.2019.
 */
public abstract class BaseRound extends Base {
    public BaseRound(int radius, int height){
        radius = getRadius();
        height = getHeight();
    }
    public double calculateBaseArea(int radius){
        return Math.PI*Math.pow(radius, 2);
    }

}
