package com.matth.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.input.GestureDetector;
import com.matth.gameobjects.Player;
import com.matth.gameworld.GameRenderer;
import com.matth.gameworld.GameWorld;
import com.matth.trHelpers.InputHandler;

/**
 * Created by matth on 1/9/2017.
 */

public class GameScreen implements Screen {

  private GameWorld world;
  private GameRenderer renderer;
  private GestureDetector gd;

  private float runTime;


  public GameScreen(){
    float screenWidth = Gdx.graphics.getHeight();
    float screenHeight = Gdx.graphics.getWidth();
    runTime = 0;
    float gameWidth = 816;
    float gameHeight = screenHeight/(screenWidth/gameWidth);

    int midpointY = (int)(gameHeight/2);

    world = new GameWorld(midpointY);
    renderer = new GameRenderer(world, (int)gameHeight,midpointY);

    gd = new GestureDetector(new InputHandler(world.getPlayer()));
    Gdx.input.setInputProcessor(gd);



  }

  @Override
  public void show() {
    Gdx.app.log("Gamescreen","Show");
  }

  @Override
  public void render(float delta) {
    runTime += delta;
    world.update(delta);
    renderer.render(runTime);
  }

  @Override
  public void resize(int width, int height) {
    Gdx.app.log("Gamescreen", "Resizing");
  }

  @Override
  public void pause() {
    Gdx.app.log("Gamescreen","Paused");
  }

  @Override
  public void resume() {
    Gdx.app.log("Gamescreen","Resumed");
  }

  @Override
  public void hide() {
    Gdx.app.log("Gamescreen","Hide");
  }

  @Override
  public void dispose() {

  }
}
