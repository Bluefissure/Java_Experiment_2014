package Experiment08;
import java.util.*;
class Array
{
	int maxn=1001,length=0;
	int []a=new int[maxn];
	void clear()
	{
		for(int i=0;i<=1000;i++)
			a[i]=0;
	}
	void add(int num){a[length++]=num;}
	void insert(int dex,int num)
	{
		for(int i=length-1;i>dex;i--)
			a[i+1]=a[i];
		a[dex+1]=num;
		length++;
	}
	void delete(int dex)
	{
		for(int i=dex;i<length;i++)
			a[i]=a[i+1];
		a[length--]=0;
	}
	
	int find(int num)
	{
		for(int i=0;i<length;i++)
			if(a[i]==num) return i;
		return -1;
	}
	
	void print()
	{
		System.out.print("The list is:\n");
		for(int i=0;i<length;i++)
			System.out.print(a[i]+" ");
		Scanner in=new Scanner(System.in);
		System.out.print("\n");
	}
	
}


public class Experiment08_1 {
	public static void main(String[] args)
	{
		Array arr=new Array();
		arr.clear();
		Scanner in=new Scanner(System.in);
		System.out.println("Please input N:");
		int n=in.nextInt();
		System.out.println("Please input N numbers to add:");
		for(int i=1;i<=n;i++)
		{
			arr.add(in.nextInt());
		}
		arr.print();
		
		System.out.println("Please input the number to add:");
		arr.add(in.nextInt());
		arr.print();
		
		int m;
		System.out.println("Please input the dex and num to insert:");
		n=in.nextInt();m=in.nextInt();
		arr.insert(n, m);
		arr.print();
		
		System.out.println("Please input the dex to delete:");
		n=in.nextInt();
		arr.delete(n);
		arr.print();
		
		System.out.println("Please input the numer you want to find:");
		m=in.nextInt();
		if(arr.find(m)!=-1)
			System.out.println("The "+m+" is found at "+arr.find(m));
		else
		{
			System.out.println("Cannot find "+m);
		}
	}
	

}
