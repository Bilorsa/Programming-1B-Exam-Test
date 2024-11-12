package org.example;

public class MoviesPrinting {
    double[][] movieTicketSales;
    double[] totalSales;
    String[] movies;

    public MoviesPrinting(double[][] movieTicketSales, double[] totalSales, String[] movies){
        this.movieTicketSales= movieTicketSales;
        this.totalSales= totalSales;
        this.movies= movies;
    }

   //prints the heading of the report which contains the title and months sales were recorded
    public void printHeadings() {
        System.out.println("MOVIE TICKET SAES REPORT - 2024");
        System.out.println();
        System.out.println("\t\t\t JAN" + "\t\t\t" + "FEB" + "\t\t\t" + "MAR");

        System.out.println("-----------------------------------" + "-------------------------------------");
    }
    public void printTotalMoviesales() {
        for(int x = 0 ; x < totalSales.length; x++){
            System.out.println(totalSales[x] + "\t");

            totalSales[x] += movieTicketSales.TotalMovieSales(movieTicketSales[x]);
            for(int y = 0; y <totalSales.length; y++){
                System.out.println(movieTicketSales);
            }
            System.out.println();
        }
        public void printTopMovie() {
            int topPosition = movieTicketSales
            double topSale = totalSales[0]
        }
    }
}
