package com.codeline.task3.Request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CustomerRequest {
    Integer customerId;

    String customerName;

    Integer customerPhone;

    String customerAddress;
}
