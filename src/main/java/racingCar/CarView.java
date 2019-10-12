package racingCar;

import java.util.*;

public class CarView {

	private final Scanner scanner = new Scanner(System.in);
	private String split[];
	private int num;
	int winnerListSize;
	String resultPrintString = "";
	private RacingCar racingCar;

	public CarView(RacingCar racingCar) {
		this.racingCar = racingCar;
	}

	public List<String> inputCarName() {

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분");
		String carName = scanner.nextLine();

		split = carName.split(",");

		for (int i = 0; i < split.length; i++) {
			racingCar.addCarListByName(split[i]);
		}

		return Arrays.asList(split);
	}

	public int inputTryNumAndReturnNum() {
		System.out.println("시도할 횟수는 몇회인가요?");
		num = scanner.nextInt();

		return num;
	}

	public void printProcessResult() {

		System.out.println("실행 결과");

		for (int i = 0; i < num; i++) {
			printProcess();
		}
	}

	private void printProcess() {

		for (int j = 0; j < racingCar.getCarList().size(); j++) {
			racingCar.getCarList().get(j).movingOneStep(racingCar.forwardStep());
			String countingPostionHyphenString = calculatePosition(racingCar.getCarList().get(j).getPosition());

			System.out.println(racingCar.getCarList().get(j).getName() + " : " + countingPostionHyphenString);
		}

		System.out.println();
	}

	private String calculatePosition(int n) {

		String countPosition = "-";

		for (int i = 0; i < n; i++) {
			countPosition += "-";
		}

		return countPosition;
	}

	public void printResult() {

		winnerListSize = racingCar.getWinnerList().size();

		for (int i = 0; i < racingCar.getWinnerList().size(); i++) {
			resultPrintString += racingCar.getWinnerList().get(i);
			operationComma(winnerListSize);
		}

		resultPrintString += "가 최종우승했습니다.";

		System.out.println(resultPrintString);
	}

	private void operationComma(int cnt) {
		if (cnt >= 2) {
			resultPrintString += ", ";
			winnerListSize--;
		}
	}

}
