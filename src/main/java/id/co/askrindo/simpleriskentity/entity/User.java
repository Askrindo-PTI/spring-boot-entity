package id.co.askrindo.simpleriskentity.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ms_user", schema = "dbo")
@Builder
public class User extends Additional{

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "nama")
    private String name;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "password")
    private String password;
}
