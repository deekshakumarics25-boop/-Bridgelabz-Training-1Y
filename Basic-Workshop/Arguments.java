public class Arguments{
static int x = 50;
int z = 60;

void m3(){
System.out.println("m3 static var x: " + x); // 90
System.out.println("m3 object level var x: " + z); // 60
}
public static void m2(){
int y = 30;
System.out.println("m2 static var x before: " + x); // 80
x = 90;
Arguments obj = new Arguments();
System.out.println("object-level var: " + obj.z); // 60
System.out.println("m2 static var x after :" + x); // 90
System.out.println("m2 local var: "+ y); // 30
}
public static void m1(){
int y = 20;
System.out.println("m1 static var x: " + x); // 70
System.out.println("m1 local var: "+ y); // 20
x = 80;
m2();
}

public static void main(String[] args){
int y = 10;
System.out.println("HelloWorld");
System.out.println("main static var x: " + x); // 50
System.out.println("main local var y: "+ y); // 10
x = 70;
m1();
Arguments obj = new Arguments();
System.out.println("object-level var: "+obj.z); // 60
obj.m3();
System.out.println(args[0]);
System.out.println(args[0] + args[1]);
System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
}
}