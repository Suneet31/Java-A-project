class NestedFLoop
{
public static void main(String args[])
{
for (int row=1; row<=5;row++);
{
	for(int column=1;column<=row;column++);
		{
		System.out.println("*");
		}
System.out.println();
}
}
}