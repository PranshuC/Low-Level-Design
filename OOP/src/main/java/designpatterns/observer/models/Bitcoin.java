package designpatterns.observer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class Bitcoin {

    private Double value;
}
