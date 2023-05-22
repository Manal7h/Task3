package com.codeline.task3.Model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailDetails {
    private List<String> recipient;
    private String mgBody;
    private String subject;
    private String attachment;

}
