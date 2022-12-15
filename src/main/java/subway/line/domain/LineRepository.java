package subway.line.domain;

import subway.domain.LineStations;
import subway.station.domain.Station;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class LineRepository {
    private static final List<Line> lines = new ArrayList<>();

    public static List<Line> lines() {
        return Collections.unmodifiableList(lines);
    }

    public static void addLine(Line line) {
        validateRepository(line);
        lines.add(line);
    }

    public static boolean deleteLineByName(String name) {
        return lines.removeIf(line -> Objects.equals(line.getName(), name));
    }

    public static void validateRepository(Line line) {
        LineException.notInRepository(line.getName());
    }

    public static boolean search(Station station) {
        for (Line line : lines) {
            if (findStation(line.getLineStations(), station)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findStation(LineStations lineStations, Station inputStation) {
        for (Station station : lineStations.getLineStations()) {
            if (isSame(station, inputStation)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSame(Station station, Station compare) {
        if (station.getName().equals(compare.getName())) {
            return true;
        }
        return false;
    }

    public static Line findLine(String lineName) {
        for (Line line : lines) {
            if (line.getName().equals(lineName)) {
                return line;
            }
        }
        return null;
    }

    public static void sectionRegist(String lineName, String stationName, int order) {
        Line line = findLine(lineName);
        setStation(line.getLineStations(), stationName, order);
    }

    public static void setStation(LineStations lineStations, String stationName, int order) {
        lineStations.getLineStations().add(order-1, Station.of(stationName));
    }

    public static void sectionDelete(String lineName, String stationName) {
        Line line = findLine(lineName);
        sectionRemove(line.getLineStations(), stationName);
    }

    public static void sectionRemove(LineStations lineStations, String stationName) {
        lineStations.getLineStations().removeIf(station -> Objects.equals(station.getName(), stationName));
    }
}
