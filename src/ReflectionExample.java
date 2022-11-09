public class ReflectionExample {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        ReflectionChecker reflectionChecker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();

        /*
        reflectionChecker.showClassName(rabbit);
        reflectionChecker.showClassFields(rabbit);
        reflectionChecker.showClassMethods(rabbit);
         */

        reflectionChecker.showFieldsAnnotations(rabbit);

        reflectionChecker.fillPrivateFields(rabbit);

        System.out.println(rabbit.getRabbitAge());
        System.out.println(rabbit.getRabbitName());

        System.out.println();

        Object clone = reflectionChecker.createNewObject(rabbit);

        reflectionChecker.showClassName(clone);
        reflectionChecker.showClassFields(clone);

    }
}
