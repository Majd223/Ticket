//This is a base abstract class called "Ticket" to be inhereted by other ticket classes.

public abstract class Ticket
{
    //Unique numeric ID for a ticket.
    public int Number;
    //Ticket cost.
    public double Price;
    //Force creation of a methode to return price in subclasses
    //public abstract double getPrice();
    public double getPrice()
    {
        return Price;
    }
    //Force creating of a methode to return a ticket representative string in subclasses.
    public abstract String toString();
}