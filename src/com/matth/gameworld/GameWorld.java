package com.matth.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.matth.gameobjects.Player;

/**
 * Created by matth on 1/9/2017.
 */

public class GameWorld {
  private Player player;

  public GameWorld(int midPointY){
    player = new Player(33,midPointY*2,24,34);
  }

  public void update(float delta) {
    player.update(delta);
  }

  public Player getPlayer() {
    return player;
  }
}
