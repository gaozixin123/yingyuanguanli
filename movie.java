import java.util.Date;
public class movie {
    private String name;
    private String director;
    private String actor;
    private double time;
    private double price;
    private int seat;
    public movie(){}
    @Override
    public String toString() {
        return "movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", director=" + director +
                ", time=" + time +
                ", price=" + price +
                ", seat=" + seat +
                '}';
    }
    public movie(String name,String director,String actor,double time,double price,int seat){
        this.name=name;
        this.director=director;
        this.actor=actor;
        this.time=time;
        this.price=price;
        this.seat=seat;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
