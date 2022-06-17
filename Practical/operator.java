class Operator{
public static void main (String [] args)
{
int a= 20;
int b= 15;
int c= 5;
int d=25;
int max;
int min;
// unary
System.out.println(a++);
System.out.println(++a);
System.out.println(a--);
System.out.println(--a);
//arthemetic
System.out.println(b+c);
System.out.println(b-c);
System.out.println(b*c);
System.out.println(b/c);
System.out.println(b%c);
//relational
System.out.println(a==b);
System.out.println(a!=b);
System.out.println(a>b);
System.out.println(a<b);
System.out.println(a<=b);
System.out.println(a>=b);
//assignment
System.out.println(a=b); //a=b(15)
System.out.println(a+=b);//15+15
System.out.println(a-=b);//30-15
System.out.println(a*=b);//15*15
System.out.println(a/=b);//225/15
System.out.println(a%=b);//15/15 r=0
//logical 
	//AND if both are true then only statement is true
System.out.println(b>c && a>c );
System.out.println(b>c && c>b);
	//OR in one is true then statement is true
System.out.println(b>c || c>a );
System.out.println(c>a || c>b );
//ternary/conditional
max = (d>b)?(d>c? d:c):(b>c? b:c);
min = (d<b)?(d>c? d:c):(b>c? c:b);
System.out.println(max);
System.out.println(min);



}
}