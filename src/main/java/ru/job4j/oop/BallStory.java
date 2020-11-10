package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.meet(hare);
        hare.tryEat(ball);
        ball.meet(wolf);
        wolf.tryEat(ball);
        ball.meet(fox);
        fox.tryEat(ball);
        fox.eat(ball);
    }
}
