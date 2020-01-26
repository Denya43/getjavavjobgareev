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
         int tempSectional;

        switch (numFigure) {
            case 1:
                System.out.println("Enter radius");
                tempRadius = sc.nextInt();
                System.out.println("Enter height");
                tempHeight = sc.nextInt();
                Cone cone = new Cone(tempRadius, tempHeight);
                System.out.println("Enter height of Section ");
                tempSectional = sc.nextInt();
                System.out.println("Sectional area "+cone.sectionArea(tempSectional)+
                        " surfaceArea "+cone.fullArea()+" figureVolume "+cone.value());
                break;
            case 2:
                System.out.println("Enter radius");
                tempRadius = sc.nextInt();
                System.out.println("Enter height");
                tempHeight = sc.nextInt();
                Cylinder cylinder = new Cylinder(tempRadius, tempHeight);
                System.out.println("Sectional area "+cylinder.sectionArea()+
                        " surfaceArea "+cylinder.fullArea()+" figureVolume "+cylinder.value());
                break;
            case 3:
                System.out.println("Enter height");
                tempHeight = sc.nextInt();
                System.out.println("Enter Number Of Angles");
                tempNumOfAngles = sc.nextInt();
                System.out.println("Enter Length Of Edge");
                tempLngthOfEdge = sc.nextInt();
                Prism prism = new Prism(tempHeight, tempNumOfAngles, tempLngthOfEdge);
                System.out.println("Sectional area "+prism.sectionArea()+
                        " surfaceArea "+prism.fullArea()+" figureVolume "+prism.value());
                break;
            case 4:
                System.out.println("Enter Radius");
                tempRadius = sc.nextInt();
                System.out.println("Enter Height");
                tempHeight = sc.nextInt();
                System.out.println("Enter Number Of Angles");
                tempNumOfAngles = sc.nextInt();
                System.out.println("Enter height of Section ");
                tempSectional = sc.nextInt();
                Pyramid pyramid = new Pyramid(tempRadius, tempHeight, tempNumOfAngles);
                System.out.println("Sectional area "+pyramid.sectionArea(sc.nextDouble())+
                        " surfaceArea "+pyramid.fullArea()+" figureVolume "+pyramid.value());

                break;
        }

    }

}