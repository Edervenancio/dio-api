package dio.web.api.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario(){}

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
