package id.co.askrindo.simpleriskentity.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Additional {

    @Column(name = "created_date" ,nullable = false, updatable = false)
    @CreatedDate()
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(timezone = "Asia/Jakarta",pattern = "dd/MM/yyyy")
    protected Date createdDate;

    @LastModifiedDate
    @Column(name = "modified_date", updatable = true)
    @Temporal(TemporalType.TIMESTAMP)
    protected Date modifiedDate;

    private String ket;
}
