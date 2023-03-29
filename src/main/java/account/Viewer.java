package account;

import cinema.Cinema;

import java.util.ArrayList;

public class Viewer {
    private String nickName;
    private int age;
    private int countOfViewedCinema;
    private ArrayList<Cinema> listOfViewedCinema;

    public Viewer(String nickName, int age) {
        setNickName(nickName);
        setAge(age);
        if (listOfViewedCinema == null) {listOfViewedCinema = new ArrayList<>();}
    }

    public void addCinema(Cinema cinema) {
        if (cinema!=null) {
            listOfViewedCinema.add(cinema);
            setCountOfViewedCinema(listOfViewedCinema.size());
        }
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

    public int getCountOfViewedCinema() {
        return countOfViewedCinema;
    }

    private void setCountOfViewedCinema(int countOfViewedCinema) {
        this.countOfViewedCinema = Math.max(countOfViewedCinema, 0);
    }

    public ArrayList<Cinema> getListOfViewedCinema() {
        return listOfViewedCinema;
    }

    @Override
    public String toString() {
        return "Viewer{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", countOfViewedCinema=" + countOfViewedCinema +
                '}';
    }
}
