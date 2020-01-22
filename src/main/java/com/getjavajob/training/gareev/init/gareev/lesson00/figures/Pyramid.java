package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.PyramidB;

/**
 * Created by Denis on 22.01.2020.
 */
public class Pyramid extends PyramidB {
    public Pyramid(int height, int numOfAngels, int lngthOfEdge) {
        super(height, numOfAngels, lngthOfEdge);
    }
    public double sectionalArea(int radius, double numOfAngels, int lngthOfEdge, int heightSection) {
        return Math.pow(radius,2)*Math.pow(radius*2/heightSection,2);
    }
    public double surfaceArea(int radius, int height){
        return Math.PI*radius*Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
    }
    public double figureVolume(int radius, int height){
        return height/3*Math.PI*Math.pow(radius,2);
    }
}
