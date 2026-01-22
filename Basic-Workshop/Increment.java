public class Increment{
public static void main(String[] args){
 int i=0;
 System.out.println("val :"+i); //0
 i++;
 System.out.println("val a: "+i++); //1
 System.out.println("val b: "+i); //2
 ++i;
 System.out.println("val c: "+i++); //3
 System.out.println("val d: "+i++); //4
 int z = i + i++ + ++i + i + ++i + i++ ;
 System.out.println(" value of z:"+z); //40
 System.out.println(i); //9
 int y = i - i++ - --i + i - ++i + i++ ;
 System.out.println(" value of y:"+y); //0
 System.out.println(i); //7

    // for loop
for(int m =0;m<10;m++){
System.out.println("m: "+m);
}
     // while loop
int j=10;
while(j>0){
System.out.println("j: "+j);
j-- ;
}
     // do-while loop
int k=10;
do{
System.out.println("k:"+k);
k-- ;
}while(k>0);
 }
}