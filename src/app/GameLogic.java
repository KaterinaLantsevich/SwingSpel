package app;

//import java.util.ArrayList;
import gui.Tile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//import java.util.List;

public class GameLogic {
    private Tile[][] tiles = new Tile[4][4];

    public Tile[][] getTiles() {
        return tiles;
    }

    public GameLogic() {
        initializeTiles();
        System.out.println(Arrays.deepToString(tiles));
    }

    private void initializeTiles() {
        List<Integer> test = new ArrayList();
        for (int i = 0; i < 16; i++) {
            test.add(i);
        }
        Collections.shuffle(test);
        int k = 0;
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles.length; j++) {
                tiles[i][j] = new Tile(test.get(k));
                k++;
            }
        }
    }
}
