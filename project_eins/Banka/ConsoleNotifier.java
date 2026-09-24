public class ConsoleNotifier implements Notifier {
    public void notify(String message) {
        System.out.println(message);
    }
    public void notify(double message) {
        System.out.println(message);
    }
    public void notify(boolean message) {
        System.out.println(message);
    }
}
