package com.matth.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by matth on 1/10/2017.
 */

public class Player {
  private Vector2 position;
  private Vector2 velocity;
  private Vector2 acceleration;

  private int width;
  private int height;

  public Player(float x, float y, int width, int height){
    this.width = width;
    this.height = height;
    position = new Vector2(x,y);
    velocity = new Vector2(0,0);
    acceleration = new Vector2(0,460);
  }

  public void update(float delta){
    if(position.y > 0)
      position.y = 200;
    position.add(velocity.cpy().scl(delta));
  }

  public void onSwipeUp(){
    velocity.y = -200;
  }

  public float getX(){
    return position.x;
  }

  public float getY(){
    return position.y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
