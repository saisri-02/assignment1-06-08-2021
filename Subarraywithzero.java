import java.util.*;
class Subarraywithzero
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(subarraySum(a,n));
}
public static boolean subarraySum(int a[],int n)
{
HashMap<Integer,Boolean> hm=new HashMap();
int sum=0;
for(int i=0;i<n;i++)
{
sum+=a[i];
if(sum==0 || hm.containsKey(sum))
return true;
hm.put(sum,true);
}
return false;
}
}

output1:
5
4 2 -3 1 6
true

output2:
5
-3 2 3 1 6
false