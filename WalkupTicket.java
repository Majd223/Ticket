
/*This is a class called "WalkupTicket" which inherets and extends Ticket class.
A WalkupTicket implemets a date of event ticket purchase. */

class WalkupTicket extends Ticket
{
    //contructor for WalkupTicket
    public WalkupTicket(int newNumber)
    {
        this.Number = newNumber;
        //Set walkupTicket price.
        this.Price = 50;
    }
    
    //methode to return a representative string of WalkupTicket
    // overriide the base class ticket method of the same name
    @Override
    public String toString()
    {
        return "Number: " + Number + ", Price:" + Price;
    }

}

