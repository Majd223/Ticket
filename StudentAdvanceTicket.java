/*
This is a class called "StudnetAdvanceTicket" which inherets and extends AdvanceTicket class.
A StudentAdvanceTicket implemets a prior to the date of event discount ticket purchase for students.*/

class StudentAdvanceTicket extends AdvanceTicket
{   //constructor for StudnetAdvanceTicket.
    public StudentAdvanceTicket (int newNumber, int newDays)
    {
        //Call AdvanceTicket constructor.
       super(newNumber, newDays);
       //Apply student discount.
       this.Price = this.Price/2;
    }

    //methode to return a representative string of StudentAdvanceTicket.
    //overriide the base class Advanceticket method of the same name.
    @Override
    public String toString()
    {
        return super.toString() + " (ID required)";
    }
}