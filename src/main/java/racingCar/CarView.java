package racingCar;

import java.util.*;
import java.util.stream.*;

public class CarView {

	private final Scanner scanner = new Scanner(System.in);

	public List<String> inputCarName() {

		List<String> inputCarNameList = new ArrayList<String>();
		String split[];

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)");
		String carName = scanner.nextLine();

		split = carName.split(",");

		Arrays.stream(split).forEach(i -> {
			inputCarNameList.add(i);
		});

		return inputCarNameList;
	}

	public int inputTryNumAndReturnNum() {

		System.out.println("시도할 횟수는 몇회인가요?");
		int num = scanner.nextInt();

		while (num < 1) {
			System.out.println("시도할 횟수를 다시 입력하세요.");
			num = scanner.nextInt();
		}

		return num;
	}

	public void printProcessResult(List<Car> carList, int num) {

		System.out.println("실행 결과");

		IntStream.range(0, num).forEach(i -> {
			carList.stream().forEach(j -> {
				printProcess(j);
			});
			System.out.println();
		});

	}

	private int forwardStep() {

		Random random = new Random();
		final int randomNumber = random.nextInt(10); // 0 ~ 9

		int step = (randomNumber >= 4) ? 1 : 0;

		return step;
	}

	private void printProcess(Car c) {
		c.movingOneStep(forwardStep());
		String countingPostionHyphenString = calculatePosition(c.getPosition());
		System.out.println(c.getName() + " : " + countingPostionHyphenString);
	}

	private String calculatePosition(int n) {

		String countPosition = "-";

		for (int i = 0; i < n; i++) {
			countPosition += "-";
		}

		return countPosition;
	}

	public void printResult(List<String> winnerList) {

		String resultPrintString = String.join(", ", winnerList);
		resultPrintString += "가 최종우승했습니다.";

		System.out.println(resultPrintString);
	}

}