package racingCar;

import java.util.*;

public class RacingCar {

	public RacingCar() {
		carView = new CarView(this);
		winnerList = new ArrayList<String>();
	}

	private List<Car> carList = new ArrayList<Car>();
	private List<String> winnerList;
	private CarView carView;
	
	public void addCarListByName(String carName) {
		Car car = new Car(carName);
		carList.add(car);
	}

	public int forwardStep() {

		Random random = new Random();
		final int randomNumber = random.nextInt(10); // 0 ~ 9

		int step = (randomNumber >= 4) ? 1 : 0;

		return step;
	}

	private void addWinnerList() {

		for (int i = 0; i < carList.size(); i++) {
			if (carList.get(i).getPosition() == getWinnerPosition()) {
				String winner = carList.get(i).getName();
				winnerList.add(winner);
			}
		}
	}

	public List<String> getWinnerList() {
		return winnerList;
	}
	
	public List<Car> getCarList() {
		return carList;
	}

	private int getWinnerPosition() {

		int max = 0;

		for (int i = 0; i < carList.size(); i++) {
			if (max < carList.get(i).getPosition()) {
				max = carList.get(i).getPosition();
			}
		}

		return max;
	}

	public void run() {
		carView.inputCarName();
		carView.inputTryNumAndReturnNum();
		carView.printProcessResult();
		addWinnerList();
		carView.printResult();
	}

}