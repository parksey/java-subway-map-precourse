package subway.util;

public enum MainFunction {
    STATION("1", "1. 역 관리"),
    LINE("2", "2. 노선 관리"),
    SECTION("3", "3. 구간 관리"),
    MAIN_PRINT("4", "4. 지하철 노선도 출력"),
    QUIT("Q", "Q. 종료");
    private final String select;
    private final String msg;

    MainFunction(String select, String msg) {
        this.select = select;
        this.msg =msg;
    }

    public String getMsg() {
        return msg;
    }

    public String getSelect() {
        return select;
    }
}
