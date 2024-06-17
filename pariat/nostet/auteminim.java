try {
  // Code that may throw an exception
} catch (SpecificExceptionType e) {
  // Handle the specific exception
  log.error("An error occurred: " + e.getMessage());
} catch (AnotherExceptionType e) {
  // Handle another specific exception
  log.error("Another error occurred: " + e.getMessage());
} catch (Exception e) {
  // This will catch any exception that is not caught by the previous catch blocks
  log.error("Unexpected error occurred: " + e.getMessage());
}
