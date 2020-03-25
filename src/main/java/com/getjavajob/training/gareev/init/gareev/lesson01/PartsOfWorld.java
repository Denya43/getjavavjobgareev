package main.java.com.getjavajob.training.gareev.init.gareev.lesson01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class PartsOfWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String worldPart = scanner.next();
        System.out.println(PartsOfWorldInf.valueOf(worldPart));
    }
}
