package LAB2;

public class Music {
        private String Title;
        private int Duration;
        private String Genre;
        private String AlbumName;
        private Date releasedate;
        private Artist Artistname;


        public Music(String Title ,int Duration, String Genre,String AlbumName,Date releasedate,Artist Artistname) {
            this.Title = Title;
            this.Duration= Duration;
            this.Genre = Genre;
            this.AlbumName= AlbumName;
            this.releasedate=releasedate;
            this.Artistname=Artistname;
        }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public String getGenre() {
        return Genre;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public void setAlbumName(String albumName) {
        AlbumName = albumName;
    }

    public Artist getArtistname() {
        return Artistname;
    }

    public void setArtistname(Artist artistname) {
        Artistname = artistname;
    }

    public String toString() {
        String Display = String.format("%s/%d/%s/%s/%s/%s ", Title,  Duration, Genre, AlbumName,releasedate,Artistname);
        return Display;
    }
}
