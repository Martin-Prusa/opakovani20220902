package cz.martin;

import cz.martin.games.VideoGame;
import cz.martin.games.VideoGamesService;

import java.util.ArrayList;
import java.util.HashMap;

public class Main3 {
    public static void main(String[] args) {
        VideoGamesService videoGamesService = new VideoGamesService();
        for (VideoGame videoGame : videoGamesService.getCancelled()) {
            System.out.println(videoGame.getGame());
        }
        System.out.println();

        HashMap<String, ArrayList<VideoGame>> developers = videoGamesService.getDevelopers();
        for (String s : developers.keySet()) {
            System.out.println(s+": ");
            for (VideoGame videoGame : developers.get(s)) {
                System.out.println("\t "+videoGame.getGame());
            }
        }

        for (String platform : videoGamesService.getPlatforms()) {
            System.out.println(platform);
        }
    }
}
