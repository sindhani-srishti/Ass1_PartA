/**
 * ACS-3913 - Assignment 1
 */

public abstract class EReader {
    protected ExportStrategy exportStrategy;
    public EReader() {
    }

    public abstract void annotate();

    public void openBook() {
        System.out.println("Open a book");
    }

    public void sync() {
        System.out.println("Sync reading data");
    }

    public void export() {
       exportStrategy.export();
    }
	public void setExportStrategy(ExportStrategy e){
		this.exportStrategy = e;
	}
	
}