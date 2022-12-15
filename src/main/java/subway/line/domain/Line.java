package subway.line.domain;

import subway.domain.LineStations;

public class Line {
    private String name;
    private LineStations lineStations;

    public Line(String name, LineStations lineStations) {
        validateLine(name);
        this.name = name;
        this.lineStations = lineStations;
    }

    public static Line of(String name, LineStations lineStations) {
        return new Line(name, lineStations);
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public static void validateLine(String userInput) {
        LineException.notLimitLength(userInput);
    }

    public LineStations getLineStations() {
        return lineStations;
    }
}
