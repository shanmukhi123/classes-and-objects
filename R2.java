class Calculator
{
  public static double powerInt(int num1,int num2)
{
   return Math.pow(num1,num2);
}
public static double powerDouble(double num1,int num2)
{
   return Math.pow(num1,num2);
}
}

class R2
{
  public static void main(String args[])
{
   System.out.println(Calculator.powerInt(3,4));
 System.out.println(Calculator.powerDouble(7.1,5));
}
}
