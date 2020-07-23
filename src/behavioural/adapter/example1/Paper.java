package behavioural.adapter.example1;

public class Paper {
    private Pencil pencil;

    public Paper(Pencil pencil) {
        this.pencil = pencil;
    }

    public void publish(String content){
        pencil.write(content);
    }
}
