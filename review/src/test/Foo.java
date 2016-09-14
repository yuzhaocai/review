package test;

public class Foo {
	
	public static void main(String[] args) {
		int count = 0;
		int[] arr = new int[]{1,2,3,4};
		for(int i = 0;i < arr.length;i++){
			for(int j = 0;j < arr.length;j++){
				for(int k = 0;k < arr.length;k++){
					count++;
					System.out.println("" + arr[i] + arr[j] + arr[k]);
				}
			}
		}
		System.out.println(count);
		
		int x = 1;
		int y = 2;
		System.out.println("foo" + x + y);
		System.out.println(x + y + "foo");
		
		char c = '8';
		char d = (char) (c + 1);
		System.out.println(d);
	}
}
