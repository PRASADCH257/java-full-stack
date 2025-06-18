import java.util.Scanner;

class Patterns
{

/*

public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}*/

/* Number2 */

/*

public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
}
} */

/* Number3 */

/* 

public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
}
} */

/* Number4 */

/*

public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k++ +"\t");
}
System.out.println();
}
}
} */

/* Number5 */

/* 

public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(k==10)
{
k=1;
}
System.out.print(k++ +"\t");
}
System.out.println();
}
}
} */

/* Number6 */

/* 

public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(k++ +"\t");
k+=1;
}
System.out.println();
}
}
} */

/* Number7 */

/*

public static void main(String[] args)
{
int n,k=1;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j%2);
}
System.out.println();
}
}
}*/

/* Number8 */

/*

public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/

/* Number9 */
/*

public static void main(String[] args)
{
int n,even=2;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n-1;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(" "+even);
even+=2;
}
System.out.println();
even=2;
}
}
}*/

/* Number10 */

/*

public static void main(String[] args)
{
int n;
String s="INDIA";
Scanner s1=new Scanner(System.in);
System.out.print("Enter the value:");
n=s1.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
} */

/* Number11 */

/*

public static void main(String[] args)
{
int n;
Scanner s=new Scanner(System.in);
System.out.print("Enter the value:");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=i;j<=2*n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=2*i-1;k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}*/