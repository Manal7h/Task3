package com.codeline.task3.Model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@Getter
@Setter
@Data
@MappedSuperclass

public class BaseEntity {

    @CreatedDate
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "Asia/Muscat")
    Date createdDate;

    @UpdateTimestamp
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" , timezone = "Asia/Muscat")
    Date updatedDate;

    Boolean isActive;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
