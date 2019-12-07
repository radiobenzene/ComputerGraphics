package entities;

import models.TexturedModel;

import org.lwjgl.util.vector.Vector3f;

public class Entity {

	private TexturedModel model;
	private Vector3f position;
	private float rotY;
	private float scale;

	public Entity(TexturedModel model, Vector3f position, float rotY, float scale) {
		this.model = model;
		this.position = position;
		this.rotY = rotY;
		this.scale = scale;
	}

	public void increaseRotation(float dy)
	{
		//Getting Rotation
		rotY += dy;
	}

	public TexturedModel getModel() 
	{
		//Getting Model
		return model;
	}

	public Vector3f getPosition() 
	{
		//Getting Position
		return position;
	}

	public float getRotY() 
	{
		return rotY;
	}

	public float getScale() 
	{
		return scale;
	}

}