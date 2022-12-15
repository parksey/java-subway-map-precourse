package subway.line.domain;

public class Line {
    private String name;

    public Line(String name) {
        validateLine(name);
        this.name = name;
    }

    public static Line of(String name) {
        return new Line(name);
    }

    public String getName() {
        return name;
    }

    // 추가 기능 구현
    public void validateLine(String userInput) {
        LineException.notLimitLength(userInput);
    }
}
