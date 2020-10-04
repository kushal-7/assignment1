public class ArrayList {
		int size=10;
		int main_Array[];
		int head_array=0;
		int tor;
		int len;
		int deleted;
		int length;
		double max=0.75;
		double min=0.25;
		


		public ArrayList(){
			main_Array=new int[size];
		}

		public void add(int t){
			if (size==0){
				main_Array[0]=t;
				head_array=0;
			}
			else
			{
				main_Array[head_array]=t;
				head_array++;
			}

		}
		public void pop(){
			head_array=head_array-1;
			deleted=main_Array[head_array];
			main_Array[head_array]=0;
			int num=0;
			int p=0;
			do{
				num++;
				p++;
			}
			while(p<main_Array[p]);
			tor=num;
			len=tor/size;
			System.out.println("The removed element from the array is: "+ deleted);


		}
		public void resize(){
		if(length==length*min){
			
				int [] destination=new int[main_Array.length*2];
				for(int i=0; i<main_Array.length; i++)
				{
					destination[i]=main_Array[i];

				}

				for(int i=0; i<destination.length; i++)
				{
					System.out.println(destination[i]);

				}
			}
		
		else if(length==length*0.25){

				int [] destination=new int[main_Array.length/2];
				for(int i=0; i<main_Array.length; i++)
				{
					destination[i]=main_Array[i];

				}

				for(int i=0; i<destination.length; i++)
				{
					System.out.println("The value at position"+i+"is"+destination[i]);
				}

		 }
		else{
			System.out.println("Error");
			}
		}
		public int size(){
			return size;
		}
		
		
		public String toString(){
			String s=Integer.toString(size);
			return s;
		}








}