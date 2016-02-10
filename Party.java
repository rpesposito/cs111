//Party.java
public class Party{

 public static void main(String[] args){
  //welcome message
  System.out.println("java Party\n");

  double peopleAtParty, numSlicesPerPerson, numSodasPerPerson;
  double costOfPizza, numSlicesPerPizza, costOfSoda, numSodaPerCase;

  int pizzaToBuy, sodaToBuy;

  double totalCost;

  //getting part info from user
  System.out.print("Enter number of people attending the party: ");
  peopleAtParty = IO.readDouble();

  System.out.print("\nHow many slices of pizza will each person eat: ");
  numSlicesPerPerson = IO.readDouble();

  System.out.print("\nHow many cans of soda will each person drink: ");
  numSodasPerPerson = IO.readDouble();

  System.out.print("\nHow much will each pizza pie cost: ");
  costOfPizza = IO.readDouble();

  System.out.print("\nHow many slices does each pie contain: ");
  numSlicesPerPizza = IO.readDouble();

  System.out.print("\nHow much does a case of soda cost: ");
  costOfSoda = IO.readDouble();

  System.out.print("\nHow many cans of soda are in each case: ");
  numSodaPerCase = IO.readDouble();

  pizzaToBuy = (int)((peopleAtParty * numSlicesPerPerson) / numSlicesPerPizza);

  //check if the number of pies needed is fractional and if needed rounds up
  if (pizzaToBuy < ((peopleAtParty * numSlicesPerPerson) / numSlicesPerPizza)){
   pizzaToBuy += 1;
  }

  //check if the number of cases needed is fractional and rounds up
  sodaToBuy = (int)((peopleAtParty * numSodasPerPerson) / numSodaPerCase);

  if (sodaToBuy < ((peopleAtParty * numSodasPerPerson) / numSodaPerCase)){
   sodaToBuy += 1;
  }

  totalCost = (pizzaToBuy * costOfPizza) + (sodaToBuy * costOfSoda);

  System.out.println("");

  //returns answer for rutgers webcat
  IO.outputDoubleAnswer(totalCost);

 }
}