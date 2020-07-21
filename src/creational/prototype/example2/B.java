package creational.prototype.example2;

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
        A newA = new A(this.objA.getId(), this.objA.getName());
        B newB = new B(newA, this.id, this.name);
        return newB;
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
