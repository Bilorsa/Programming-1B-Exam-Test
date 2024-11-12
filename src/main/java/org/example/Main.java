package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double[][] movieTicketsales = {{3000, 1500, 1700},
                {3500, 1200, 1600}}; //Array for sales in each month

        double[] totalSales = new double[3];
        String[] movies = {"Napolean", "Oppenheimer"};

        MoviesPrinting printing = new MoviesPrinting(movieTicketsales, totalSales, movies);
        printing.printHeadings();
        printing.printTotalMoviesales();
        }
    }
