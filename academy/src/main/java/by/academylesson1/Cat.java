package by.academylesson1;

public class Cat {
	
	String nickname; 
	String color;
	double weight;
	int age;
	public Cat () {
		super();
	}
	public Cat(String nickname, String color,double wait,int age) {	
	    super(); this.nickname = nickname;
	             this.weight = weight;
	             this.color = color;
	             this.age = age; 
	}
	public void sleep() {
		System.out.println(nickname +" спит");
	}
	public void eat() {
		weight = weight+ 1 ;
		System.out.println(nickname + " ест ,вес кота теперь " +weight);
	}
	public void walk() {
		weight = weight -1;
		System.out.println(nickname + " гуляет , теперь вес кота " + weight);
	}
	@Override
	public String toString() {
         return "nickname :" + nickname+
        		 "color :" + color+
        		 "weight :" + weight+
        		 "age :" + age; 
{
