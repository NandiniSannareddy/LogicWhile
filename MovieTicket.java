import javax.naming.ReferralException;

abstract class Movie {
    int movieId;
    String title;
    double ticketPrice;
    int numberOfTickets;

    abstract double calculatePrice(double ticketPrice, int numberOfTickets);

    Movie(int movieId, String title, double ticketPrice, int numberOfTickets) {
        this.movieId = movieId;
        this.title = title;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    void displayDetails() {
        System.out.println("\nMovie Record");
        System.out.println("ID: " + movieId);
        System.out.println("Title: " + title);
        System.out.println("Ticket Price: " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        if (numberOfTickets > 6) {
            System.out.println("Booking Failed: Cannot book more than 6 tickets");
            ;
            return;
        }
        System.out.println("Total Price: " + calculatePrice(ticketPrice, numberOfTickets));
    }
}

class TeluguMovie extends Movie {
    TeluguMovie(int movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    public double calculatePrice(double ticketPrice, int numberOfTickets) {
        double Total = ticketPrice * numberOfTickets;
        double gst = Total * 0.05;
        Total += gst;
        return Total;
    }
}

class HindiMovie extends Movie {
    HindiMovie(int movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    public double calculatePrice(double ticketPrice, int numberOfTickets) {
        double Total = ticketPrice * numberOfTickets;
        double discount = Total * 0.1;
        Total -= discount;
        double gst = Total * 0.05;
        Total += gst;
        return Total;
    }
}

class EnglishMovie extends Movie {
    EnglishMovie(int movieId, String title, double ticketPrice, int numberOfTickets) {
        super(movieId, title, ticketPrice, numberOfTickets);
    }

    public double calculatePrice(double ticketPrice, int numberOfTickets) {
        double Total = ticketPrice * numberOfTickets;
        Total += (numberOfTickets * 50);
        double gst = Total * 0.05;
        Total += gst;
        return Total;
    }
}

public class MovieTicket {
    public static void main(String[] args) {
        TeluguMovie t = new TeluguMovie(101, "RRR", 150, 3);
        t.displayDetails();
        HindiMovie h = new HindiMovie(102, "Pathaan", 200, 2);
        h.displayDetails();
        EnglishMovie e = new EnglishMovie(103, "Avatar", 250, 7);
        e.displayDetails();
    }

}
