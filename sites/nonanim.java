// Example of parsing a date string
String dateString = "2024-06-22";
LocalDate date = LocalDate.parse(dateString);

// Example of parsing JSON string using Jackson library
ObjectMapper objectMapper = new ObjectMapper();
String json = "{\"name\":\"John\",\"age\":30}";
try {
    Map<String, Object> map = objectMapper.readValue(json, new TypeReference<Map<String, Object>>(){});
    // Now 'map' contains parsed JSON data
} catch (IOException e) {
    e.printStackTrace();
}
