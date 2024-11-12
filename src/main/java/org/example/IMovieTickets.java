package org.example;

public interface IMovieTickets {
    double TotalMovieSales(int[] movieTicketSales);
    String TopMovie(String[] movies, int[] totalSales);
}