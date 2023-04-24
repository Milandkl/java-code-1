// program to print all the characteristic of different mobile phone.
class Mobile {
String name;
int battery;
int version;
String brand;
public static void main(String[] args){
Mobile m1= new Mobile();
Mobile m2= new Mobile();
m1.name="iphone 13 pro max";
m1.battery=3900;
m1.version=13;
m1.brand="Iphone 13Promax";
m2.name="Iphone 14Pro Max";
m2.battery=3500;
m2.version=15;
m2.brand="Iphone";
System.out.println("First Mobile:");
System.out.println("Name:"+m1.name);
System.out.println("Battery Capacity:"+m1.battery);
System.out.println("Version:"+m1.version);
System.out.println("Brand:"+m1.brand);
System.out.println("\n");
System.out.println("Second Mobile");
System.out.println("Name:"+m2.name);
System.out.println("Battery Capacity:"+m2.battery);
System.out.println("Version:"+m2.version);
System.out.println("Brand:"+m2.brand);
}
}
/* 
output:
First Mobile:
Name:iphone 13 pro max
Battery Capacity:3900
Version:13
Brand:Iphone 13Promax


Second Mobile
Name:Iphone 14Pro Max
Battery Capacity:3500
Version:15
Brand:Iphone

Explanation:
 At first,I created a class with name Mobile
Then,I printed a variable
I created a object and printed all the value of different mobilephone.
*/