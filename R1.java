class Box
{
   double w,h,d;
public void ini(double w,double h,double d)
{
   this.w=w;
this.h=h;
this.d=d;
}

double display()
{
   double v=w*h*d;
return v;
}
  
}
class R1
{
   public static void main(String a[])
{
   Box b1=new Box();
b1.ini(6.0,5.0,8.0);
double v=b1.display();
System.out.println("Volume is="+v);
}
}