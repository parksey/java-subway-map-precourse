package subway.station.domain;

public class StationDomain {
    public boolean regist(String stationName) {
        StationRepository.addStation();
        return true;
    }

    public boolean delete(String stationName) {
        StationRepository.deleteStation();
        return true;
    }

    public void search() {

    }
}
