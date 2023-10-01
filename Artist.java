package LAB2;
public class Artist {
    private String Name;
    private String Nationality;
    private int Rating;
    public Artist(String Name, String Nationality, int Rating) {
        this.Name = Name;
        this.Nationality= Nationality;
        this.Rating = Rating;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String  Nationality) {
        this.Nationality = Nationality;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }
    public String toString() {
            String Display = String.format("%s/%s/%d",Name, Nationality, Rating);
            return Display;
    }
}

