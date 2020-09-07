package behavioural.template.example1;

public class ConcreteClass2 extends TemplateMethodClass {
    @Override
    protected void requiredOperations1() {
        System.out.println("requiredOperations1----implemented by-----ConcreteClass-------2");
    }

    @Override
    protected void requiredOperations2() {
        System.out.println("requiredOperations2----implemented by-----ConcreteClass-------2");
    }
}
