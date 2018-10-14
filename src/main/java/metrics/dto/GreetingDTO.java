package metrics.dto;

public class GreetingDTO {

    private String greeting;

    public GreetingDTO(String name) {
        this.greeting = "Hello, " + name;
    }

    public String getGreeting() {
        return greeting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GreetingDTO that = (GreetingDTO) o;

        return greeting != null ? greeting.equals(that.greeting) : that.greeting == null;
    }

    @Override
    public int hashCode() {
        return greeting != null ? greeting.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "GreetingDTO{" +
                "greeting='" + greeting + '\'' +
                '}';
    }
}
