package behavioural.template.example1;

public abstract class TemplateMethodClass {
    public final void templateMethod(){
        baseOperation1();
        requiredOperations1();
        baseOperation2();
        requiredOperations2();
    }

    /**
     * These operations already have implementations.
     */
    protected void  baseOperation1() {
        System.out.println("Performing baseOperation-----------1");
    }

    protected void  baseOperation2() {
        System.out.println("Performing baseOperation-----------2");
    }

    /**
     * These operations have to be implemented in subclasses.
     */
    protected abstract void requiredOperations1();
    protected abstract void requiredOperations2();
}
