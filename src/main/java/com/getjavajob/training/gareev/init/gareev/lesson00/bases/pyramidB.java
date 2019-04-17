package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases;

/**
 * Created by Denis on 13.04.2019.
 */
public class pyramidB extends basePolygon {
        public pyramidB(int radius, int height, int numOfAngles) {
            super(radius, height, numOfAngles);
        }

    @Override
    public double calculateBaseArea(int radius, double numOfAngels, int lngthOfEdge) {
        return Math.pow(lngthOfEdge, 2)*Math.sqrt(3)/4;
    }
}
