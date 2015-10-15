package entity;

import java.util.*;
import item.*;
import net.slashie.libjcsi.CSIColor;

public class entity{
	
	private String name;
	
	private String tag;
	
	private CSIColor color;
	private CSIColor generic;
	
	//The overall health of the entity
	private int hp;
	
	//Experience points.
	private double exp;
	
	//Level. How powerful the character is.
	private int lvl;
	
	//Strength
	private int STR;
	//Dexterity
	private int DEX;
	//Agility
	private int AGL;
	//Constitution
	private int CON;
	//Wisdom
	private int WIS;
	//Intelligence
	private int INT;
	//Charisma
	private int CHR;
	
	//An enity's inventory. Where it holds items. Items can have inventories too.
	private ArrayList<item> inventory;
	
	//The entities body is made up of parts. Arms, legs, etc. As body parts are an item, they can hold other body parts. I.E Leg has a foot.
	//We can get complex with this. Thigh has Thigh Bone, Thigh Muscle, Thigh Tendon and Knee. Knee has Bone and Calf. Calf has Calf Bone, 
	//Calf Muscle, Etc...
	//Maybe body parts could hold equipment too?
	private ArrayList<item> bodyParts;
	
	
	private char type;
	
	//Really Basic Constructor
	public entity(char c){
		type=c;
	}
	
	//Getter/Setter Methods
	
	public int getAGL() {
		return AGL;
	}

	public void setAGL(int aGL) {
		AGL = aGL;
	}
	
	public int getCHR() {
		return CHR;
	}

	public void setCHR(int cHR) {
		CHR = cHR;
	}
	//This returns the whole CSIColor object, not the integer it contains.
	public CSIColor accessColor(){
		return this.color;
	}
	//This saves an actual CSIColor object to the entity's color object.
	public void saveColor(CSIColor tempColor){
		this.color=tempColor;
	}
	//This changes colors conveniently using a string. The list of colors available is in the CSIColor JavaDoc
	/*
	public void changeColor(String temp){
		this.color.setColor(this.generic.getColor(temp.toUpperCase()));
	}
	*/
	public int getCON() {
		return CON;
	}

	public void setCON(int cON) {
		CON = cON;
	}
	
	public int getDEX() {
		return DEX;
	}

	public void setDEX(int dEX) {
		DEX = dEX;
	}
	
	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}
	
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getINT() {
		return INT;
	}

	public void setINT(int iNT) {
		INT = iNT;
	}
	
	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getSTR() {
		return STR;
	}

	public void setSTR(int sTR) {
		STR = sTR;
	}
	
	public String getTag(){
		return this.tag;
	}
	
	public void setTag(String tempTag){
		tag=tempTag;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	public void setName(String tempName){
		this.name = tempName;
	}
	
	public String getName(){
		return this.name;
	}

	public int getWIS() {
		return WIS;
	}

	public void setWIS(int wIS) {
		WIS = wIS;
	}

	public ArrayList<item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<item> inventory) {
		this.inventory = inventory;
	}

	public ArrayList<item> getBodyParts() {
		return bodyParts;
	}

	public void setBodyParts(ArrayList<item> bodyParts) {
		this.bodyParts = bodyParts;
	}
	
	
	//The Real Meat
	
	//X position
	int x=0;
	//Y position
	int y=0;
	//Z position (Floor?)
	int z=0;
	
	public void moveX(int changeX){
		x=x+changeX;
	}
	
	public void moveY(int changeY){
		y=y+changeY;
	}
	
	public void moveZ(int changeZ){
		z=z+changeZ;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}
}