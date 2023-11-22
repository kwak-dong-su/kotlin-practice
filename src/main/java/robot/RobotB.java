package robot;

public class RobotB implements Robot {

    @Override
    public void introduce() {
//        Robot.super.introduce();
        System.out.println("안녕");
    }

    @Override
    public void move() {
        System.out.println("이동");
    }

    @Override
    public void stop() {
        System.out.println("정지");
    }

    @Override
    public void upgrade() {

    }

    @Override
    public void upgrade(int grade) {

    }
}
