package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


    }
}

class Button {

    private int clickCount;

    public void click() {
        clickCount++;
        System.out.println(clickCount);
    }
}

class Balance {

    private int rightBowl = 0;
    private int leftBowl = 0;

    public int addRight(int n) {
        return this.rightBowl += n;
    }

    public int addLeft(int n) {
        return this.leftBowl += n;
    }

    public void result() {
        if (this.rightBowl == this.leftBowl) {
            System.out.println("=");
        }
        else if (this.rightBowl > this.leftBowl) {
            System.out.println("R");
        }
        else {
            System.out.println("L");
        }
    }
}

class Bell {

    public void sound(){
        System.out.println("ding");
        System.out.println("dong");
    }
}

class OddEvenSeparator {

    private final List<Integer> oddList = new ArrayList<>();
    private final List<Integer> evenList = new ArrayList<>();

    public void addNumber(int n) {
        if (n % 2 == 0) {
            oddList.add(n);
        }
        else {
            evenList.add(n);
        }
    }

    public void odd() {
        System.out.println(oddList);
    }

    public void even() {
        System.out.println(evenList);
    }
}

class Table {

    private final int rows;
    private final int cols;
    private static int[][] array;



    Table(int row, int col) {
        this.rows = row;
        this.cols = col;
        array = new int[rows][cols];
    }

    public void getValue(int row, int col) {
        System.out.println(array[row][col]);
    }

    public static void setValue(int row, int col, int value) {
        array[row][col] = value;
    }

    public int rows() {
        return this.rows;
    }

    public int cols() {
        return this.cols;
    }

    public void tostring() {
        String str = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                str += array[i][j] + " ";
            }
        }
    }

    public int average() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}

