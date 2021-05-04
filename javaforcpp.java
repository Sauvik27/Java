import java.util.*;

public class javaforcpp{
	// public static void array1DFun(int arr[])
	// {
	// 	arr[4] = 50;
	// 	for(int i=0;i<arr.length;i++)
	// 	{
	// 		System.out.println(arr[i]);
	// 	}
	// }


	//classes and objects
	static class abc{
		int x;
		int y;
	}
	// static class rect{
	// 	abc tr;
	// 	abc br;
	// }

	public static void main(String[] args)
	{
		// Scanner scn = new Scanner(System.in);
		// System.out.println("Enter the value of n");
		// int n = scn.nextInt();
		// System.out.println("Your input was " + n);
		// System.out.print("Hello World");
		// String s = scn.next();
		// System.out.println(s);



		//DataTypes: byte, short, int, long,char, float, double(more preferred than float)
		/* no pointers in java (so can't pass by reference, pointers)
		(thats why to use a value in a function we should make the variable global
		(static int x=9)static should be written)*/



		//1-D array
		// int arr[] = new int[5];
		// arr[0] = 10;
		// arr[1] = 20;
		// array1DFun(arr);
		// System.out.println(arr.length);
		// for(int val: arr){  //val: arr will check every index
		// 	System.out.println(val);
		// }



		//2-D array
		// int arr2[][] = new int[2][3];
		// arr[0][0] = 11;
		// arr[0][1] = 22;
		// for(int i=0; i<arr2.length;i++)
		// {
		// 	for(int j=0;j<arr2[i].length;j++)
		// 	{

		// 	}
		// }
		//in jagged(having different number of columns) array
		// int arr2jagged[][] = new int[2][]
		// arr2jagged[0] = new int[3];
		// arr2jagged[1] = new int[4];
		// for(int i=0; i<arr2jagged.length;i++)
		// {
		// 	for(int j=0;j<arr2jagged[i].length;j++)
		// 	{
		// 		System.out.println(arr[i][j]);
		// 	}
		// }




		//classes and oops

		// rect r = new rect();
		// r.tr = new abc();
		// r.br = new abc();
		// r.tr.x = 10;
		// r.tr.y = 11;
		// r.br.x = 12;
		// r.br.y = 13;
		// System.out.println(r.br.y);




		//ArrayList(same as array but it has dynamic(not fixed) size)
		// ArrayList<Integer> list = new ArrayList();
		// System.out.println(list + " -> " + list.size());

		// list.add(10);
		// list.add(20);
		// list.add(30);
		// System.out.println(list + " -> " + list.size());

		// list.add(1, 1000);
		// System.out.println(list + " -> " + list.size());

		// int val = list.get(1);
		// System.out.println(val);

		// list.set(1,2000); //not list[1] = 2000;
		// System.out.println(list + " -> " + list.size());

		// list.remove(2);
		// System.out.println(list + " -> " + list.size());

		// ArrayList<String> listString = new ArrayList<>();
		// listString.add("Hello");
		// listString.add("Hel");
		// listString.add("Hellopp");
		// System.out.println(listString + " -> " + list.size());

		// for(int i =0;i<list.size(); i++)
		// {
		// 	System.out.println(list.get(i));
		// }
		// for(int val1: list)
		// {
		// 	System.out.println(val1);
		// }
		// System.out.println(list);




		//Stack and Queue
		//Stack
		// Stack<Integer> stk = new Stack<>();
		// stk.push(10);
		// stk.push(20);
		// stk.push(30);
		// System.out.println(stk);
		// stk.push(40);
		// System.out.println(stk);
		// System.out.println(stk.peek());
		// System.out.println(stk.pop());
		// System.out.println(stk);
		//Queue
		// ArrayDeque<Integer> que = new ArrayDeque<>();
		// que.addLast(10);
		// que.addLast(20);
		// que.addLast(30);
		// System.out.println(que);
		// que.addLast(40);
		// System.out.println(que);
		// System.out.println(que.getFirst());
		// System.out.println(que.removeFirst());
		// System.out.println(que);




		//String
		// Scanner scn = new Scanner(System.in);

		// String s0 = "hello";
		// System.out.println(s0);
		// String s1 = scn.next();
		// String s2 = scn.next();
		// System.out.println(s1);
		// System.out.println(s2);

		// String s3 = scn.nextLine();
		// System.out.println(s3);
		// String s4 = scn.nextLine();
		// System.out.println(s4);

		// String s = scn.nextLine();
		// System.out.println(s);
		// System.out.println(s.length());

		
		// for(int i=0;i<s.length();i++)
		// {
		// 	char ch = s.charAt(i);
		// 	System.out.println(ch);
		// }




		//subString
		// String s = "abcd";
		// System.out.println(s.substring(1,3)); // it will output data less than index 3
		// System.out.println(s.substring(1)); // it will print every character from 1 to end
		// String s1 = "Hello";
		// String s2 = "World";
		// String s3 = s1 + " " + s2;
		// System.out.println(s3);
		// System.out.println(s3 + 10 + 20);
		// String s5 = "abc def ghi jkl";
		// String parts[] = s5.split(" ");
		// for(int i=0;i<parts.length;i++)
		// {
		// 	System.out.println(parts[i]);
		// }

		//String: memory, interning, newm immutability, performance, equal & ==
		/*Interning: if there is a string of same name in heap, then anotherstring of 
		  same name will not be created, rather the same address will be given to the
		  another string, it helps to reduce memory/space. To avoid interning, use new String("jnding")*/
		// In comparison: dont use == , use equals(s1.equals(s2)) for string.
		//refernce is mutable, instance is not, Immutability slows the performance.


		// String-Builder (mutable string)
		// StringBuilder sb = new StringBuilder("Hello");
		// System.out.println(sb);

		// char ch = sb.charAt(0); //get
		// System.out.println(ch);

		// sb.setCharAt(0 , 'd'); //update
		// System.out.println(sb);
		// sb.insert(2, 'y');		//insert
		// System.out.println(sb);
		// sb.deleteCharAt(2);		//delete
		// System.out.println(sb);
		// System.out.println(sb.length());
	}
}
