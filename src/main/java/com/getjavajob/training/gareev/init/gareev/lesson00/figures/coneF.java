package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.baseRound;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.coneB;

/**
 * Created by Denis on 13.04.2019.
 */
public class coneF extends coneB {
    public coneF(int radius, int height) {
        super(radius, height);
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
