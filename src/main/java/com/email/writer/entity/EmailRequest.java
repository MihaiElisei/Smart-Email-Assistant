package com.email.writer.entity;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmailRequest {
    private String emailContent;
    private String tone;
}
