import java.util.*;

public class WeatherData {
  private float temperature;
  private float humidity;
  private float pressure;
  private CurrentConditionsDisplay currentConditionsDisplay;
  private StatisticsDisplay statisticsDisplay;

  public WeatherData() {
    currentConditionsDisplay = new CurrentConditionsDisplay();
    statisticsDisplay = new StatisticsDisplay();
  }

  public void measurementsChanged() {
    currentConditionsDisplay.update(temperature, humidity, pressure);
    statisticsDisplay.update(temperature, humidity, pressure);
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }
}
