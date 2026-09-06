package academy.week08;

/**
 * Week 8 — DTO for JsonTasks.
 * Already implemented, nothing to do here.
 * Jackson needs the no-args constructor and getters/setters.
 */
public class WeatherReport {

    private String city;
    private int temperature;

    public WeatherReport() {
    }

    public WeatherReport(String city, int temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
