import java.util.ArrayList;
import java.util.List;

public class Sensor {

    private Double temperature;
    private Double highLimite = 8.0;
    private Double lowLimite = 2.0;
    private final List<Notification> notifications = new ArrayList<>();

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
        if (temperature > this.highLimite){
            notifications.forEach(Notification::notifyUser);
        }
        if (temperature < this.lowLimite){
            notifications.forEach(Notification::notifyUser);
        }
    }

    public Double getHighLimite() {
        return highLimite;
    }

    public void setHighLimite(Double highLimite) {
        this.highLimite = highLimite;
    }

    public Double getLowLimite() {
        return lowLimite;
    }

    public void setLowLimite(Double lowLimite) {
        this.lowLimite = lowLimite;
    }

    public void addNotification(Notification notification){
        notifications.add(notification);
    }

    public List<Notification> getNotifications() {
        return notifications;
    }
}
