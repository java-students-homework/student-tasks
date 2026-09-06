package academy.week08;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.List;

/**
 * Week 8 · Lesson 2 — JSON with Jackson.
 * Create ONE ObjectMapper as a field and reuse it in every method.
 * Hints: writeValueAsString, readValue, readTree, TypeReference.
 */
public class JsonTasks {

    /**
     * Serialize the report into JSON.
     * Example: WeatherReport("Kyiv", -3) → {"city":"Kyiv","temperature":-3}
     * (field order in JSON does not matter).
     */
    public String toJson(WeatherReport report) throws JsonProcessingException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Parse JSON into a WeatherReport.
     * Example: {"city":"Kyiv","temperature":-3} → WeatherReport("Kyiv", -3).
     */
    public WeatherReport fromJson(String json) throws JsonProcessingException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Parse a JSON array into a list of reports.
     * Example: [{"city":"Kyiv",...},{"city":"Lviv",...}] → list of 2.
     * Hint: new TypeReference<List<WeatherReport>>() {}.
     */
    public List<WeatherReport> listFromJson(String json) throws JsonProcessingException {
        throw new UnsupportedOperationException("TODO");
    }

    /**
     * Pull one text field out of arbitrary JSON without a DTO.
     * Example: json={"name":"Ann","age":30}, field="name" → "Ann".
     * The field always exists. Hint: readTree(...).get(...).asText().
     */
    public String textField(String json, String field) throws JsonProcessingException {
        throw new UnsupportedOperationException("TODO");
    }
}
