package hello.core;

public class Member {
    private Long id;
    private String string;
    private Grade grade;

    public Member(Long id, String string, Grade grade) {
        this.id = id;
        this.string = string;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
