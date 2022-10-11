class Calculator
{

public static void main(String[] args) // Main method
{
Calculator calc = new Calculator(); // new-memory,  new calculator-object,  
// calc-reference name, calculator-class name
// using calculator I am going to add two numbers
calc.add();         // method calling statement
calc.subtract();    // method calling statement
calc.multiply();    // method calling statement
calc.divided();     // method calling statement
// . --> dot operator

}
void add() // method signature    // add() method name
{
System.out.println(10+20);
}
void subtract()    // method signature
{
System.out.println(10-20);
}
void multiply()    // method signature
{
System.out.println(10*20);
}
void divided()      // method signature
{
System.out.println(10/20);
}

}
