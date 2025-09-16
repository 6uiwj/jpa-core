package com.sparta.entity;

import jakarta.persistence.*;

//JPA가 엔티티 클래스를 인스턴스화할 때 기본생성자를 사용하므로 기본생성자가 있어야 함
@Entity // JPA가 관리할 수 있는 Entity 클래스 지정  //cf: (name = "이름") : 엔티티 클래스 이름 지정
@Table(name = "memo") // 매핑할 테이블의 이름을 지정 (default: 엔티티명과 동일함 )
public class Memo {
    @Id //기본키 지정 , 영속성컨텍스트에서 엔티티를 식별할때 기본키 필요
    //@GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    //name: 필드와 매핑할 테이블의 컬럼 이름지정 (default:엔티티클래스의 필드명)
    // nullable: null 허용 여부 (default: true)
    // unique: 중복 허용 여부 (false 일때 중복 허용) (default: false)
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // length: 컬럼 길이 지정
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}