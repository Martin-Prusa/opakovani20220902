package cz.martin.games;

public class VideoGame {
    private String game;
    private String developer;
    private int year;

    private String[] platforms;

    public VideoGame(String game, String developer, int year, String[] platforms) {
        this.game = game;
        this.developer = developer;
        this.year = year;
        this.platforms = platforms;
    }

    public String getGame() {
        return game;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getYear() {
        return year;
    }

    public String[] getPlatforms() {
        return platforms;
    }
}
