package com.matth.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.matth.gameobjects.Player;
import com.matth.trHelpers.AssetLoader;

/**
 * Created by matth on 1/9/2017.
 */

public class GameRenderer {

  private GameWorld myWorld;
  private OrthographicCamera cam;
  private ShapeRenderer shapeRenderer;

  private SpriteBatch sb;

  private int midPointY;
  private int gameHeight;

  public GameRenderer(GameWorld world, int gameHeight, int midPointY){
    myWorld = world;

    this.gameHeight = gameHeight;
    this.midPointY = midPointY;

    cam = new OrthographicCamera();
    cam.setToOrtho(true,407,gameHeight);

    sb = new SpriteBatch();
    sb.setProjectionMatrix(cam.combined);

    shapeRenderer = new ShapeRenderer();
    shapeRenderer.setProjectionMatrix(cam.combined);
  }

  public void render(float runTime){
    Player player = myWorld.getPlayer();

    Gdx.gl.glClearColor(0,0,0,1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

    shapeRenderer.setColor(55/255.0f,80/255.0f,100/255.0f,1);
    shapeRenderer.rect(0,0,406,2*midPointY);
    shapeRenderer.end();

    TextureRegion currentFrame = AssetLoader.hiroRunAnimation.getKeyFrame(runTime);

    sb.begin();

    sb.draw(currentFrame,player.getX(),player.getY(),player.getWidth(),player.getHeight());
    sb.end();
  }

}
