import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Topic {
    private final Set<Subscriber> subscribers;
    private final String name;

    public Topic(final String name) {
        this.name = name;
        subscribers = new CopyOnWriteArraySet<>();
    }

    public String getName() {
        return name;
    }
    public void addSubscriber(final Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(final Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publish(final Message message) {
        subscribers.forEach(sub -> sub.update(message));
    }


}
