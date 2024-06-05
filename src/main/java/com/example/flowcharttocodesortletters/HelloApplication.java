package com.example.flowcharttocodesortletters;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class HelloApplication {
    public static void main(String[] args) {
        String[] letterSet = {"z", "b", "e", "f", "a", "c", "o"};
        String temp;
        for (int i = 0; i < letterSet.length - 1; i++) {
            for (int j = 0; j < letterSet.length - 1 - i; j++) {
                if (letterSet[j].compareTo(letterSet[j + 1]) < 0) {
                    temp = letterSet[j];
                    letterSet[j] = letterSet[j + 1];
                    letterSet[j + 1] = temp;
                }
            }
        }
        System.out.println("Ordered array from z to a:");
        for (int i=0;i<=letterSet.length-1;i++){
            System.out.print(letterSet[i] + " ");
        }
    }
}