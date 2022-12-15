package subway.domain;

import subway.station.domain.Station;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LineStations {
    List<Station> lineStations;

    LineStations(Station upStation, Station downStation) {
        lineStations = new LinkedList<>();

        lineStations.add(upStation);
        lineStations.add(downStation);
    }

    LineStations(List<Station> lineStations) {
        lineStations = lineStations;
    }

    public static LineStations of(List<Station> lineStations) {
        return new LineStations(lineStations);
    }

    public void addLineStation(Station station) {
        lineStations.add(station);
    }
}
