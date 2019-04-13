package main.java.com.getjavajob.training.gareev.init.gareev;

import main.java.com.getjavajob.training.gareev.init.gareev.bases.coneB;
import main.java.com.getjavajob.training.gareev.init.gareev.bases.cylinderB;
import main.java.com.getjavajob.training.gareev.init.gareev.bases.prismB;
import main.java.com.getjavajob.training.gareev.init.gareev.bases.pyramidB;

import java.util.Scanner;

/**
 * Created by Denis on 13.04.2019.
 */
public class TaskCh01N003 {
    public static void main(String[] args){
        System.out.println("Enter type of figure \n" +
                "   1 - Cone\n" +
                "   2 - Pyramid\n" +
                "   3 - Cylinder\n" +
                "   4 - Prism");
        Scanner sc = new Scanner(System.in);
        int numFigure = sc.nextInt();
         switch(numFigure){
            case 1: new coneB(sc.nextInt(), sc.nextInt()); break;
            case 2: new cylinderB(sc.nextInt(), sc.nextInt(), sc.nextInt());break;
            case 3: new prismB(sc.nextInt(), sc.nextInt()); break;
            case 4: new pyramidB(sc.nextInt(), sc.nextInt(), sc.nextInt()); break;
        }


    }
}
