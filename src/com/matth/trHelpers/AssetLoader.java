package com.matth.trHelpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture.TextureFilter;

/**
 * Created by matth on 1/10/2017.
 */

public class AssetLoader {
  public static Texture runTexture;
  public static Texture bg, grass;

  //Hiro Run
  public static Animation<TextureRegion> hiroRunAnimation;
  public static TextureRegion hiro1,hiro2,hiro3,hiro4,hiro5,hiro6,hiro7,hiro8,hiro9,hiro10;

  //Hiro Jump
  public static Texture jumpTexture;
  public static Animation<TextureRegion> hiroJumpAnimation;
  public static TextureRegion hiroJ1,hiroJ2,hiroJ3,hiroJ4,hiroJ5,hiroJ6,hiroJ7;

  public static void load(){
    runTexture = new Texture("run.png");
    runTexture.setFilter(TextureFilter.Nearest,TextureFilter.Nearest);

    //Run Hiro
    hiro1 = new TextureRegion(runTexture,1,1,27,35);
    hiro1.flip(false,true);
    hiro2 = new TextureRegion(runTexture,30,2,28,34);
    hiro2.flip(false,true);
    hiro3 = new TextureRegion(runTexture,60,3,29,33);
    hiro3.flip(false,true);
    hiro4 = new TextureRegion(runTexture,91,4,29,32);
    hiro4.flip(false,true);
    hiro5 = new TextureRegion(runTexture,122,4,28,32);
    hiro5.flip(false,true);
    hiro6 = new TextureRegion(runTexture,152,3,26,33);
    hiro6.flip(false,true);
    hiro7 = new TextureRegion(runTexture,180,2,25,34);
    hiro7.flip(false,true);
    hiro8 = new TextureRegion(runTexture,207,1,24,35);
    hiro8.flip(false,true);
    hiro9 = new TextureRegion(runTexture,60,3,29,33);
    hiro9.flip(false,true);
    hiro10 = new TextureRegion(runTexture,1,1,27,35);
    hiro10.flip(false,true);

    TextureRegion[] run = {hiro2,hiro3,hiro4,hiro5,hiro6,hiro7,hiro8};
    hiroRunAnimation = new Animation<TextureRegion>(0.06f,run);
    hiroRunAnimation.setPlayMode(Animation.PlayMode.LOOP_PINGPONG);

    //Jump Hiro
    jumpTexture = new Texture("kirbyjump.png");
    jumpTexture.setFilter(TextureFilter.Nearest,TextureFilter.Nearest);

    hiroJ1 = new TextureRegion(jumpTexture,0,67,44,67);
    hiroJ1.flip(false,true);
    hiroJ2 = new TextureRegion(jumpTexture,0,67,88,67);
    hiroJ2.flip(false,true);
    hiroJ3 = new TextureRegion(jumpTexture,0,67,132,67);
    hiroJ3.flip(false,true);
    hiroJ4 = new TextureRegion(jumpTexture,0,67,176,67);
    hiroJ4.flip(false,true);
    hiroJ5 = new TextureRegion(jumpTexture,0,67,220,67);
    hiroJ5.flip(false,true);
    hiroJ6 = new TextureRegion(jumpTexture,0,67,264,67);
    hiroJ6.flip(false,true);
    hiroJ7 = new TextureRegion(jumpTexture,0,67,308,67);
    hiroJ7.flip(false,true);

    TextureRegion[] jump = {hiroJ1,hiroJ2,hiroJ3,hiroJ4,hiroJ5,hiroJ6,hiroJ7};
    hiroJumpAnimation = new Animation<TextureRegion>(0.03f,jump);
    hiroJumpAnimation.setPlayMode(Animation.PlayMode.LOOP);

  }

  public static void dispose(){
    jumpTexture.dispose();
    runTexture.dispose();
  }

}
