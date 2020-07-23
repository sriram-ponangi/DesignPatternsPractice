package structural.adapter.example1;

public class InkPenToPencilAdapter implements Pencil {
    private InkPen inkPen;

    public InkPenToPencilAdapter(InkPen inkPen) {
        this.inkPen = inkPen;
    }

    @Override
    public void write(String text) {
        inkPen.jot(text);
    }

    @Override
    public void erase(String text) {
        inkPen.scratch(text);
    }
}
