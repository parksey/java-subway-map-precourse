package subway.util;

public enum SubwayCode {
    NAME_LIMIT(1);

    private final int code;

    SubwayCode(int code) {
        this.code =code;
    }

    public int getCode() {
        return code;
    }
}
