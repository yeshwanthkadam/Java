import java.util.*;
class ListMethods 
{
	public static void main(String[] args) 
	{
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		for(Integer x : marks)
			{
		System.out.print(x+" ");
			}
		System.out.println();
		marks.add(400);
		marks.add(1,500);
		for(Integer x : marks)
			{
		System.out.print(x+" ");
			}
			System.out.println();
		marks.set(1,250);
		System.out.println(marks.get(3));
		System.out.println(marks.indexOf(400));
		marks.add(3, null);
		for(Integer x : marks)
			{
		System.out.print(x+" ");
			}
	}
}
