package app.model;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
    private String breed;

    @Override
    public String toString() {
        return "Im a Dog";
    }
}



