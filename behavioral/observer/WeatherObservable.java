package behavioral.observer;

public interface WeatherObservable extends Observable {
	
	WeatherType getCurrentWeather();
}
