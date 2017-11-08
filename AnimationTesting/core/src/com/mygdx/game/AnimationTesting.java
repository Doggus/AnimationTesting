package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AnimationTesting extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	TextureRegion[] animationFrames;
	Animation animation;
	float elapsedTime;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("Slime.png");

        TextureRegion[][] tmpFrames = TextureRegion.split(img,15,12);

        animationFrames = new TextureRegion[3];

       /* animationFrames[0] = tmpFrames[0][0];
        animationFrames[1] = tmpFrames[0][1];
        animationFrames[2] = tmpFrames[0][2];
        animationFrames[3] = tmpFrames[0][3];
        animationFrames[4] = tmpFrames[1][0];
        animationFrames[5] = tmpFrames[1][1];
        animationFrames[6] = tmpFrames[1][2];
        animationFrames[7] = tmpFrames[1][3]; */

        /*animationFrames[0] = tmpFrames[0][0];
        animationFrames[1] = tmpFrames[1][0];
        animationFrames[2] = tmpFrames[2][0];
        animationFrames[3] = tmpFrames[3][0];
        animationFrames[4] = tmpFrames[0][1];
        animationFrames[5] = tmpFrames[1][1];
        animationFrames[6] = tmpFrames[2][1];
        animationFrames[7] = tmpFrames[3][1]; */

        animationFrames[0] = tmpFrames[0][0];
        animationFrames[1] = tmpFrames[0][1];
        animationFrames[2] = tmpFrames[0][2];


        animation = new Animation(1f/3f,animationFrames);
	}

	@Override
	public void render () {
		elapsedTime += Gdx.graphics.getDeltaTime();
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		batch.draw((TextureRegion)animation.getKeyFrame(elapsedTime,true),100,150);
		batch.end();
	}
}
