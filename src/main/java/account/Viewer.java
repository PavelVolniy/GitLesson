package account;

public class Viewer {
    private String nickName;
    private int age;
    private int countOfViewedFilms;

    public Viewer(String nickName, int age, int countOfViewedFilms) {
        setNickName(nickName);
        setAge(age);
        setCountOfViewedFilms(countOfViewedFilms);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if (nickName != null && !nickName.isEmpty()) this.nickName = nickName;
        else this.nickName = "default";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = Math.max(age, 0);
    }

    public int getCountOfViewedFilms() {
        return countOfViewedFilms;
    }

    public void setCountOfViewedFilms(int countOfViewedFilms) {
        this.countOfViewedFilms = Math.max(countOfViewedFilms, 0);
    }
}
