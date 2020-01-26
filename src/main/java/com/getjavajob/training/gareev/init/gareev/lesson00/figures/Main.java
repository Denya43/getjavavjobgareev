package main.java.com.getjavajob.training.gareev.init.gareev.lesson00.figures;

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
         int tempRadius;
         int tempHeight;
         int tempNumOfAngles;
         int tempLngthOfEdge;

        switch (numFigure) {
            case 1:
                System.out.println("Enter radius");
                tempRadius = sc.nextInt();
                System.out.println("Enter height");
                tempHeight = sc.nextInt();
                Cone cone = new Cone(tempRadius, tempHeight);
                System.out.println("Enter height of Section "+cone.sectionalArea(sc.nextInt())+
                        " surfaceArea "+cone.surfaceArea()+" figureVolume "+cone.figureVolume());
                break;
            case 2:
                System.out.println("Enter radius");
                tempRadius = sc.nextInt();
                System.out.println("Enter height");
                tempHeight = sc.nextInt();
                Cylinder cylinder = new Cylinder(tempRadius, tempHeight);
                break;
            case 3:
                System.out.println("Enter height");
                tempHeight = sc.nextInt();
                System.out.println("Enter Number Of Angles");
                tempNumOfAngles = sc.nextInt();
                System.out.println("Enter Length Of Edge");
                tempLngthOfEdge = sc.nextInt();
                Prism prism = new Prism(tempHeight, tempNumOfAngles, tempLngthOfEdge);
                break;
            case 4:
                System.out.println("Enter Radius");
                tempRadius = sc.nextInt();
                System.out.println("Enter Height");
                tempHeight = sc.nextInt();
                System.out.println("Enter Number Of Angles");
                tempNumOfAngles = sc.nextInt();
                Pyramid pyramid = new Pyramid(tempRadius, tempHeight, tempNumOfAngles);

                break;
        }

    }

}