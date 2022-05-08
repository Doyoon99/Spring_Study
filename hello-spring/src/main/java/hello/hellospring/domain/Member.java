package hello.hellospring.domain;

public class Member {

    private Long id;
    private String member_id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMember_id() { return member_id; }

    public void setMember_id(String member_id) { this.member_id = member_id; }
}
