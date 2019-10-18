package racingCar;

import java.util.*;

public class CarWinner {

    public List<String> addWinnerList(List<Car> carList) {

        int maxPosition = getWinnerPosition(carList);

        List<String> winnerList = new ArrayList<String>();

        carList.stream().filter(i -> i.getPosition() == maxPosition)
                .forEach(j -> winnerList.add(j.getName()));

        return winnerList;
    }

    private int getWinnerPosition(List<Car> carList) {

        List<Integer> positionList = new ArrayList<Integer>();

        carList.stream().forEach(i -> {
            positionList.add(i.getPosition());
        });

        int max = positionList.stream().max(Integer::compare).orElse(-1);

        return max;
    }

}