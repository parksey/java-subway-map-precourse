package subway.util;

public enum SectionFunction {
    REGIST("1", "1. 구간 등록"),
    DELETE("2", "2. 구간 삭제"),
    BACK("B", "B. 돌아가기");
    private final String select;
    private final String msg;

    SectionFunction(String select, String msg) {
        this.select = select;
        this.msg =msg;
    }

    public static boolean isSectionFunction(String userInput) {
        for (SectionFunction sectionFunction : SectionFunction.values()) {
            if (sectionFunction.select.equals(userInput)) {
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
