package behavioural.adapter.example1;

public class Main {
    public static void main(String[] args) {

        Pencil graphitePencil = new GraphitePencil();
        Paper paper1 = new Paper(graphitePencil);
        paper1.publish("Writing some content without the help of the adapter class");


        InkPen inkPen = new InkPen();
        Pencil penAsPencil = new InkPenToPencilAdapter(inkPen);
        /*
        * Paper paper2 = new Paper(inkPen); // Will not compile as Paper is expecting a pencil type
        * Adapter solves this problem of using the inkPen as pencil
        */
        Paper paper2 = new Paper(penAsPencil);
        paper2.publish("Writing some content with the help of the adapter class");
    }
}
