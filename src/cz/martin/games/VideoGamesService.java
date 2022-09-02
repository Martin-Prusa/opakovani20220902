package cz.martin.games;

import java.util.*;

public class VideoGamesService {
    private List<VideoGame> games;

    private HashMap<String, ArrayList<VideoGame>> developers = new HashMap<>();

    private HashSet<String> platforms = new HashSet<>();
    public VideoGamesService() {
        games = new VideoGamesRepository().getVideoGames();

        for (VideoGame game : games) {
            developers.putIfAbsent(game.getDeveloper(), new ArrayList<>());
            developers.get(game.getDeveloper()).add(game);
            Collections.addAll(platforms, game.getPlatforms());
        }
    }

    public List<VideoGame> getCancelled() {
        return games.stream().filter(i -> i.getYear() == -1).toList();
    }

    public HashMap<String, ArrayList<VideoGame>> getDevelopers() {
        return developers;
    }

    public List<VideoGame> getGames() {
        return games;
    }

    public HashSet<String> getPlatforms() {
        return platforms;
    }
}
