package Experiment10;

public class MagazineList {
	private MagazineNode list;
	public MagazineList()
	{
		list=null;
	}
	public void add(Magazine mag)
	{
		MagazineNode node=new MagazineNode(mag);
		MagazineNode current;
		if(list==null)
			list=node;
		else
		{
			current=list;
			while(current.next!=null)
				current=current.next;
			current.next=node;
		}
	}
	
	void sort()
	{

		MagazineNode current=list;
		while(current.next!=null)
		{
			while(current.next!=null&&current.magazine.toString().compareTo(current.next.magazine.toString())<=0)
					current=current.next;
			if(current.next==null) break;
			MagazineNode insert=current.next;
			if(current.next.next!=null)
				current.next=insert.next;
			else 
				current.next=null;
			MagazineNode pointer=list;
			if(pointer.magazine.toString().compareTo(insert.magazine.toString())>=0)
			{
				insert.next=pointer;
				list=insert;
				current=list;
			}
			else
			{
				while(pointer.next.magazine.toString().compareTo(insert.magazine.toString())<=0)
					pointer=pointer.next;
				insert.next=pointer.next;
				pointer.next=insert;
			}
//			System.out.println(this);
		}
	}

	void mergeSort(MagazineList another)
	{
		MagazineNode current=list,current2=another.list;
		while(current.next!=null)
		{
			if(current.magazine.toString().compareTo(current.next.magazine.toString())>0)
				return;
			current=current.next;
		}
		while(current2.next!=null)
		{
			if(current2.magazine.toString().compareTo(current2.next.magazine.toString())>0)
				return;
			current2=current2.next;
		}
		current=list;
		current2=another.list;
		MagazineList result=new MagazineList();
		while(current!=null||current2!=null)
		{
			if(current==null||current2==null)
			{
				while(current!=null)
				{
					result.add(current.magazine);
					current=current.next;
				}
				while(current2!=null)
				{
					result.add(current2.magazine);
					current2=current2.next;
				}
			}
			else if(current.magazine.toString().compareTo(current2.magazine.toString())<=0)
			{
				result.add(current.magazine);
				current=current.next;
			}
			else
			{
				result.add(current2.magazine);
				current2=current2.next;
			}
		}
		this.list=result.list;
	}
	
	void Reverse()
	{
		MagazineNode current=list,temp;
		list=null;
		while(current!=null)
		{
			temp=current.next;
			current.next=list;
			list=current;
			current=temp;
			
			
			
		}
	}
	
	public String toString()
	{
		String result="";
		MagazineNode current=list;
		while(current!=null)
		{
			result+=current.magazine + "\n";
			current=current.next;
		}
		return result;
	}
}
