package behavioural.template.example1;

public class Main {
    public static void main(String[] args) {
        TemplateMethodClass obj1 = new ConcreteClass1();
        templateMethodClient(obj1);

        System.out.println("\n\n");

        TemplateMethodClass obj2 = new ConcreteClass2();
        templateMethodClient(obj2);
    }

    public static void templateMethodClient(TemplateMethodClass object){
        object.templateMethod();
    }
}
