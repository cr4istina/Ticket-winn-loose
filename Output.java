public class Output {

    static void answer(Ticket ticket){
        System.out.println("Your ticket is: " + ticket.getTicket());
        if (ticket.getTicket() % 19 == 0) {
            System.out.println("You won!");
        } else {
            System.out.println("Sorry, not a lucky one. Try again.");
         }
    }
}
