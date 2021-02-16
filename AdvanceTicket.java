/*
This is a class called "AdvanceTicket" which inherets and extends Ticket class.
An AdvanceTicket implemets a prior to the date of event ticket purchase. */

class AdvanceTicket extends Ticket
{
    // AdvanceTicket uses "Days" add the concept of pre-purchase to tickets. 
    int Days; 
    //constructor for AdvanceTicket.
    public AdvanceTicket(int newNumber, int newDays)
    {
        this.Number = newNumber;
        //Sets the number of days before the event that the ticket was purchased.
        this.Days = newDays; 
        //Set AdvanceTicket price.
        this.Price = 40;
        //apply discount if purchased >10 days in advanced.
        if (Days > 10)
        {
            this.Price = 30; 
        } 
    }
   
    //methode to return a representative string of AdvanceTicket
    //overriide the base class ticket method of the same name
    @Override
    public String toString()
    {
        return "Number: " + Number + ", Price:" + Price;
    }

}