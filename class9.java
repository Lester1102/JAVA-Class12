package pack9.sub1;
public class class9
 {
 final static double PI=3.14;
 private double radius;
 
 public CSphere(double r)
 {
 radius=r;
}
 public void show()
 {
 double vol=4/3.0*PI*radius*radius*radius;
 
 System.out.print("radius="+radius);
 System.out.println(", volume="+vol);
 }
 }
package pack9.sub2; 03 public class CTrapezoid
 {
 private int upper;
 private int base;
 private int height;
 
 public CTrapezoid(int u,int b,int h)
 {
   upper=u;
 base=b;
 height=h;
 }
 public void show()
 {
 double area=(upper+base)*height/2.0;
 System.out.print("upper="+upper);
 System.out.print(", base="+base);
 System.out.print(", height="+height);
 System.out.println(", area="+area);
 }
 
public static void main(String args[]) 
 {
 CSphere sp=new CSphere(2);
 CTrapezoid tra=new CTrapezoid(2,3,4);
 sp.show();
 tra.show();
 }
 }