public class test{
	public static void main(String[] args) {
		ArrayList obj1=new ArrayList();
		obj1.add(8);
		obj1.add(2);
		obj1.add(8);
		obj1.add(7);
		obj1.add(8);
		obj1.add(6);
	

	

		obj1.pop();
		
		obj1.resize();
		System.out.println("The toString Function " +obj1.toString());
		System.out.println("Size of the Array is : "+ obj1.size());
		System.out.println("All Test Passed!!!");
		

	



	}
}