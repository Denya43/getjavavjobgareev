package main.java.com.getjavajob.training.gareev.init.gareev;

/**
 * Created by Denis on 13.04.2019.
 */
public abstract class chooseFigure {
    private int radius;
    private int height;
    private int numOfAngles;

    public chooseFigure(int radius, int height, int numOfAngles){
        this.radius =  radius;
        this.height =  height;
        this.numOfAngles =  numOfAngles;
    }

    public int getRadius() {
        return this.radius =  radius;
    }
    public int getHeight() {
        return this.height =  height;
    }
    public int getNumOfAngles() {
        return this.numOfAngles =  numOfAngles;
    }
    public void setRadius() {
         this.radius =  radius;
    }
    public void setHeight() {
         this.height =  height;
    }
    public void setNumOfAngles() {
         this.numOfAngles =  numOfAngles;
    }

}
