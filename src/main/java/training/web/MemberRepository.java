package training.web;

import org.springframework.data.jpa.repository.JpaRepository;

// 繼承 JpaRepository<要操作的實體類別, 主鍵的型態>
public interface MemberRepository extends JpaRepository<Member, Integer> {

    // 沒錯，裡面是空的！
    // 因為 Spring Boot 已經在背後把 CRUD (新增、讀取、更新、刪除) 的 SQL 語法全都寫好了！

}