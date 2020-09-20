package behavioral.observer;

import java.util.List;

public class Weather implements WeatherObservable {
	
	
	private List<Observer> observers;
	private WeatherType currentWeather;
	
	public WeatherType getCurrentWeather() {
		return currentWeather;
	}

	public void setCurrentWeather(WeatherType currentWeather) {
		this.currentWeather = currentWeather;
		notifyObservers();
	}

	public Weather(List<Observer> observers) {
		this.observers = observers;
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(o -> o.update());
	}

}
