package life_simulator;

import javax.persistence.*;

@Entity
public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @Column(nullable = false, unique = true)
    private String username;
    private String password;
 
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
}