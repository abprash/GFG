package outputs;


public class Except 
{
    public static void main(String[] args) 
    {    
        try
        {
            throw new Error();
        }
        catch (Error e) 
        {
            try
            {
                throw new RuntimeException();
            }
            catch (Throwable t) 
            {
 
            }
        }
            System.out.println("phew");
            String s = "";
            s = s.concat("D");
    }
}