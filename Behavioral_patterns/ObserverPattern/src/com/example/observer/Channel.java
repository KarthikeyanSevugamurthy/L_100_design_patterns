import java.util.*;

class Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String videoTitle;

    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    public void unsubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void uploadVideo(String title) {
        this.videoTitle = title;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update(videoTitle);
        }
    }
}
