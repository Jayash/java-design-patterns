package behavioral.observer;

public class MobileWeatherObserver implements Observer {

	private WeatherObservable weatherObservable;
	private WeatherType currentWeather;
	
	public WeatherType getCurrentWeather() {
		return currentWeather;
	}

	public MobileWeatherObserver(WeatherObservable weatherObservable) {
		this.weatherObservable = weatherObservable;
		currentWeather = weatherObservable.getCurrentWeather();
	}
	
	@Override
	public void update() {
		currentWeather = weatherObservable.getCurrentWeather();
	}

}
