package com.codeline.task3.Response;

import com.codeline.task3.Model.Customer;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Data
@Builder
public class CustomerResponse {

    Integer cId;

    String cName;

    String cPhone;

    String cAddress;

    public static CustomerResponse convertToResponse(Customer request) {
        return CustomerResponse.builder()
                .cName(request.getCustomerName())
                .cPhone(request.getCustomerPhone())
                .cAddress(request.getCustomerAddress())
                .build();
    }
}
