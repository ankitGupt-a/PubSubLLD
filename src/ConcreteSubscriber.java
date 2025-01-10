public class ConcreteSubscriber implements Subscriber{
    private final String name;

    public ConcreteSubscriber(final String name) {
        this.name = name;
    }
    public void update(final Message message) {
        System.out.println(message.getContent() + " received by the " + name);
    }
}
