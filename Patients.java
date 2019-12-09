class Patient
{
  String name;
double height,weight;
Patient(String name,double height,double weight)
{
   this.name=name;
   this.height=height;
   this.weight=weight;

}
double BMI()
{
  double b=(weight/(height*height))*703;
return b;
}
}
class Patients
{
public static void main(String args[])
{
  Patient p=new Patient("Ram",5.9,78.2);
String a=p.name;
System.out.println("The BMI of "+a+" is "+p.BMI());
}
}