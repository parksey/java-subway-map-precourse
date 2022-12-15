package subway.util;

public enum LineFunction {
    REGIST("1", "1. 노선 등록"),
    DELETE("2", "2. 노선 삭제"),
    SEARCH("3", "3. 노선 조회"),
    BACK("B", "B. 돌아가기");
    private final String select;
    private final String msg;

    LineFunction(String select, String msg) {
        this.select = select;
        this.msg =msg;
    }

    public static boolean isLineFunction(String userInput) {
        for (LineFunction lineFunction : LineFunction.values()) {
            if (lineFunction.select.equals(userInput)) {
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
