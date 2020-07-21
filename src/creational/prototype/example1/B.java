package creational.prototype.example1;

public class B implements Cloneable {
    A objA;
    private int id;
    private String name;

    public B(A objA, int id, String name) {
        this.objA = objA;
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public A getObjA() {
        return objA;
    }

    public void setObjA(A objA) {
        this.objA = objA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "objA=" + objA +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
