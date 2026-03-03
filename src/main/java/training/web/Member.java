package training.web;

import jakarta.persistence.*;

@Entity // 宣告這是一個資料庫實體
@Table(name = "member") // 對應到資料庫裡的 member 表格
public class Member {

    @Id // 宣告這是主鍵 (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 對應 AUTO_INCREMENT
    private Integer id;

    private String name;
    private String email;
    private String password;
    private Integer follower_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(Integer follower_count) {
        this.follower_count = follower_count;
    }
}
