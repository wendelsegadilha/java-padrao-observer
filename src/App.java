public class App {

    public static void main(String[] args) {

        Sensor s = new Sensor();

        Notification EmailNotification = new EmailNotification();
        Notification SmNotification = new SmsNotification();

        s.addNotification(EmailNotification);
        s.addNotification(SmNotification);

        s.setTemperature(5.0);
        s.setTemperature(6.0);
        s.setTemperature(4.0);
        s.setTemperature(5.0);
        s.setTemperature(10.0);
        s.setTemperature(6.0);
        s.setTemperature(7.0);
        s.setTemperature(4.0);
        s.setTemperature(4.0);
        s.setTemperature(1.0);
        s.setTemperature(1.0);
        s.setTemperature(5.0);
        s.setTemperature(4.0);
    }
}
