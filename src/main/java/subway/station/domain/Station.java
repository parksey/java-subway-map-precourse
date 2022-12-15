package subway.station.domain;

public class Station {
    private String name;

    public Station(String name) {
        validateStation(name);
        this.name = name;
    }

    public static Station of(String name) {
        return new Station(name);
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void validateStation(String userInput) {
        StationException.notLimitLength(userInput);
        StationException.notInRepository(userInput);
    }
}
