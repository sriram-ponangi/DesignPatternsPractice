package behavioural.adapter.example1;

public class GraphitePencil implements Pencil {
    @Override
    public void write(String text) {
        System.out.println("\nWriting text with \"GRAPHITE PENCIL\": ");
        System.out.println(text);
        System.out.println("\n");
    }

    @Override
    public void erase(String text) {
        System.out.println("\nErasing text from \"GRAPHITE PENCIL\": ");
        System.out.println(text);
        System.out.println("\n");
    }
}
