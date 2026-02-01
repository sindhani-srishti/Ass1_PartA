/**
 * ACS-3913 - Assignment 1
 */
 
public class BasicEReader extends EReader{
	public BasicEReader() { 
		this.exportStrategy = new Text(); 
	}
    public void annotate(){
        System.out.println("Basic annotation tools");
    }
}