public class PartADriver {
    public static void main(String[] args) {
        EReader reader= new ProEReader();
// using its all methods
        reader.openBook();
        reader.sync();
        reader.annotate();
        reader.export();  

        System.out.println("Changing setting to markdown");
        reader.setExportStrategy(new Markdown());
        reader.export();   
    }
}