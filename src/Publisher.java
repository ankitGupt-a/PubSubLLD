import java.util.HashSet;
import java.util.Set;

public class Publisher {
    private final Set<Topic> topics;

    public Publisher() {
        this.topics = new HashSet<>();
    }

    public void registerTopic(final Topic topic) {
        topics.add(topic);
    }

    public void publish(final Message message) {
        topics.forEach(topic -> topic.publish(message));
    }
}
