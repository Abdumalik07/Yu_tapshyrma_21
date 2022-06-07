package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        fileWriter("Alphabet","Aa \nBb \nCc \nDd \nEe \nFf \nGg \nHh \nIi \nJj \nKk \nLl \nMm \nNn \nOo \nPp \nQq \nRr \nSs \nTt \nYy \nVv \nWw \nXx \nYy \nZz \n0 \n1 \n2 \n3 \n4 \n5 \n6 \n7 \n8 \n9");
        fileReader("Alphabet");

    }
    public static void fileWriter(String fileName,String text){
        try (FileWriter writer=new FileWriter(fileName);) {

            writer.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileReader(String fileName){
        try (FileReader reader=new FileReader(fileName)) {
            Scanner scanner =new Scanner(reader);
            int i=0;
            while (scanner.hasNextLine()){
                i++;
                System.out.println(i+": "+scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
