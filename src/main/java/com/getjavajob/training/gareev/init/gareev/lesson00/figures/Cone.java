package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.ConeB;

/**
 * Created by Denis on 13.04.2019.
 */
public class Cone extends ConeB {
    private final double radius;
    private final double height;
    public Cone(int radius, int height) {
        super();
        this.height = height;
        this.radius = radius;
    }


    //public double sectionalArea(int radius, double numOfAngels, int lngthOfEdge, int heightSection) {
    public double sectionalArea(int heightSection) {
        return Math.pow(radius,2)*Math.pow(radius*2/heightSection,2);
    }
    //public double surfaceArea(int radius, int height){
        public double surfaceArea(){
        return Math.PI*radius*Math.sqrt(Math.pow(radius,2)+Math.pow(height,2));
    }
    //public double figureVolume(int radius, int height){
    public double figureVolume(){
        return height/3*Math.PI*Math.pow(radius,2);
    }
}
