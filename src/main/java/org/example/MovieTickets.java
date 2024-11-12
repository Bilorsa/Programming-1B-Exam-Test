package org.example;

public class MovieTickets implements IMovieTickets{

    //Calculation of each movies sale added
    @Override
    public double TotalMovieSales(int[] movieTicketSales) {
        double totalSales = 0.0;
                for(int x = 0; x < movieTicketSales.length; x++){
                    totalSales += movieTicketSales[x];
                }
        return totalSales;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int topPosition = 0;
        double topSale = totalSales[0];
        for(int x = 0; x < totalSales.length; x++){
            if(totalSales[x] > topSale){
                topPosition = x;
            }
        }
        return String.valueOf(topPosition);
    }

}
