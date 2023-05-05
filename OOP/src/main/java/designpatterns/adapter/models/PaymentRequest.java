package designpatterns.adapter.models;

import lombok.Builder;
import lombok.Getter;

// DTO - Data Transfer Object
@Builder
@Getter
public class PaymentRequest {

    private String phoneNumber;
    private String email;
    private String name;
}
