/**
 * ACS-3913 - Assignment 1
 */

public class ProEReader extends EReader{
	public ProEReader() { 
		this.exportStrategy = new PDF(); 
	}
    public void annotate(){
        System.out.println("Advanced annotation tools");
    }
}