package outputs;

/*public class Test1 {
    int x = 10;
    
public
    static void main(String[] args)
    {
        System.out.println(new Test1().x);
    }
    static
    {
    	int x = 20;
        System.out.print(x + " ");
    }
}*/
class Test1 {
public
    static void main(String[] args)
    {
        int arr[] = { 11, 22, 33 };
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
 
        System.out.println();
 
        //int arr2[] = new int[3];
        int arr2[] = new int[]{ 11, 22, 33 };
        for (int i = 0; i < arr2.length; i++)
            System.out.print(arr2[i] + " ");
    }
}