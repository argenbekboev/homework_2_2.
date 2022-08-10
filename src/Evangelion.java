public class Evangelion extends Anime{
    private int year;
    private String author;
    private String series;

    public Evangelion(int year, String author, String series) {
        this.year = year;
        this.author = author;
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public String getSeries() {
        return series;
    }


    @Override
    public void Print() {
        System.out.println("Anime name: " +
                "\nYear: " + year +
                "\nAuthor: " + author +
                "\nSeries: " + series);
    }
}


