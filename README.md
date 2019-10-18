# java-racingcar
자동차 경주 게임 미션 저장소

## 기능 설명

### Car
- getName()
    - Car 객체의 name을 return

- getPosition()
    - Car 객체가 몇칸 갔는지 칸 수를 return

- movingOneStep()
    - 1칸씩 Car 객체의 position을 전진


### CarView
- inputCarName()
    - 경주에 참가할 참가자를 입력 받고, ArrayList를 return

- inputTryNumAndReturnNum()
    - 시도할 횟수를 입력 받고, return
    - 1 이상으로 입력하지 않으면 재 입력

- printProcessResult()
    - 실행결과를 console에 출력

- forwardStep()
    - random 값이 4 이상이면 1 그 이하이면 0을 return하여 Car를 움직일지 말지를 결정

- printProcess()
    - Car객체를 입력받고 해당 Car 객체의 position을 console에 출력

- calculatePosition()
    - Car 객체가 몇칸 이동했는 지를 "-"을 return
    
- printResult()
    - 누가 최종 우승했는지를 console에 출력


### RacingCar
- addCarListByName()
    - 입력 받은 Car의 이름으로 자동차 게임 참가자 carList에 넣음

- addCarList()
    - carList에 add
    
- run()
    - 전체적인 자동차 경주 게임을 실행


### CarWinner
- addWinnerList()
    - 모든 참가자를 입력 받아서 최종 우승자 이름을 return

- getWinnerPosition()
    - 우승자들이 몇칸 갔는지를 계산해서 return