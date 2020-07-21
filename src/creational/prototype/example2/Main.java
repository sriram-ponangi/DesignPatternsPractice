package creational.prototype.example2;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(1, "A1");
        B b1 = new B(a, 1, "B1");

        B b2 = (B) b1.clone();

        System.out.println("\nORIGINAL OBJECT BEFORE CLONING:");
        System.out.println("Hashcode of main object: ");
        System.out.println(b1.hashCode());
        System.out.println(b1);

        System.out.println("\nDEEP CLONING EXAMPLE:");
        System.out.println("Hashcode of cloned main object: ");
        System.out.println(b2.hashCode());
        System.out.println(b2);


        System.out.println("\nHashcode of inner object (objA) in cloned object: ");
        System.out.println(b2.objA.hashCode());
        System.out.println("Hashcode of inner object (objA) in original object: ");
        System.out.println(b1.objA.hashCode());
    }
}
