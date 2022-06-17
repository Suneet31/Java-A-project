class variance{

char a='X';
public static void main(String args[] )
{
variance dynamite=new variance();
dynamite.alpha();
dynamite.beta();

}
public void alpha(){
System.out.println("it is not static="+a);
}
public void beta(){
System.out.println("it is static="+a);
}
}