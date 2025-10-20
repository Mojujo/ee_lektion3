package se.mojujo.ee_lektion3.RestTemplate;

public class WeatherModel {
    public double latitude;
    public double longitude;
    public double generationtime_ms;
    public int utc_offset_seconds;
    public String timezone;
    public String timezone_abbreviation;
    public double elevation;

    public HourlyUnits hourly_units;
    public Hourly hourly;

}
