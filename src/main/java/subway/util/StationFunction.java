package subway.util;

public enum StationFunction {
    REGIST("1", "1. 역 등록"),
    LINE("2", "2. 역 삭제"),
    SECTION("3", "3. 역 조회"),
    BACK("B", "B. 돌아가기");
    private final String select;
    private final String msg;

    StationFunction(String select, String msg) {
        this.select = select;
        this.msg =msg;
    }

    public static boolean isStationFunction(String userInput) {
        for (StationFunction stationFunction : StationFunction.values()) {
            if (stationFunction.select.equals(userInput)) {
                return true;
            }
        }
        return false;
    }

    public String getMsg() {
        return msg;
    }

    public String getSelect() {
        return select;
    }
}
