package Com;

public class Exa1 extends RuntimeException 
{
  private String message;

public Exa1(String message) 
{	
	this.message = message;
}
public String getmessage()
{
	return message;
}
  
  
}
//
//Rules forcreating Custom Exception
//1.create a class with exception naem
//2.if class extends exception-> Checked Exception
//2b.if class extends runtime->Unchecked Exception
//3.Override getmessage()->variable,constructor &method
//4.invoke the Eception using throw keyword and handle it using try and catch block