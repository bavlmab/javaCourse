package ru.stqa.javaCourse.sandbox;

public class MyFirstProgram {

	public static void main(String[] args){
		hello("Daria");

		Square s = new Square(5);
        //s.l = 5; Атрибуты заполняются в конструкторе

        Rectangle r = new Rectangle(4, 6);
        /*r.a = 4;
        r.b = 6;*/

        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));
	}

    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");;
    }

	public static double area(Square s){
	    return s.l * s.l;
    }

    public static double area(Rectangle r){
        return r.a * r.b;
    }
}