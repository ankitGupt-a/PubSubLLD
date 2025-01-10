public class PubSubDemo {
    public static void main(String[] args) {
        final Topic topic1 = new Topic("topic 1");
        final Topic topic2 = new Topic("topic 2");

        final Publisher publisher1 = new Publisher();
        final Publisher publisher2 = new Publisher();

        publisher1.registerTopic(topic1);
        publisher1.registerTopic(topic2);
        publisher2.registerTopic(topic2);

        final Subscriber subscriber1 = new ConcreteSubscriber("Subscriber 1");
        final Subscriber subscriber2 = new ConcreteSubscriber("Subscriber 2");
        final Subscriber subscriber3 = new ConcreteSubscriber("Subscriber 3");
        final Subscriber subscriber4 = new ConcreteSubscriber("Subscriber 4");

        topic1.addSubscriber(subscriber1);
        topic1.addSubscriber(subscriber2);

        topic2.addSubscriber(subscriber3);
        topic2.addSubscriber(subscriber4);

        publisher1.publish(new Message("Message from publisher 1"));
        publisher2.publish(new Message("Message from publisher 2"));

    }
}