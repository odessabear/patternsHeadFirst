package chapter2.observer.observable;

import chapter2.observer.interfaces.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForeCastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForeCastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData)observable;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Forecast: ");
        if (currentPressure>lastPressure){
            System.out.println("Improving weather on yhe way!");
        }else if (currentPressure == lastPressure){
            System.out.println("More of the same");
        }else if (currentPressure < lastPressure){
            System.out.println("Watch out for cooler, rainy weather");
        }
    }
}
