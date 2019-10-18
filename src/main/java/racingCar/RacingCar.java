package racingCar;

import java.util.*;

public class RacingCar {

	private List<String> carNames = new ArrayList<String>();
	private List<Car> carList = new ArrayList<Car>();
	private List<String> winnerList;

	private CarView carView;
	private CarWinner carWinner;

	private int n;

	public RacingCar() {
		carView = new CarView();
		carWinner = new CarWinner();
	}

	private void addCarListByName(String carName) {
		Car car = new Car(carName);
		carList.add(car);
	}

	private void addCarList() {
		for (int i = 0; i < carNames.size(); i++) {
			addCarListByName(carNames.get(i));
		}
	}

	public void run() {
		carNames = carView.inputCarName();
		n = carView.inputTryNumAndReturnNum();
		addCarList();
		carView.printProcessResult(carList, n);
		winnerList = carWinner.addWinnerList(carList);
		carView.printResult(winnerList);
	}

}