package com.ems.dto;

import com.ems.constant.CommonStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeRrDTO {


    private String id;
    private String employee;
    private String rr;

    private CommonStatus statuss;


}
