package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.ConeB;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.CylinderB;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.PrismB;
import main.java.com.getjavajob.training.gareev.init.gareev.lesson00.bases.PyramidB;

import java.util.Scanner;

/**
 * Created by Denis on 13.04.2019.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter type of figure \n" +
                "   1 - Cone\n" +
                "   2 - Pyramid\n" +
                "   3 - Cylinder\n" +
                "   4 - Prism");
        Scanner sc = new Scanner(System.in);
        int numFigure = sc.nextInt();
        switch (numFigure) {
            case 1:
                new Cone(sc.nextInt(), sc.nextInt());
                break;
            case 2:
                new Cylinder(sc.nextInt(), sc.nextInt());
                break;
            case 3:
                new Prism(sc.nextInt(), sc.nextInt(), sc.nextInt());
                break;
            case 4:
                new Pyramid(sc.nextInt(), sc.nextInt(), sc.nextInt());
                break;
        }

    }

}