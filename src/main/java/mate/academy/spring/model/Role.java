package mate.academy.spring.model;

import java.util.Arrays;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private RoleName role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleName getRole() {
        return role;
    }

    public void setRole(RoleName role) {
        this.role = role;
    }

    public enum RoleName {
        ADMIN("ADMIN"),
        USER("USER");

        private String role;
        RoleName(String role) {
            this.role = role;
        }

        public static RoleName toRole(String role) {
            return Arrays.stream(values())
                    .filter(r -> r.role.equalsIgnoreCase(role))
                    .findFirst().orElse(null);
        }
    }
}
