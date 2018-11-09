import java.util.Scanner;

public class Input {

    static Ticket question() {
        int ticket;
        System.out.println("Enter your ticket number (min. 2 digits):");
        ticket = new Scanner(System.in).nextInt();
        Ticket theTicket = new Ticket();
        theTicket.setTicket(ticket);
        return theTicket;
    }
}
