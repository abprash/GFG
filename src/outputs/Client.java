package outputs;



public class Client {
    int x = 10;
    
    public static void main(String args[])
    {
		Client obj;//this has not been initialized....
		//local variables MUST always be initialized
        System.out.println(obj.x);
    }
}